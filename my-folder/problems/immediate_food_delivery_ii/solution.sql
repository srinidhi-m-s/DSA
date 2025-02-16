select round(sum(case 
    when d.order_date=d.customer_pref_delivery_date 
    then 1 else 0 end)/count(*)*100,2) as immediate_percentage
from Delivery d
join (select d2.customer_id,min(d2.order_date) as first_order
from Delivery d2
group by d2.customer_id
)first
on d.customer_id=first.customer_id and d.order_date=first.first_order;


