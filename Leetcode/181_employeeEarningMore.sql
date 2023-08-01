# Write your MySQL query statement below
select e.name as Employee from employee e, employee m where e.managerId=m.id and e.salary>m.salary
