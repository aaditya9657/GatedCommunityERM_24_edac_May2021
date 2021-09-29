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
-- Table structure for table `soc_houses`
--

DROP TABLE IF EXISTS `soc_houses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `soc_houses` (
  `id` int NOT NULL AUTO_INCREMENT,
  `flat_no` int NOT NULL,
  `wing` varchar(255) NOT NULL,
  `society_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK7uv1ttch89qidyp3re71r7eid` (`society_id`),
  CONSTRAINT `FK7uv1ttch89qidyp3re71r7eid` FOREIGN KEY (`society_id`) REFERENCES `societies` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `soc_houses`
--

LOCK TABLES `soc_houses` WRITE;
/*!40000 ALTER TABLE `soc_houses` DISABLE KEYS */;
INSERT INTO `soc_houses` VALUES (1,101,'A',1),(2,102,'A',1),(3,103,'A',1),(4,104,'A',1),(5,201,'A',1),(6,202,'A',1),(7,203,'A',1),(8,204,'A',1),(9,301,'A',1),(10,302,'A',1),(11,303,'A',1),(12,304,'A',1),(13,401,'A',1),(14,402,'A',1),(15,403,'A',1),(16,404,'A',1),(17,101,'A',2),(18,102,'A',2),(19,103,'A',2),(20,104,'A',2),(21,201,'A',2),(22,202,'A',2),(23,203,'A',2),(24,204,'A',2),(25,301,'A',2),(26,302,'A',2),(27,303,'A',2),(28,304,'A',2),(29,401,'A',2),(30,402,'A',2),(31,403,'A',2),(32,404,'A',2);
/*!40000 ALTER TABLE `soc_houses` ENABLE KEYS */;
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
