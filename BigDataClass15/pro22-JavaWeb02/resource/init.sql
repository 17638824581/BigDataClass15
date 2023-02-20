
show databases;

-- 创建数据库
create database `dahua` default charset = 'utf8';

-- 切换数据库
use dahua;

-- 创建用户表
create table user(
  id int primary key auto_increment comment '用户id',
  username varchar(64) not null unique comment '用户名',
  password varchar(128) not null comment '用户密码',
  email varchar(64) not null unique comment '用户邮箱'
);

-- 查看用户表
desc user;

select * from user;