-- auto Generated on 2020-04-09
-- DROP TABLE IF EXISTS customer;
CREATE TABLE customer(
	id VARCHAR (50) NOT NULL COMMENT 'id',
	account VARCHAR (50) DEFAULT '' COMMENT '账号',
	`password` VARCHAR (50) DEFAULT '' COMMENT '登录密码',
	is_member TINYINT (3) DEFAULT 0 COMMENT '是否是会员 true 是;false 不是',
	create_by VARCHAR (50) DEFAULT '' COMMENT '创建人id',
	create_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
	update_by VARCHAR (50) DEFAULT '' COMMENT '更新人id',
	update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'customer';
