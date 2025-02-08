select a.machine_id,round(avg(a.timestamp-b.timestamp),3)as processing_time
from Activity a
join Activity b
on a.machine_id=b.machine_id and
a.process_id=b.process_id and
a.activity_type="end" and
b.activity_type="start" 
group by a.machine_id;
