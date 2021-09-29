-- MySQL dump 10.13  Distrib 8.0.24, for Win64 (x86_64)
--
-- Host: localhost    Database: mysoc_db
-- ------------------------------------------------------
-- Server version	8.0.24

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
-- Table structure for table `local_services`
--

DROP TABLE IF EXISTS `local_services`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `local_services` (
  `id` int NOT NULL AUTO_INCREMENT,
  `VehicleType` varchar(255) DEFAULT NULL,
  `fname` varchar(255) NOT NULL,
  `lname` varchar(255) NOT NULL,
  `mname` varchar(255) DEFAULT NULL,
  `profile_pathname` varchar(255) DEFAULT NULL,
  `registration_no` varchar(255) DEFAULT NULL,
  `types` varchar(255) NOT NULL,
  `uid` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_i5ro42v3ygve91f64uyxqadtn` (`uid`),
  UNIQUE KEY `UK_iwdm0wa7qcoqi14yp6pktmohh` (`profile_pathname`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `local_services`
--

LOCK TABLES `local_services` WRITE;
/*!40000 ALTER TABLE `local_services` DISABLE KEYS */;
INSERT INTO `local_services` VALUES (1,'Bike','Girish','Joshi',NULL,NULL,'MH 12 AB 1000','Maid','u_20210927000026'),(2,'Bike','Vijay','Joshi',NULL,NULL,'MH 12 AB 1001','Car Washer','u_20210927000027'),(3,'Bike','Amruta','Joshi',NULL,NULL,'MH 12 AB 1002','Driver','u_20210927000028'),(4,'Bike','Harish','Joshi',NULL,NULL,'MH 12 AB 1003','Carpenter','u_20210927000029'),(5,'Bike','Dinesh','Joshi',NULL,NULL,'MH 12 AB 1004','Plumber','u_20210927000030'),(6,'Bike','Girish','Kulkarni',NULL,NULL,'MH 12 AB 1005','Electrician','u_20210927000031'),(7,'Bike','Vijay','Kulkarni',NULL,NULL,'MH 12 AB 1006','Cook','u_20210927000032'),(8,'Bike','Amruta','Kulkarni',NULL,NULL,'MH 12 AB 1007','Maid','u_20210927000033'),(9,'Bike','Harish','Kulkarni',NULL,NULL,'MH 12 AB 1008','Car Washer','u_20210927000034'),(10,'Bike','Dinesh','Kulkarni',NULL,NULL,'MH 12 AB 1009','Driver','u_20210927000035'),(11,'Bike','Girish','Mohite',NULL,NULL,'MH 12 AB 1010','Carpenter','u_20210927000036'),(12,'Bike','Vijay','Mohite',NULL,NULL,'MH 12 AB 1011','Plumber','u_20210927000037'),(13,'Bike','Amruta','Mohite',NULL,NULL,'MH 12 AB 1012','Electrician','u_20210927000038'),(14,'Bike','Harish','Mohite',NULL,NULL,'MH 12 AB 1013','Cook','u_20210927000039'),(15,'Bike','Dinesh','Mohite',NULL,NULL,'MH 12 AB 1014','Maid','u_20210927000040'),(16,'Bike','Girish','Pawar',NULL,NULL,'MH 12 AB 1015','Car Washer','u_20210927000041'),(17,'Bike','Vijay','Pawar',NULL,NULL,'MH 12 AB 1016','Driver','u_20210927000042'),(18,'Bike','Amruta','Pawar',NULL,NULL,'MH 12 AB 1017','Carpenter','u_20210927000043'),(19,'Bike','Harish','Pawar',NULL,NULL,'MH 12 AB 1018','Plumber','u_20210927000044'),(20,'Bike','Dinesh','Pawar',NULL,NULL,'MH 12 AB 1019','Electrician','u_20210927000045'),(21,'Bike','Girish','Sharma',NULL,NULL,'MH 12 AB 1020','Cook','u_20210927000046'),(22,'Bike','Vijay','Sharma',NULL,NULL,'MH 12 AB 1021','Maid','u_20210927000047'),(23,'Bike','Amruta','Sharma',NULL,NULL,'MH 12 AB 1022','Car Washer','u_20210927000048'),(24,'Bike','Harish','Sharma',NULL,NULL,'MH 12 AB 1023','Driver','u_20210927000049'),(25,'Bike','Dinesh','Sharma',NULL,NULL,'MH 12 AB 1024','Carpenter','u_20210927000050');
/*!40000 ALTER TABLE `local_services` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-09-29 19:56:08
