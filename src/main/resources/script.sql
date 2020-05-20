use mysqldb;

drop table if exists USER; 

CREATE TABLE USER
(
   id INT PRIMARY KEY AUTO_INCREMENT,
    userName VARCHAR(100),
    password VARCHAR(100),
    roles VARCHAR(255),
    active  BOOLEAN 


);
commit;
insert into USER (id, userName, password, roles, active) values(1, "user", "pass", "Role1, Role2,Role3", 1);
insert into USER (id, userName, password, roles, active) values(2, "user1", "pass1", "Role11, Role12,Role13", 0);

commit;