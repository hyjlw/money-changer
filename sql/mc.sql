create database money_changer_db;


create table Currency(`id` int, `name` varchar(8), `rate` float);

insert into Currency values((1, 'USD', 1.0), (2, 'SGD', 1.40));