select 
    name, 
    count(name) as cnt 
from animal_ins
    where name is not null
    group by name
    HAVING count(name) > 1
order by name