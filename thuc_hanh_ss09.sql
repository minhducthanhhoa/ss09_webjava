CREATE DATABASE thuc_hanh_ss09;

USE thuc_hanh_ss09;

CREATE TABLE customer (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL,
    phone VARCHAR(15),
    address VARCHAR(100),
    gender VARCHAR(10),
    email VARCHAR(100)
);

INSERT INTO customer (username, password, phone, address, gender, email)
VALUES ('admin', '123456', '0909090909', 'Hanoi', 'Male', 'admin@gmail.com');

CREATE TABLE movies (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255),
    director VARCHAR(100),
    genre VARCHAR(50),
    description TEXT,
    duration INT,
    language VARCHAR(50)
);
