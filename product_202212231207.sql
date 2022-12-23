INSERT INTO javadbtest.product (NAME,PRICE,QUANITY,DESCRIPTION) VALUES
	 ('Pen',12,6,'cello'),
	 ('Pen',14,7,'cello'),
	 ('mop',16,9,'cello');


-- javadbtest.product definition

CREATE TABLE `product` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(11) NOT NULL,
  `PRICE` int(11) NOT NULL,
  `QUANITY` int(11) NOT NULL,
  `DESCRIPTION` varchar(11) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=601 DEFAULT CHARSET=latin1;
