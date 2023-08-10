# Write your MySQL query statement below

#why not max(salary) as SecondHighestSalary

select max(salary)  SecondHighestSalary from Employee where salary<(select max(salary) from employee)

