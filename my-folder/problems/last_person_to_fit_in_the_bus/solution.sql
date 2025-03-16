select person_name
from (select * , 
    (select sum(weight) from Queue where turn <=q.turn) as tsum
from Queue q
order by turn desc
)A
where A.tsum<=1000
limit 1;