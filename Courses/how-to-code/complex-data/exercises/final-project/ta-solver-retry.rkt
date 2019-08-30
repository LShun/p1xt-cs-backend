;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-advanced-reader.ss" "lang")((modname ta-solver-retry) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #t #t none #f () #f)))
;; Slot is Natural
;; interp. each TA slot has a number, is the same length, and none overlap

(define-struct ta (name max avail))
;; TA is (make-ta String Natural (listof Slot))
;; interp. the TA's name, number of slots they can work, and slots they're available for

(define SOBA (make-ta "Soba" 2 (list 1 3)))
(define UDON (make-ta "Udon" 1 (list 3 4)))
(define RAMEN (make-ta "Ramen" 1 (list 2)))

(define NOODLE-TAs (list SOBA UDON RAMEN))



(define-struct assignment (ta slot))
;; Assignment is (make-assignment TA Slot)
;; interp. the TA is assigned to work the slot

;; Schedule is (listof Assignment)

;; ============================= FUNCTIONS (Followed: https://github.com/KamilCybulski/htc-solutions)
;; (listof TA) (listof Slot) -> Schedule or false
;; produce valid schedule given TAs and Slots; false if impossible

(check-expect (schedule-tas empty empty) empty)
(check-expect (schedule-tas empty (list 1 2)) false)
(check-expect (schedule-tas (list SOBA) empty) empty)

(check-expect (schedule-tas (list SOBA) (list 1)) (list (make-assignment SOBA 1)))
(check-expect (schedule-tas (list SOBA) (list 2)) false)
(check-expect (schedule-tas (list SOBA) (list 1 3)) (list (make-assignment SOBA 3)
                                                          (make-assignment SOBA 1)))

(check-expect (schedule-tas NOODLE-TAs (list 1 2 3 4)) 
              (list
               (make-assignment UDON 4)
               (make-assignment SOBA 3)
               (make-assignment RAMEN 2)
               (make-assignment SOBA 1)))

(check-expect (schedule-tas NOODLE-TAs (list 1 2 3 4 5)) false)

(define (schedule-tas tas slots)
  (cond [(empty? slots) empty]
        [(empty? tas) false]
        [else (local [(define (fn-for-schedule todo s)
                        ;; s is Schedule: the completed Schedule so far
                        (cond [(empty? todo) s]
                              [else (fn-for-los (rest todo)
                                                (next-schedules (first todo) tas s))]))

                      (define (fn-for-los todo los)
                        (cond [(empty? los) false]
                              [else (local [(define try (fn-for-schedule todo (first los)))]
                                      (if (not (false? try))
                                          try
                                          (fn-for-los todo (rest los))))]))]

                (fn-for-schedule slots empty))]))

;; Slots (listof TA) Schedule -> (listof Schedule)
;; produce a list of valid next schedules
(check-expect (next-schedules 1 NOODLE-TAs empty)
              (list (list (make-assignment SOBA 1))))
(check-expect (next-schedules 2 NOODLE-TAs
                              (list (make-assignment SOBA 1)))
              (list (list (make-assignment RAMEN 2)
                          (make-assignment SOBA 1))))

(define (next-schedules slot tas schedule)
  (keep-valid tas (create-schedules slot tas schedule)))


;; Slot (listof TA) Schedule -> (listof Schedule)
;; produce a list of next schedules by inserting each TA that can take a given
;; Slot
(check-expect (create-schedules 1 NOODLE-TAs empty)
              (list (list (make-assignment SOBA 1))))
(check-expect (create-schedules 3 NOODLE-TAs (list (make-assignment RAMEN 2)
                                                   (make-assignment SOBA 1)))
              (list
               (list (make-assignment SOBA 3)
                     (make-assignment RAMEN 2)
                     (make-assignment SOBA 1))
               (list (make-assignment UDON 3)
                     (make-assignment RAMEN 2)
                     (make-assignment SOBA 1))))

(define (create-schedules slot tas schedule)
  (cond [(empty? tas) empty]
        [else
         (if (member? slot (ta-avail (first tas)))
             (cons (cons (make-assignment (first tas) slot) schedule)
                   (create-schedules slot (rest tas) schedule))
             (create-schedules slot (rest tas) schedule))]))

;; (listof TA) (listof Schedule) -> (listof Schedule)
;; filter the list by removing all invalid schedules (TA assigned more slots
;; or invalid slots)
(check-expect (keep-valid NOODLE-TAs (list (list (make-assignment SOBA 1)
                                                 (make-assignment SOBA 3))))
              (list (list (make-assignment SOBA 1)
                          (make-assignment SOBA 3))))
(check-expect (keep-valid NOODLE-TAs (list (list (make-assignment SOBA 1)
                                                 (make-assignment SOBA 3)
                                                 (make-assignment SOBA 2))))
              empty)

(define (keep-valid tas los)
  (local [(define (valid? schedule)
            (local [(define (compare ta)
                      (if (< (ta-max ta) (count ta schedule))
                          false
                          true))
                    (define (count ta schedule)
                      (local [(define (counter as n)
                                (if (equal? (assignment-ta as) ta)
                                    (add1 n)
                                    n))]
                        (foldr counter 0 schedule)))]
              (andmap compare tas)))]
    (filter valid? los)))





