# Repel_Server

Build cu ./gradlew build pentru a compune jar-ul  sau  ./gradlew bootRun pentru a rula.

Pentru MySQL
Download link https://dev.mysql.com/downloads/installer/
 
 In /src/main/resources/application.properties trebuie modificate campurile:
spring.datasource.url=jdbc:mysql://localhost:3306/*NumeleBazeiDeDate*
spring.datasource.username=*User la mysql*
spring.datasource.password= *Parola la mysql*

In command line ul MYSQL:

CREATE DATABASE repeldb;
use repeldb;
CREATE TABLE users ( id int unsigned not null auto_increment,username varchar(20) not null,primary key (userId));

Pentru rulare:
In /build/libs se afla jar ul compilat de gradle.
java -jar build/libs/gs-accessing-data-mysql-0.1.0.jar // pentru a porni server ul 

In browser:
localhost:8080/demo/all // pentru a vedea continutul DB ului;
localhost:8080/demo/add?name=Sorin&id=5 // pentru a adauga in baza de date; 
