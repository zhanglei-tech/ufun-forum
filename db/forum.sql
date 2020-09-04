CREATE TABLE `forum_post` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '物理主键',
  `post_id` varchar(32) NOT NULL COMMENT '主题id',
  `topic_id` varchar(32) DEFAULT NULL COMMENT '话题id',
  `topic` varchar(100) DEFAULT NULL COMMENT '话题',
  `topic_key` varchar(100) DEFAULT NULL COMMENT '话题key',
  `author` varchar(50) DEFAULT NULL COMMENT '作者',
  `author_avatar` varchar(255) DEFAULT NULL COMMENT '作者头像',
  `author_id` varchar(32) DEFAULT NULL COMMENT '作者id',
  `subject` varchar(200) DEFAULT NULL COMMENT '标题',
  `content` text COMMENT '内容',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `is_top` tinyint(4) DEFAULT '0' COMMENT '是否置顶',
  `is_essence` tinyint(4) DEFAULT '0' COMMENT '是否精华',
  `view_count` int(11) DEFAULT '0' COMMENT '浏览数',
  `reply_count` int(11) DEFAULT '0' COMMENT '回复数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='主题';

CREATE TABLE `forum_reply` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '物理主键',
  `reply_id` varchar(32) DEFAULT NULL COMMENT '回复id',
  `post_id` varchar(32) DEFAULT NULL COMMENT '主题id',
  `author` varchar(50) DEFAULT NULL COMMENT '作者',
  `author_id` varchar(32) DEFAULT NULL COMMENT '作者id',
  `reply_content` text COMMENT '回复内容',
  `reply_time` datetime DEFAULT NULL COMMENT '回复时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='回复';

CREATE TABLE `forum_topic` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '物理主键',
  `topic_id` varchar(32) DEFAULT NULL COMMENT '话题id',
  `topic` varchar(100) DEFAULT NULL COMMENT '话题',
  `topic_key` varchar(100) DEFAULT NULL COMMENT '话题key',
  `list_order` int(11) DEFAULT NULL COMMENT '顺序',
  `status` tinyint(4) DEFAULT '1' COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='话题';