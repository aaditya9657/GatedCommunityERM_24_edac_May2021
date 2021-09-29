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
-- Table structure for table `soc_user_vehicles`
--

DROP TABLE IF EXISTS `soc_user_vehicles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `soc_user_vehicles` (
  `id` int NOT NULL AUTO_INCREMENT,
  `Type` varchar(255) NOT NULL,
  `registration_no` varchar(255) NOT NULL,
  `house_id` int DEFAULT NULL,
  `society_id` int DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_75032funglrnl9ndr2rstu8xo` (`registration_no`),
  KEY `FKjf0o807l0u9b6qvtwask76av7` (`house_id`),
  KEY `FK3nnd9ttrncalys5w4jwfog5rs` (`society_id`),
  KEY `FKr5tw27q1xm7383oe06w0msptg` (`user_id`),
  CONSTRAINT `FK3nnd9ttrncalys5w4jwfog5rs` FOREIGN KEY (`society_id`) REFERENCES `societies` (`id`),
  CONSTRAINT `FKjf0o807l0u9b6qvtwask76av7` FOREIGN KEY (`house_id`) REFERENCES `soc_houses` (`id`),
  CONSTRAINT `FKr5tw27q1xm7383oe06w0msptg` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=65 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `soc_user_vehicles`
--

LOCK TABLES `soc_user_vehicles` WRITE;
/*!40000 ALTER TABLE `soc_user_vehicles` DISABLE KEYS */;
INSERT INTO `soc_user_vehicles` VALUES (1,'Car','MH 12 AA 1000',1,1,1),(2,'Bike','MH 14 AA 2000',1,1,1),(3,'Car','MH 12 AA 1001',1,1,1),(4,'Bike','MH 14 AA 2001',1,1,1),(5,'Car','MH 12 AA 1002',1,1,2),(6,'Bike','MH 14 AA 2002',1,1,2),(7,'Car','MH 12 AA 1003',1,1,2),(8,'Bike','MH 14 AA 2003',1,1,2),(9,'Car','MH 12 AA 1004',2,1,3),(10,'Bike','MH 14 AA 2004',2,1,3),(11,'Car','MH 12 AA 1005',2,1,3),(12,'Bike','MH 14 AA 2005',2,1,3),(13,'Car','MH 12 AA 1006',2,1,4),(14,'Bike','MH 14 AA 2006',2,1,4),(15,'Car','MH 12 AA 1007',2,1,4),(16,'Bike','MH 14 AA 2007',2,1,4),(17,'Car','MH 12 AA 1008',3,1,5),(18,'Bike','MH 14 AA 2008',3,1,5),(19,'Car','MH 12 AA 1009',3,1,5),(20,'Bike','MH 14 AA 2009',3,1,5),(29,'Car','MH 12 AA 1014',4,1,8),(30,'Bike','MH 14 AA 2014',4,1,8),(31,'Car','MH 12 AA 1015',5,1,9),(32,'Bike','MH 14 AA 2015',5,1,9),(33,'Car','MH 12 AA 1016',5,1,10),(34,'Bike','MH 14 AA 2016',5,1,10),(35,'Car','MH 12 AA 1017',6,1,11),(36,'Bike','MH 14 AA 2017',6,1,11),(37,'Car','MH 12 AA 1018',6,1,12),(38,'Bike','MH 14 AA 2018',6,1,12),(39,'Car','MH 12 AA 1019',7,1,13),(40,'Bike','MH 14 AA 2019',7,1,13),(41,'Car','MH 12 AA 1020',7,1,14),(42,'Bike','MH 14 AA 2020',7,1,14),(43,'Car','MH 12 AA 1021',8,1,15),(44,'Bike','MH 14 AA 2021',8,1,15),(45,'Car','MH 12 AA 1022',8,1,16),(46,'Bike','MH 14 AA 2022',8,1,16),(47,'Car','MH 12 AA 1023',9,1,17),(48,'Bike','MH 14 AA 2023',9,1,17),(49,'Car','MH 12 AA 1024',9,1,18),(50,'Bike','MH 14 AA 2024',9,1,18),(51,'Car','MH 12 AA 1025',10,1,19),(52,'Bike','MH 14 AA 2025',10,1,19),(53,'Car','MH 12 AA 1026',10,1,20),(54,'Bike','MH 14 AA 2026',10,1,20),(55,'Car','MH 12 AA 1027',11,1,21),(56,'Bike','MH 14 AA 2027',11,1,21),(57,'Car','MH 12 AA 1028',11,1,22),(58,'Bike','MH 14 AA 2028',11,1,22),(59,'Car','MH 12 AA 1029',12,1,23),(60,'Bike','MH 14 AA 2029',12,1,23),(61,'Car','MH 12 AA 1030',12,1,24),(62,'Bike','MH 14 AA 2030',12,1,24),(63,'Car','MH 12 AA 1031',13,1,25),(64,'Bike','MH 14 AA 2031',13,1,25);
/*!40000 ALTER TABLE `soc_user_vehicles` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-09-29 19:56:10
