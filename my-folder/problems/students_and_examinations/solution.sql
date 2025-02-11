select s.student_id,s.student_name,sub.subject_name ,count(e.student_id) as attended_exams
from Examinations e right join( Students s
join Subjects sub)  on e.student_id=s.student_id and e.subject_name=sub.subject_name 
group by sub.subject_name,s.student_id
order by s.student_id,sub.subject_name;