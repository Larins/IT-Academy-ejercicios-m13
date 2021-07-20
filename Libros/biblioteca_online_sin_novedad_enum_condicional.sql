-- phpMyAdmin SQL Dump
-- version 4.8.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 08-05-2019 a las 18:20:07
-- Versión del servidor: 10.1.33-MariaDB
-- Versión de PHP: 7.2.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: 'biblioteca_online'
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla 'libros'
--

USE biblioteca_online;

DROP TABLE IF EXISTS biblioteca_online.libros ;

CREATE TABLE libros (
  id int(11) NOT NULL,
  titulo varchar(100) NOT NULL,
  autor varchar(100) NOT NULL,
  editorial varchar(50) NOT NULL,
  fecha date NOT NULL,
  tematica ENUM ('CIENCIA','COCINA','ENTRETENIMIENTO','FICCION','HISTORICA','INFANTIL','INFORMATICA','INTRIGA','ROMANTICA','SOCIAL')
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla 'libros'
--

INSERT INTO libros (id, titulo, autor, editorial, fecha, tematica) VALUES
(1, 'HARRY POTTER Y EL PRISIONERO DE AZKABÁN', 'J.K ROWLING', 'SALAMANDRA', '2013-10-08', 'INFANTIL'),
(2, 'EL GRAN LABERINTO', 'FERNANDO SABATER PEREZ', 'ARIEL', '2012-10-16', 'FICCIÓN'),
(3, 'ROMEO Y JULIETA', 'WILLIAM SHAKESPEARE', 'SALAMANDRA', '2014-07-18', 'ROMANTICA'),
(4, 'LA CARTA ESFERICA', 'ARTURO PEREZ LOPEZ', 'SALAMANDRA', '2011-04-08', 'FICCION'),
(5, 'EL CODIGO DA VINCI', 'DAN BROWN', 'ARIEL', '2010-10-20', 'FICCION'),
(6, 'MUCHO RUIDO Y POCAS NUECES', 'WILLIAM SHAKESPEARE', 'SALAMANDRA', '2011-09-16', 'ROMANTICA'),
(7, 'PROTOCOLO', 'JOSE LOPEZ MURILLO', 'SALAMANDRA', '2014-01-21', 'SOCIAL'),
(8, 'LINUX', 'FERNANDO SABATER PEREZ', 'ARIEL', '2012-02-02', 'INFORMATICA'),
(9, 'EL TUMULTO', 'H.P LOVECRAFT', 'DEBATE', '2001-07-07', 'CIENCIA'),
(10, 'PERSONAJES MITICOS', 'RICHARD HOLLIGHAM', 'DEBATE', '2013-01-07', 'ENTRETENIMIENTO'),
(11, 'EL TIEMPO', 'J.K ROWLING', 'SALAMANDRA', '1999-11-05', 'CIENCIA'),
(12, 'DIETAS MEDITERRANEAS', 'ARTURO PEREZ LOPEZ', 'ARIEL', '2014-09-16', 'COCINA'),
(13, 'ANGELES Y DEMONIOS', 'DAN BROWN', 'ARIEL', '2014-09-21', 'FICCION'),
(14, 'FORTALEZA DIGITAL', 'DAN BROWN', 'ARIEL', '2011-04-19', 'FICCION'),
(15, 'CAPITAN ALATRISTE', 'ARTURO PEREZ REVERTE', 'ALFAGUARA', '2001-04-17', 'HISTORICA'),
(16, 'PIEL DE TAMBOR', 'ARTURO PEREZ REVERTE', 'ALFAGUARA', '2009-04-14', 'HISTORICA'),
(17, 'TIEMPOS DE COLERA', 'GABRIEL GARCIA', 'OVEJA NEGRA', '2002-08-04', 'HISTORICA'),
(18, 'NOTICIA DE UN SECUESTRO', 'GABRIEL GARCIA', 'ALFAGUARA', '2013-05-13', 'INTRIGA');

ALTER TABLE libros
      ADD COLUMN tem_id VARCHAR(256) NOT NULL;

UPDATE libros
      SET tem_id = (CASE 
        WHEN tematica = 'CIENCIA' THEN 1
        WHEN tematica = 'COCINA' THEN 2
        WHEN tematica = 'ENTRETENIMIENTO' THEN 3
        WHEN tematica = 'FICCION' THEN 4
        WHEN tematica = 'HISTORICA' THEN 5
        WHEN tematica = 'INFANTIL' THEN 6
        WHEN tematica = 'INFORMATICA' THEN 7
        WHEN tematica = 'INTRIGA' THEN 8
        WHEN tematica = 'ROMANTICA' THEN 9
        WHEN tematica = 'SOCIAL' THEN 10
        ELSE 0 END);
        
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla 'usuarios'
--

DROP TABLE IF EXISTS biblioteca_online.usuarios ;

CREATE TABLE usuarios (
  id int(11) NOT NULL,
  usuario varchar(30) NOT NULL,
  password varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla 'usuarios'
--

INSERT INTO usuarios (id, usuario, password) VALUES
(1, 'admin', '456'),
(2, 'espai', '123'),
(3, 'lara', 'lara');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla 'libros'
--
ALTER TABLE libros
  ADD PRIMARY KEY (id);

--
-- Indices de la tabla 'usuarios'
--
ALTER TABLE usuarios
  ADD PRIMARY KEY (id),
  ADD UNIQUE KEY usuario (usuario);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla 'libros'
--
ALTER TABLE libros
  MODIFY id int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT de la tabla 'usuarios'
--
ALTER TABLE usuarios
  MODIFY id int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
