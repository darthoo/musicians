CREATE DATABASE music CHARACTER SET utf8 COLLATE utf8_general_ci;
use music;

CREATE TABLE user (
  user_id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(45) NOT NULL,
  age INT NOT NULL,
  PRIMARY KEY (user_id))
  ENGINE = InnoDB
  DEFAULT CHARACTER SET = utf8;


CREATE TABLE composition (
  composition_id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(45) NULL,
  artist VARCHAR(45) NULL,
  duration FLOAT NULL,
  rating FLOAT NULL,
  PRIMARY KEY (composition_id))
  ENGINE = InnoDB
  DEFAULT CHARACTER SET = utf8;
CREATE TABLE user_composition(
    user_id INT NOT NULL,
    composition_id INT NOT NULL,
    PRIMARY KEY (user_id, composition_id),
    CONSTRAINT FK_USER FOREIGN KEY (user_id) REFERENCES user (user_id),
    CONSTRAINT FK_COMPOSITION FOREIGN KEY (composition_id) REFERENCES composition (composition_id)
) ENGINE = InnoDB
  DEFAULT CHARACTER SET = utf8;