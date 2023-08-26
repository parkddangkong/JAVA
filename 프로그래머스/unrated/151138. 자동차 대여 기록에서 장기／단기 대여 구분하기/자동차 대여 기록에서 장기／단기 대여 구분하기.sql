SELECT 
    HISTORY_ID, 
    CAR_ID, 
    to_char(start_date,'YYYY-MM-DD') start_date,
    to_char(end_date,'YYYY-MM-DD') end_date,
    case when to_number(to_char(end_date-start_date+1)) >= 30 then '장기 대여'
         else '단기 대여'
    end  RENT_TYPE
from CAR_RENTAL_COMPANY_RENTAL_HISTORY 
where EXTRACT(YEAR FROM start_date) = 2022                                                                     AND EXTRACT(MONTH FROM start_date) = 9
order by HISTORY_ID desc