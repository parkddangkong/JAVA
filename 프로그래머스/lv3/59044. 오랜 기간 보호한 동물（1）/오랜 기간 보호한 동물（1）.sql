SELECT i.name, i.datetime from animal_ins i, animal_outs o
where i.animal_id = o.animal_id(+)
and o.animal_id is null
order by i.datetime
fetch first 3 rows only