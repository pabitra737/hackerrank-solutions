

/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/
SELECT EARNINGS, EMPLOYEE_COUNT
FROM (
    SELECT SALARY * MONTHS AS EARNINGS,
           COUNT(*) AS EMPLOYEE_COUNT
    FROM EMPLOYEE
    GROUP BY SALARY * MONTHS
    ORDER BY EARNINGS DESC
)
WHERE ROWNUM = 1;

