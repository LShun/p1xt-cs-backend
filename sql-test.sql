
`Obtaining Data from Multiple Tables`
`Query: Display employees job history from when he/she was first hired. Include relevant details.
`

SELECT E.employee_id, E.first_name, E.last_name, J.start_date 
FROM JOB_HISTORY J, EMPLOYEES E
WHERE J.employee_id = E.employee_id;