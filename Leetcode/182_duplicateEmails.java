# Write your MySQL query statement below
select distinct e.email as Email from Person e, Person p where e.email=p.email and e.id!=p.id;