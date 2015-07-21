-- phpMyAdmin SQL Dump
-- version 4.1.6
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jul 21, 2015 at 09:32 PM
-- Server version: 5.6.16
-- PHP Version: 5.5.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `cat`
--

-- --------------------------------------------------------

--
-- Table structure for table `ques_bank`
--

CREATE TABLE IF NOT EXISTS `ques_bank` (
  `question` varchar(200) NOT NULL,
  `questionlevel` int(11) NOT NULL,
  `option1` varchar(100) NOT NULL,
  `option2` varchar(100) NOT NULL,
  `option3` varchar(100) NOT NULL,
  `option4` varchar(100) NOT NULL,
  `answer` varchar(100) NOT NULL,
  `category` varchar(100) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `ques_bank`
--

INSERT INTO `ques_bank` (`question`, `questionlevel`, `option1`, `option2`, `option3`, `option4`, `answer`, `category`, `id`) VALUES
('What is language of hive called', 1, 'HIVEL', 'HQL', 'HIQL', 'SQL', 'HQL', 'hive', 1);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `name` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `organisation` varchar(50) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`name`, `username`, `email`, `password`, `organisation`) VALUES
('313311', '313213', '2312', '313133123', '323213'),
('sadasdasdda', 'adadcxzcz', 'sdad', 'dsasda', 'asda'),
('amogh', 'amogh0', 'amogh0607@gmail.com', 'amogh12345', 'Xebia IT architects'),
('amogh', 'amogh01', 'amogh0607@gmail.com', 'amogh12345', 'Xebia IT architects'),
('amogh', 'amogh06', 'amogh0607@gmail.com', 'amogh12345', 'Xebia IT architects'),
('amogh', 'amogh0607', 'amogh0607@gmail.com', 'amogh12345', 'Xebia IT architects'),
('amogh', 'amogh0d1', 'amogh0607@gmail.com', 'amogh12345', 'Xebia IT architects'),
('bvxnbzvnb', 'bnznbcxvxznbv', 'xbxvcbnxvzbcvb', 'vznbvv n', 'vcbvzxbnzncv'),
('czcxzc', 'czxcz', 'xczc', 'czcx', 'cxzcz'),
('czcxzc', 'czxcz1', 'xczc', 'czcx', 'cxzcz'),
('daadadas', 'dadada', 'sadad', 'dasdsda', 'dasdad'),
('sdasd', 'dadasd', 'dada', 'dasda', 'dasdad'),
('Deepankar Agrawal', 'deddede', 'deepankar01agrawal@gmail.com', '1212', '1212'),
('Deepanakr', 'deep', '123@gmail.com', '12121', 'UPES'),
('Deepankar Agrawal', 'Deepankar', 'deepankar01agrawal@gmail.com', 'UPES', '123'),
('Deepankar Agrawal', 'Deepankar1', 'deepankar01agrawal@gmail.com', 'UPES', '123'),
('nbnmmb', 'mbnmb', 'mbmnb', 'mbm', 'mnmbmbn'),
('rohan', 'rohansrivastava', 'rohan@gmail.com', 'rohanspassword', 'XebiaITArchitects'),
('dadasadadas', 'saddasdda', 'dsadaas', 'dasasa', 'dasdsad'),
('dadasadadas', 'saddasddahliil', 'dsadaas', 'dasasa', 'dasdsad'),
('dakddkahjadgadhg', 'sahgahgdafaghd', 'sfhdgfdhga', 'asdfahgdaf', 'gdafdhgafdsh'),
('dakddkahjadgadhg', 'sahgahgdafaghd1', 'sfhdgfdhga', 'asdfahgdaf', 'gdafdhgafdsh'),
('name', 'user name', 'mail', 'organization', 'password'),
('name', 'user name2', 'mail@gmail.com', 'organization', 'password'),
('name', 'username', 'mail', 'organization', 'password'),
('yeuwquqe', 'wteqetwtqy', 'qweytqetyqwy', '233121', '3123321');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
