/*
SQLyog Ultimate v8.55 
MySQL - 5.5.5-10.5.8-MariaDB : Database - hndstudb
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`hndstudb` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `hndstudb`;

/*Table structure for table `tbl_course` */

DROP TABLE IF EXISTS `tbl_course`;

CREATE TABLE `tbl_course` (
  `course_code` varchar(20) NOT NULL,
  `course_name` varchar(150) DEFAULT NULL,
  `created_datetime` timestamp NOT NULL DEFAULT current_timestamp(),
  `created_user` varchar(20) DEFAULT NULL,
  `updated_datetime` varchar(50) DEFAULT NULL,
  `updated_user` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`course_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tbl_course` */

insert  into `tbl_course`(`course_code`,`course_name`,`created_datetime`,`created_user`,`updated_datetime`,`updated_user`) values ('HNDAGRI','Higher National Diploma in Agriculture','2022-08-11 11:27:48',NULL,NULL,NULL),('HNDIT','Higher National Diploma in Information Technology','2022-08-11 11:27:26',NULL,NULL,NULL);

/*Table structure for table `tbl_subject` */

DROP TABLE IF EXISTS `tbl_subject`;

CREATE TABLE `tbl_subject` (
  `subject_code` varchar(20) NOT NULL,
  `subject_name` varchar(150) DEFAULT NULL,
  `course_code` varchar(20) DEFAULT NULL,
  `created_datetime` timestamp NULL DEFAULT current_timestamp(),
  `created_user` varchar(20) DEFAULT NULL,
  `updated_datetime` varchar(50) DEFAULT NULL,
  `updated_user` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`subject_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tbl_subject` */

insert  into `tbl_subject`(`subject_code`,`subject_name`,`course_code`,`created_datetime`,`created_user`,`updated_datetime`,`updated_user`) values ('FOOD','Food Science','HNDFOOD','2022-08-11 11:24:02',NULL,NULL,NULL),('JAVA','Java Programming','HNDIT','2022-08-11 11:23:20',NULL,NULL,NULL),('MICRO','Micro Biology','HNDAGRI','2022-08-11 11:23:51',NULL,NULL,NULL),('PHP','Php programming','HNDIT','2022-08-11 11:23:31',NULL,NULL,NULL);

/*Table structure for table `tbl_user` */

DROP TABLE IF EXISTS `tbl_user`;

CREATE TABLE `tbl_user` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `nic` varchar(12) DEFAULT NULL,
  `gender` varchar(5) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `username` varchar(20) DEFAULT NULL,
  `pword` text DEFAULT NULL,
  `role` varchar(20) DEFAULT NULL,
  `status_code` varchar(20) DEFAULT NULL,
  `couse_code` varchar(20) DEFAULT NULL,
  `created_datetime` timestamp NOT NULL DEFAULT current_timestamp(),
  `created_user` varchar(20) DEFAULT NULL,
  `updated_datetime` varchar(40) DEFAULT NULL,
  `updated_user` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `tbl_user` */

insert  into `tbl_user`(`id`,`first_name`,`last_name`,`nic`,`gender`,`address`,`username`,`pword`,`role`,`status_code`,`couse_code`,`created_datetime`,`created_user`,`updated_datetime`,`updated_user`) values (1,'Saman','Kumara','88558866','M',NULL,'admin','123','ADMIN','ACTIVE',NULL,'2022-08-11 10:28:11',NULL,NULL,NULL),(2,'Kumara','Perera','4566665','F','Negombo','STU001','STU001','STUDENT','ACTIVE','HNDIT','2022-08-11 11:13:56',NULL,NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
