-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 09, 2017 at 08:30 PM
-- Server version: 10.1.10-MariaDB
-- PHP Version: 7.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `crimeapp`
--

-- --------------------------------------------------------

--
-- Table structure for table `coords`
--

CREATE TABLE `coords` (
  `x` double NOT NULL,
  `y` double NOT NULL,
  `coord_id` int(11) NOT NULL,
  `loc_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `coords`
--

INSERT INTO `coords` (`x`, `y`, `coord_id`, `loc_id`) VALUES
(14.1760647, 121.1885007, 2, 1),
(14.1768397, 121.1874118, 3, 1),
(14.1764704, 121.1830666, 4, 1),
(14.1753234, 121.1732075, 5, 1),
(14.1722037, 121.3396407, 6, 1),
(14.5489068, 121.0245375, 7, 2),
(14.5501634, 121.0235397, 8, 2),
(14.5537461, 121.022499, 9, 2),
(14.5520326, 121.0225848, 10, 2),
(14.5542747, 121.0206858, 11, 2),
(14.6051468, 121.0061517, 12, 3),
(14.6041398, 121.0057226, 13, 3),
(14.6027382, 121.0034373, 14, 3),
(14.6048042, 121.0033837, 15, 3),
(14.6044928, 121.0016885, 16, 3),
(14.5300758, 121.0044371, 17, 4),
(14.5304808, 121.0044317, 18, 4),
(14.5279935, 121.0034715, 19, 4),
(14.5298369, 120.9912728, 20, 4),
(14.5317427, 120.9893094, 21, 4),
(14.2629217, 121.0435971, 22, 5),
(14.2623271, 121.0435969, 23, 5),
(14.2624226, 121.0439404, 24, 5),
(14.2624226, 121.0436722, 25, 5),
(14.2622355, 121.0418912, 26, 5);

-- --------------------------------------------------------

--
-- Table structure for table `loc_name`
--

CREATE TABLE `loc_name` (
  `id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `loc_name`
--

INSERT INTO `loc_name` (`id`, `name`) VALUES
(1, 'Laguna'),
(2, 'Makati'),
(3, 'Manila'),
(4, 'Pasay'),
(5, 'STC');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `coords`
--
ALTER TABLE `coords`
  ADD PRIMARY KEY (`coord_id`);

--
-- Indexes for table `loc_name`
--
ALTER TABLE `loc_name`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `coords`
--
ALTER TABLE `coords`
  MODIFY `coord_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;
--
-- AUTO_INCREMENT for table `loc_name`
--
ALTER TABLE `loc_name`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
