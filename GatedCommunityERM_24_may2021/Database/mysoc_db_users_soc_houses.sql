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
-- Table structure for table `users_soc_houses`
--

DROP TABLE IF EXISTS `users_soc_houses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users_soc_houses` (
  `users_id` int NOT NULL,
  `houses_id` int NOT NULL,
  KEY `FKhmlt90ly4s8c3oqcmsigjp88o` (`houses_id`),
  KEY `FKe863ufo6k7fh1f37nnrp9742f` (`users_id`),
  CONSTRAINT `FKe863ufo6k7fh1f37nnrp9742f` FOREIGN KEY (`users_id`) REFERENCES `users` (`id`),
  CONSTRAINT `FKhmlt90ly4s8c3oqcmsigjp88o` FOREIGN KEY (`houses_id`) REFERENCES `soc_houses` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users_soc_houses`
--

LOCK TABLES `users_soc_houses` WRITE;
/*!40000 ALTER TABLE `users_soc_houses` DISABLE KEYS */;
INSERT INTO `users_soc_houses` VALUES (1,1),(1,13),(1,26),(2,1),(2,14),(2,26),(3,2),(3,14),(3,27),(4,2),(4,15),(4,27),(5,3),(5,15),(5,28),(8,4),(8,17),(8,29),(9,5),(9,17),(9,30),(10,5),(10,18),(10,30),(11,6),(11,18),(11,31),(12,6),(12,19),(12,31),(13,7),(13,19),(13,32),(14,7),(14,20),(14,32),(15,8),(15,20),(16,8),(16,21),(17,9),(17,21),(18,9),(18,22),(19,10),(19,22),(20,10),(20,23),(21,11),(21,23),(22,11),(22,24),(23,12),(23,24),(24,12),(24,25),(25,13),(25,25);
/*!40000 ALTER TABLE `users_soc_houses` ENABLE KEYS */;
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
