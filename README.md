# EmployeeAPICRUD

CREATE DATABASE IF NOT EXISTS EmployeeDB;

USE EmployeeDB ;

drop table if exists Employee;

CREATE TABLE Employee ( empid bigint NOT NULL AUTO_INCREMENT, emp_name VARCHAR(50) DEFAULT NULL, emp_salary float DEFAULT NULL, emp_age integer DEFAULT NULL, emp_city VARCHAR(50) DEFAULT NULL, PRIMARY KEY (empid) );

USE EmployeeDB ;

select * from Employee;
