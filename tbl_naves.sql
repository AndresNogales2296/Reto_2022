-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-02-2023 a las 05:35:47
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `banco_naves`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_naves`
--

CREATE TABLE `tbl_naves` (
  `id_nave` int(7) NOT NULL,
  `nombre_nave` varchar(57) NOT NULL,
  `combustible_nave` varchar(57) NOT NULL,
  `nacionalidad_nave` varchar(57) NOT NULL,
  `año_lanzamineto_nave` int(7) NOT NULL,
  `año_aterrizaje_nave` int(7) NOT NULL,
  `mision_principal_nave` varchar(57) NOT NULL,
  `tipo_de_nave` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `tbl_naves`
--

INSERT INTO `tbl_naves` (`id_nave`, `nombre_nave`, `combustible_nave`, `nacionalidad_nave`, `año_lanzamineto_nave`, `año_aterrizaje_nave`, `mision_principal_nave`, `tipo_de_nave`) VALUES
(1, 'Venera IV', 'N2O4+UDMH', 'RUSIA', 1967, 1967, 'Exploracion en el planeta venus', 'Nave No Tripulada'),
(2, 'Venera IX', 'N2O4+UDMH', 'RUSIA', 1975, 1975, 'Captar imagenes del planeta venus', 'Nave No Tripulada'),
(3, 'Saturno V', 'H(liquido)+O(liquido)', 'EEUU', 1967, 1973, 'Transportar carga util al espacio', 'Vehiculo Lanzadera'),
(4, 'H-IIA', 'Solido+N(Liquido)+O(Liquido)', 'JAPON', 2001, 2023, 'Provisionar recursos en el espacio', 'Vehiculo Lanzadera'),
(5, 'Apolo', 'NO4+UDMH', 'EEUU', 1966, 1975, 'Mision lunar', 'Nave Tripulada'),
(6, 'Mercury', 'NO4+UDMH', 'EEUU', 1959, 1963, 'Mision Lunar', 'Nave Tripulada'),
(7, 'Zenit II', 'Queroseno+O(liquido)', 'RUSIA', 1985, 2023, 'Transportar carga util al espacio', 'Vehiculo Lanzadera'),
(8, 'Sputnik', 'N2O4+UDMH', 'RUSIA', 1957, 1958, 'Capturar imagenes de la superficie de Venus', 'Nave No Tripulada'),
(9, 'Catastrofico', 'Diesel', 'COLOMBIA', 2022, 2023, 'Transportar recursos al espacio', 'Vehiculo Lanzadera'),
(10, 'Viajero II', 'N(comp)+N2H4', 'EEUU', 1977, 2023, 'Exploracion en el planeta Venus', 'Nave No Tripulada'),
(11, 'Larga Marcha 3B', 'UDMH+N2O4', 'CHINA', 1996, 2023, 'Provisionar recursos en el espacio', 'Vehiculo Lanzadera'),
(12, 'Falcon IX', 'Queroseno+O(liquido)', 'EEUU', 2010, 2023, 'Provicionar recursos en el espacio', 'Vehiculo Lanzadera'),
(13, 'Mariner IV', 'N2H4', 'EEUU', 1965, 2023, 'Sobrevolar planeta Marte', 'Nave No Tripulada'),
(14, 'Helios I', 'PuO2', 'EEUU', 2009, 2023, 'Estudiar el Sol', 'Nave No Tripulada'),
(15, 'Explorador V', 'H2O2+CO2', 'EEUU', 2000, 2023, 'Capturar imagenes del planeta Marte', 'Vehiculo Lanzadera'),
(16, 'Luna I', 'N2O4+UDMH', 'RUSIA', 1959, 2023, 'Capturar imagenes del Planeta Tierra', 'Nave No Tripulada');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tbl_naves`
--
ALTER TABLE `tbl_naves`
  ADD PRIMARY KEY (`id_nave`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tbl_naves`
--
ALTER TABLE `tbl_naves`
  MODIFY `id_nave` int(7) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
