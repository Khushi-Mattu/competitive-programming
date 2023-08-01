# Write your MySQL query statement below
select name as Customers from Customers c where c.id not in (select o.customerId from Orders o)