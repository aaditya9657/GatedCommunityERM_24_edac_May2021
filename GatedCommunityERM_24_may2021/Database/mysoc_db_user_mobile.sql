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
-- Table structure for table `user_mobile`
--

DROP TABLE IF EXISTS `user_mobile`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_mobile` (
  `id` int NOT NULL AUTO_INCREMENT,
  `is_primary` bit(1) NOT NULL,
  `mob_no` bigint NOT NULL,
  `user_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_j6gfs7rvofphwq5u71f72wumh` (`mob_no`),
  KEY `FKog05m55ogvh8tvfq0h9q73esj` (`user_id`),
  CONSTRAINT `FKog05m55ogvh8tvfq0h9q73esj` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_mobile`
--

LOCK TABLES `user_mobile` WRITE;
/*!40000 ALTER TABLE `user_mobile` DISABLE KEYS */;
INSERT INTO `user_mobile` VALUES (1,_binary '',7777777777,1),(2,_binary '\0',7777777779,1),(3,_binary '',7777777781,2),(4,_binary '\0',7777777783,2),(5,_binary '',7777777785,3),(6,_binary '\0',7777777787,3),(7,_binary '',7777777789,4),(8,_binary '\0',7777777791,4),(9,_binary '',7777777793,5),(10,_binary '\0',7777777795,5),(15,_binary '',7777777805,8),(16,_binary '\0',7777777807,8),(17,_binary '',7777777809,9),(18,_binary '\0',7777777811,9),(19,_binary '',7777777813,10),(20,_binary '\0',7777777815,10),(21,_binary '',7777777817,11),(22,_binary '\0',7777777819,11),(23,_binary '',7777777821,12),(24,_binary '\0',7777777823,12),(25,_binary '',7777777825,13),(26,_binary '\0',7777777827,13),(27,_binary '',7777777829,14),(28,_binary '\0',7777777831,14),(29,_binary '',7777777833,15),(30,_binary '\0',7777777835,15),(31,_binary '',7777777837,16),(32,_binary '\0',7777777839,16),(33,_binary '',7777777841,17),(34,_binary '\0',7777777843,17),(35,_binary '',7777777845,18),(36,_binary '\0',7777777847,18),(37,_binary '',7777777849,19),(38,_binary '\0',7777777851,19),(39,_binary '',7777777853,20),(40,_binary '\0',7777777855,20),(41,_binary '',7777777857,21),(42,_binary '\0',7777777859,21),(43,_binary '',7777777861,22),(44,_binary '\0',7777777863,22),(45,_binary '',7777777865,23),(46,_binary '\0',7777777867,23),(47,_binary '',7777777869,24),(48,_binary '\0',7777777871,24),(49,_binary '',7777777873,25),(50,_binary '\0',7777777875,25);
/*!40000 ALTER TABLE `user_mobile` ENABLE KEYS */;
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
