create database travelmanagementsystem;
show databases;
use travelmanagementsystem;
select * from account;
select * from customer;
select * from bookpackage;
 
show tables;
create table customer(username varchar(50), id varchar(50), number varchar(50) ,name varchar(50) , gender varchar(50) ,country varchar(50) ,address varchar(50) ,phone varchar(15),email varchar(50)  );
select * from customer;
create table bookpackage(username varchar(50), package varchar(50), persons varchar(50), id varchar(100), number varchar(50),phone varchar(15),price varchar(20));
select * from bookpackage;
SELECT * FROM bookpackage WHERE username = 'dgh';
create table hotel(name varchar(30), costperperson varchar(30), acroom varchar(10),foodincluded varchar(10));
select * from hotel;
INSERT INTO hotel (name, costperperson, acroom, foodincluded) VALUES
('JW Marriott Hotel', '5000', '7000', '9000'),
('Madarin Hotel', '4000', '6000', '7500'),
('Four Season Hotel', '4500', '6500', '8000'),
('Raddisson Blue Hotel', '5500', '7500', '9500'),
('Classio Hotel', '3000', '4000', '5500'),
('The Bay Club Hotel', '3500', '5000', '6500'),
('Breeze Blow Hotel', '2800', '3800', '5200'),
('The Taj Hotel', '6000', '8000', '10000'),
('Paul Hotel', '3200', '4500', '6000'),
('Riverview Hotel', '3700', '5200', '6800');
create table booktable 
select * from bookhotel;
RENAME TABLE booktable TO bookhotel;

