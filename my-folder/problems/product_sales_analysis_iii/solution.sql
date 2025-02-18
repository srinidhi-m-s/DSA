
select s.product_id,s.year as first_year,s.quantity,s.price
from Sales s  
join (select min(t.year) as mini,t.product_id
from Sales t
group by t.product_id)first
on s.year=first.mini and s.product_id=first.product_id;
