;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-beginner-reader.ss" "lang")((modname hello) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #f #t none #f () #f)))
;; String -> string
;; add "!" to the end of s
(check-expect (yell "hello") "hello!")
(check-expect (yell "goodbye") "goodbye!")


;(define (yell s) "") ;stub

;(define (yell s) ;template
;  (... s))

(define (yell s)
  (string-append s "!"))