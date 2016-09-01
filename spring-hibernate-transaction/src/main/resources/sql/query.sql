SET GLOBAL log_output = 'TABLE';
SET GLOBAL general_log = 'ON';
truncate table mysql.general_log;
SELECT * FROM  mysql.general_log order by event_time desc;
SELECT * FROM  mysql.general_log  WHERE command_type ='Query' order by event_time desc LIMIT 100 ;


TRUNCATE TABLE USER;

desc user;
select * from user;