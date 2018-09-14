```sql
-----查询所有对象个数--------------- 
select object_type,count(*) from user_objects group by object_type; 
--创建版本语句
-- Create table 
create table VERSION 
( 
VERSIONID VARCHAR2(50), 
UPDTDATE DATE 
); 
insert into version(versionid,updtdate) values('V2.10.20171214-42196-GQT-patch',sysdate); 
commit;


--查看表空间文件路径
 select tablespace_name,file_id,bytes/1024/1024,file_name
　　 from dba_data_files order by file_id;

--新建表空间---用于windows
CREATE SMALLFILE TABLESPACE gwypts  
DATAFILE 'E:\oracle\product\10.2.0\oradata\orcl\gwypts'
SIZE 200M 
AUTOEXTEND ON NEXT 100K 
MAXSIZE UNLIMITED 
LOGGING EXTENT 
MANAGEMENT LOCAL SEGMENT SPACE 
MANAGEMENT AUTO

--删除用户 
drop user pts cascade;


--新建用户，并且给用户赋权限
CREATE USER gwypts PROFILE "DEFAULT" IDENTIFIED BY gwypts DEFAULT TABLESPACE gwypts TEMPORARY TABLESPACE "TEMP" ACCOUNT UNLOCK;
grant resource,connect,imp_full_database,exp_full_database,CREATE ANY JOB to gwypts;

--授权语句

grant connect,resource,dba to ly_zsxt    
grant all privileges  to ly_zsxt 


--删除表空间
drop tablespace gwypts including contents and datafiles cascade constraints;

--数据库的dmp导入：
imp dgg/dgg@192.168.2.95/orcl file=d:\dmxg.dmp log=d:\dmxg.log full=y

--导入现场DMP的时候可以用这个导入语句
imp dgg/dgg@192.168.2.96/orcl file=d:\dmxg.dmp log=d:\dmxg.log fromuser=lyzhxg_xc touser=lyzhxg_bd
----(full( 全库导出): 导出除ORDSYS,MDSYS,CTXSYS,ORDPLUGINS,LBACSYS 这些系统用户之外的所有用户的数据. )

--导出
exp lyzhxg/lyzhxg@192.168.2.110/xyxy file=f:\lyzhxg0906.dmp log=d:\lyzhxg0906.log statistics=none

--查看表空间
select   *   from   dba_tablespaces


--查看用户和默认表空间的关系
select   username,default_tablespace   from   dba_users;

--查看服务器版本
select * from v$version

--查看字符集
select * from nls_database_parameters

--查看默认表空间
select * from database_properties where property_name='DEFAULT_TEMP_TABLESPACE';

--查看临时表空间状态
select tablespace_name,file_name,bytes/1024/1024 file_size,autoextensible from dba_temp_files;

select count(*) from user_tables;-----某个用户下所有表
select count(*) from dba_tables;------数据库下所有表


-----查询所有对象个数---------------  
select object_type,count(*) from user_objects group by object_type;

--解决死锁问题
--1）解锁用户      
alter user lyyx account lock;      
       
--2）查询当前所有正在连接的用户session：      
select username,sid,serial# from v$session  where username = 'dhsfzhxg';      
--如下结果：       
--username          sid                serial#       
----------------------------------------       
--LYYX             144              3559      
       
--3）找到要删除用户的sid,和serial，并删除。你要删除用户'LYYX',可以这样做：       
alter system kill session '144,3559';      
       
--4）删除用户：      
drop user LYYX cascade; 

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

--会话字符集环境
select * from nls_session_parameters;
--客户端字符集环境
select * from nls_instance_parameters;
--数据库服务器字符集
select * from nls_database_parameters;
```
>在windows平台下，就是注册表里面相应OracleHome的NLS_LANG。还可以在dos窗口里面自己设置，

>--比如: set nls_lang=AMERICAN_AMERICA.ZHS16GBK

>set nls_lang=SIMPLIFIED CHINESE_CHINA.UTF-8
>NLS_LANG
>SIMPLIFIED CHINESE_CHINA.ZHS16GBK
>AMERICAN_AMERICA.UTF8(NOW)
