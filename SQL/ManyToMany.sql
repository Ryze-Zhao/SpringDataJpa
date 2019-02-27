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

 Date: 27/02/2019 12:29:30
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for many_student
-- ----------------------------
DROP TABLE IF EXISTS `many_student`;
CREATE TABLE `many_student`  (
  `student_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `s_age` int(11) NULL DEFAULT NULL,
  `s_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`student_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of many_student
-- ----------------------------
INSERT INTO `many_student` VALUES (1, 10, '学生1');
INSERT INTO `many_student` VALUES (2, 10, '学生2');

-- ----------------------------
-- Table structure for many_teacher
-- ----------------------------
DROP TABLE IF EXISTS `many_teacher`;
CREATE TABLE `many_teacher`  (
  `teacher_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `t_age` int(11) NULL DEFAULT NULL,
  `t_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`teacher_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of many_teacher
-- ----------------------------
INSERT INTO `many_teacher` VALUES (1, 30, '老师1');
INSERT INTO `many_teacher` VALUES (2, 30, '老师2');

-- ----------------------------
-- Table structure for student_teacher
-- ----------------------------
DROP TABLE IF EXISTS `student_teacher`;
CREATE TABLE `student_teacher`  (
  `g_student_id` bigint(20) NOT NULL,
  `g_teacher_id` bigint(20) NOT NULL,
  INDEX `FKlsqf8qlgsri93eeonw7lby7le`(`g_teacher_id`) USING BTREE,
  INDEX `FKptjv1hvv4n1g70j5qm5yqcv17`(`g_student_id`) USING BTREE
) ENGINE = MyISAM CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Fixed;

-- ----------------------------
-- Records of student_teacher
-- ----------------------------
INSERT INTO `student_teacher` VALUES (1, 1);
INSERT INTO `student_teacher` VALUES (1, 2);
INSERT INTO `student_teacher` VALUES (2, 1);
INSERT INTO `student_teacher` VALUES (2, 2);

-- ----------------------------
-- Table structure for teachaer_student
-- ----------------------------
DROP TABLE IF EXISTS `teachaer_student`;
CREATE TABLE `teachaer_student`  (
  `g_teacher_id` bigint(20) NOT NULL,
  `g_student_id` bigint(20) NOT NULL,
  INDEX `FKgspix2oevghq2q43doyofqmg4`(`g_student_id`) USING BTREE,
  INDEX `FK15ehfxqhov43cb7xv9cqpccot`(`g_teacher_id`) USING BTREE
) ENGINE = MyISAM CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Fixed;

-- ----------------------------
-- Records of teachaer_student
-- ----------------------------
INSERT INTO `teachaer_student` VALUES (1, 1);
INSERT INTO `teachaer_student` VALUES (1, 2);
INSERT INTO `teachaer_student` VALUES (2, 1);
INSERT INTO `teachaer_student` VALUES (2, 2);

SET FOREIGN_KEY_CHECKS = 1;
