/*
  创建管家婆的数据库
  名字 house_keeper
*/
CREATE DATABASE house_keeper charset utf8;

USE house_keeper;


DROP TABLE IF EXISTS `house_keeper_list`;

CREATE TABLE house_keeper_list(
   -- 主键
   id INT(10) unsigned not null AUTO_INCREMENT,
   -- 分类名称   
   cate_name VARCHAR(200) not null default '',
   -- 金额
   money DOUBLE not null default 0.00,
   -- 账户
   user VARCHAR(100) not null default '',
   -- 创建日期
   create_time DATE,
   -- 账务描述
   description  VARCHAR(1000) not null default '',

   PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8  ;


-- SELECT * FROM house_keeper_list

-- 写入测试的数据
INSERT  INTO house_keeper_list(id,cate_name,money,user,create_time,description) VALUES (1,'吃饭支出',247,'交通银行','2016-03-02','家庭聚餐');
INSERT  INTO house_keeper_list(id,cate_name,money,user,create_time,description) VALUES (2,'工资收入',12345,'现金','2016-03-15','开工资了');
INSERT  INTO house_keeper_list(id,cate_name,money,user,create_time,description) VALUES (3,'服装支出',1998,'现金','2016-04-02','买衣服');
INSERT  INTO house_keeper_list(id,cate_name,money,user,create_time,description) VALUES (4,'吃饭支出',325,'现金','2016-06-18','朋友聚餐');
INSERT  INTO house_keeper_list(id,cate_name,money,user,create_time,description) VALUES (5,'股票收入',8000,'工商银行','2016-10-28','股票大涨');
INSERT  INTO house_keeper_list(id,cate_name,money,user,create_time,description) VALUES (6,'股票收入',5000,'工商银行','2016-10-28','股票又大涨');
INSERT  INTO house_keeper_list(id,cate_name,money,user,create_time,description) VALUES (7,'工资收入',5000,'交通银行','2016-10-28','又开工资了');
INSERT  INTO house_keeper_list(id,cate_name,money,user,create_time,description) VALUES (8,'礼金支出',5000,'现金','2016-10-28','朋友结婚');
INSERT  INTO house_keeper_list(id,cate_name,money,user,create_time,description) VALUES (9,'其他支出',1560,'现金','2016-10-29','丢钱了');
INSERT  INTO house_keeper_list(id,cate_name,money,user,create_time,description) VALUES (10,'交通支出',2300,'交通银行','2016-10-29','油价还在涨啊');
INSERT  INTO house_keeper_list(id,cate_name,money,user,create_time,description) VALUES (11,'吃饭支出',1000,'工商银行','2016-10-29','又吃饭');
INSERT  INTO house_keeper_list(id,cate_name,money,user,create_time,description) VALUES (12,'工资收入',1000,'现金','2016-10-30','开资');
INSERT  INTO house_keeper_list(id,cate_name,money,user,create_time,description) VALUES (13,'交通支出',2000,'现金','2016-10-30','机票好贵');
INSERT  INTO house_keeper_list(id,cate_name,money,user,create_time,description) VALUES (14,'工资收入',5000,'现金','2016-10-30','又开资');

