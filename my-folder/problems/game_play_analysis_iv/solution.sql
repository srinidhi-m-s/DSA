select round(sum(case 
    when DATEDIFF(a.event_date, first.first_entry)=1
    then 1 else 0 end)/count(distinct a.player_id),2) as fraction
from Activity a
left join (select a2.player_id,min(a2.event_date) as first_entry
from Activity a2
group by a2.player_id
)first
on a.player_id=first.player_id ;

