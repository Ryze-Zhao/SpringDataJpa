/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50721
 Source Host           : localhost:3306
 Source Schema         : springdatejpa

 Target Server Type    : MySQL
 Target Server Version : 50721
 File Encoding         : 65001

 Date: 27/02/2019 12:23:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_score
-- ----------------------------
DROP TABLE IF EXISTS `t_score`;
CREATE TABLE `t_score`  (
  `score_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `s_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `s_score` int(11) NULL DEFAULT NULL,
  `s_student_id` bigint(20) NULL DEFAULT NULL,
  PRIMARY KEY (`score_id`) USING BTREE,
  INDEX `FK7la7mahcvs52vtu3x0914qlfb`(`s_student_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_score
-- ----------------------------
INSERT INTO `t_score` VALUES (1, '语文', 99, 1);
INSERT INTO `t_score` VALUES (2, '数学', 89, 1);
INSERT INTO `t_score` VALUES (3, '语文', 79, 2);
INSERT INTO `t_score` VALUES (4, '数学', 69, 2);

-- ----------------------------
-- Table structure for t_student
-- ----------------------------
DROP TABLE IF EXISTS `t_student`;
CREATE TABLE `t_student`  (
  `student_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `s_age` int(11) NULL DEFAULT NULL,
  `s_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`student_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_student
-- ----------------------------
INSERT INTO `t_student` VALUES (1, 11, '测试1');
INSERT INTO `t_student` VALUES (2, 12, '测试2');

SET FOREIGN_KEY_CHECKS = 1;
