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
-- Table structure for table `user_email`
--

DROP TABLE IF EXISTS `user_email`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_email` (
  `id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(255) NOT NULL,
  `is_primary` bit(1) NOT NULL,
  `user_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_qm35y897bny0qjqutviap50yi` (`email`),
  KEY `FKrmuyuv27bd3tu8krjtaod9s2k` (`user_id`),
  CONSTRAINT `FKrmuyuv27bd3tu8krjtaod9s2k` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_email`
--

LOCK TABLES `user_email` WRITE;
/*!40000 ALTER TABLE `user_email` DISABLE KEYS */;
INSERT INTO `user_email` VALUES (1,'tanvi.yevle0@gmail.com',_binary '',1),(2,'tanvi.yevle1@gmail.com',_binary '\0',1),(3,'rutuja.yevle0@gmail.com',_binary '',2),(4,'rutuja.yevle1@gmail.com',_binary '\0',2),(5,'akanksha.yevle0@gmail.com',_binary '',3),(6,'akanksha.yevle1@gmail.com',_binary '\0',3),(7,'aditi.yevle0@gmail.com',_binary '',4),(8,'aditi.yevle1@gmail.com',_binary '\0',4),(9,'apoorva.yevle0@gmail.com',_binary '',5),(10,'apoorva.yevle1@gmail.com',_binary '\0',5),(15,'akanksha.kadam0@gmail.com',_binary '',8),(16,'akanksha.kadam1@gmail.com',_binary '\0',8),(17,'aditi.kadam0@gmail.com',_binary '',9),(18,'aditi.kadam1@gmail.com',_binary '\0',9),(19,'apoorva.kadam0@gmail.com',_binary '',10),(20,'apoorva.kadam1@gmail.com',_binary '\0',10),(21,'tanvi.patil0@gmail.com',_binary '',11),(22,'tanvi.patil1@gmail.com',_binary '\0',11),(23,'rutuja.patil0@gmail.com',_binary '',12),(24,'rutuja.patil1@gmail.com',_binary '\0',12),(25,'akanksha.patil0@gmail.com',_binary '',13),(26,'akanksha.patil1@gmail.com',_binary '\0',13),(27,'aditi.patil0@gmail.com',_binary '',14),(28,'aditi.patil1@gmail.com',_binary '\0',14),(29,'apoorva.patil0@gmail.com',_binary '',15),(30,'apoorva.patil1@gmail.com',_binary '\0',15),(31,'tanvi.deshmukh0@gmail.com',_binary '',16),(32,'tanvi.deshmukh1@gmail.com',_binary '\0',16),(33,'rutuja.deshmukh0@gmail.com',_binary '',17),(34,'rutuja.deshmukh1@gmail.com',_binary '\0',17),(35,'akanksha.deshmukh0@gmail.com',_binary '',18),(36,'akanksha.deshmukh1@gmail.com',_binary '\0',18),(37,'aditi.deshmukh0@gmail.com',_binary '',19),(38,'aditi.deshmukh1@gmail.com',_binary '\0',19),(39,'apoorva.deshmukh0@gmail.com',_binary '',20),(40,'apoorva.deshmukh1@gmail.com',_binary '\0',20),(41,'tanvi.adhikari0@gmail.com',_binary '',21),(42,'tanvi.adhikari1@gmail.com',_binary '\0',21),(43,'rutuja.adhikari0@gmail.com',_binary '',22),(44,'rutuja.adhikari1@gmail.com',_binary '\0',22),(45,'akanksha.adhikari0@gmail.com',_binary '',23),(46,'akanksha.adhikari1@gmail.com',_binary '\0',23),(47,'aditi.adhikari0@gmail.com',_binary '',24),(48,'aditi.adhikari1@gmail.com',_binary '\0',24),(49,'apoorva.adhikari0@gmail.com',_binary '',25),(50,'apoorva.adhikari1@gmail.com',_binary '\0',25);
/*!40000 ALTER TABLE `user_email` ENABLE KEYS */;
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
