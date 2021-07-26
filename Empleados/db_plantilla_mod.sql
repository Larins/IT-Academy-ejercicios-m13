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

-- Creación de la base de datos PLANTILLA

DROP DATABASE IF EXISTS plantilla;
CREATE DATABASE plantilla CHARACTER SET utf8mb4;
USE plantilla;

-- Creación de la estructura de la tabla EMPLEADOS

CREATE TABLE empleados (
  id int(11) NOT NULL,
  nombre varchar(100) NOT NULL,
  posicion ENUM ('BOSS','MANAGER','SENIOR','JUNIOR'),
  salario int(11),
  creacion TIMESTAMP,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcado de los datos en la tabla EMPLEADOS

INSERT INTO empleados (id, nombre, posicion, salario) VALUES
(1, 'LARA SAIZ', 'BOSS', 5000),
(2, 'JORDI ALBIOL', 'MANAGER', 3500),
(3, 'ANDREU VINYOLES', 'SENIOR', 2500),
(4, 'ROGER TORRENT', 'SENIOR', 2500),
(5, 'MUSTAFA AHARRAT', 'JUNIOR', 1000),
(6, 'EDUARD LARA', 'JUNIOR', 1000);

-- Creación de la estructura de la tabla USUARIOS

CREATE TABLE usuarios (
  id int(11) NOT NULL,
  usuario varchar(30) NOT NULL,
  password varchar(30) NOT NULL,
  creacion TIMESTAMP,
  PRIMARY KEY (id),
  UNIQUE KEY (usuario)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Volcado de los datos en la tabla USUARIOS

INSERT INTO usuarios (id, usuario, password) VALUES
(1, 'admin', '456'),
(2, 'espai', '123'),
(3, 'lara', 'lara');

-- Autoincrementos de la tabla EMPLEADOS (tras volcar los primeros registros)

ALTER TABLE empleados
  MODIFY id int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

-- Autoincrementos de la tabla USUARIOS (tras volcar los primeros registros)

ALTER TABLE usuarios
  MODIFY id int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
