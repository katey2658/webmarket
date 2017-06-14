--创建数据库
CREATE DATABASE IF NOT EXISTS gouyijia;
--使用数据库
USE gouyijia;
--创建商品表
CREATE TABLE product(
  product_id BIGINT NOT NULL AUTO_INCREMENT COMMENT "商品编号",
  product_type VARCHAR(45) NOT NULL  COMMENT "商品类别",
  keywords VARCHAR (120) NOT NULL COMMENT "关键词",
  product_title VARCHAR (120) NOT NULL COMMENT "产品标题",
  product_image VARCHAR (255) NOT NULL  COMMENT "图片地址",
  product_initial_num INT NOT NULL  COMMENT "商品数量",
  product_price INT  NOT NULL  COMMENT "商品价格",
  display_measurements VARCHAR (45) NOT NULL COMMENT "规格尺寸",
  state TINYINT NOT NULL DEFAULT 0 COMMENT "状态",
  create_time TIMESTAMP NOT NULL DEFAULT current_timestamp()  COMMENT "创建时间",
  PRIMARY KEY (product_id)
)ENGINE=InnoDB AUTO_INCREMENT=1000000 DEFAULT CHARSET=utf8 COMMENT ='商品简表';


--创建商品详细表
CREATE TABLE product_info(
  product_id BIGINT NOT NULL AUTO_INCREMENT COMMENT "商品编号",
  images VARCHAR(255) NOT NULL COMMENT "图片",
  good_to_know VARCHAR(255) COMMENT "相关提示",
  care_inst VARCHAR(255) COMMENT "保养说明",
  measure_part VARCHAR(255) COMMENT "产品规格",
  docs_file VARCHAR(120) COMMENT "说明文档",
  key_features VARCHAR(120) COMMENT "重要特征",
  designer VARCHAR(45) COMMENT "设计者",
  design_thoughts VARCHAR(255) COMMENT "设计灵感",
  package_info VARCHAR(45) COMMENT "包装详情",
  create_time TIMESTAMP COMMENT "创建时间",
  PRIMARY KEY (product_id)
)ENGINE=InnoDB AUTO_INCREMENT=1000000 DEFAULT CHARSET=utf8 COMMENT ='商品详细表';

--秒杀商品编号
CREATE TABLE seckill_product(
  sp_id BIGINT NOT NULL  COMMENT "秒杀商品ID",
  sp_title VARCHAR(120) NOT NULL COMMENT "商品主题",
  sp_price INT NOT NULL COMMENT "秒杀价格",
  sp_num INT NOT NULL COMMENT "秒杀数量",
  start_time TIMESTAMP NOT NULL COMMENT "开始时间",
  end_time TIMESTAMP NOT NULL  COMMENT "结束时间",
  create_time TIMESTAMP NOT NULL DEFAULT current_timestamp() COMMENT "创建时间",
  PRIMARY KEY (sp_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT ='秒杀商品详细表';

--秒杀成功商品表
CREATE TABLE success_seckilled_product(
  sp_id BIGINT NOT NULL COMMENT "秒杀商品Id",
  user_id BIGINT NOT NULL COMMENT "用户id",
  state TINYINT NOT NULL DEFAULT 0 COMMENT "状态",
  create_time TIMESTAMP DEFAULT current_timestamp() COMMENT "创建时间",
  PRIMARY KEY (sp_id,user_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT ='秒杀成功商品详细表';

--用户表
CREATE TABLE  user(
  user_id BIGINT NOT NULL AUTO_INCREMENT COMMENT "用户编号",
  user_name VARCHAR (45) NOT NULL COMMENT "用户名",
  user_tel VARCHAR (45) NOT NULL UNIQUE COMMENT "用户注册手机号",
  user_pwd VARCHAR (45) NOT NULL UNIQUE COMMENT "用户密码",
  user_mail VARCHAR (45) NOT NULL COMMENT "用户邮箱",
  user_photo VARCHAR(120) COMMENT "用户头像",
  create_time TIMESTAMP NOT NULL DEFAULT current_timestamp() COMMENT "用户注册时间",
  PRIMARY KEY (user_id)
)ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8 COMMENT ='用户表';


--用户所有的收货地址
--用户所有的收货地址信息表
CREATE TABLE address(
  address_id  BIGINT NOT NULL AUTO_INCREMENT,
  user_id  BIGINT NOT NULL COMMENT "用户",
  consignee_name VARCHAR(45) NOT NULL COMMENT "收货人",
  contract_tel VARCHAR(20) NOT NULL COMMENT "联系方式",
  geocode_id BIGINT NOT NULL COMMENT "地理编码",
  address VARCHAR(255) COMMENT "地址",
  PRIMARY KEY (address_id),
  FOREIGN KEY (user_id)REFERENCES user(user_id)
)ENGINE=InnoDB DEFAULT CHARSET=UTF8 COMMENT ="收货信息表";


--地理编码
CREATE TABLE geocode(
  geocode BIGINT NOT NULL UNIQUE COMMENT "地理编码",
  province_code INT NOT NULL COMMENT "省份编码",
  city_code INT NOT NULL COMMENT "城市编码",
  district_code INT NOT NULL COMMENT "县区级编码",
  block_code INT NOT NULL COMMENT "街区编码",
  geo_name VARCHAR(120) NOT NULL COMMENT "地理名"
)ENGINE=InnoDB DEFAULT CHARSET=UTF8 COMMENT ="地理编码表";

--消费记录表
CREATE TABLE  expenses_record(
  exp_record_id INT NOT NULL AUTO_INCREMENT COMMENT "消费记录编号",
  exp_id INT(20) NOT NULL COMMENT "消费清单编号",
  user_id BIGINT NOT NULL COMMENT "购买用户",
  product_id BIGINT NOT NULL COMMENT "购买商品编号",
  num INT NOT NULL DEFAULT 0 COMMENT "购买数量",
  price INT NOT NULL DEFAULT 0 COMMENT "单价",
  is_sale BOOL DEFAULT FALSE  COMMENT "是否打折",
  discount TINYINT DEFAULT 10 COMMENT "折扣",
  total INT DEFAULT 0 COMMENT "总共支付",
  state TINYINT DEFAULT 0 COMMENT "状态",
  address_id BIGINT NOT NULL COMMENT "收货地址",
  express_code BIGINT NOT NULL COMMENT "快递编号",
  create_time TIMESTAMP NOT NULL DEFAULT current_timestamp()COMMENT "创建时间",
  PRIMARY KEY (exp_record_id)
)ENGINE=InnoDB  DEFAULT CHARSET=UTF8 COMMENT="消费记录表";

--快递记录表
CREATE TABLE  express(
  express_code BIGINT NOT NULL AUTO_INCREMENT COMMENT "快递编号",
  state TINYINT NOT NULL DEFAULT 0 COMMENT "运送状态",
  address_id BIGINT  NOT NULL COMMENT "收件地址编号",
  weight INT NOT NULL  DEFAULT 0 COMMENT "重量",
  price INT NOT NULL DEFAULT 0 COMMENT "价钱",
  PRIMARY KEY (express_code)
)ENGINE=InnoDB DEFAULT CHARSET=UTF8 COMMENT="快递记录表" ;


--快递状态进行表
CREATE TABLE express_logs (
  express_code BIGINT NOT NULL COMMENT "快递编号",
  info VARCHAR(120) NOT NULL COMMENT "快递状况",
  create_time TIMESTAMP NOT NULL DEFAULT current_timestamp() COMMENT "创建时间"
)ENGINE=InnoDB DEFAULT CHARSET=UTF8 COMMENT ="快递行进记录表" ;

--活动记录表
CREATE TABLE activity(
  activity_id INT NOT NULL AUTO_INCREMENT COMMENT "活动编号",
  activity_title VARCHAR(120) NOT NULL COMMENT "活动主题",
  activity_desc VARCHAR(255) NOT NULL COMMENT "活动描述",
  activity_public BOOL DEFAULT TRUE COMMENT "是否公开",
  activity_count INT DEFAULT 10 COMMENT "每个人投票次数",
  start_time TIMESTAMP NOT NULL COMMENT "开始时间",
  end_time TIMESTAMP NOT NULL  COMMENT "结束时间",
  create_time TIMESTAMP DEFAULT current_timestamp() COMMENT "创建时间",
  PRIMARY KEY (activity_id)
)ENGINE=InnoDB DEFAULT CHARSET=UTF8 COMMENT ="活动表";


--活动者参与表
CREATE TABLE participartor(
  participartor_id BIGINT NOT NULL AUTO_INCREMENT COMMENT "参与者编号",
  activity_id INT NOT NULL COMMENT "活动编号",
  user_id BIGINT COMMENT "参与用户",
  product_id BIGINT COMMENT "参与产品",
  image VARCHAR(120) NOT NULL COMMENT "图片地址",
  vote_desc  VARCHAR(120) COMMENT "参选口号",
  count INT NOT NULL DEFAULT 0 COMMENT "票数",
  create_time TIMESTAMP NOT NULL DEFAULT current_timestamp() COMMENT "创建时间",
  PRIMARY KEY (participartor_id)
)ENGINE=InnoDB DEFAULT CHARSET=UTF8 COMMENT ="活动参与者详情表";


--购物车临时存储表
CREATE TABLE cart_product(
  user_id BIGINT NOT NULL COMMENT "用户编号",
  product_id BIGINT NOT NULL COMMENT "商品编号",
  num INT NOT NULL COMMENT "购物车中数量",
  address_id BIGINT NOT NULL COMMENT "收货地址"
)ENGINE=InnoDB DEFAULT CHARSET=UTF8 COMMENT ="购物车存储列表";

--投票记录表
CREATE TABLE activity_vote(
  activity_id INT NOT NULL COMMENT "活动",
  user_id BIGINT COMMENT "投票用户编号",
  operate_ip VARCHAR(45) NOT NULL COMMENT "操作IP",
  create_time TIMESTAMP DEFAULT current_timestamp() COMMENT "操作时间"
)ENGINE=InnoDB DEFAULT CHARSET=UTF8 COMMENT ="投票记录表";





