select pr.product_name, sl.year, sl.price
from Sales as sl
join Product as pr
on sl.product_id = pr.product_id