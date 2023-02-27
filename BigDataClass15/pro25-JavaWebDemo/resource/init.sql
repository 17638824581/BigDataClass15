-- 创建库 javaWebtest
create database javaWebDemo;

use javaWebDemo;

drop table if exists user;

-- 创建用户表
create table user(
    id int primary key auto_increment comment '用户id',
    name varchar(64) not null comment '用户昵称',
    username varchar(64) not null unique comment '用户名',
    email varchar(128) not null unique comment '邮箱',
    password varchar(128) not null comment '用户密码'
);

drop table if exists book;

-- 创建书籍表
create table book(
    id int primary key auto_increment comment '书籍id',
    title varchar(64) not null comment '书名',
    author varchar(64) not null comment '作者',
    type varchar(64) not null comment '类型',
    price double not null comment '价格'
);
