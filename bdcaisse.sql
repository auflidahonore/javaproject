-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Mar 06 Février 2018 à 10:57
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `bdcaisse`
--

-- --------------------------------------------------------

--
-- Structure de la table `caisse`
--

CREATE TABLE IF NOT EXISTS `caisse` (
  `solde_caisse` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `caisse`
--

INSERT INTO `caisse` (`solde_caisse`) VALUES
(100000);

-- --------------------------------------------------------

--
-- Structure de la table `caissier`
--

CREATE TABLE IF NOT EXISTS `caissier` (
  `cin_caissier` int(12) NOT NULL,
  `nom_caissier` text NOT NULL,
  `pren_caissier` text NOT NULL,
  `fonction` varchar(30) NOT NULL,
  `telephone` int(10) NOT NULL,
  PRIMARY KEY (`cin_caissier`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `caissier`
--

INSERT INTO `caissier` (`cin_caissier`, `nom_caissier`, `pren_caissier`, `fonction`, `telephone`) VALUES
(1, 'RAKOTO', 'Paul', 'azerty', 349608034);

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE IF NOT EXISTS `client` (
  `num_cli` int(10) NOT NULL,
  `nom_cli` text NOT NULL,
  `pren_cli` text NOT NULL,
  `adresse_cli` varchar(30) NOT NULL,
  `tel_cli` int(10) NOT NULL,
  PRIMARY KEY (`num_cli`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `client`
--

INSERT INTO `client` (`num_cli`, `nom_cli`, `pren_cli`, `adresse_cli`, `tel_cli`) VALUES
(1, 'VERO', 'Tiana', 'Isada', 349608034),
(2, 'NAHITANA', 'Onivelo', 'Ampitankely', 349920200),
(3, 'MANITSOA', 'Fabriola', 'Andrainjato', 327511665),
(4, 'RANDRIANANTENAINA', 'Olivier', 'Sahalava', 326881752),
(5, 'RAFANOMEZANTSOA', 'Jules', 'Antarandolo', 337176444),
(6, 'HASIMPITIA', 'Marinah', 'Beravina', 349985462);

-- --------------------------------------------------------

--
-- Structure de la table `commander`
--

CREATE TABLE IF NOT EXISTS `commander` (
  `num_com` int(10) NOT NULL,
  `nom_cli` text NOT NULL,
  `pren_cli` text NOT NULL,
  `date_com` date NOT NULL,
  `nom_act` varchar(30) NOT NULL,
  `titre_act` varchar(30) NOT NULL,
  `type_act` varchar(30) NOT NULL,
  `date_act` date NOT NULL,
  `dure_act` varchar(30) NOT NULL,
  `prix_com` int(10) NOT NULL,
  PRIMARY KEY (`num_com`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `commander`
--

INSERT INTO `commander` (`num_com`, `nom_cli`, `pren_cli`, `date_com`, `nom_act`, `titre_act`, `type_act`, `date_act`, `dure_act`, `prix_com`) VALUES
(1, 'VERO', 'Tiana', '2018-01-18', 'Emission', 'La santé public', 'Evangelique', '2018-01-24', '2 h', 20000),
(2, 'NAHITANA', 'Onivelo', '2018-01-19', 'Matraquage', 'Hody', 'Non Evangelique', '2018-01-26', '4 mn 00s', 5000),
(3, 'MANITSOA', 'Fabriola', '2018-01-27', 'Ticker', 'Récéption Emit', 'Evangelique', '2018-01-30', '1 mn', 15000),
(4, 'RANDRIANANTENAINA', 'Olivier', '2018-01-15', 'Spot publicitaire', 'Ny paska', 'Evangelique', '2018-01-30', '15 mn', 20000),
(5, 'HASIMPITIA', 'Marinah', '2018-01-15', 'Spot publicitaire', 'spectacle', 'Non Evangelique', '2018-02-14', '5 mn', 60000),
(6, 'RAFANOMEZANTSOA', 'Jules', '2018-01-26', 'Emission', 'Ny peste', 'Non Evangelique', '2018-01-27', '2 h', 20000),
(7, 'HASIMPITIA', 'Marinah', '2018-02-01', 'Emission', 'education', 'Non Evangelique', '2018-02-14', '2h', 20000),
(10, 'VERO', 'Tiana', '2018-02-04', 'Spot publicitaire', 'imady', 'Non Evangelique', '2018-02-17', '30', 5000),
(11, 'VERO', 'Tiana', '2018-02-04', 'Emission', 'imady', 'Non Evangelique', '2018-02-17', '50', 15000);

-- --------------------------------------------------------

--
-- Structure de la table `depense`
--

CREATE TABLE IF NOT EXISTS `depense` (
  `num_dep` int(10) NOT NULL,
  `date_dep` date NOT NULL,
  `montant_dep` int(10) NOT NULL,
  PRIMARY KEY (`num_dep`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `depense`
--

INSERT INTO `depense` (`num_dep`, `date_dep`, `montant_dep`) VALUES
(1, '2018-01-19', 50000),
(2, '2018-01-26', 15000);

-- --------------------------------------------------------

--
-- Structure de la table `evaluation`
--

CREATE TABLE IF NOT EXISTS `evaluation` (
  `num_evalu` int(5) NOT NULL,
  `date_evalu` date NOT NULL,
  `date_rech1` date NOT NULL,
  `date_rech2` date NOT NULL,
  `total_paiem` int(10) NOT NULL,
  `total_dep` int(7) NOT NULL,
  `solde_final_caisse` int(10) NOT NULL,
  PRIMARY KEY (`num_evalu`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `evaluation`
--

INSERT INTO `evaluation` (`num_evalu`, `date_evalu`, `date_rech1`, `date_rech2`, `total_paiem`, `total_dep`, `solde_final_caisse`) VALUES
(1, '2018-02-04', '2018-01-19', '2018-01-26', 25000, 65000, 100000),
(2, '2018-02-04', '2018-01-19', '2018-01-26', 25000, 65000, 100000);

-- --------------------------------------------------------

--
-- Structure de la table `paiement`
--

CREATE TABLE IF NOT EXISTS `paiement` (
  `num_paiem` int(10) NOT NULL,
  `num_com` int(10) NOT NULL,
  `nom_cli` text NOT NULL,
  `pren_cli` text NOT NULL,
  `nom_act` varchar(30) NOT NULL,
  `type_act` varchar(30) NOT NULL,
  `dure_act` varchar(30) NOT NULL,
  `date_act` date NOT NULL,
  `date_paiem` date NOT NULL,
  `mode_paiem` varchar(30) NOT NULL,
  `montant_payer` int(10) NOT NULL,
  PRIMARY KEY (`num_paiem`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `paiement`
--

INSERT INTO `paiement` (`num_paiem`, `num_com`, `nom_cli`, `pren_cli`, `nom_act`, `type_act`, `dure_act`, `date_act`, `date_paiem`, `mode_paiem`, `montant_payer`) VALUES
(1, 1, 'VERO', 'Tiana', 'Emission', 'Evangelique', '2 h', '2018-01-24', '2018-01-24', 'en éspece', 20000),
(2, 2, 'NAHITANA', 'Onivelo', 'Matraquage', 'Non Evangelique', '4 mn 00s', '2018-01-26', '2018-01-24', 'en éspece', 5000),
(3, 3, 'MANITSOA', 'Fabriola', 'Ticker', 'Evangelique', '1 mn', '2018-01-30', '2018-01-27', 'en espece', 15000),
(4, 4, 'RANDRIANANTENAINA', 'Olivier', 'Spot publicitaire', 'Evangelique', '15 mn', '2018-01-30', '2018-01-28', 'cheque bancaire', 20000),
(5, 5, 'HASIMPITIA', 'Marinah', 'Spot publicitaire', 'Non Evangelique', '5 mn', '2018-02-14', '2018-01-27', 'cheque bancaire', 60000),
(6, 6, 'RAFANOMEZANTSOA', 'Jules', 'Emission', 'Non Evangelique', '2 h', '2018-01-27', '2018-01-27', 'en espece', 20000),
(7, 7, 'HASIMPITIA', 'Marinah', 'Emission', 'Non Evangelique', '2h', '2018-02-14', '2018-02-01', 'en espece', 20000),
(10, 10, 'VERO', 'Tiana', 'Spot publicitaire', 'Non Evangelique', '30', '2018-02-17', '2018-02-04', 'espece', 5000);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
