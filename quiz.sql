-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: 192.168.0.150    Database: quiz_db
-- ------------------------------------------------------
-- Server version	8.0.20

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
-- Table structure for table `capitals`
--

DROP TABLE IF EXISTS `capitals`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `capitals` (
  `number` int NOT NULL,
  `question` varchar(30) NOT NULL,
  `answer` varchar(30) NOT NULL,
  PRIMARY KEY (`number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `capitals`
--

LOCK TABLES `capitals` WRITE;
/*!40000 ALTER TABLE `capitals` DISABLE KEYS */;
/*!40000 ALTER TABLE `capitals` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clearquiz`
--

DROP TABLE IF EXISTS `clearquiz`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clearquiz` (
  `id` varchar(10) NOT NULL,
  `quiznumber` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clearquiz`
--

LOCK TABLES `clearquiz` WRITE;
/*!40000 ALTER TABLE `clearquiz` DISABLE KEYS */;
/*!40000 ALTER TABLE `clearquiz` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `favoritesquiz`
--

DROP TABLE IF EXISTS `favoritesquiz`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `favoritesquiz` (
  `id` varchar(10) NOT NULL,
  `quiznumber` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `favoritesquiz`
--

LOCK TABLES `favoritesquiz` WRITE;
/*!40000 ALTER TABLE `favoritesquiz` DISABLE KEYS */;
/*!40000 ALTER TABLE `favoritesquiz` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fourletters`
--

DROP TABLE IF EXISTS `fourletters`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fourletters` (
  `number` int NOT NULL,
  `question` varchar(45) NOT NULL,
  `awnser` varchar(45) NOT NULL,
  `hint` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fourletters`
--

LOCK TABLES `fourletters` WRITE;
/*!40000 ALTER TABLE `fourletters` DISABLE KEYS */;
INSERT INTO `fourletters` VALUES (1,'조삼','모사','원숭이');
/*!40000 ALTER TABLE `fourletters` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `music`
--

DROP TABLE IF EXISTS `music`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `music` (
  `number` int NOT NULL,
  `title` varchar(20) NOT NULL,
  `singer` varchar(20) DEFAULT NULL,
  `year` int DEFAULT NULL,
  `playCount` int DEFAULT '0',
  PRIMARY KEY (`number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `music`
--

LOCK TABLES `music` WRITE;
/*!40000 ALTER TABLE `music` DISABLE KEYS */;
INSERT INTO `music` VALUES (1,'조용함',NULL,NULL,0);
/*!40000 ALTER TABLE `music` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` varchar(10) NOT NULL,
  `password` varchar(10) DEFAULT NULL,
  `Manager` tinyint DEFAULT NULL,
  `favorites_ID` varchar(10) DEFAULT NULL,
  `clear_ID` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `clear_ID` FOREIGN KEY (`id`) REFERENCES `clearquiz` (`id`),
  CONSTRAINT `favorites_ID` FOREIGN KEY (`id`) REFERENCES `favoritesquiz` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'quiz_db'
--

--
-- Dumping routines for database 'quiz_db'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-21 17:47:58
