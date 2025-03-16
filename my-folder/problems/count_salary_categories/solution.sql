SELECT c.category, 
       COUNT(a.income) AS accounts_count
FROM (
  SELECT 'Low Salary' AS category
  UNION 
  SELECT 'Average Salary'
  UNION 
  SELECT 'High Salary'
) c
LEFT JOIN Accounts a
ON (a.income < 20000 AND c.category = 'Low Salary')
OR (a.income BETWEEN 20000 AND 50000 AND c.category = 'Average Salary')
OR (a.income > 50000 AND c.category = 'High Salary')
GROUP BY c.category;
