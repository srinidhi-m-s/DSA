select f.name
from Employee e 
join Employee f
on e.managerId=f.id
group by e.managerId
having count(e.managerId)>=5;
