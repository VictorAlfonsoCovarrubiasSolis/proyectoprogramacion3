-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 16-05-2023 a las 07:42:14
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `zonewar`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `admins`
--

CREATE TABLE `admins` (
  `user` varchar(50) NOT NULL,
  `pasword` varchar(50) NOT NULL,
  `cargo` varchar(50) NOT NULL,
  `salario` float NOT NULL,
  `nombre` varchar(250) NOT NULL,
  `correo` varchar(100) NOT NULL,
  `telefono` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `admins`
--

INSERT INTO `admins` (`user`, `pasword`, `cargo`, `salario`, `nombre`, `correo`, `telefono`) VALUES
('dueño', 'dueño123', 'dueño', 999999, 'Fernando', 'fernan@gmail.com', '1111222323'),
('guille', 'guille123', 'gerente', 4567, 'guillermo', 'guillermos@gmail.com', '1231234567');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `apartados`
--

CREATE TABLE `apartados` (
  `nomproducto` varchar(250) NOT NULL,
  `user` varchar(50) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `costouni` float NOT NULL,
  `costotot` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `articulos`
--

CREATE TABLE `articulos` (
  `tipo` varchar(50) NOT NULL,
  `nombre` varchar(250) NOT NULL,
  `genero` varchar(50) NOT NULL,
  `plataforma` varchar(50) NOT NULL,
  `compania` varchar(50) NOT NULL,
  `anio` int(11) NOT NULL,
  `precio` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `articulos`
--

INSERT INTO `articulos` (`tipo`, `nombre`, `genero`, `plataforma`, `compania`, `anio`, `precio`) VALUES
('Videojuego', 'Assassins Creed Valhalla', 'Accion, Aventura', 'PS5 - XBOX ', 'Ubisoft Montreal', 2018, 789),
('Componente', 'ASUS ROG Strix GeForce RTX 4070 Ti ', 'Tarjeta Grafica', 'AMD - Intel', 'ASUSTeK Computer, Inc', 2023, 21899),
('Videojuego', 'Fortnite', 'Accion,  Battle royale', 'PS5 - XBOX - Nintendo Switch', 'Epic Games', 2017, 1000),
('Videojuego', 'God of War Ragnarök ', 'Accion, Aventura', 'PS5', 'Santa Monica Studio', 2022, 1349),
('Videojuego', 'Halo Infinite', 'Accion, Aventura, Disparos', 'PC - XBOX ', '343 Industries', 2021, 578),
('Componente', 'hola', 'hola', 'hola', 'hola', 2345, 12000),
('Componente ', 'Logitech G733 LIGHTSPEED', 'Audio', 'Para puertos con USB 2.0', 'Logitech', 2020, 2565),
('Componente', 'Microfono HyperX ', 'QuadCast S', 'Para puertos con USB 2.0', 'HyperX', 2021, 2242),
('Componente ', 'Monitor Nitro XZ270 Xbmiipx', 'Videojuegos', 'Para puertos adaptadores tipo HDMI - DisplayPort', 'Acer', 2020, 4979),
('Consola', 'Nintendo Switch', 'OLED w/ White ', 'Switch', 'Nintendo', 2021, 5890),
('Consola', 'PlayStation 4', 'Slim', 'PS4', 'SONY', 2016, 7499),
('Consola', 'PlayStation 5 ', 'Digital Edition', 'PS5', 'SONY', 2020, 11500),
('Videojuego', 'Resident Evil 5', 'Accion, Aventura,  Horror, Disparos', 'PS5 - XBOX - PC', 'Capcom', 2009, 456),
('Componente', 'RYZEN 9 5950X', 'RYZEN', 'AMD', 'Advanced Micro Devices', 2020, 8999),
('Consola', 'Xbox S', 'Series S', 'Xbox ', 'Microsoft', 2020, 6499),
('Consola', 'Xbox X', 'Series X', 'Xbox ', 'Microsoft', 2020, 12199);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compras`
--

CREATE TABLE `compras` (
  `nomproducto` varchar(250) NOT NULL,
  `user` varchar(50) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `costouni` float NOT NULL,
  `costotot` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `tipo` varchar(50) NOT NULL,
  `nombre` varchar(250) NOT NULL,
  `genero` varchar(50) NOT NULL,
  `plataforma` varchar(50) NOT NULL,
  `compania` varchar(50) NOT NULL,
  `anio` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precio` float NOT NULL,
  `estado` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`tipo`, `nombre`, `genero`, `plataforma`, `compania`, `anio`, `cantidad`, `precio`, `estado`) VALUES
('Videojuego', 'Assassins Creed Valhalla', 'Accion, Aventura', 'PS5 - XBOX ', 'Ubisoft Montreal', 2018, 269, 789, 'Comprar y Apartar'),
('Consola', 'PlayStation 4', 'Slim', 'PS4', 'SONY', 2016, 135, 7499, 'Comprar y Apartar'),
('Componente', 'ASUS ROG Strix GeForce RTX 4070 Ti ', 'Tarjeta Grafica', 'AMD - Intel', 'ASUSTeK Computer, Inc', 2023, 65, 21899, 'Comprar y Apartar'),
('Videojuego', 'God of War Ragnarök ', 'Accion, Aventura', 'PS5', 'Santa Monica Studio', 2022, 40, 1349, 'Comprar y Apartar'),
('Componente', 'RYZEN 9 5950X', 'RYZEN', 'AMD', 'Advanced Micro Devices', 2020, 343, 8999, 'Comprar y Apartar'),
('Consola', 'Xbox S', 'Series S', 'Xbox ', 'Microsoft', 2020, 45, 6499, 'Comprar y Apartar');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `users`
--

CREATE TABLE `users` (
  `user` varchar(50) NOT NULL,
  `pasword` varchar(50) NOT NULL,
  `nombre` varchar(250) NOT NULL,
  `correo` varchar(100) NOT NULL,
  `telefono` varchar(11) NOT NULL,
  `direccion` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `users`
--

INSERT INTO `users` (`user`, `pasword`, `nombre`, `correo`, `telefono`, `direccion`) VALUES
('robert', '12345', 'roberto', 'roberto@gmail.com', '1111111111', 'colonia10calles'),
('vic', 'vic123', 'alfonso', 'alfonso@gmail.co', '4442223333', 'otra');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `admins`
--
ALTER TABLE `admins`
  ADD PRIMARY KEY (`user`);

--
-- Indices de la tabla `articulos`
--
ALTER TABLE `articulos`
  ADD PRIMARY KEY (`nombre`);

--
-- Indices de la tabla `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`user`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
