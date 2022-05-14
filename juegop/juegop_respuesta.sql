-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: juegop
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `respuesta`
--

DROP TABLE IF EXISTS `respuesta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `respuesta` (
  `id` int NOT NULL AUTO_INCREMENT,
  `respuesta` varchar(100) NOT NULL,
  `correcta` tinyint NOT NULL,
  `preguntas_id` int NOT NULL,
  PRIMARY KEY (`id`,`preguntas_id`),
  KEY `fk_respuestas_preguntas1_idx` (`preguntas_id`),
  CONSTRAINT `fk_respuestas_preguntas1` FOREIGN KEY (`preguntas_id`) REFERENCES `pregunta` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `respuesta`
--

LOCK TABLES `respuesta` WRITE;
/*!40000 ALTER TABLE `respuesta` DISABLE KEYS */;
INSERT INTO `respuesta` VALUES (1,'Ivan Duque',1,1),(2,'Alvaro Velez',0,1),(3,'Gustavo Petro',0,1),(4,'Juan Manuel Santos',0,1),(5,'Medellin',0,2),(6,'Barranquilla',0,2),(7,'Bogota',1,2),(8,'Cali',0,2),(9,'Mexico',0,3),(10,'Chile',0,3),(11,'Venezuela',0,3),(12,'Colombia',1,3),(13,'Genetica',0,4),(14,'Bacteriologia',0,4),(15,'Biologia',1,4),(16,'Quimica',0,4),(17,'236',0,5),(18,'250',0,5),(19,'300',0,5),(20,'206',1,5),(21,'M = P – N',1,6),(22,'N = P + M',0,6),(23,'N = P / M',0,6),(24,'M = P + N',0,6),(25,'1889',0,7),(26,'1989',1,7),(27,'1967',0,7),(28,'1992',0,7),(29,'9',0,8),(30,'8',0,8),(31,'13',1,8),(32,'17',0,8),(33,'9',0,9),(34,'17',0,9),(35,'8',0,9),(36,'7',1,9),(37,'1482',0,10),(38,'1572',0,10),(39,'1492',1,10),(40,'1552',0,10),(41,'Leon',0,11),(42,'Mosquito',1,11),(43,'Tiburon',0,11),(44,'Elefante',0,11),(45,'11',0,12),(46,'12',1,12),(47,'10',0,12),(48,'9',0,12),(49,'5',1,13),(50,'1',0,13),(51,'0',0,13),(52,'3',0,13),(53,'1050',0,14),(54,'1080',0,14),(55,'1095',1,14),(56,'1100',0,14),(57,'Inercia',0,15),(58,'Dinamica',0,15),(59,'Accion y Reaccion',0,15),(60,'Relatividad',1,15),(61,'10',0,16),(62,'50',0,16),(63,'100',1,16),(64,'1000',0,16),(65,'1917',1,17),(66,'1870',0,17),(67,'1920',0,17),(68,'1897',0,17),(69,'Mesopotamica',0,18),(70,'Sumeria',1,18),(71,'Egipcia',0,18),(72,'Fenicia',0,18),(73,'Rea',0,19),(74,'Mimas',0,19),(75,'Tetis',0,19),(76,'Titan',1,19),(77,'Ardilla',0,20),(78,'Ornitorrinco',0,20),(79,'Murcielago',1,20),(80,'Pinguino',0,20),(81,'1533',0,21),(82,'1492',0,21),(83,'1507',0,21),(84,'1440',1,21),(85,'Universidad de Al - Azhar',0,22),(86,'Universidad de Bolonia',1,22),(87,'Universidad de Nalanda',0,22),(88,'Universidad de Salamanca',0,22),(89,'Escoces',0,23),(90,'Hungaro',0,23),(91,'Vasco',1,23),(92,'Sorbio',0,23),(93,'Futbol',0,24),(94,'Natacion',1,24),(95,'Basketball',0,24),(96,'Baseball',0,24),(97,'Avion supersonico',1,25),(98,'Pieza musical',0,25),(99,'Submarino',0,25),(100,'Barco',0,25);
/*!40000 ALTER TABLE `respuesta` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-13 21:56:13
