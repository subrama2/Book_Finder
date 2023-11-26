-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Nov 25, 2023 at 07:37 PM
-- Server version: 8.0.31
-- PHP Version: 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bookfinder1`
--

-- --------------------------------------------------------

--
-- Table structure for table `books`
--

DROP TABLE IF EXISTS `books`;
CREATE TABLE IF NOT EXISTS `books` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Title` varchar(50) DEFAULT NULL,
  `Author` varchar(50) DEFAULT NULL,
  `Genre` varchar(50) DEFAULT NULL,
  `Description` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `ISBN` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `books`
--

INSERT INTO `books` (`ID`, `Title`, `Author`, `Genre`, `Description`, `ISBN`) VALUES
(1, 'To Kill a Mockingbird', 'Harper Lee', 'Fiction', 'Set in the American South during the 1930s, \"To Kill a Mockingbird\" explores themes of racial injustice, moral growth, and compassion through the eyes of Scout Finch, a young girl whose father, Atticu', '978-0-06-112008-4'),
(2, '1984', 'George Orwell', 'Dystopian Fiction', 'In a totalitarian society where the government, led by the Party and its leader Big Brother, controls every aspect of citizens\' lives, Winston Smith rebels against the oppressive regime. \"1984\" is a c', '978-0-452-28423-4'),
(3, 'The Great Gatsby', 'F. Scott Fitzgerald', 'Classic', 'Set in the Roaring Twenties, \"The Great Gatsby\" is a tale of wealth, love, and the American Dream. Narrated by Nick Carraway, the novel delves into the lives of the mysterious Jay Gatsby and the beaut', '978-0-7432-7356-5'),
(4, 'The Hitchhiker\'s Guide to the Galaxy', 'Douglas Adams', 'Science Fiction, Comedy', 'Join Arthur Dent as he travels through space with Ford Prefect, Zaphod Beeblebrox, and other eccentric characters, armed with nothing but his towel and the titular guidebook. A humorous and satirical ', ' 978-0-345-39181-3'),
(5, 'The Catcher in the Rye', 'J.D. Salinger', 'Fiction', 'Follow the journey of Holden Caulfield, a disenchanted teenager expelled from an elite boarding school. As he navigates the streets of New York City, Holden grapples with the challenges of adolescence', ' 978-0-316-76948-0');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
