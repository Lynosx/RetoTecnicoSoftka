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
-- Table structure for table `pregunta`
--

DROP TABLE IF EXISTS `pregunta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pregunta` (
  `id` int NOT NULL AUTO_INCREMENT,
  `pregunta` varchar(100) NOT NULL,
  `categorias_id` int NOT NULL,
  PRIMARY KEY (`id`,`categorias_id`),
  KEY `fk_preguntas_categorias1_idx` (`categorias_id`),
  CONSTRAINT `fk_preguntas_categorias1` FOREIGN KEY (`categorias_id`) REFERENCES `categoria` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pregunta`
--

LOCK TABLES `pregunta` WRITE;
/*!40000 ALTER TABLE `pregunta` DISABLE KEYS */;
INSERT INTO `pregunta` VALUES (1,'Quien es el actual presidente de Colombia',1),(2,'Cual es la ciudad capital de Colombia',1),(3,'Donde nacio Gabriel Garcia Marquez',2),(4,'Ciencia encargada de estudiar la fauna y la flora',2),(5,'Cuantos huesos tiene el cuerpo humano adulto',3),(6,'Si P = M + N, cual de las siguientes formulas es correcta',3),(7,'En que año cayo el muro de Berlin',3),(8,'Cuanto es  2 + 6 * 2 -1',2),(9,'Cuantos lados tiene un heptagono',2),(10,'En que año llego Cristobal Colon a America',3),(11,'Cual es el animal que provoca mas muertes cada año',2),(12,'Cuantas notas musicales existen',3),(13,'Cuantos corazones tiene un gusano de tierra',4),(14,'Cuantos dias hay en 3 años',1),(15,'Cual de las siguientes NO es una ley descrita por Newton',1),(16,'Cuantos años hay en un siglo',1),(17,'En que año empezo la revolucion rusa',4),(18,'Cual fue la primera civilizacion humana',4),(19,'Cual es la luna mas grande de Saturno',4),(20,'Que animales mamiferos son los unicos que pueden volar',4),(21,'En que año se invento la imprenta',5),(22,'Cual es la universidad mas antigua del mundo',5),(23,'Cual es el idioma mas antiguo de europa que sigue en uso',5),(24,'Cual es el deporte mas practicado del mundo',5),(25,'Que era concorde',5);
/*!40000 ALTER TABLE `pregunta` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-13 21:56:12
