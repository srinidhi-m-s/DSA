select  p.product_id,p.new_price as price
from Products p
 join(
select product_id,max(change_date) as date
from Products 
where change_date <="2019-08-16"
group by product_id)final
on p.change_date=final.date and p.product_id=final.product_id
group by p.product_id
UNION
SELECT DISTINCT product_id, 10 AS price
FROM Products
WHERE product_id NOT IN (SELECT DISTINCT product_id FROM Products WHERE change_date <= '2019-08-16');
;
