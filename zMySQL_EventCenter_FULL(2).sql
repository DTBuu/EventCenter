CREATE DATABASE  IF NOT EXISTS `eventcenter` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `eventcenter`;
-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: eventcenter
-- ------------------------------------------------------
-- Server version	8.0.26

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
-- Table structure for table `chutri`
--

DROP TABLE IF EXISTS `chutri`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chutri` (
  `ChuTri_id` int NOT NULL,
  `ChuTri_ten` varchar(100) NOT NULL,
  `ChuTri_gia` float NOT NULL,
  `GhiChu` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ChuTri_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chutri`
--

LOCK TABLES `chutri` WRITE;
/*!40000 ALTER TABLE `chutri` DISABLE KEYS */;
INSERT INTO `chutri` VALUES (1,'Theo yeu cau',0,'Bao gia sau'),(2,'1 MC',2300000,NULL),(3,'1 MC quoc te',4600000,NULL),(4,'2 MC',4000000,NULL),(5,'2 MC quoc te',9000000,NULL);
/*!40000 ALTER TABLE `chutri` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `diadiemtochuc`
--

DROP TABLE IF EXISTS `diadiemtochuc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `diadiemtochuc` (
  `DDTC_id` int NOT NULL AUTO_INCREMENT,
  `DDTC_ten` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `DDTC_SoBanMAX` int NOT NULL,
  `DDTC_GiaMotBan` float NOT NULL DEFAULT '0',
  `GhiChu` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `DDTC_hinhanh` varchar(240) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`DDTC_id`),
  KEY `DDTC_id` (`DDTC_id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diadiemtochuc`
--

LOCK TABLES `diadiemtochuc` WRITE;
/*!40000 ALTER TABLE `diadiemtochuc` DISABLE KEYS */;
INSERT INTO `diadiemtochuc` VALUES (1,'Lau 1 Sanh A',100,5900000,'có phụ thu','https://res.cloudinary.com/springweb/image/upload/v1637201722/sample.jpg'),(2,'Lau 1 Sanh B',200,6900000,'có phụ thu','https://res.cloudinary.com/springweb/image/upload/v1637201722/sample.jpg'),(3,'Lau 1 Sanh C',100,5900000,'có phụ thu','https://res.cloudinary.com/springweb/image/upload/v1637201722/sample.jpg'),(4,'Lau 2 Sanh A',100,5900000,'không phụ thu','https://res.cloudinary.com/springweb/image/upload/v1637201722/sample.jpg'),(5,'Lau 2 Sanh B',200,6900000,'không phụ thu','https://res.cloudinary.com/springweb/image/upload/v1637201722/sample.jpg'),(6,'Lau 2 Sanh C',100,5900000,'không phụ thu','https://res.cloudinary.com/springweb/image/upload/v1637201722/sample.jpg'),(7,'Tang thuong',300,9900000,'abcdef','https://res.cloudinary.com/springweb/image/upload/v1637201722/sample.jpg'),(8,'Khuon vien mat tien',100,4900000,'abcdef','https://res.cloudinary.com/springweb/image/upload/v1637201722/sample.jpg'),(9,'Khuon vien mat hau',100,3900000,'abcdef','https://res.cloudinary.com/springweb/image/upload/v1637201722/sample.jpg'),(10,'Khuon vien ben trai',100,3900000,'không phụ thu','https://res.cloudinary.com/springweb/image/upload/v1637201722/sample.jpg'),(11,'Khuon vien ben phai',100,3900000,'không phụ thu','https://res.cloudinary.com/springweb/image/upload/v1637201722/sample.jpg'),(16,'Alo sdaf',100,9000000,'sadf',NULL);
/*!40000 ALTER TABLE `diadiemtochuc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `giaitri`
--

DROP TABLE IF EXISTS `giaitri`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `giaitri` (
  `GiaiTri_id` int NOT NULL,
  `GiaiTri_ten` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `GiaiTri_gia` float NOT NULL,
  `GhiChu` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`GiaiTri_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `giaitri`
--

LOCK TABLES `giaitri` WRITE;
/*!40000 ALTER TABLE `giaitri` DISABLE KEYS */;
INSERT INTO `giaitri` VALUES (1,'Theo yeu cau',0,'Bao gia sau'),(2,'1 show 1 nghe si',9000000,NULL),(3,'1 show 1 nghe si hang A',19990000,NULL),(4,'2 show 2 nghe si ',15000000,NULL),(5,'2 show 2 nghe si hang A',34990000,NULL);
/*!40000 ALTER TABLE `giaitri` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `items`
--

DROP TABLE IF EXISTS `items`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `items` (
  `Item_id` int NOT NULL,
  `Item_loai` varchar(100) NOT NULL,
  `Item_ten` varchar(100) NOT NULL,
  `Item_DonVi` varchar(100) NOT NULL,
  `Item_GiaMotDV` float NOT NULL,
  `GhiChu` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`Item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `items`
--

LOCK TABLES `items` WRITE;
/*!40000 ALTER TABLE `items` DISABLE KEYS */;
INSERT INTO `items` VALUES (1,'Mon An','Mon An A','Phan',89000,NULL),(2,'Mon An','Mon An B','Phan',79000,NULL),(3,'Mon An ','Mon An C ','Phan',99000,NULL),(4,'Mon An ','Mon An D','Phan',87000,NULL),(5,'Mon An ','Mon An E','Phan ',77000,NULL),(6,'Mon An ','Mon An F','Phan',97000,NULL),(7,'Mon An','Mon An G','Phan',91000,NULL),(8,'Mon An ','Mon An H','Phan',81000,NULL),(9,'Mon An ','Mon An I','Phan',101000,NULL),(10,'Mon An ','Mon An J','Phan',109000,NULL),(11,'Mon An ','Mon An K','Phan',66000,NULL),(12,'Mon An ','Mon An L','Phan',73000,NULL),(13,'Mon An ','Mon An M','Phan',128000,NULL),(14,'Mon An ','Mon An N','Phan',33000,NULL),(15,'Mon An','Mon An O','Phan',169000,NULL),(16,'Mon An ','Mon An P','Phan',150000,NULL),(17,'Mon An ','Mon An Q','Phan',95000,NULL),(18,'Mon An ','Mon An R','Phan',164000,NULL),(19,'Mon An ','Mon An S','Phan',66000,NULL),(20,'Mon An','Mon An T','Phan',198000,NULL),(21,'Thuc Uong','Bia A','Lon',39000,NULL),(22,'Thuc Uong','Bia B','Lon',39000,NULL),(23,'Thuc Uong','Bia C','Lon',27000,NULL),(24,'Thuc Uong','Bia D','Lon',27000,NULL),(25,'Thuc Uong','Bia E','Lon',63000,NULL),(26,'Thuc Uong','Ruou A','Chai',9800000,NULL),(27,'Thuc Uong','Ruou B','Chai',14900000,NULL),(28,'Thuc Uong','Ruou C','Chai',13300000,NULL),(29,'Thuc Uong','Ruou D','Chai',10990000,NULL),(30,'Thuc Uong','Ruou E','Chai',19250000,NULL);
/*!40000 ALTER TABLE `items` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `items_in_menus`
--

DROP TABLE IF EXISTS `items_in_menus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `items_in_menus` (
  `Menu_id` int NOT NULL,
  `Item_id` int NOT NULL,
  `GiaMotDV` float NOT NULL,
  `SoLuong` int NOT NULL,
  `GhiChu` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`Menu_id`,`Item_id`),
  KEY `Item_id` (`Item_id`),
  CONSTRAINT `items_in_menus_ibfk_1` FOREIGN KEY (`Menu_id`) REFERENCES `menus` (`Menu_id`),
  CONSTRAINT `items_in_menus_ibfk_2` FOREIGN KEY (`Item_id`) REFERENCES `items` (`Item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `items_in_menus`
--

LOCK TABLES `items_in_menus` WRITE;
/*!40000 ALTER TABLE `items_in_menus` DISABLE KEYS */;
INSERT INTO `items_in_menus` VALUES (1,2,1212,1212,NULL),(2,1,89000,50,NULL),(2,2,79000,50,NULL),(2,3,99000,50,NULL),(2,4,87000,50,NULL),(2,26,9800000,50,NULL),(3,5,77000,50,NULL),(3,6,97000,50,NULL),(3,7,91000,50,NULL),(3,8,81000,50,NULL),(3,27,14900000,50,NULL),(4,9,101000,50,NULL),(4,10,109000,50,NULL),(4,11,66000,50,NULL),(4,12,73000,50,NULL),(4,28,13300000,50,NULL),(5,17,95000,50,NULL),(5,18,164000,50,NULL),(5,19,66000,50,NULL),(5,20,198000,50,NULL),(6,13,128000,50,NULL),(6,14,33000,50,NULL),(6,15,169000,50,NULL),(6,16,150000,50,NULL),(6,29,10990000,50,NULL),(7,1,1212,1212,NULL),(7,2,2313,123123,NULL),(7,3,123123,1321312,NULL),(7,4,12321,131132,NULL),(7,29,12,31,NULL);
/*!40000 ALTER TABLE `items_in_menus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `khachhang`
--

DROP TABLE IF EXISTS `khachhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `khachhang` (
  `KhachHang_id` int NOT NULL AUTO_INCREMENT,
  `Login_id` int DEFAULT NULL,
  `Ho` varchar(100) NOT NULL,
  `Ten` varchar(100) NOT NULL,
  `NgaySinh` date NOT NULL,
  `QueQuan` varchar(100) NOT NULL,
  `Sdt` varchar(10) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `GhiChu` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`KhachHang_id`),
  KEY `Login_id` (`Login_id`),
  CONSTRAINT `khachhang_ibfk_1` FOREIGN KEY (`Login_id`) REFERENCES `logins` (`Login_id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khachhang`
--

LOCK TABLES `khachhang` WRITE;
/*!40000 ALTER TABLE `khachhang` DISABLE KEYS */;
INSERT INTO `khachhang` VALUES (1,NULL,'AJDYA','AJDYA','1998-08-12','Tay Ninh','9487859132','AJDYA',NULL),(2,NULL,'YXBAI','YXBAI','1995-06-23','Nam Dinh','9104375610','YXBAI',NULL),(3,NULL,'JXCDL','JXCDL','1991-04-15','Thanh Hoa','4144298113','JXCDL',NULL),(4,NULL,'HPOAM','HPOAM','1994-10-07','Kon Tum','2154889265','HPOAM',NULL),(5,NULL,'VSXAD','VSXAD','1990-01-11','Bac Giang','3605646263','VSXAD',NULL),(6,NULL,'GRWFV','GRWFV','1996-03-09','Bac Ninh','3633111936','GRWFV',NULL),(7,NULL,'YYOGS','YYOGS','1993-02-25','Ha Giang','3964960713','YYOGS',NULL),(8,NULL,'XVOFF','XVOFF','1995-10-08','Thanh Hoa','0486655991','XVOFF',NULL),(9,NULL,'TDUFK','TDUFK','1992-03-23','Lang Son','8604683836','TDUFK',NULL),(10,NULL,'UTBCY','UTBCY','1991-01-29','Ba Ria - Vung Tau','3575516117','UTBCY',NULL),(11,12,'zxczcx','zcxccxczx','2000-01-01','nzcn','0909000000','abc@gmail.com',NULL),(12,13,'mnnmb','cmncnmc','2000-01-01','cxcnvn','0909090090','abc@gmaill.com',NULL),(13,14,'diep','phi','2000-01-02','binh son','0909090090','abc@gmail.com',NULL),(14,15,'abc','abc','2000-01-01','bs','0909000000','bac@gmail.com',NULL),(15,16,'Nguyen Van','A','2000-01-01','qunag ngai','0909000000','dipe@gmail.com',NULL),(16,17,'Nguyen Van','A','2000-01-01','qunag ngai','0909000000','dipe@gmail.com',NULL),(17,18,'','A','2000-01-01','qunag ngai','0909000000','dipe@gmail.com',NULL),(18,19,'Nguyen Van','Tuan','2000-01-01','qunag ngai','0909000000','dipe@gmail.com',NULL),(19,20,'Nguyen','A','2000-01-01','ququq','0909090909','diep@gmail.com',NULL),(20,21,'phi','phi','2000-01-01','quan','0909000000','diep@gmail.com',NULL),(21,22,'Diep hoang','phi','2000-01-01','quang ngai','0900900900','email@gmail.com',NULL);
/*!40000 ALTER TABLE `khachhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `logins`
--

DROP TABLE IF EXISTS `logins`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `logins` (
  `Login_id` int NOT NULL AUTO_INCREMENT,
  `Login_loai` varchar(100) DEFAULT NULL,
  `Login_user` varchar(100) NOT NULL,
  `Login_pass` varchar(100) NOT NULL,
  `GhiChu` varchar(100) DEFAULT NULL,
  `Login_avatar` varchar(240) DEFAULT NULL,
  PRIMARY KEY (`Login_id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `logins`
--

LOCK TABLES `logins` WRITE;
/*!40000 ALTER TABLE `logins` DISABLE KEYS */;
INSERT INTO `logins` VALUES (1,'manager','dtbuu','111',NULL,NULL),(2,'manager','dhphi','111',NULL,NULL),(3,'staff','tkbao','333',NULL,NULL),(4,'staff','dtdat','555',NULL,NULL),(5,'staff','llrot','444',NULL,NULL),(6,'staff','phucvu','222',NULL,NULL),(7,'staff','daubep','333',NULL,NULL),(8,'staff','vesinh','444',NULL,NULL),(9,'staff','ketoan','777',NULL,NULL),(10,'staff','letan','666',NULL,NULL),(11,'staff','baove','555',NULL,NULL),(12,'guest','ba','$2a$10$3PPowuLLJ0VSGKMsEhdqVufEYNVLOjD2UjEAAEcnQDur5VZoiNVYq',NULL,NULL),(13,'guest','nvnv','$2a$10$G2vrAShNdQO6cpuDIuuMje1ptKFJ1h8IoTuZ2fuJyN0.C0.jZTPZy',NULL,NULL),(14,'manager','phi','$2a$10$L1NebCwzBCUhfU9r1.EySukWvHp7rMnn59v3kQXXEl742zgPatq/q',NULL,NULL),(15,'guest','admin','$2a$10$dCK40d.r27AJh3WGRU4sS.Kk4ZM2trv55RH.ounfmEqModYn.754i',NULL,NULL),(16,'guest','alo','$2a$10$/y4N.89LqpjEebEzCzN1beIBVQMpg3wFjd33Jvb2z7dsXR8Jvk1LK',NULL,NULL),(17,'guest','test','$2a$10$oFSzpFXK6A3h5WwtIKyPRecay2prWr346DWLAzwYgShbed5sdGvsi',NULL,NULL),(18,'guest','test2','$2a$10$CenCXZKXsLb5o0bgnqoUiu1NHBItbxx3QH458E5I1kvFtypnDRI/6',NULL,'https://res.cloudinary.com/springweb/image/upload/v1637659166/elmu6kwjzgbujpckiwlq.png'),(19,'guest','test3','$2a$10$BIR.TVIVRoHANvHqqWrzFuhKfi0SV9ZZpIxt5pALY.mhRjXLD6f2.',NULL,'https://res.cloudinary.com/springweb/image/upload/v1637201722/sample.jpg'),(20,'guest','test4','$2a$10$RPaRoC2lxVdJzYgUDGjZfea9M9Q8omRhF9fmbAF0v3Oeb.NJ3t2mC',NULL,'https://res.cloudinary.com/springweb/image/upload/v1637765086/vanmmvp1ztx0blcfbmpq.png'),(21,'guest','thu','$2a$10$j6m.U7FTHoMOOeHl1aneY.uP/lpYRi9wGIF7BNEnH/Jc8SJRJHxnm',NULL,'https://res.cloudinary.com/springweb/image/upload/v1638199095/ahahk9wfvaele44mwxwz.png'),(22,'guest','test7','$2a$10$WPG5I1b17SbiIc2um7H58uLvLG5pULN5q1HMdyCVLpRaTMcuKokM2',NULL,'https://res.cloudinary.com/springweb/image/upload/v1638774678/ectqyntwpzuip4u6chxt.jpg');
/*!40000 ALTER TABLE `logins` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menus`
--

DROP TABLE IF EXISTS `menus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `menus` (
  `Menu_id` int NOT NULL,
  `Menu_ten` varchar(100) NOT NULL,
  `GhiChu` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`Menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menus`
--

LOCK TABLES `menus` WRITE;
/*!40000 ALTER TABLE `menus` DISABLE KEYS */;
INSERT INTO `menus` VALUES (1,'Theo yeu cau','Bao gia sau'),(2,'Am thuc Mien Bac',NULL),(3,'Am thuc Mien Trung',NULL),(4,'Am thuc Mien Nam',NULL),(5,'Am thuc chay',NULL),(6,'Am thuc Phuong Tay',NULL),(7,'dfadsfasdf',NULL);
/*!40000 ALTER TABLE `menus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nhanvien`
--

DROP TABLE IF EXISTS `nhanvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nhanvien` (
  `NhanVien_id` int NOT NULL AUTO_INCREMENT,
  `Login_id` int DEFAULT NULL,
  `Ho` varchar(100) NOT NULL,
  `Ten` varchar(100) NOT NULL,
  `ViTri_id` int NOT NULL,
  `NgaySinh` date NOT NULL,
  `QueQuan` varchar(100) NOT NULL,
  `Sdt` varchar(10) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `GhiChu` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`NhanVien_id`),
  KEY `Login_id` (`Login_id`),
  KEY `ViTri_id` (`ViTri_id`),
  CONSTRAINT `nhanvien_ibfk_1` FOREIGN KEY (`Login_id`) REFERENCES `logins` (`Login_id`),
  CONSTRAINT `nhanvien_ibfk_2` FOREIGN KEY (`ViTri_id`) REFERENCES `vitri` (`ViTri_id`)
) ENGINE=InnoDB AUTO_INCREMENT=110 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhanvien`
--

LOCK TABLES `nhanvien` WRITE;
/*!40000 ALTER TABLE `nhanvien` DISABLE KEYS */;
INSERT INTO `nhanvien` VALUES (1,1,'Duong Tan','Buu',1,'2000-01-01','Ho Chi Minh','0909382319','1851010015buu@ou.edu.vn',NULL),(2,2,'Diep Hoang','Phi',1,'2000-01-01','Quang Ngai','0909000000','1851010097phi@ou.edu.vn',NULL),(3,3,'Tran Kim','Bao',3,'2000-01-01','Ho Chi Minh','0909000000','1851010015bao@ou.edu.vn',NULL),(4,4,'Dao Tien','Dat',5,'2000-01-01','Hai Phong','0909000000','1851010023dat@ou.edu.vn',NULL),(5,5,'Lap Lui','Rot',4,'2000-01-01','Hai Phong','0909000000','1851010023rot@ou.edu.vn',NULL),(6,6,'Tran Le','Phuong',2,'2000-12-30','Ho Chi Minh','0909000000','email@gmail.com',NULL),(7,6,'Nguyen Hoang Minh','Khang',2,'2000-12-30','Ho Chi Minh','0909000000','email@gmail.com',NULL),(8,6,'Dang Thanh','Phuoc',2,'2000-12-30','Ho Chi Minh','0909000000','email@gmail.com',NULL),(9,6,'Le Manh','Tai',2,'2000-12-30','Ho Chi Minh','0909000000','email@gmail.com',NULL),(10,6,'Nguyen Chi','Thang',2,'2000-12-30','Ho Chi Minh','0909000000','email@gmail.com',NULL),(11,6,'Nguyen Minh','Tri',2,'2000-12-30','Ho Chi Minh','0909000000','email@gmail.com',NULL),(12,6,'Nguyen Hong Phuong','Uyen',2,'2000-12-30','Ho Chi Minh','0909000000','email@gmail.com',NULL),(13,6,'Nguyen Duy Minh','Hoang',2,'2000-12-30','Ho Chi Minh','0909000000','email@gmail.com',NULL),(14,6,'Tran Vu Ngoc','Huy',2,'2000-12-30','Ho Chi Minh','0909000000','email@gmail.com',NULL),(15,6,'Le Minh','Tan',2,'2000-12-30','Ho Chi Minh','0909000000','email@gmail.com',NULL),(16,6,'Nguyen Hoang','Duy',2,'2000-12-30','Ho Chi Minh','0909000000','email@gmail.com',NULL),(17,6,'Hoang Duc','Luu',2,'2000-12-30','Ho Chi Minh','0909000000','email@gmail.com',NULL),(18,6,'Trang Thi Diem','Mai',2,'2000-12-30','Ho Chi Minh','0909000000','email@gmail.com',NULL),(19,6,'Tran Phuong','Nam',2,'2000-12-30','Ho Chi Minh','0909000000','email@gmail.com',NULL),(20,6,'Hoang','Quang',2,'2000-12-30','Ho Chi Minh','0909000000','email@gmail.com',NULL),(21,6,'Ho Tan','Tai',2,'2000-12-30','Ho Chi Minh','0909000000','email@gmail.com',NULL),(22,6,'Luu Thanh','Tam',2,'2000-12-30','Ho Chi Minh','0909000000','email@gmail.com',NULL),(23,6,'Ho Hoang Hung','Thinh',2,'2000-12-30','Ho Chi Minh','0909000000','email@gmail.com',NULL),(24,6,'Hong Thanh','Thuan',2,'2000-12-30','Ho Chi Minh','0909000000','email@gmail.com',NULL),(25,6,'Truong Bao','Thuan',2,'2000-12-30','Ho Chi Minh','0909000000','email@gmail.com',NULL),(26,6,'Bui Duc','Tien',2,'2000-12-30','Ho Chi Minh','0909000000','email@gmail.com',NULL),(27,6,'Tran Minh','Truyen',2,'2000-12-30','Ho Chi Minh','0909000000','email@gmail.com',NULL),(28,6,'Ngo Thanh','Long',2,'2000-12-30','Ho Chi Minh','0909000000','email@gmail.com',NULL),(29,6,'Trinh Ngoc','Tinh',2,'2000-12-30','Ho Chi Minh','0909000000','email@gmail.com',NULL),(30,6,'Dinh Ngoc','An',2,'2000-12-30','Ho Chi Minh','0909000000','email@gmail.com',NULL),(31,6,'Tang Dai','An',2,'2000-12-30','Da Nang','0909000000','email@gmail.com',NULL),(32,6,'Hoang Tuan','Anh',2,'2000-12-30','Da Nang','0909000000','email@gmail.com',NULL),(33,6,'Huynh The','Bao',2,'2000-12-30','Da Nang','0909000000','email@gmail.com',NULL),(34,6,'Nguyen Nguyet Phuong','Bao',2,'2000-12-30','Da Nang','0909000000','email@gmail.com',NULL),(35,6,'Dinh Quoc','Duy',2,'2000-12-30','Da Nang','0909000000','email@gmail.com',NULL),(36,6,'Ha My','Duyen',2,'2000-12-30','Da Nang','0909000000','email@gmail.com',NULL),(37,6,'Manh The','Dung',2,'2000-12-30','Da Nang','0909000000','email@gmail.com',NULL),(38,6,'Huynh Phuoc','Dat',2,'2000-12-30','Da Nang','0909000000','email@gmail.com',NULL),(39,6,'Le Dinh','Dat',2,'2000-12-30','Da Nang','0909000000','email@gmail.com',NULL),(40,6,'Trinh Chan','Dat',2,'2000-12-30','Da Nang','0909000000','email@gmail.com',NULL),(41,6,'Tran Thanh Bao','Dang',2,'2000-12-30','Da Nang','0909000000','email@gmail.com',NULL),(42,6,'Do Viet','Dinh',2,'2000-12-30','Da Nang','0909000000','email@gmail.com',NULL),(43,6,'Do Trong','Duc',2,'2000-12-30','Da Nang','0909000000','email@gmail.com',NULL),(44,6,'Cao Ba','Giang',2,'2000-12-30','Da Nang','0909000000','email@gmail.com',NULL),(45,6,'Bui Duc Nhat','Hao',2,'2000-12-30','Da Nang','0909000000','email@gmail.com',NULL),(46,6,'Tran Le Nhat','Hao',2,'2000-12-30','Da Nang','0909000000','email@gmail.com',NULL),(47,6,'Nguyen Hoang Minh','Hai',2,'2000-12-30','Da Nang','0909000000','email@gmail.com',NULL),(48,6,'Nguyen Thanh','Hang',2,'2000-12-30','Da Nang','0909000000','email@gmail.com',NULL),(49,6,'Bui Xuan','Hieu',2,'2000-12-30','Da Nang','0909000000','email@gmail.com',NULL),(50,6,'Vo Dinh','Huy',2,'2000-12-30','Da Nang','0909000000','email@gmail.com',NULL),(51,6,'Nguyen Quoc','Hung',2,'2000-12-30','Ha Noi','0909000000','email@gmail.com',NULL),(52,6,'Do Vo Anh','Khoa',2,'2000-12-30','Ha Noi','0909000000','email@gmail.com',NULL),(53,6,'Nguyen Minh','Khoi',2,'2000-12-30','Ha Noi','0909000000','email@gmail.com',NULL),(54,6,'Tat Quang','Kiet',2,'2000-12-30','Ha Noi','0909000000','email@gmail.com',NULL),(56,6,'Dinh Quang','Linh',2,'2000-12-30','Ha Noi','0909000000','email@gmail.com',NULL),(57,7,'Tran Nhat','Long',3,'1990-07-06','Hue','0909000000','email@gmail.com',NULL),(58,7,'Nguyen Hoang Duy','Loc',3,'1991-08-07','Dong Nai','0909000000','email@gmail.com',NULL),(59,7,'Tran Xuan','Loc',3,'1992-09-08','Bac Giang','0909000000','email@gmail.com',NULL),(60,7,'Nguyen Cong','Minh',3,'1993-10-09','Hai Duong','0909000000','email@gmail.com',NULL),(61,7,'Pham Quang','Minh',3,'1994-11-10','Quang Ninh','0909000000','email@gmail.com',NULL),(62,7,'Pham Chi','Nang',3,'1995-12-11','Vinh','0909000000','email@gmail.com',NULL),(63,7,'Le Nguyen Kim','Ngan',3,'1996-01-13','Lao Cai','0909000000','email@gmail.com',NULL),(64,7,'Tran Bao','Ngan',3,'1997-02-14','Lam Dong','0909000000','email@gmail.com',NULL),(65,7,'Dang Hoang','Nguyen',3,'1998-03-15','Da Lat','0909000000','email@gmail.com',NULL),(66,7,'Ma Hoang Hai','Nguyen',3,'1999-04-16','Son La','0909000000','email@gmail.com',NULL),(67,8,'Phan Van','Nguyen',4,'2000-12-30','Yen Bai','0909000000','email@gmail.com',NULL),(68,8,'Pham Thi Hong','Ngu',4,'2000-12-30','Yen Bai','0909000000','email@gmail.com',NULL),(69,8,'Dao Thanh','Nhan',4,'2000-12-30','Yen Bai','0909000000','email@gmail.com',NULL),(70,8,'Le Cong','Nhat',4,'2000-12-30','Yen Bai','0909000000','email@gmail.com',NULL),(71,8,'Le Minh','Nhat',4,'2000-12-30','Yen Bai','0909000000','email@gmail.com',NULL),(72,8,'Nguyen Hong','Phat',4,'2000-12-30','Yen Bai','0909000000','email@gmail.com',NULL),(73,8,'Nguyen Tan','Phat',4,'2000-12-30','Yen Bai','0909000000','email@gmail.com',NULL),(74,8,'Truong Thien','Phong',4,'2000-12-30','Yen Bai','0909000000','email@gmail.com',NULL),(75,8,'Le Tran','Phu',4,'2000-12-30','Yen Bai','0909000000','email@gmail.com',NULL),(76,8,'Nguyen Ngoc','Phu',4,'2000-12-30','Yen Bai','0909000000','email@gmail.com',NULL),(77,8,'Nguyen Quang','Phu',4,'2000-12-30','Yen Bai','0909000000','email@gmail.com',NULL),(78,8,'Nguyen Hoang','Phuc',4,'2000-12-30','Yen Bai','0909000000','email@gmail.com',NULL),(79,8,'Vuong Gia Phuc','',4,'2000-12-30','Phu Quoc','0909000000','email@gmail.com',NULL),(80,8,'Nguyen Huynh Minh','Quang',4,'2000-12-30','Phu Quoc','0909000000','email@gmail.com',NULL),(81,8,'Doan Tran Minh','Quan',4,'2000-12-30','Phu Quoc','0909000000','email@gmail.com',NULL),(82,8,'Nguyen Thi Bich','Quyen',4,'2000-12-30','Phu Quoc','0909000000','email@gmail.com',NULL),(83,8,'Truong Hao','Quy',4,'2000-12-30','Phu Quoc','0909000000','email@gmail.com',NULL),(84,8,'Nguyen Thi','Quynh',4,'2000-12-30','Phu Quoc','0909000000','email@gmail.com',NULL),(85,8,'Ngo Cao','Sang',4,'2000-12-30','Phu Quoc','0909000000','email@gmail.com',NULL),(86,8,'Le Dien','Tai',4,'2000-12-30','Phu Quoc','0909000000','email@gmail.com',NULL),(87,8,'Vu Duc','Tam',4,'2000-12-30','Phu Quoc','0909000000','email@gmail.com',NULL),(88,9,'Nguyen Xuan','Thao',7,'1999-02-02','Dien Bien','0909000000','email@gmail.com',NULL),(89,9,'Tran Tan','Thanh',7,'1999-02-02','Dien Bien','0909000000','email@gmail.com',NULL),(90,9,'Nguyen Thi Phuong','Thao',7,'1999-02-02','Dien Bien','0909000000','email@gmail.com',NULL),(91,10,'Mac','Thien',6,'1998-03-03','Ho Chi Minh','0909000000','email@gmail.com',NULL),(92,10,'Ngo Tran Duy','Thien',6,'1998-03-03','Ho Chi Minh','0909000000','email@gmail.com',NULL),(93,10,'Ngo Hong','Thinh',6,'1998-03-03','Ho Chi Minh','0909000000','email@gmail.com',NULL),(94,10,'Nguyen Duc','Thinh',6,'1998-03-03','Ho Chi Minh','0909000000','email@gmail.com',NULL),(95,11,'Nguyen Hoang','Thong',5,'1997-04-04','Hai Phong','0909000000','email@gmail.com',NULL),(96,11,'Nguyen Hoang','Thuan',5,'1997-04-04','Hai Phong','0909000000','email@gmail.com',NULL),(97,11,'Nguyen Trong Lam','Thuc',5,'1997-04-04','Hai Phong','0909000000','email@gmail.com',NULL),(98,4,'Vo Ngo Van','Tien',5,'1997-04-04','Hai Phong','0909000000','email@gmail.com',NULL),(103,10,'dsfasdf','asdfasdf',7,'2021-11-01','adsfasdf','213123123','fsdfasdf',NULL),(104,11,'sdfdsf','sadfasdf',5,'2021-11-11','asfasdf','1412341','adfasdf',NULL),(105,8,'sdfdsf','sadfasdf',5,'2021-11-11','asfasdf','1412341','dsfasdfasdf',NULL),(106,8,'sdfdsf','sadfasdf',5,'2021-11-11','asfasdf','1412341','dsfasdfasdf',NULL),(107,3,'asdfa','sdfasdfasdf',1,'2021-11-11','fasdfasdf','12312321','dsfasdfds',NULL),(108,3,'asdfa','sdfasdfasdf',4,'2021-11-11','fasdfasdf','12312321','dsfasdfds',NULL);
/*!40000 ALTER TABLE `nhanvien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `phucvu`
--

DROP TABLE IF EXISTS `phucvu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `phucvu` (
  `PhucVu_id` int NOT NULL,
  `PhucVu_ten` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `PhucVu_gia` float NOT NULL,
  `GhiChu` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`PhucVu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phucvu`
--

LOCK TABLES `phucvu` WRITE;
/*!40000 ALTER TABLE `phucvu` DISABLE KEYS */;
INSERT INTO `phucvu` VALUES (1,'Theo yeu cau',0,'Bao gia sau'),(2,'Goi phuc vu pho thong ',15000000,''),(3,'Goi phuc vu dong',19000000,''),(4,'Goi phuc vu bac',29000000,''),(5,'Goi phuc vu vang',39000000,''),(6,'Goi phuc vu dac biet',49000000,''),(7,'hsdfgsdfgsd',12000000,NULL);
/*!40000 ALTER TABLE `phucvu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sukien`
--

DROP TABLE IF EXISTS `sukien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sukien` (
  `SuKien_id` int NOT NULL AUTO_INCREMENT,
  `SuKien_loai` varchar(100) DEFAULT NULL,
  `SuKien_ten` varchar(100) NOT NULL,
  `KhachHang_id` int DEFAULT NULL,
  `QuanLyPhuTrach` int DEFAULT NULL,
  `DDTC_id` int NOT NULL,
  `SoBan` int NOT NULL,
  `TrangTri_id` int NOT NULL,
  `ChuTri_id` int NOT NULL,
  `PhucVu_id` int NOT NULL,
  `Menu_id` int NOT NULL,
  `GiaiTri_id` int NOT NULL,
  `NgayBatDau` date NOT NULL,
  `NgayKetThuc` date DEFAULT NULL,
  `PhuThu` float DEFAULT NULL,
  `GhiChu` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`SuKien_id`),
  KEY `TrangTri_id` (`TrangTri_id`),
  KEY `ChuTri_id` (`ChuTri_id`),
  KEY `PhucVu_id` (`PhucVu_id`),
  KEY `Menu_id` (`Menu_id`),
  KEY `GiaiTri_id` (`GiaiTri_id`),
  KEY `DDTC_id` (`DDTC_id`),
  KEY `sukien_ibfk_1` (`KhachHang_id`),
  KEY `sukien_ibfk_2` (`QuanLyPhuTrach`),
  CONSTRAINT `sukien_ibfk_1` FOREIGN KEY (`KhachHang_id`) REFERENCES `khachhang` (`KhachHang_id`),
  CONSTRAINT `sukien_ibfk_2` FOREIGN KEY (`QuanLyPhuTrach`) REFERENCES `nhanvien` (`NhanVien_id`),
  CONSTRAINT `sukien_ibfk_3` FOREIGN KEY (`DDTC_id`) REFERENCES `diadiemtochuc` (`DDTC_id`),
  CONSTRAINT `sukien_ibfk_4` FOREIGN KEY (`TrangTri_id`) REFERENCES `trangtri` (`TrangTri_id`),
  CONSTRAINT `sukien_ibfk_5` FOREIGN KEY (`ChuTri_id`) REFERENCES `chutri` (`ChuTri_id`),
  CONSTRAINT `sukien_ibfk_6` FOREIGN KEY (`PhucVu_id`) REFERENCES `phucvu` (`PhucVu_id`),
  CONSTRAINT `sukien_ibfk_7` FOREIGN KEY (`Menu_id`) REFERENCES `menus` (`Menu_id`),
  CONSTRAINT `sukien_ibfk_8` FOREIGN KEY (`GiaiTri_id`) REFERENCES `giaitri` (`GiaiTri_id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sukien`
--

LOCK TABLES `sukien` WRITE;
/*!40000 ALTER TABLE `sukien` DISABLE KEYS */;
INSERT INTO `sukien` VALUES (1,NULL,'dasdas',NULL,NULL,9,212,7,2,3,4,2,'2021-12-08','2021-12-10',NULL,NULL),(2,'Hoi nghi','LCLKD',2,2,9,70,9,2,3,1,2,'2020-02-29',NULL,173000,NULL),(3,'Sinh nhat','LFXPK',3,1,7,69,4,2,4,6,4,'2021-01-17',NULL,332000,NULL),(4,'Hoi nghi','SKTAO',4,2,10,79,2,1,6,2,1,'2021-06-15',NULL,448000,NULL),(5,'Sinh nhat','ANRMX',5,2,5,73,5,1,1,4,5,'2021-03-26',NULL,820000,NULL),(6,'Le cuoi','VBNRO',6,1,7,75,6,3,6,6,5,'2021-12-01',NULL,583000,NULL),(7,'Le cuoi','CDUXZ',7,2,6,87,2,1,1,1,5,'2020-02-05',NULL,999000,NULL),(8,'Le ky niem','YJYVQ',8,1,10,64,2,2,6,3,3,'2021-07-28',NULL,454000,NULL),(9,'Su kien khac','KRZJZ',9,1,9,87,9,3,5,2,1,'2020-11-23',NULL,665000,NULL),(10,'Su kien khac','LCZRU',10,1,2,83,8,3,3,2,2,'2020-03-03',NULL,106000,NULL),(11,'tiec thoi noi','dashfkaj',13,1,1,12,2,2,4,3,3,'2021-01-03',NULL,424,NULL),(12,'asdasd','asdasdas',1,1,1,123123,1,1,1,1,1,'2021-11-06',NULL,NULL,NULL),(13,'dsf','asdf',2,1,1,1,1,1,1,1,1,'2021-11-26',NULL,NULL,NULL),(14,'dfdsfg','sdfdf',3,2,2,2,2,2,2,2,2,'2021-11-14',NULL,NULL,NULL),(15,'afsadf','asdf',3,2,3,123,1,1,1,1,1,'2021-11-09',NULL,NULL,NULL),(16,NULL,'sakldfaklj',NULL,NULL,1,123123,1,1,1,1,1,'2021-12-09','2021-12-11',NULL,NULL),(17,NULL,'sakldfaklj',NULL,NULL,1,123123,1,1,1,1,1,'2021-12-09','2021-12-11',NULL,NULL),(18,NULL,'diep hoang phi sinh nhat',NULL,NULL,1,123123,1,1,1,1,1,'2021-12-09','2021-12-11',NULL,NULL),(19,NULL,'diep hoang phi sinh nhat',NULL,NULL,1,123123,1,1,1,1,1,'2021-12-09','2021-12-11',NULL,NULL),(20,NULL,'diep hoang phi sinh nhat',NULL,NULL,1,123123,1,1,1,1,1,'2021-12-09','2021-12-11',NULL,NULL),(21,NULL,'diep hoang phi thoi noi',NULL,NULL,1,123123,1,1,1,1,1,'2021-12-09','2021-12-11',NULL,NULL),(22,NULL,'diep hoang phi thoi noi  Ã¡dasdasd',NULL,NULL,1,123123,1,1,1,1,1,'2021-12-09','2021-12-11',NULL,NULL),(23,NULL,'diep hoang phi sinh nhat',NULL,NULL,1,123123,1,1,1,1,1,'2021-12-09','2021-12-11',NULL,NULL),(24,NULL,'sakldfaklj',NULL,NULL,1,123123,1,1,1,1,1,'2021-12-09','2021-12-11',NULL,NULL),(25,NULL,'sdfadsfxczvzx szcvxzcv',NULL,NULL,4,121,3,2,2,3,2,'2021-12-09','2021-12-11',NULL,NULL),(26,NULL,'asdf',NULL,NULL,6,21,6,4,5,4,3,'2021-12-10','2021-12-12',NULL,NULL),(27,NULL,'diep hoang phi tiec dam cuoi test',NULL,NULL,6,21,6,4,5,4,3,'2021-12-10','2021-12-12',NULL,NULL),(28,NULL,'diep hoang phi tiec asdfasdfsdasfasdfasdfasdfasdf',NULL,NULL,6,21,6,4,5,4,3,'2021-12-10','2021-12-12',NULL,NULL),(29,NULL,'diep hoang phi tiec asdfasdfsdasfasdfasdfasdfasdf',NULL,NULL,6,21,6,4,5,4,3,'2021-12-10','2021-12-12',NULL,NULL),(30,NULL,'diep hoang phi tiec asdfasdfsdasfasdfasdfasdfasdf',NULL,NULL,6,21,6,4,5,4,3,'2021-12-10','2021-12-12',NULL,NULL),(31,NULL,'diep hoang phi tiec diephjhdsjlhhhsd',NULL,NULL,6,21,6,4,5,4,3,'2021-12-10','2021-12-12',NULL,NULL),(32,NULL,'dsfadsvvv  bb  wfa ',NULL,NULL,6,21,6,4,5,4,3,'2021-12-10','2021-12-12',NULL,NULL),(33,NULL,'asdf',NULL,NULL,9,1212,8,5,6,5,4,'2021-12-14','2021-12-14',NULL,NULL),(34,NULL,'asdfasdf ',NULL,NULL,10,123,1,1,1,1,1,'2021-12-15','2021-12-23',NULL,NULL),(35,NULL,'asdfasd sdsddfasdf',NULL,NULL,4,121,1,1,1,3,1,'2021-12-15','2021-12-16',NULL,NULL),(36,NULL,'asdfasd sdsddfasdf',NULL,NULL,4,121,1,1,1,3,1,'2021-12-15','2021-12-16',NULL,NULL);
/*!40000 ALTER TABLE `sukien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `thanhtoan`
--

DROP TABLE IF EXISTS `thanhtoan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `thanhtoan` (
  `ThanhToan_id` int NOT NULL AUTO_INCREMENT,
  `SuKien_id` int NOT NULL,
  `NgayThanhToan` date NOT NULL,
  `SoTien` float NOT NULL,
  `PhuongThuc` varchar(100) NOT NULL,
  `GhiChu` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ThanhToan_id`),
  KEY `SuKien_id` (`SuKien_id`),
  CONSTRAINT `thanhtoan_ibfk_1` FOREIGN KEY (`SuKien_id`) REFERENCES `sukien` (`SuKien_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `thanhtoan`
--

LOCK TABLES `thanhtoan` WRITE;
/*!40000 ALTER TABLE `thanhtoan` DISABLE KEYS */;
INSERT INTO `thanhtoan` VALUES (1,2,'2021-12-12',1323,'mnm','mn');
/*!40000 ALTER TABLE `thanhtoan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trangtri`
--

DROP TABLE IF EXISTS `trangtri`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `trangtri` (
  `TrangTri_id` int NOT NULL,
  `TrangTri_ten` varchar(100) NOT NULL,
  `TrangTri_gia` float NOT NULL,
  `GhiChu` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`TrangTri_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trangtri`
--

LOCK TABLES `trangtri` WRITE;
/*!40000 ALTER TABLE `trangtri` DISABLE KEYS */;
INSERT INTO `trangtri` VALUES (1,'Theo yeu cau',0,'Bao gia sau'),(2,'Chu de phuong Tay',1900000,NULL),(3,'Chu de phuong Dong',1900000,NULL),(4,'Chu de hien dai ',1900000,NULL),(5,'Chu de co trang',1900000,NULL),(6,'Chu de mua Xuan',1900000,NULL),(7,'Chu de mua Ha',1900000,NULL),(8,'Chu de mua Thu',1900000,NULL),(9,'Chu de mua Dong',1900000,NULL);
/*!40000 ALTER TABLE `trangtri` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vitri`
--

DROP TABLE IF EXISTS `vitri`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vitri` (
  `ViTri_id` int NOT NULL,
  `ViTri_ten` varchar(100) NOT NULL,
  PRIMARY KEY (`ViTri_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vitri`
--

LOCK TABLES `vitri` WRITE;
/*!40000 ALTER TABLE `vitri` DISABLE KEYS */;
INSERT INTO `vitri` VALUES (1,'Quan ly'),(2,'Phuc vu'),(3,'Dau bep'),(4,'Ve sinh'),(5,'Bao ve'),(6,'Le tan'),(7,'Ke toan');
/*!40000 ALTER TABLE `vitri` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-12-14 13:08:48
