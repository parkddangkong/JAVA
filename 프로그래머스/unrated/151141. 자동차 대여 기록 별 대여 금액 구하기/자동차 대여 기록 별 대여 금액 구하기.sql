WITH TABLE1 AS (
    SELECT 
        H.HISTORY_ID,
        C.CAR_TYPE,
        C.DAILY_FEE*(H.END_DATE - H.START_DATE + 1) AS "FEE_ND",
        CASE
            WHEN H.END_DATE - H.START_DATE + 1 >= 90 THEN '90일 이상'
            WHEN H.END_DATE - H.START_DATE + 1 < 90 AND H.END_DATE - H.START_DATE + 1>= 30 THEN '30일 이상'
            WHEN H.END_DATE - H.START_DATE + 1 < 30 AND H.END_DATE - H.START_DATE + 1>= 7 THEN '7일 이상'
            ELSE '7일 미만'
        END AS "DURATION_TYPE"
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY H
        LEFT JOIN CAR_RENTAL_COMPANY_CAR C
            ON H.CAR_ID = C.CAR_ID
    WHERE C.CAR_TYPE = '트럭'
)
SELECT
    T1.HISTORY_ID,
    (T1.FEE_ND*(100-NVL(P.DISCOUNT_RATE, 0))/100) AS "FEE"
FROM TABLE1 T1
    LEFT JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN P
        ON T1.DURATION_TYPE = P.DURATION_TYPE
            AND T1.CAR_TYPE = P.CAR_TYPE
ORDER BY FEE DESC, HISTORY_ID DESC;