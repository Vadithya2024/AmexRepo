CREATE DATABASE school_database;

CREATE TABLE students (
                          id INT AUTO_INCREMENT PRIMARY KEY,
                          name VARCHAR(255) NOT NULL,
                          date_of_birth DATE NOT NULL,
                          joining_date DATE NOT NULL,
                          class_name VARCHAR(255) NOT NULL
);