CREATE DATABASE  IF NOT EXISTS `vedisoft` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `vedisoft`;
-- MySQL dump 10.13  Distrib 5.5.62, for debian-linux-gnu (x86_64)
--
-- Host: 127.0.0.1    Database: vedisoft
-- ------------------------------------------------------
-- Server version	5.5.62-0ubuntu0.14.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `prefix` varchar(20) DEFAULT NULL,
  `certi_title` varchar(1000) DEFAULT NULL,
  `duration` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `session`
--

DROP TABLE IF EXISTS `session`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `session` (
  `session_id` int(7) NOT NULL AUTO_INCREMENT,
  `session_name` varchar(20) DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  `created_by` varchar(20) DEFAULT NULL,
  `creation_date` date DEFAULT NULL,
  `last_updated_by` varchar(20) DEFAULT NULL,
  `last_updation_date` date DEFAULT NULL,
  `extra` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`session_id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `fees`
--

DROP TABLE IF EXISTS `fees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fees` (
  `id` int(7) NOT NULL AUTO_INCREMENT,
  `batch_id` int(7) DEFAULT '0',
  `famt` float(7,2) DEFAULT NULL,
  `due_date` date DEFAULT NULL,
  `mode1` varchar(20) DEFAULT NULL,
  `branch_id` int(7) DEFAULT '0',
  `created_by` varchar(20) DEFAULT NULL,
  `creation_date` date DEFAULT NULL,
  `last_creation_by` varchar(20) DEFAULT NULL,
  `last_creation_date` date DEFAULT NULL,
  `extra1` varchar(20) DEFAULT NULL,
  `extra2` int(7) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1015 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `installment`
--

DROP TABLE IF EXISTS `installment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `installment` (
  `id` int(7) NOT NULL AUTO_INCREMENT,
  `receipt_no` int(20) unsigned DEFAULT '0',
  `reg_no` varchar(45) DEFAULT NULL,
  `inst_date` date DEFAULT NULL,
  `amt` float(7,2) DEFAULT NULL,
  `batch_id` int(7) NOT NULL DEFAULT '0',
  `mode1` varchar(20) DEFAULT NULL,
  `chq_no` int(7) DEFAULT NULL,
  `bank` varchar(20) DEFAULT NULL,
  `chq_date` date DEFAULT '1111-11-11',
  `staff_id` int(7) NOT NULL DEFAULT '0',
  `branch_id` int(7) NOT NULL DEFAULT '0',
  `created_by` varchar(20) DEFAULT NULL,
  `creation_date` date DEFAULT NULL,
  `last_created_by` varchar(20) DEFAULT NULL,
  `last_creation_date` date DEFAULT NULL,
  `delivery_date` date DEFAULT NULL,
  `extra2` int(7) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28799 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `batch`
--

DROP TABLE IF EXISTS `batch`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `batch` (
  `batch_id` int(7) NOT NULL AUTO_INCREMENT,
  `code` varchar(45) DEFAULT NULL,
  `faculty_id` int(7) DEFAULT NULL,
  `course_id` int(7) DEFAULT NULL,
  `timings` varchar(20) DEFAULT NULL,
  `sdate` date DEFAULT NULL,
  `days` varchar(20) DEFAULT NULL,
  `enddate` varchar(20) DEFAULT NULL,
  `session_id` int(7) DEFAULT NULL,
  `created_by` varchar(20) DEFAULT NULL,
  `creation_date` date DEFAULT NULL,
  `last_updated_by` varchar(20) DEFAULT NULL,
  `last_updation_date` date DEFAULT NULL,
  `status` varchar(20) DEFAULT 'false',
  `branch_id` int(7) DEFAULT NULL,
  PRIMARY KEY (`batch_id`)
) ENGINE=InnoDB AUTO_INCREMENT=816 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `college_list`
--

DROP TABLE IF EXISTS `college_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `college_list` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(80) CHARACTER SET latin1 COLLATE latin1_bin DEFAULT NULL,
  `prefix` varchar(20) DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=90 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `person_type`
--

DROP TABLE IF EXISTS `person_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `person_type` (
  `person_type_id` int(7) NOT NULL AUTO_INCREMENT,
  `person_type` varchar(20) DEFAULT NULL,
  `created_by` varchar(20) DEFAULT NULL,
  `created_date` date DEFAULT NULL,
  `last_updated_by` varchar(20) DEFAULT NULL,
  `last_updated_date` date DEFAULT NULL,
  PRIMARY KEY (`person_type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `registration_id` int(7) NOT NULL AUTO_INCREMENT,
  `registration_date` date DEFAULT NULL,
  `name` varchar(40) DEFAULT NULL,
  `course` varchar(20) DEFAULT NULL,
  `sem` varchar(20) DEFAULT NULL,
  `laddress` varchar(100) DEFAULT NULL,
  `paddress` varchar(100) DEFAULT NULL,
  `flag` varchar(20) DEFAULT 'yes',
  `dob` date DEFAULT NULL,
  `mno` varchar(20) DEFAULT NULL,
  `pno` varchar(20) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL,
  `campus` varchar(20) DEFAULT NULL,
  `doj` date DEFAULT '1111-11-11',
  `package1` varchar(20) DEFAULT '11111',
  `enquiry_id` int(7) DEFAULT NULL,
  `branch` varchar(20) DEFAULT NULL,
  `college_id` int(7) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `branch_id` int(7) DEFAULT NULL,
  `card_no` int(7) DEFAULT NULL,
  `created_by` varchar(20) DEFAULT NULL,
  `creation_date` date DEFAULT NULL,
  `last_updated_by` varchar(20) DEFAULT NULL,
  `last_updation_date` date DEFAULT NULL,
  `reg_id` varchar(145) DEFAULT NULL,
  `company` varchar(20) DEFAULT 'AAAA',
  `extra3` varchar(120) DEFAULT '0',
  PRIMARY KEY (`registration_id`)
) ENGINE=InnoDB AUTO_INCREMENT=18917 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `branches`
--

DROP TABLE IF EXISTS `branches`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `branches` (
  `branch_id` int(7) NOT NULL AUTO_INCREMENT,
  `branch_name` varchar(20) DEFAULT NULL,
  `branch_prefix` varchar(20) DEFAULT NULL,
  `plot_no` varchar(20) DEFAULT NULL,
  `locality` varchar(20) DEFAULT NULL,
  `street` varchar(20) DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  `state` varchar(20) DEFAULT NULL,
  `branch_manager_id` int(7) DEFAULT '0',
  `branch_contact_no` varchar(20) DEFAULT NULL,
  `multiple_courses` varchar(1000) DEFAULT NULL,
  `estb_date` date DEFAULT NULL,
  `created_by` varchar(20) DEFAULT NULL,
  `creation_date` date DEFAULT NULL,
  `last_updated_by` varchar(20) DEFAULT NULL,
  `last_updation_date` date DEFAULT NULL,
  `extra1` varchar(20) DEFAULT NULL,
  `extra2` int(7) DEFAULT NULL,
  PRIMARY KEY (`branch_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `student_batch`
--

DROP TABLE IF EXISTS `student_batch`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student_batch` (
  `sb_id` int(7) NOT NULL AUTO_INCREMENT,
  `student_id` varchar(200) DEFAULT NULL,
  `batch_id` int(10) unsigned DEFAULT '0',
  `flag` varchar(20) DEFAULT 'yes',
  `created_by` varchar(20) DEFAULT NULL,
  `created_date` date DEFAULT NULL,
  `last_updated_by` varchar(20) DEFAULT NULL,
  `last_updated_date` date DEFAULT NULL,
  `joined` varchar(45) NOT NULL DEFAULT '0',
  `certificate` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`sb_id`)
) ENGINE=InnoDB AUTO_INCREMENT=22015 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `person`
--

DROP TABLE IF EXISTS `person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `person` (
  `person_id` int(7) NOT NULL AUTO_INCREMENT,
  `person_type_id` int(7) DEFAULT NULL,
  `person_name` varchar(20) DEFAULT NULL,
  `designation` varchar(20) DEFAULT NULL,
  `branch_id` int(7) DEFAULT NULL,
  `contact_no` varchar(20) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `plot_no` varchar(200) DEFAULT NULL,
  `street` varchar(200) DEFAULT NULL,
  `locality` varchar(200) DEFAULT NULL,
  `city` varchar(200) DEFAULT NULL,
  `state` varchar(200) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `doj` date DEFAULT NULL,
  `dol` date DEFAULT '1111-11-11',
  `email` varchar(40) DEFAULT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `key1` varchar(20) DEFAULT NULL,
  `active` varchar(20) DEFAULT NULL,
  `card_no` varchar(20) DEFAULT NULL,
  `created_by` varchar(20) DEFAULT NULL,
  `created_date` date DEFAULT NULL,
  `last_updated_by` varchar(20) DEFAULT NULL,
  `last_updated_date` date DEFAULT NULL,
  PRIMARY KEY (`person_id`)
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-04 15:29:53
