-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: hostel
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `accounts`
--

DROP TABLE IF EXISTS `accounts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `accounts` (
  `acc_id` int NOT NULL,
  `amount` double(12,2) NOT NULL,
  PRIMARY KEY (`acc_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `due`
--

DROP TABLE IF EXISTS `due`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `due` (
  `d_id` int NOT NULL AUTO_INCREMENT,
  `amount` double(12,2) NOT NULL,
  `st_id` int DEFAULT NULL,
  `month` varchar(55) DEFAULT NULL,
  `status` varchar(55) DEFAULT NULL,
  PRIMARY KEY (`d_id`),
  KEY `st_id` (`st_id`),
  CONSTRAINT `due_ibfk_1` FOREIGN KEY (`st_id`) REFERENCES `student` (`s_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `e_id` int NOT NULL AUTO_INCREMENT,
  `e_name` varchar(200) NOT NULL,
  `e_age` int NOT NULL,
  `e_address` varchar(255) NOT NULL,
  `e_mobile` bigint NOT NULL,
  `e_position` varchar(255) NOT NULL,
  `e_salary` double(12,2) NOT NULL,
  `e_status` varchar(50) NOT NULL,
  PRIMARY KEY (`e_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `expense`
--

DROP TABLE IF EXISTS `expense`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `expense` (
  `e_id` int NOT NULL AUTO_INCREMENT,
  `amount` double(12,2) NOT NULL,
  `month` varchar(55) DEFAULT NULL,
  `purpose` varchar(255) DEFAULT NULL,
  `emp_id` int DEFAULT NULL,
  PRIMARY KEY (`e_id`),
  KEY `emp_id` (`emp_id`),
  CONSTRAINT `expense_ibfk_1` FOREIGN KEY (`emp_id`) REFERENCES `employee` (`e_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `income`
--

DROP TABLE IF EXISTS `income`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `income` (
  `i_id` int NOT NULL AUTO_INCREMENT,
  `amount` double(12,2) NOT NULL,
  `st_id` int DEFAULT NULL,
  `month` varchar(55) DEFAULT NULL,
  PRIMARY KEY (`i_id`),
  KEY `st_id` (`st_id`),
  CONSTRAINT `income_ibfk_1` FOREIGN KEY (`st_id`) REFERENCES `student` (`s_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `room`
--

DROP TABLE IF EXISTS `room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `room` (
  `Number` varchar(10) NOT NULL,
  `Activate` varchar(50) DEFAULT NULL,
  `RoomStatus` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`Number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `s_id` int NOT NULL AUTO_INCREMENT,
  `student_name` varchar(200) NOT NULL,
  `mother_name` varchar(200) NOT NULL,
  `father_name` varchar(200) NOT NULL,
  `email` varchar(200) DEFAULT NULL,
  `address` varchar(500) NOT NULL,
  `institue` varchar(500) DEFAULT NULL,
  `n_bid` varchar(50) DEFAULT NULL,
  `mobile_no` bigint NOT NULL,
  `roomno` varchar(50) DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`s_id`),
  UNIQUE KEY `n_bid` (`n_bid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-08-11  0:15:27
