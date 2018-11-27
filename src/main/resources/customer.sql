CREATE TABLE `customer`(
  `id` bigint(20) not null AUTO_INCREMENT,
  `name` varchar(255) default null,
  `contact` varchar(255) default null,
  `telephone` varchar(255) default null,
  `email` varchar(255) default null,
  `remark` text,
  primary key (`id`)
)