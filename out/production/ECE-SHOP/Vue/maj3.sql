-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: shopping
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `article`
--

DROP TABLE IF EXISTS `article`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `article` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(100) NOT NULL,
  `description` varchar(1000) NOT NULL,
  `prix` decimal(65,0) NOT NULL,
  `quantité` decimal(65,0) NOT NULL,
  `categorie` varchar(100) DEFAULT NULL,
  `stock` int DEFAULT NULL,
  `remise` int DEFAULT '0',
  `image` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `article`
--

LOCK TABLES `article` WRITE;
/*!40000 ALTER TABLE `article` DISABLE KEYS */;
INSERT INTO `article` VALUES (1,'Pomme_uni','Fruit à chair juteuse et sucrée',1,1,'Fruit',100,0,'Pomme.jpg'),(2,'Pomme_lot','Fruit à chair juteuse et sucrée',8,10,'Fruit',100,0,'Pomme.jpg'),(3,'Banane_uni','Fruit allongé, riche en potassium',1,1,'Fruit',50,0,'Banane.jpg'),(4,'Banane_lot','Fruit allongé, riche en potassium',7,10,'Fruit',50,0,'Banane.jpg'),(5,'Orange_uni','Agrume riche en vitamine C',1,1,'Fruit',75,0,'Orange.jpg'),(6,'Orange_lot','Agrume riche en vitamine C',5,10,'Fruit',75,0,'Orange.jpg'),(7,'Ananas_uni','Fruit tropical sucré et juteux',2,1,'Fruit',30,0,'Ananas.jpg'),(8,'Ananas_lot','Fruit tropical sucré et juteux',16,10,'Fruit',30,0,'Ananas.jpg'),(9,'Fraise_uni','Petit fruit rouge et sucré',1,1,'Fruit',200,0,'Fraise.jpg'),(10,'Fraise_lot','Petit fruit rouge et sucré',10,10,'Fruit',200,0,'Fraise.jpg'),(11,'Raisin_uni','Petit fruit juteux et sucré',2,1,'Fruit',100,0,'Raisin.jpg'),(12,'Raisin_lot','Petit fruit juteux et sucré',12,10,'Fruit',100,0,'Raisin.jpg'),(13,'Mangue_uni','Fruit tropical doux et parfumé',3,1,'Fruit',150,0,'Mangue.jpg'),(14,'Mangue_lot','Fruit tropical doux et parfumé',20,10,'Fruit',150,0,'Mangue.jpg'),(15,'Poire_uni','Fruit à chair fine et parfumée',1,1,'Fruit',75,0,'Poire.jpg'),(16,'Poire_lot','Fruit à chair fine et parfumée',10,10,'Fruit',75,0,'Poire.jpg'),(17,'Kiwi_uni','Petit fruit ovale et acidulé',1,1,'Fruit',40,0,'Kiwi.jpg'),(18,'Kiwi_lot','Petit fruit ovale et acidulé',6,10,'Fruit',40,0,'Kiwi.jpg'),(19,'Citron_lot','Agrume acidulé et rafraîchissant',4,10,'Fruit',60,0,'Citron.jpg'),(20,'Tomate_lot','Légume rouge et juteux',3,5,'Légume',50,0,'Tomate.jpg'),(21,'Concombre_lot','Légume frais et croquant',4,7,'Légume',80,0,'Concombre.jpg'),(22,'Carotte_lot','Légume orange et sucré',2,4,'Légume',100,0,'Carotte.jpg'),(23,'Courgette_uni','Légume vert et doux',1,1,'Légume',60,0,'Courgette.jpg'),(24,'Courgette_lot','Légume vert et doux',5,9,'Légume',60,0,'Courgette.jpg'),(25,'Aubergine_uni','Légume violet et fondant',1,1,'Légume',30,0,'Aubergine.jpg'),(26,'Aubergine_lot','Légume violet et fondant',6,12,'Légume',30,0,'Aubergine.jpg'),(27,'Champignon_lot','Légume blanc et savoureux',3,6,'Légume',150,0,'Champignon.jpg'),(28,'Patate douce_uni','Légume orange et doux',1,1,'Légume',200,0,'Patate douce.jpg'),(29,'Patate douce_lot','Légume orange et doux',8,15,'Légume',200,0,'Patate douce.jpg'),(30,'Oignon_lot','Légume blanc et piquant',2,3,'Légume',100,1,'Oignon.jpg'),(31,'Ail_lot','Légume blanc et parfumé',3,5,'Légume',70,0,'Ail.jpg'),(32,'Riz_uni','Céréale blanche et légère',1,1,'Feculent',250,0,'Riz.jpg'),(33,'Riz_lot','Céréale blanche et légère',8,20,'Feculent',250,0,'Riz.jpg'),(34,'Pâtes_uni','Céréale jaune et savoureuse',1,1,'Feculent',200,0,'Pâtes_.jpg'),(35,'Pâtes_lot','Céréale jaune et savoureuse',6,15,'Feculent',200,0,'Pâtes_.jpg'),(36,'Farine_uni','Ingrédient pour pâtisserie',1,1,'Feculent',500,0,'Farine.jpg'),(37,'Farine_lot','Ingrédient pour pâtisserie',4,10,'Feculent',500,0,'Farine.jpg');
/*!40000 ALTER TABLE `article` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `client`
--

DROP TABLE IF EXISTS `client`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `client` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(100) NOT NULL,
  `prénom` varchar(100) NOT NULL,
  `adresse` varchar(200) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `client`
--

LOCK TABLES `client` WRITE;
/*!40000 ALTER TABLE `client` DISABLE KEYS */;
INSERT INTO `client` VALUES (1,'Durand','Marie','12 rue de la Paix','marie.durand@gmail.com','marie.durand1'),(2,'Martin','Jean','24 avenue des Lilas','jean.martin@yahoo.com','jean.martin1'),(3,'Dubois','Claire','6 rue des Ormes','claire.dubois@hotmail.com','claire.dubois1'),(4,'Lefebvre','Pierre','18 rue de la Gare','pierre.lefebvre@outlook.com','pierre.lefebvre1'),(5,'Moreau','Sophie','9 rue des Champs','sophie.moreau@gmail.com','sophie.moreau1'),(6,'Girard','Antoine','15 boulevard Voltaire','antoine.girard@yahoo.com','antoine.girard1'),(7,'Dupont','Julie','22 avenue de la République','julie.dupont@hotmail.com','julie.dupont1'),(8,'Rousseau','Alexandre','3 rue du Moulin','alexandre.rousseau@gmail.com','alexandre.rousseau1'),(9,'Fontaine','Marion','7 rue des Acacias','marion.fontaine@outlook.com','marion.fontaine1'),(10,'Morel','Lucie','11 avenue de la Liberté','lucie.morel@yahoo.com','lucie.morel1'),(11,'Lemaire','Nicolas','2 rue des Écoles','nicolas.lemaire@gmail.com','nicolas.lemaire1'),(12,'Mercier','Hélène','8 rue du Commerce','helene.mercier@hotmail.com','helene.mercier1'),(13,'Fournier','Thibault','14 avenue de la Gare','thibault.fournier@yahoo.com','thibault.fournier1'),(14,'Dupuis','Camille','5 rue du Temple','camille.dupuis@gmail.com','camille.dupuis1'),(15,'Roger','Mathilde','19 boulevard Saint-Michel','mathilde.roger@hotmail.com','mathilde.roger1'),(16,'Lecomte','Maxime','10 rue de la Poste','maxime.lecomte@yahoo.com','maxime.lecomte1'),(17,'Michel','Emma','16 avenue des Platanes','emma.michel@gmail.com','emma.michel1'),(18,'Perrin','Thomas','1 rue du Château','thomas.perrin@hotmail.com','thomas.perrin1'),(19,'Morin','Charlotte','13 rue du Roi','charlotte.morin@yahoo.com','charlotte.morin1'),(20,'Letexier','Yvick','55 rue de l\'Arbre','yvick.letexier@hotmail.com','yvick.letexier1');
/*!40000 ALTER TABLE `client` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `commande`
--

DROP TABLE IF EXISTS `commande`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `commande` (
  `id` int NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  `id_client` int NOT NULL,
  `total` int NOT NULL,
  `payé` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `commande`
--

LOCK TABLES `commande` WRITE;
/*!40000 ALTER TABLE `commande` DISABLE KEYS */;
INSERT INTO `commande` VALUES (1,'2023-04-02',5,25,1),(2,'2023-04-02',3,15,1),(3,'2023-04-03',4,9,0),(4,'2023-04-04',1,12,0),(5,'2023-04-04',5,7,1),(6,'2023-04-04',2,22,0),(7,'2023-04-04',3,18,1),(8,'2023-04-04',4,9,1),(9,'2023-04-04',5,14,0),(10,'2023-04-05',1,6,1),(11,'2023-04-08',2,19,0),(12,'2023-04-09',5,25,1),(13,'2023-04-10',5,100,1);
/*!40000 ALTER TABLE `commande` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detail_commande`
--

DROP TABLE IF EXISTS `detail_commande`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detail_commande` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_commande` int NOT NULL,
  `id_article` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_commande` (`id_commande`),
  KEY `id_article` (`id_article`),
  CONSTRAINT `detail_commande_ibfk_1` FOREIGN KEY (`id_commande`) REFERENCES `commande` (`id`),
  CONSTRAINT `detail_commande_ibfk_2` FOREIGN KEY (`id_article`) REFERENCES `article` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detail_commande`
--

LOCK TABLES `detail_commande` WRITE;
/*!40000 ALTER TABLE `detail_commande` DISABLE KEYS */;
/*!40000 ALTER TABLE `detail_commande` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employé`
--

DROP TABLE IF EXISTS `employé`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employé` (
  `id` int NOT NULL,
  `nom` varchar(100) NOT NULL,
  `prénom` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `mot_de_passe` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employé`
--

LOCK TABLES `employé` WRITE;
/*!40000 ALTER TABLE `employé` DISABLE KEYS */;
INSERT INTO `employé` VALUES (1,'HOARAU-MARSAC','Clément','clement.hoaraumarsac@edu.ece.fr','clementece'),(2,'BALBUENA-ESPINOLA','Nahuel','nahuel.balbuenaespinola@edu.ece.fr','nahuelece'),(3,'TARIN-DARNIS','Ruben','ruben.tarindarnis@edu.ece.fr','rubenece'),(4,'ZAFFRAN','Achille','achille.zaffran@edu.ece.fr','achilleece');
/*!40000 ALTER TABLE `employé` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-04-14 15:58:32
