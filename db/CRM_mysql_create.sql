DROP DATABASE if exists crm_db;
CREATE DATABASE crm_db;
USE crm_db;

CREATE TABLE `Customer` (
	`customerId` INT NOT NULL AUTO_INCREMENT,
	`companyName` varchar(255) NOT NULL,
	`belongsTo` varchar(255) NOT NULL,
	`contactPerson` INT,
	PRIMARY KEY (`customerId`)
);

CREATE TABLE `Order` (
	`orderId` INT NOT NULL AUTO_INCREMENT,
	`customerId` INT NOT NULL,
	`item` varchar(255) NOT NULL,
	`date` DATETIME NOT NULL,
	`price` FLOAT NOT NULL,
	PRIMARY KEY (`orderId`)
);

CREATE TABLE `Person` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`firstName` varchar(128) NOT NULL,
	`lastName` varchar(128),
	`phoneNumber` VARCHAR(128),
	`email` VARCHAR(128),
	`position` VARCHAR(128),
	`comments` VARCHAR(2048),
	PRIMARY KEY (`id`)
);

CREATE TABLE `User` (
	`userEmail` varchar(255) NOT NULL,
	`userFirstName` varchar(255) NOT NULL,
	`userLastName` varchar(255) NOT NULL,
	`userPassword` VARCHAR(255) NOT NULL,
	PRIMARY KEY (`userEmail`)
);

CREATE TABLE `Item` (
	`itemId` INT NOT NULL AUTO_INCREMENT,
	`itemName` varchar(255) NOT NULL,
	`itemQuantity` INT NOT NULL,
	`itemPrice` FLOAT NOT NULL,
	`belongsToOrder` INT NOT NULL,
	PRIMARY KEY (`itemId`)
);

ALTER TABLE `Customer` ADD CONSTRAINT `Customer_fk0` FOREIGN KEY (`belongsTo`) REFERENCES `User`(`userEmail`);

ALTER TABLE `Customer` ADD CONSTRAINT `Customer_fk1` FOREIGN KEY (`contactPerson`) REFERENCES `Person`(`id`);

ALTER TABLE `Order` ADD CONSTRAINT `Order_fk0` FOREIGN KEY (`customerId`) REFERENCES `Customer`(`customerId`);

ALTER TABLE `Item` ADD CONSTRAINT `Item_fk0` FOREIGN KEY (`belongsToOrder`) REFERENCES `Order`(`orderId`);

INSERT INTO User (userEmail, userFirstName, userLastName, userPassword)
VALUES('joecthomsen@gmail.com' , 'Johannes' , 'Thomsen' ,'aGffrTdswXrhddgTTRVE');









