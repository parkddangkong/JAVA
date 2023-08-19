select a.car_id, a.car_type, a.daily_fee*30*(100-b.discount_rate)/100 fee
from CAR_RENTAL_COMPANY_CAR a
    join (select * from CAR_RENTAL_COMPANY_DISCOUNT_PLAN where duration_type = '30일 이상') b on a.car_type=b.car_type 
where 1=1
    and not exists (select 1 
                  from (select distinct car_id
                                 from CAR_RENTAL_COMPANY_RENTAL_HISTORY a
                                 where 1=1
                                     and (to_char(a.start_date,'yyyy-mm-dd') <= '2022-11-30')
                                     and (to_char(a.end_date,'yyyy-mm-dd') >= '2022-11-01')) b 
                 where a.car_id=b.car_id)
    and a.car_type in ('세단','SUV')
    and a.daily_fee*30*(100-b.discount_rate)/100 >= 500000
    and a.daily_fee*30*(100-b.discount_rate)/100 < 2000000
order by 3 desc, 2, 1 desc