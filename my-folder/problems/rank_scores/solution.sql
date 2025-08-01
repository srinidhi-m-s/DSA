select score, (Dense_Rank() OVER(order by score desc) )as "rank"
from Scores;