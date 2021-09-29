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
-- Table structure for table `local_services_mobile`
--

DROP TABLE IF EXISTS `local_services_mobile`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `local_services_mobile` (
  `id` int NOT NULL AUTO_INCREMENT,
  `is_primary` bit(1) NOT NULL,
  `mob_no` bigint NOT NULL,
  `local_service_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_aegssshknxyxaar2y572l2xck` (`mob_no`),
  KEY `FKn7dou3fob0bju9omn82l527su` (`local_service_id`),
  CONSTRAINT `FKn7dou3fob0bju9omn82l527su` FOREIGN KEY (`local_service_id`) REFERENCES `local_services` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `local_services_mobile`
--

LOCK TABLES `local_services_mobile` WRITE;
/*!40000 ALTER TABLE `local_services_mobile` DISABLE KEYS */;
INSERT INTO `local_services_mobile` VALUES (1,_binary '',7777777776,1),(2,_binary '\0',7777777778,1),(3,_binary '',7777777780,2),(4,_binary '\0',7777777782,2),(5,_binary '',7777777784,3),(6,_binary '\0',7777777786,3),(7,_binary '',7777777788,4),(8,_binary '\0',7777777790,4),(9,_binary '',7777777792,5),(10,_binary '\0',7777777794,5),(11,_binary '',7777777796,6),(12,_binary '\0',7777777798,6),(13,_binary '',7777777800,7),(14,_binary '\0',7777777802,7),(15,_binary '',7777777804,8),(16,_binary '\0',7777777806,8),(17,_binary '',7777777808,9),(18,_binary '\0',7777777810,9),(19,_binary '',7777777812,10),(20,_binary '\0',7777777814,10),(21,_binary '',7777777816,11),(22,_binary '\0',7777777818,11),(23,_binary '',7777777820,12),(24,_binary '\0',7777777822,12),(25,_binary '',7777777824,13),(26,_binary '\0',7777777826,13),(27,_binary '',7777777828,14),(28,_binary '\0',7777777830,14),(29,_binary '',7777777832,15),(30,_binary '\0',7777777834,15),(31,_binary '',7777777836,16),(32,_binary '\0',7777777838,16),(33,_binary '',7777777840,17),(34,_binary '\0',7777777842,17),(35,_binary '',7777777844,18),(36,_binary '\0',7777777846,18),(37,_binary '',7777777848,19),(38,_binary '\0',7777777850,19),(39,_binary '',7777777852,20),(40,_binary '\0',7777777854,20),(41,_binary '',7777777856,21),(42,_binary '\0',7777777858,21),(43,_binary '',7777777860,22),(44,_binary '\0',7777777862,22),(45,_binary '',7777777864,23),(46,_binary '\0',7777777866,23),(47,_binary '',7777777868,24),(48,_binary '\0',7777777870,24),(49,_binary '',7777777872,25),(50,_binary '\0',7777777874,25);
/*!40000 ALTER TABLE `local_services_mobile` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-09-29 19:56:09
