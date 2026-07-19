# Write your MySQL query statement below
with emailname as(
select email, count(*) as totalcount from Person group by email having totalcount>1
)
select email from emailname;