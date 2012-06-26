# MySQL-Front 3.2  (Build 7.31)

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES 'gbk' */;

# Host: 127.0.0.1    Database: mysql
# ------------------------------------------------------
# Server version 5.0.27-community-nt

DROP DATABASE IF EXISTS `mysql`;
CREATE DATABASE `mysql` /*!40100 DEFAULT CHARACTER SET gbk */;
USE `mysql`;

#
# Table structure for table visitor
#

CREATE TABLE `visitor` (
  `Id` int(11) NOT NULL default '0',
  `USERNAME` varchar(16) default NULL,
  `PASSWORD` varchar(11) default NULL,
  `EMAIL` varchar(11) default NULL,
  `AUTHORITY` varchar(11) default NULL,
  PRIMARY KEY  (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

#
# Dumping data for table visitor
#

INSERT INTO `visitor` VALUES (1,'11','1','11','normal');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
