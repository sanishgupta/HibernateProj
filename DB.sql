CREATE TABLE TAB_CUSTOMER
(
CUSTOMER_ID  NUMBER(10)          NOT NULL,
CUSTOMER_NAME           VARCHAR2(255)
)
 
CREATE SEQUENCE TAB_CUSTOMER_SEQ
START WITH 1
MAXVALUE 999999999999999999999999999
MINVALUE 1
NOCYCLE
CACHE 20
NOORDER;



---------------------------------------------
create table EMPLOYEE (
   id INT NOT NULL auto_increment,
   first_name VARCHAR(20) default NULL,
   last_name  VARCHAR(20) default NULL,
   salary     INT  default NULL,
   PRIMARY KEY (id)
);