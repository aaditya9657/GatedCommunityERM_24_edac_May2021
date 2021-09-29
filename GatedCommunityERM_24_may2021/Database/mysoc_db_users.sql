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
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fname` varchar(255) NOT NULL,
  `lname` varchar(255) NOT NULL,
  `mname` varchar(255) DEFAULT NULL,
  `profile_pathname` varchar(255) DEFAULT NULL,
  `uid` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_efqukogbk7i0poucwoy2qie74` (`uid`),
  UNIQUE KEY `UK_r2gdoth0o1614xbpa4vld275i` (`profile_pathname`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'Tanvi','Yevle',NULL,NULL,'u_20210927000001'),(2,'Rutuja','Yevle',NULL,NULL,'u_20210927000002'),(3,'Akanksha','Yevle',NULL,NULL,'u_20210927000003'),(4,'Aditi','Yevle',NULL,NULL,'u_20210927000004'),(5,'Apoorva','Yevle',NULL,NULL,'u_20210927000005'),(8,'Akanksha','Kadam',NULL,NULL,'u_20210927000008'),(9,'Aditi','Kadam',NULL,NULL,'u_20210927000009'),(10,'Apoorva','Kadam',NULL,NULL,'u_20210927000010'),(11,'Tanvi','Patil',NULL,NULL,'u_20210927000011'),(12,'Rutuja','Patil',NULL,NULL,'u_20210927000012'),(13,'Akanksha','Patil',NULL,NULL,'u_20210927000013'),(14,'Aditi','Patil',NULL,NULL,'u_20210927000014'),(15,'Apoorva','Patil',NULL,NULL,'u_20210927000015'),(16,'Tanvi','Deshmukh',NULL,NULL,'u_20210927000016'),(17,'Rutuja','Deshmukh',NULL,NULL,'u_20210927000017'),(18,'Akanksha','Deshmukh',NULL,NULL,'u_20210927000018'),(19,'Aditi','Deshmukh',NULL,NULL,'u_20210927000019'),(20,'Apoorva','Deshmukh',NULL,NULL,'u_20210927000020'),(21,'Tanvi','Adhikari',NULL,NULL,'u_20210927000021'),(22,'Rutuja','Adhikari',NULL,NULL,'u_20210927000022'),(23,'Akanksha','Adhikari',NULL,NULL,'u_20210927000023'),(24,'Aditi','Adhikari',NULL,NULL,'u_20210927000024'),(25,'Apoorva','Adhikari',NULL,NULL,'u_20210927000025');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
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
