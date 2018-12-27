/*
Navicat MySQL Data Transfer
Source Server         : localhost_3306
Source Server Version : 50559
Source Host           : localhost:3306
Source Database       : umanager
Target Server Type    : MYSQL
Target Server Version : 50559
File Encoding         : 65001
Date: 2018-10-21 01:28:44
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `score` int(11) NOT NULL,
  `auth`int(11) not null ,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'ja', '123', 'ja@1.com','0','1');
INSERT INTO `user` VALUES ('2', 'BL', '123', 'bl@1.com','0','2');
INSERT INTO `user` VALUES ('3', 'QZY', '123', 'bl2@1.com','0','1');
INSERT INTO `user` VALUES ('4', 'YJH', '123', 'bl3@1.com','0','1');