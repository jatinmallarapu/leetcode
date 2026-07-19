# Write your MySQL query statement below
with twotables as(
select p.firstName, p.lastName, a.city, a.state 
from Person p left join Address a on p.personId = a.personId
union
select p.firstName, p.lastName, a.city, a.state 
from Person p right join Address a on a.personId = p.personId
)
select * from twotables where firstName IS NOT NULL;