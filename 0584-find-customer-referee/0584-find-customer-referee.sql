# Write your MySQL query statement below
SELECT c.name 
FROM Customer c
WHERE c.referee_id IS null OR c.referee_id != 2 ;