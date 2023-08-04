# Write your MySQL query statement below
select e.name from employee e join employee e2 on e.id=e2.managerId group by e2.managerId having count(e2.managerId)>=5 ;