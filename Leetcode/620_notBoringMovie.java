# Write your MySQL query statement below
select id,movie,description,rating from Cinema where NOT description='boring' and id%2!=0 order by rating desc;