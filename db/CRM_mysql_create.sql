DROP DATABASE crm_db;
CREATE DATABASE crm_db;
USE crm_db;
CREATE TABLE `Customers` (
	`customerId` INT NOT NULL AUTO_INCREMENT,
	`belongsToUser` INT NOT NULL,
	`companyName` varchar(255) NOT NULL,
	PRIMARY KEY (`customerId`)
);

CREATE TABLE `Orders` (
	`orderId` INT NOT NULL AUTO_INCREMENT,
	`customerId` INT NOT NULL,
	`date` DATETIME NOT NULL,
	`price` FLOAT NOT NULL,
	PRIMARY KEY (`orderId`)
);

CREATE TABLE `Employees` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`worksAtId` INT,
	`firstName` varchar(128) NOT NULL,
	`lastName` varchar(128),
	`phoneNumber` VARCHAR(128),
	`email` VARCHAR(128),
	`position` VARCHAR(128),
	`comments` VARCHAR(2048),
	PRIMARY KEY (`id`)
);

CREATE TABLE `UserProfiles` (
	`userId` INT NOT NULL AUTO_INCREMENT,
	`userEmail` varchar(255) NOT NULL,
	`userFirstName` varchar(255) NOT NULL,
	`userLastName` varchar(255) NOT NULL,
	`userPassword` VARCHAR(255) NOT NULL,
	PRIMARY KEY (`userId`)
);

CREATE TABLE `Items` (
	`itemId` INT NOT NULL AUTO_INCREMENT,
	`belongsToOrder` INT NOT NULL,
	`itemName` varchar(255) NOT NULL,
	`itemQuantity` INT NOT NULL,
	`itemPrice` FLOAT NOT NULL,
	PRIMARY KEY (`itemId`)
);

ALTER TABLE `Customers` ADD CONSTRAINT `Customers_fk0` FOREIGN KEY (`belongsToUser`) REFERENCES `UserProfiles`(`userId`);

ALTER TABLE `Orders` ADD CONSTRAINT `Orders_fk0` FOREIGN KEY (`customerId`) REFERENCES `Customers`(`customerId`);

ALTER TABLE `Employees` ADD CONSTRAINT `Employees_fk0` FOREIGN KEY (`worksAtId`) REFERENCES `Customers`(`customerId`);

ALTER TABLE `Items` ADD CONSTRAINT `Items_fk0` FOREIGN KEY (`belongsToOrder`) REFERENCES `Orders`(`orderId`);

INSERT INTO UserProfiles VALUE(1, 'joecthomsen@gmail.com','Johannes','Thomsen','HFFDegdgD4y42!');
INSERT INTO Customers VALUE(1, 1, 'Sky Cider');
INSERT INTO Employees VALUE(1, 1, 'Ebbe', 'Hansen', '33114840', 'ebbe@skycider.com' , 'Manager' , 'He has three eyes!');
INSERT INTO Orders VALUE(1, 1, NOW() , 1299.99);
INSERT INTO Items VALUE(1, 1, 'Sky Cider Apple/elderflower', 3, 990.99);








