select case 
    when id%2=0 then id-1
    when id+1 in (select id from Seat) then id+1
    else id
    end as id,student
from Seat S
order by id;

