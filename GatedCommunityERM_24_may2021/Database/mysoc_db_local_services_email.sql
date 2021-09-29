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
-- Table structure for table `local_services_email`
--

DROP TABLE IF EXISTS `local_services_email`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `local_services_email` (
  `id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(255) NOT NULL,
  `is_primary` bit(1) NOT NULL,
  `local_service_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_4v29tja8ko74excl3v2whwh69` (`email`),
  KEY `FKgcr36y64a8kuep9oh3322tsic` (`local_service_id`),
  CONSTRAINT `FKgcr36y64a8kuep9oh3322tsic` FOREIGN KEY (`local_service_id`) REFERENCES `local_services` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `local_services_email`
--

LOCK TABLES `local_services_email` WRITE;
/*!40000 ALTER TABLE `local_services_email` DISABLE KEYS */;
INSERT INTO `local_services_email` VALUES (1,'girish.joshi0@gmail.com',_binary '',1),(2,'girish.joshi1@gmail.com',_binary '\0',1),(3,'vijay.joshi0@gmail.com',_binary '',2),(4,'vijay.joshi1@gmail.com',_binary '\0',2),(5,'amruta.joshi0@gmail.com',_binary '',3),(6,'amruta.joshi1@gmail.com',_binary '\0',3),(7,'harish.joshi0@gmail.com',_binary '',4),(8,'harish.joshi1@gmail.com',_binary '\0',4),(9,'dinesh.joshi0@gmail.com',_binary '',5),(10,'dinesh.joshi1@gmail.com',_binary '\0',5),(11,'girish.kulkarni0@gmail.com',_binary '',6),(12,'girish.kulkarni1@gmail.com',_binary '\0',6),(13,'vijay.kulkarni0@gmail.com',_binary '',7),(14,'vijay.kulkarni1@gmail.com',_binary '\0',7),(15,'amruta.kulkarni0@gmail.com',_binary '',8),(16,'amruta.kulkarni1@gmail.com',_binary '\0',8),(17,'harish.kulkarni0@gmail.com',_binary '',9),(18,'harish.kulkarni1@gmail.com',_binary '\0',9),(19,'dinesh.kulkarni0@gmail.com',_binary '',10),(20,'dinesh.kulkarni1@gmail.com',_binary '\0',10),(21,'girish.mohite0@gmail.com',_binary '',11),(22,'girish.mohite1@gmail.com',_binary '\0',11),(23,'vijay.mohite0@gmail.com',_binary '',12),(24,'vijay.mohite1@gmail.com',_binary '\0',12),(25,'amruta.mohite0@gmail.com',_binary '',13),(26,'amruta.mohite1@gmail.com',_binary '\0',13),(27,'harish.mohite0@gmail.com',_binary '',14),(28,'harish.mohite1@gmail.com',_binary '\0',14),(29,'dinesh.mohite0@gmail.com',_binary '',15),(30,'dinesh.mohite1@gmail.com',_binary '\0',15),(31,'girish.pawar0@gmail.com',_binary '',16),(32,'girish.pawar1@gmail.com',_binary '\0',16),(33,'vijay.pawar0@gmail.com',_binary '',17),(34,'vijay.pawar1@gmail.com',_binary '\0',17),(35,'amruta.pawar0@gmail.com',_binary '',18),(36,'amruta.pawar1@gmail.com',_binary '\0',18),(37,'harish.pawar0@gmail.com',_binary '',19),(38,'harish.pawar1@gmail.com',_binary '\0',19),(39,'dinesh.pawar0@gmail.com',_binary '',20),(40,'dinesh.pawar1@gmail.com',_binary '\0',20),(41,'girish.sharma0@gmail.com',_binary '',21),(42,'girish.sharma1@gmail.com',_binary '\0',21),(43,'vijay.sharma0@gmail.com',_binary '',22),(44,'vijay.sharma1@gmail.com',_binary '\0',22),(45,'amruta.sharma0@gmail.com',_binary '',23),(46,'amruta.sharma1@gmail.com',_binary '\0',23),(47,'harish.sharma0@gmail.com',_binary '',24),(48,'harish.sharma1@gmail.com',_binary '\0',24),(49,'dinesh.sharma0@gmail.com',_binary '',25),(50,'dinesh.sharma1@gmail.com',_binary '\0',25);
/*!40000 ALTER TABLE `local_services_email` ENABLE KEYS */;
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
