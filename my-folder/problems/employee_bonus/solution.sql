select Employee.name,bonus
from Employee
left join Bonus
on Employee.empID=Bonus.empID
where Bonus.bonus is null or Bonus.bonus<1000;