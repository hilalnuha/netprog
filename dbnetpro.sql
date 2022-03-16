-- phpMyAdmin SQL Dump
-- version 2.6.1-pl3
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Nov 24, 2011 at 10:28 AM
-- Server version: 4.1.11
-- PHP Version: 5.0.4
--
-- Database: `dbnetpro`
--
-- --------------------------------------------------------
--
-- Table structure for table `mahasiswa`
--
 
CREATE TABLE `mahasiswa` (
  `noInduk` tinyint(4) NOT NULL auto_increment,
  `nama` varchar(30) collate latin1_general_ci NOT NULL default '',
  `nilai` tinyint(4) NOT NULL default '0',
  `alamat` varchar(50) collate latin1_general_ci NOT NULL default '',
  PRIMARY KEY  (`noInduk`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci AUTO_INCREMENT=2 ;
 
--
-- Dumping data for table `mahasiswa`
-- 
INSERT INTO `mahasiswa` VALUES (1, 'Joko', 80, 'Surabaya');
