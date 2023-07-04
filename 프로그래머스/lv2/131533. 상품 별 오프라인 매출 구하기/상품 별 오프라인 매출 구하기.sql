
SELECT p.product_code, sum(o.SALES_AMOUNT*p.price) as SALES
    from product p
        join OFFLINE_SALE o
            on p.PRODUCT_ID = o.PRODUCT_ID
                 GROUP BY p.product_code
                 order by sales desc, PRODUCT_CODE;