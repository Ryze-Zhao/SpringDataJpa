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

 Date: 27/02/2019 12:30:49
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
  PRIMARY KEY (`score_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_score
-- ----------------------------
INSERT INTO `t_score` VALUES (1, '语文', 99);
INSERT INTO `t_score` VALUES (2, '数学', 89);
INSERT INTO `t_score` VALUES (3, '语文', 79);
INSERT INTO `t_score` VALUES (4, '数学', 69);

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

-- ----------------------------
-- Table structure for t_student_score
-- ----------------------------
DROP TABLE IF EXISTS `t_student_score`;
CREATE TABLE `t_student_score`  (
  `t_student_id` bigint(20) NULL DEFAULT NULL,
  `t_score_id` bigint(20) NOT NULL,
  PRIMARY KEY (`t_score_id`) USING BTREE,
  INDEX `FK8je9nl3ml85jq763clxt8qwmg`(`t_student_id`) USING BTREE
) ENGINE = MyISAM CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Fixed;

-- ----------------------------
-- Records of t_student_score
-- ----------------------------
INSERT INTO `t_student_score` VALUES (1, 1);
INSERT INTO `t_student_score` VALUES (1, 2);
INSERT INTO `t_student_score` VALUES (2, 3);
INSERT INTO `t_student_score` VALUES (2, 4);

SET FOREIGN_KEY_CHECKS = 1;
