-- MySQL Script generated by MySQL Workbench
-- 12/17/14 20:26:53
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`marca`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`marca` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`modelo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`modelo` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`cliente` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(50) NULL,
  `email` VARCHAR(40) NULL,
  `cpf` VARCHAR(14) NULL,
  `fone` VARCHAR(13) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`automovel`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`automovel` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `ano` VARCHAR(4) NULL,
  `chassi` VARCHAR(17) NOT NULL,
  `marca_id` INT NOT NULL,
  `modelo_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_automovel_marca1_idx` (`marca_id` ASC),
  INDEX `fk_automovel_modelo1_idx` (`modelo_id` ASC),
  CONSTRAINT `fk_automovel_marca1`
    FOREIGN KEY (`marca_id`)
    REFERENCES `mydb`.`marca` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_automovel_modelo1`
    FOREIGN KEY (`modelo_id`)
    REFERENCES `mydb`.`modelo` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`locacao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`locacao` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `data_locacao` DATE NULL,
  `automovel_id` INT NOT NULL,
  `cliente_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_locacao_automovel_idx` (`automovel_id` ASC),
  INDEX `fk_locacao_cliente1_idx` (`cliente_id` ASC),
  CONSTRAINT `fk_locacao_automovel`
    FOREIGN KEY (`automovel_id`)
    REFERENCES `mydb`.`automovel` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_locacao_cliente1`
    FOREIGN KEY (`cliente_id`)
    REFERENCES `mydb`.`cliente` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
