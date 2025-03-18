(select u.name as results
from MovieRating m
join Users u
on m.user_id=u.user_id
join Movies mo
on m.movie_id=mo.movie_id
group by m.user_id
order by count(m.movie_id)desc,u.name
limit 1)
union all
(
select mo.title as results 
from MovieRating m
join Movies mo
on m.movie_id=mo.movie_id
where year(m.created_at)=2020 && month(m.created_at)=02
group by mo.movie_id
order by avg(m.rating) desc ,mo.title
limit 1)
;