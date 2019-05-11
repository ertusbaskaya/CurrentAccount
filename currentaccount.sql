-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 05 May 2019, 22:57:52
-- Sunucu sürümü: 10.1.38-MariaDB
-- PHP Sürümü: 7.3.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `currentaccount`
--

DELIMITER $$
--
-- Yordamlar
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `prcCategoryAdd` (IN `cname` VARCHAR(255), IN `ccommentary` VARCHAR(255))  BEGIN

INSERT INTO category VALUES(NULL, cname, ccommentary);

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prcCategoryDelete` (IN `id` VARCHAR(45))  BEGIN
delete from category where cid = id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prcCategoryEdit` (IN `id` VARCHAR(45), IN `name` VARCHAR(45), IN `commentary` VARCHAR(45))  BEGIN
UPDATE category SET cname=name, ccommentary=commentary WHERE cid=id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prcCategoryGet` (IN `id` VARCHAR(45))  BEGIN
SELECT * FROM category WHERE cid = id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prcCategoryList` ()  BEGIN
SELECT * FROM category;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prcCostumersAdd` (IN `cosname` VARCHAR(255), IN `cossurname` VARCHAR(255), IN `cosphone` VARCHAR(255), IN `cosadress` VARCHAR(255))  BEGIN
INSERT INTO costumers VALUES(NULL, cosname, cossurname, cosphone, cosadress);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prcCostumersDelete` (IN `id` VARCHAR(45))  BEGIN
delete from costumers where cosid=id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prcCostumersEdit` (IN `id` VARCHAR(45), IN `name` VARCHAR(45), IN `surname` VARCHAR(45), IN `phone` VARCHAR(45), IN `adress` VARCHAR(45))  BEGIN
update costumers set cosname = name, cossurname = surname, cosphone = phone, cosadress = adress where cosid = id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prcCostumersGet` (IN `id` VARCHAR(45))  BEGIN
select * from costumers where cosid = id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prcCostumersList` ()  BEGIN
SELECT * FROM costumers;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prcPasswordEdit` (IN `password` VARCHAR(10))  NO SQL
BEGIN

UPDATE usersign SET upassword=password WHERE uid=1;

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prcProductAdd` (IN `pname` VARCHAR(45), IN `pcategory` VARCHAR(45), IN `pbuy` VARCHAR(45), IN `psale` VARCHAR(45), IN `pstock` VARCHAR(45), IN `pcommentary` VARCHAR(45))  BEGIN

INSERT INTO product VALUES(null, pname, pcategory, pbuy, psale, pstock, pcommentary);

END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prcProductDelete` (IN `id` VARCHAR(45))  BEGIN
delete from product where pid = id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prcProductEdit` (IN `id` VARCHAR(45), IN `name` VARCHAR(45), IN `category` VARCHAR(45), IN `buy` VARCHAR(45), IN `sale` VARCHAR(45), IN `stock` VARCHAR(45), IN `commentary` VARCHAR(45))  BEGIN
update product set pname = name, pcategoryname = category, pbuy = buy, psale = sale, pstock = stock, pcommentary = commentary where pid = id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prcProductGet` (IN `id` VARCHAR(45))  BEGIN
SELECT * FROM product, category WHERE pid = id and product.pcategoryname = category.cid;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prcProductList` ()  BEGIN
SELECT * FROM product  as pr , category as ct WHERE pr.pcategoryname = ct.cid;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prcSaleAction` (IN `scosid` VARCHAR(45), IN `spid` VARCHAR(45), IN `piece` VARCHAR(45))  BEGIN
INSERT INTO sale VALUES(NULL, scosid, spid, piece, now());
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prcSaleProductList` (IN `id` VARCHAR(45))  BEGIN
select * from product where pcategoryname = id;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `prcSign` ()  BEGIN

select * from usersign;

END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `category`
--

CREATE TABLE `category` (
  `cid` int(11) NOT NULL,
  `cname` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `ccommentary` varchar(255) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `category`
--

INSERT INTO `category` (`cid`, `cname`, `ccommentary`) VALUES
(16, 'Bilişim', 'Telefon, Bilgisayar'),
(17, 'Organik Gıda', 'Sebze, Meyve'),
(18, 'Beyaz eşya', 'Mutfak gereçleri'),
(19, 'Kırtasiye', 'Okul gereçleri'),
(20, 'Kitap', 'Roman, Hikaye');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `costumers`
--

CREATE TABLE `costumers` (
  `cosid` int(11) NOT NULL,
  `cosname` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `cossurname` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `cosphone` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `cosadress` varchar(255) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `costumers`
--

INSERT INTO `costumers` (`cosid`, `cosname`, `cossurname`, `cosphone`, `cosadress`) VALUES
(4, 'Ertuğrul', 'Başkaya', '5372227558', 'Fatih'),
(5, 'Mehmet', 'Kapıcı', '5385201010', 'Ankara'),
(6, 'Ahmet', 'Gezgör', '5368525252', 'Yozgat'),
(7, 'Serpil', 'Gezici', '5456251020', 'Maslak'),
(8, 'Selin', 'Yaşar', '5542565369', 'Ataşehir'),
(9, 'Yılmaz', 'Yokuş', '5465896362', 'Malatya'),
(10, 'Kamile', 'Yoksun', '5365632326', 'Samsun'),
(11, 'Okşan', 'Koşan', '5396563632', 'İzmir'),
(12, 'Ezgi', 'Büyük', '5345456869', 'Bayrampaşa'),
(13, 'Sezgin', 'Şapak', '5384587575', 'Beşiktaş'),
(15, 'Sevil', 'Yalak', '5385696596', 'Pendik'),
(16, 'Mahmut', 'Çolak', '5395696596', 'Giresun'),
(17, 'Sami', 'Yapar', '5395696589', 'Edirne'),
(18, 'Durmuş', 'Durmamış', '5391266589', 'Konya'),
(19, 'Kerim', 'Polat', '5383211215', 'Adana'),
(20, 'Polat', 'Alemdar', '5395696968', 'Susurluk'),
(21, 'Yalçın', 'Çakır', '5342364548', 'Bakırköy'),
(22, 'Yılmaz', 'Yılar', '5335696968', 'Bahçelievler');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `product`
--

CREATE TABLE `product` (
  `pid` int(11) NOT NULL,
  `pname` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `pcategoryname` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `pbuy` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `psale` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `pstock` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `pcommentary` varchar(255) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `product`
--

INSERT INTO `product` (`pid`, `pname`, `pcategoryname`, `pbuy`, `psale`, `pstock`, `pcommentary`) VALUES
(3, 'Bilgisayar', '16', '2500', '3000', '5', 'Laptop'),
(4, 'Telefon', '16', '2000', '2500', '75', 'Cep Telefonu'),
(5, 'Telefon', '16', '2000', '2500', '63', 'Cep Telefonu'),
(6, 'Bilgisayar', '16', '2500', '3000', '100', 'Laptop'),
(7, 'Bilgisayar', '16', '2500', '3000', '100', 'Laptop'),
(8, 'Buzdolabı', '18', '1500', '2000', '250', 'No Frost');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `sale`
--

CREATE TABLE `sale` (
  `sid` int(11) NOT NULL,
  `scosid` int(11) NOT NULL,
  `spid` int(11) NOT NULL,
  `piece` int(11) NOT NULL,
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `sale`
--

INSERT INTO `sale` (`sid`, `scosid`, `spid`, `piece`, `date`) VALUES
(8, 4, 3, 25, '2019-04-26 16:30:32'),
(9, 4, 3, 20, '2019-04-26 16:30:37'),
(10, 4, 5, 12, '2019-04-28 10:58:20');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `usersign`
--

CREATE TABLE `usersign` (
  `uid` int(11) NOT NULL,
  `uname` varchar(16) COLLATE utf8_turkish_ci NOT NULL,
  `upassword` varchar(8) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `usersign`
--

INSERT INTO `usersign` (`uid`, `uname`, `upassword`) VALUES
(1, 'admin', 'admin');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`cid`);

--
-- Tablo için indeksler `costumers`
--
ALTER TABLE `costumers`
  ADD PRIMARY KEY (`cosid`);

--
-- Tablo için indeksler `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`pid`);

--
-- Tablo için indeksler `sale`
--
ALTER TABLE `sale`
  ADD PRIMARY KEY (`sid`);

--
-- Tablo için indeksler `usersign`
--
ALTER TABLE `usersign`
  ADD PRIMARY KEY (`uid`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `category`
--
ALTER TABLE `category`
  MODIFY `cid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- Tablo için AUTO_INCREMENT değeri `costumers`
--
ALTER TABLE `costumers`
  MODIFY `cosid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- Tablo için AUTO_INCREMENT değeri `product`
--
ALTER TABLE `product`
  MODIFY `pid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Tablo için AUTO_INCREMENT değeri `sale`
--
ALTER TABLE `sale`
  MODIFY `sid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Tablo için AUTO_INCREMENT değeri `usersign`
--
ALTER TABLE `usersign`
  MODIFY `uid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
