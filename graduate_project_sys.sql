CREATE DATABASE IF NOT EXISTS `graduate_project_sys` default charset utf8 COLLATE utf8_general_ci;

USE `graduate_project_sys`;
drop TABLE if EXISTS `admin_info`;
CREATE TABLE IF NOT EXISTS `admin_info` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `login_name` varchar(255) DEFAULT NULL COMMENT '登录名',
 `password` varchar(255) DEFAULT NULL COMMENT '密码',
 `real_name` varchar(255) DEFAULT NULL COMMENT '姓名',
 `cel_phone` varchar(255) DEFAULT NULL COMMENT '联系电话',
 `email` varchar(255) DEFAULT NULL COMMENT '邮箱',
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='管理员';


drop TABLE if EXISTS `college_info`;
CREATE TABLE IF NOT EXISTS `college_info` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `cname` varchar(255) DEFAULT NULL COMMENT '学院名',
 `address` varchar(255) DEFAULT NULL COMMENT '学院地址',
 `contact_tel` varchar(255) DEFAULT NULL COMMENT '联系电话',
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='学院';


drop TABLE if EXISTS `class_info`;
CREATE TABLE IF NOT EXISTS `class_info` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `class_name` varchar(255) DEFAULT NULL COMMENT '班级名',
 `cid` int(11) DEFAULT NULL COMMENT '学院ID',
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='班级';


drop TABLE if EXISTS `grade_info`;
CREATE TABLE IF NOT EXISTS `grade_info` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `gname` varchar(255) DEFAULT NULL COMMENT '年级名',
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='年级';


drop TABLE if EXISTS `term_info`;
CREATE TABLE IF NOT EXISTS `term_info` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `tname` varchar(255) DEFAULT NULL COMMENT '学期名',
 `gid` int(11) DEFAULT NULL COMMENT '年级ID',
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='学期';


drop TABLE if EXISTS `teacher_info`;
CREATE TABLE IF NOT EXISTS `teacher_info` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `tno` varchar(255) DEFAULT NULL COMMENT '工号',
 `password` varchar(255) DEFAULT NULL COMMENT '密码',
 `real_name` varchar(255) DEFAULT NULL COMMENT '姓名',
 `cel_phone` varchar(255) DEFAULT NULL COMMENT '联系电话',
 `email` varchar(255) DEFAULT NULL COMMENT '邮箱',
 `personal_intro` varchar(1000) DEFAULT NULL COMMENT '教学简介',
 `head_img` varchar(200) DEFAULT NULL COMMENT '电子照片',
 `sex` int(11) DEFAULT NULL COMMENT '性别',
 `job_name` varchar(255) DEFAULT NULL COMMENT '职称',
 `is_select` int(11) DEFAULT NULL COMMENT '是否可选',
 `selected_num` int(11) DEFAULT NULL COMMENT '已选学生数',
 `college_id` int(11) DEFAULT NULL COMMENT '所属学院',
 `research_id` int(11) DEFAULT NULL COMMENT '研究方向',
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='导师';


drop TABLE if EXISTS `research_info`;
CREATE TABLE IF NOT EXISTS `research_info` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `rname` varchar(255) DEFAULT NULL COMMENT '类型名',
 `cid` int(11) DEFAULT NULL COMMENT '学院ID',
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='研究方向';


drop TABLE if EXISTS `student_info`;
CREATE TABLE IF NOT EXISTS `student_info` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `stu_no` varchar(255) DEFAULT NULL COMMENT '学号',
 `password` varchar(255) DEFAULT NULL COMMENT '密码',
 `real_name` varchar(255) DEFAULT NULL COMMENT '姓名',
 `cel_phone` varchar(255) DEFAULT NULL COMMENT '联系电话',
 `email` varchar(255) DEFAULT NULL COMMENT '邮箱',
 `head_img` varchar(200) DEFAULT NULL COMMENT '电子照片',
 `sex` int(11) DEFAULT NULL COMMENT '性别',
 `have_turtor` int(11) DEFAULT NULL COMMENT '是否有导师',
 `college_id` int(11) DEFAULT NULL COMMENT '所属学院',
 `class_id` int(11) DEFAULT NULL COMMENT '班级',
 `research_id` int(11) DEFAULT NULL COMMENT '研究方向',
 `grade_id` int(11) DEFAULT NULL COMMENT '年级',
 `term_id` int(11) DEFAULT NULL COMMENT '学期',
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='学生';


drop TABLE if EXISTS `stu_apply_log`;
CREATE TABLE IF NOT EXISTS `stu_apply_log` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `teacher_id` int(11) DEFAULT NULL COMMENT '导师ID',
 `project_title` varchar(255) DEFAULT NULL COMMENT '项目题目',
 `project_intro` varchar(1000) DEFAULT NULL COMMENT '项目介绍',
 `profile` varchar(200) DEFAULT NULL COMMENT '相关文件',
 `stu_remark` varchar(255) DEFAULT NULL COMMENT '学生备注',
 `stu_id` int(11) DEFAULT NULL COMMENT '学生ID',
 `select_status` int(11) DEFAULT NULL COMMENT '申请状态',
 `teacher_remark` varchar(255) DEFAULT NULL COMMENT '导师备注',
 `create_time` varchar(30) DEFAULT NULL COMMENT '申请时间',
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='学生项目申请';


drop TABLE if EXISTS `teacher_eval`;
CREATE TABLE IF NOT EXISTS `teacher_eval` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `project_id` int(11) DEFAULT NULL COMMENT '项目ID',
 `ideologicalmoral` varchar(1000) DEFAULT NULL COMMENT '思想品德',
 `stu_id` int(11) DEFAULT NULL COMMENT '评价学生',
 `learningability` varchar(1000) DEFAULT NULL COMMENT '学习能力',
 `professional_skills` varchar(1000) DEFAULT NULL COMMENT '专业技能',
 `practive` varchar(1000) DEFAULT NULL COMMENT '实践',
 `papergrade` int(11) DEFAULT NULL COMMENT '论文成绩',
 `create_time` varchar(30) DEFAULT NULL COMMENT '评价时间',
 `teacher_id` int(11) DEFAULT NULL COMMENT '导师ID',
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='学业评分';


drop TABLE if EXISTS `stu_file_info`;
CREATE TABLE IF NOT EXISTS `stu_file_info` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `title` varchar(255) DEFAULT NULL COMMENT '标题',
 `file_intro` varchar(1000) DEFAULT NULL COMMENT '简介',
 `file_url` varchar(200) DEFAULT NULL COMMENT '文件',
 `project_id` int(11) DEFAULT NULL COMMENT '项目',
 `create_time` varchar(30) DEFAULT NULL COMMENT '发布时间',
 `teacher_eval` varchar(1000) DEFAULT NULL COMMENT '导师评语',
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='项目文档';


drop TABLE if EXISTS `chat_log`;
CREATE TABLE IF NOT EXISTS `chat_log` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
 `content` varchar(255) DEFAULT NULL COMMENT '聊天内容',
 `is_read` int(11) DEFAULT NULL COMMENT '是否已读',
 `type` int(11) DEFAULT NULL COMMENT '类型',
 `tid` int(11) DEFAULT NULL COMMENT '导师ID',
 `sid` int(11) DEFAULT NULL COMMENT '学生ID',
 `create_time` varchar(30) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='聊天记录';



INSERT INTO `graduate_project_sys`.`admin_info` (`id`,`login_name`,`password`,`real_name`,`cel_phone`,`email`)  VALUES('1','admin','123','姓名0','13052653265','9523895@qq.com');
INSERT INTO `graduate_project_sys`.`admin_info` (`id`,`login_name`,`password`,`real_name`,`cel_phone`,`email`)  VALUES('2','admin1','123','姓名1','13553613261','3216515@qq.com');
INSERT INTO `graduate_project_sys`.`admin_info` (`id`,`login_name`,`password`,`real_name`,`cel_phone`,`email`)  VALUES('3','admin2','123','姓名2','13552623265','8384388333@qq.com');
INSERT INTO `graduate_project_sys`.`admin_info` (`id`,`login_name`,`password`,`real_name`,`cel_phone`,`email`)  VALUES('4','admin3','123','姓名3','13052623165','000020222@qq.com');
INSERT INTO `graduate_project_sys`.`admin_info` (`id`,`login_name`,`password`,`real_name`,`cel_phone`,`email`)  VALUES('5','admin4','123','姓名4','13052633163','3216515@qq.com');
INSERT INTO `graduate_project_sys`.`college_info` (`id`,`cname`,`address`,`contact_tel`)  VALUES('1','学院名0','学院地址0','联系电话0');
INSERT INTO `graduate_project_sys`.`college_info` (`id`,`cname`,`address`,`contact_tel`)  VALUES('2','学院名1','学院地址1','联系电话1');
INSERT INTO `graduate_project_sys`.`college_info` (`id`,`cname`,`address`,`contact_tel`)  VALUES('3','学院名2','学院地址2','联系电话2');
INSERT INTO `graduate_project_sys`.`college_info` (`id`,`cname`,`address`,`contact_tel`)  VALUES('4','学院名3','学院地址3','联系电话3');
INSERT INTO `graduate_project_sys`.`college_info` (`id`,`cname`,`address`,`contact_tel`)  VALUES('5','学院名4','学院地址4','联系电话4');
INSERT INTO `graduate_project_sys`.`class_info` (`id`,`class_name`,`cid`)  VALUES('1','班级名0','4');
INSERT INTO `graduate_project_sys`.`class_info` (`id`,`class_name`,`cid`)  VALUES('2','班级名1','4');
INSERT INTO `graduate_project_sys`.`class_info` (`id`,`class_name`,`cid`)  VALUES('3','班级名2','4');
INSERT INTO `graduate_project_sys`.`class_info` (`id`,`class_name`,`cid`)  VALUES('4','班级名3','3');
INSERT INTO `graduate_project_sys`.`class_info` (`id`,`class_name`,`cid`)  VALUES('5','班级名4','4');
INSERT INTO `graduate_project_sys`.`grade_info` (`id`,`gname`)  VALUES('1','年级名0');
INSERT INTO `graduate_project_sys`.`grade_info` (`id`,`gname`)  VALUES('2','年级名1');
INSERT INTO `graduate_project_sys`.`grade_info` (`id`,`gname`)  VALUES('3','年级名2');
INSERT INTO `graduate_project_sys`.`grade_info` (`id`,`gname`)  VALUES('4','年级名3');
INSERT INTO `graduate_project_sys`.`grade_info` (`id`,`gname`)  VALUES('5','年级名4');
INSERT INTO `graduate_project_sys`.`term_info` (`id`,`tname`,`gid`)  VALUES('1','学期名0','3');
INSERT INTO `graduate_project_sys`.`term_info` (`id`,`tname`,`gid`)  VALUES('2','学期名1','1');
INSERT INTO `graduate_project_sys`.`term_info` (`id`,`tname`,`gid`)  VALUES('3','学期名2','3');
INSERT INTO `graduate_project_sys`.`term_info` (`id`,`tname`,`gid`)  VALUES('4','学期名3','3');
INSERT INTO `graduate_project_sys`.`term_info` (`id`,`tname`,`gid`)  VALUES('5','学期名4','3');
INSERT INTO `graduate_project_sys`.`teacher_info` (`id`,`tno`,`password`,`real_name`,`cel_phone`,`email`,`personal_intro`,`head_img`,`sex`,`job_name`,`is_select`,`selected_num`,`college_id`,`research_id`)  VALUES('1','teacher','123','姓名0','13052653265','129319231@qq.com','教学简介0','http://111.229.176.248/example_img/example4.jpg','2','职称0','2','0','1','2');
INSERT INTO `graduate_project_sys`.`teacher_info` (`id`,`tno`,`password`,`real_name`,`cel_phone`,`email`,`personal_intro`,`head_img`,`sex`,`job_name`,`is_select`,`selected_num`,`college_id`,`research_id`)  VALUES('2','teacher1','123','姓名1','13553613261','000020222@qq.com','教学简介1','http://111.229.176.248/example_img/example7.jpg','2','职称1','1','0','1','1');
INSERT INTO `graduate_project_sys`.`teacher_info` (`id`,`tno`,`password`,`real_name`,`cel_phone`,`email`,`personal_intro`,`head_img`,`sex`,`job_name`,`is_select`,`selected_num`,`college_id`,`research_id`)  VALUES('3','teacher2','123','姓名2','13552623265','636583@qq.com','教学简介2','http://111.229.176.248/example_img/example9.jpg','1','职称2','2','0','1','1');
INSERT INTO `graduate_project_sys`.`teacher_info` (`id`,`tno`,`password`,`real_name`,`cel_phone`,`email`,`personal_intro`,`head_img`,`sex`,`job_name`,`is_select`,`selected_num`,`college_id`,`research_id`)  VALUES('4','teacher3','123','姓名3','13052623165','83838888@qq.com','教学简介3','http://111.229.176.248/example_img/example9.jpg','1','职称3','2','0','2','4');
INSERT INTO `graduate_project_sys`.`teacher_info` (`id`,`tno`,`password`,`real_name`,`cel_phone`,`email`,`personal_intro`,`head_img`,`sex`,`job_name`,`is_select`,`selected_num`,`college_id`,`research_id`)  VALUES('5','teacher4','123','姓名4','13052633163','8523005@qq.com','教学简介4','http://111.229.176.248/example_img/example7.jpg','2','职称4','1','0','3',null);
INSERT INTO `graduate_project_sys`.`research_info` (`id`,`rname`,`cid`)  VALUES('1','类型名0','1');
INSERT INTO `graduate_project_sys`.`research_info` (`id`,`rname`,`cid`)  VALUES('2','类型名1','1');
INSERT INTO `graduate_project_sys`.`research_info` (`id`,`rname`,`cid`)  VALUES('3','类型名2','4');
INSERT INTO `graduate_project_sys`.`research_info` (`id`,`rname`,`cid`)  VALUES('4','类型名3','2');
INSERT INTO `graduate_project_sys`.`research_info` (`id`,`rname`,`cid`)  VALUES('5','类型名4','4');
INSERT INTO `graduate_project_sys`.`student_info` (`id`,`stu_no`,`password`,`real_name`,`cel_phone`,`email`,`head_img`,`sex`,`have_turtor`,`college_id`,`class_id`,`research_id`,`grade_id`,`term_id`)  VALUES('1','student','123','姓名0','13052653265','8384388333@qq.com','http://111.229.176.248/example_img/example7.jpg','1','1','1',null,'2','5',null);
INSERT INTO `graduate_project_sys`.`student_info` (`id`,`stu_no`,`password`,`real_name`,`cel_phone`,`email`,`head_img`,`sex`,`have_turtor`,`college_id`,`class_id`,`research_id`,`grade_id`,`term_id`)  VALUES('2','student1','123','姓名1','13553613261','652316585@qq.com','http://111.229.176.248/example_img/example8.jpg','2','2','2',null,'4','5',null);
INSERT INTO `graduate_project_sys`.`student_info` (`id`,`stu_no`,`password`,`real_name`,`cel_phone`,`email`,`head_img`,`sex`,`have_turtor`,`college_id`,`class_id`,`research_id`,`grade_id`,`term_id`)  VALUES('3','student2','123','姓名2','13552623265','32423422222@qq.com','http://111.229.176.248/example_img/example8.jpg','2','1','4','5','5','2',null);
INSERT INTO `graduate_project_sys`.`student_info` (`id`,`stu_no`,`password`,`real_name`,`cel_phone`,`email`,`head_img`,`sex`,`have_turtor`,`college_id`,`class_id`,`research_id`,`grade_id`,`term_id`)  VALUES('4','student3','123','姓名3','13052623165','3216515@qq.com','http://111.229.176.248/example_img/example4.jpg','1','2','3','4',null,'5',null);
INSERT INTO `graduate_project_sys`.`student_info` (`id`,`stu_no`,`password`,`real_name`,`cel_phone`,`email`,`head_img`,`sex`,`have_turtor`,`college_id`,`class_id`,`research_id`,`grade_id`,`term_id`)  VALUES('5','student4','123','姓名4','13052633163','655236785@qq.com','http://111.229.176.248/example_img/example2.jpg','2','1','2',null,'4','2',null);
INSERT INTO `graduate_project_sys`.`stu_apply_log` (`id`,`teacher_id`,`project_title`,`project_intro`,`profile`,`stu_remark`,`stu_id`,`select_status`,`teacher_remark`,`create_time`)  VALUES('1','4','项目题目0','项目介绍0','http://111.229.176.248/example_img/example4.zip','学生备注0','5','1','导师备注0','2021-04-29 05:55:16');
INSERT INTO `graduate_project_sys`.`stu_apply_log` (`id`,`teacher_id`,`project_title`,`project_intro`,`profile`,`stu_remark`,`stu_id`,`select_status`,`teacher_remark`,`create_time`)  VALUES('2','2','项目题目1','项目介绍1','http://111.229.176.248/example_img/example4.zip','学生备注1','2','2','导师备注1','2021-04-06 14:55:16');
INSERT INTO `graduate_project_sys`.`stu_apply_log` (`id`,`teacher_id`,`project_title`,`project_intro`,`profile`,`stu_remark`,`stu_id`,`select_status`,`teacher_remark`,`create_time`)  VALUES('3','4','项目题目2','项目介绍2','http://111.229.176.248/example_img/example4.zip','学生备注2','4','2','导师备注2','2021-04-11 06:55:16');
INSERT INTO `graduate_project_sys`.`stu_apply_log` (`id`,`teacher_id`,`project_title`,`project_intro`,`profile`,`stu_remark`,`stu_id`,`select_status`,`teacher_remark`,`create_time`)  VALUES('4','1','项目题目3','项目介绍3','http://111.229.176.248/example_img/example4.zip','学生备注3','2','3','导师备注3','2021-04-09 12:55:16');
INSERT INTO `graduate_project_sys`.`stu_apply_log` (`id`,`teacher_id`,`project_title`,`project_intro`,`profile`,`stu_remark`,`stu_id`,`select_status`,`teacher_remark`,`create_time`)  VALUES('5','1','项目题目4','项目介绍4','http://111.229.176.248/example_img/example4.zip','学生备注4','2','1','导师备注4','2021-04-14 01:55:16');
INSERT INTO `graduate_project_sys`.`teacher_eval` (`id`,`project_id`,`ideologicalmoral`,`stu_id`,`learningability`,`professional_skills`,`practive`,`papergrade`,`create_time`,`teacher_id`)  VALUES('1','2','思想品德0','2','学习能力0','专业技能0','实践0','91','2021-04-21 12:55:17','3');
INSERT INTO `graduate_project_sys`.`teacher_eval` (`id`,`project_id`,`ideologicalmoral`,`stu_id`,`learningability`,`professional_skills`,`practive`,`papergrade`,`create_time`,`teacher_id`)  VALUES('2','1','思想品德1','5','学习能力1','专业技能1','实践1','5','2021-05-06 02:55:17','4');
INSERT INTO `graduate_project_sys`.`teacher_eval` (`id`,`project_id`,`ideologicalmoral`,`stu_id`,`learningability`,`professional_skills`,`practive`,`papergrade`,`create_time`,`teacher_id`)  VALUES('3','4','思想品德2','2','学习能力2','专业技能2','实践2','10','2021-04-07 18:55:17','5');
INSERT INTO `graduate_project_sys`.`teacher_eval` (`id`,`project_id`,`ideologicalmoral`,`stu_id`,`learningability`,`professional_skills`,`practive`,`papergrade`,`create_time`,`teacher_id`)  VALUES('4','1','思想品德3','5','学习能力3','专业技能3','实践3','18','2021-04-13 04:55:17','5');
INSERT INTO `graduate_project_sys`.`teacher_eval` (`id`,`project_id`,`ideologicalmoral`,`stu_id`,`learningability`,`professional_skills`,`practive`,`papergrade`,`create_time`,`teacher_id`)  VALUES('5','5','思想品德4','2','学习能力4','专业技能4','实践4','15','2021-04-21 17:55:17','5');
INSERT INTO `graduate_project_sys`.`stu_file_info` (`id`,`title`,`file_intro`,`file_url`,`project_id`,`create_time`,`teacher_eval`)  VALUES('1','标题0','简介0','http://111.229.176.248/example_img/example4.zip','3','2021-04-22 22:55:17','导师评语0');
INSERT INTO `graduate_project_sys`.`stu_file_info` (`id`,`title`,`file_intro`,`file_url`,`project_id`,`create_time`,`teacher_eval`)  VALUES('2','标题1','简介1','http://111.229.176.248/example_img/example4.zip','1','2021-04-24 18:55:17','导师评语1');
INSERT INTO `graduate_project_sys`.`stu_file_info` (`id`,`title`,`file_intro`,`file_url`,`project_id`,`create_time`,`teacher_eval`)  VALUES('3','标题2','简介2','http://111.229.176.248/example_img/example4.zip','3','2021-04-10 16:55:17','导师评语2');
INSERT INTO `graduate_project_sys`.`stu_file_info` (`id`,`title`,`file_intro`,`file_url`,`project_id`,`create_time`,`teacher_eval`)  VALUES('4','标题3','简介3','http://111.229.176.248/example_img/example4.zip','1','2021-05-01 10:55:17','导师评语3');
INSERT INTO `graduate_project_sys`.`stu_file_info` (`id`,`title`,`file_intro`,`file_url`,`project_id`,`create_time`,`teacher_eval`)  VALUES('5','标题4','简介4','http://111.229.176.248/example_img/example4.zip','3','2021-05-02 22:55:17','导师评语4');
INSERT INTO `graduate_project_sys`.`chat_log` (`id`,`content`,`is_read`,`type`,`tid`,`sid`,`create_time`)  VALUES('1','聊天内容0','1','1','4','5','2021-04-22 02:55:17');
INSERT INTO `graduate_project_sys`.`chat_log` (`id`,`content`,`is_read`,`type`,`tid`,`sid`,`create_time`)  VALUES('2','聊天内容1','2','2','1','3','2021-04-28 14:55:17');
INSERT INTO `graduate_project_sys`.`chat_log` (`id`,`content`,`is_read`,`type`,`tid`,`sid`,`create_time`)  VALUES('3','聊天内容2','2','1','5','1','2021-05-03 14:55:17');
INSERT INTO `graduate_project_sys`.`chat_log` (`id`,`content`,`is_read`,`type`,`tid`,`sid`,`create_time`)  VALUES('4','聊天内容3','2','1','1','5','2021-05-02 22:55:17');
INSERT INTO `graduate_project_sys`.`chat_log` (`id`,`content`,`is_read`,`type`,`tid`,`sid`,`create_time`)  VALUES('5','聊天内容4','1','2','5','4','2021-04-22 20:55:17');