WITH SAMPLE AS 
(
    SELECT 
        order_id , 
        product_id ,
        out_date
    FROM 
        food_order
)


SELECT 
    order_id , 
    product_id ,
    to_char(out_date , 'YYYY-MM-DD') ,
    CASE
        WHEN out_date <= to_date('2022-05-01' , 'YYYY-MM-DD') THEN '출고완료'
        WHEN out_date is null THEN '출고미정'
        ELSE '출고대기'
    END
FROM sample
ORDER BY order_id