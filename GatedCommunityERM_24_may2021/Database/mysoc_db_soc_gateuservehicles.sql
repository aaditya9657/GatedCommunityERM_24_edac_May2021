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
-- Table structure for table `soc_gateuservehicles`
--

DROP TABLE IF EXISTS `soc_gateuservehicles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `soc_gateuservehicles` (
  `id` int NOT NULL AUTO_INCREMENT,
  `in_date` date DEFAULT NULL,
  `in_time` time DEFAULT NULL,
  `out_date` date NOT NULL,
  `out_time` time NOT NULL,
  `society_id` int DEFAULT NULL,
  `user_vehicle_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKra9wkwbkhos2qfauv6sg9ynpi` (`society_id`),
  KEY `FKtowyxqkqb3fwcjk6i500egha0` (`user_vehicle_id`),
  CONSTRAINT `FKra9wkwbkhos2qfauv6sg9ynpi` FOREIGN KEY (`society_id`) REFERENCES `societies` (`id`),
  CONSTRAINT `FKtowyxqkqb3fwcjk6i500egha0` FOREIGN KEY (`user_vehicle_id`) REFERENCES `soc_user_vehicles` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `soc_gateuservehicles`
--

LOCK TABLES `soc_gateuservehicles` WRITE;
/*!40000 ALTER TABLE `soc_gateuservehicles` DISABLE KEYS */;
/*!40000 ALTER TABLE `soc_gateuservehicles` ENABLE KEYS */;
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
