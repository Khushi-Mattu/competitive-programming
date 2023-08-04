# Write your MySQL query statement below
select e.id from weather e join weather w on DATEDIFF(e.recordDate,w.recordDate)=1 and e.temperature>w.temperature;