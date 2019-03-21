# Repel_Server

Build cu ./gradlew build pentru a compune jar-ul  sau  ./gradlew bootRun pentru a rula.

Pentru MySQL
Download link https://dev.mysql.com/downloads/installer/
 <br/>
 <br/>
 In /src/main/resources/application.properties trebuie modificate campurile:
 <br/>
spring.datasource.url=jdbc:mysql://localhost:3306/*NumeleBazeiDeDate*
<br/>
spring.datasource.username=*User la mysql*
<br/>
spring.datasource.password= *Parola la mysql*
<br/>
<br/>
In command line ul MYSQL:
<br/>
CREATE DATABASE repeldb;
<br/>
use repeldb;
<br/>
CREATE TABLE users ( id int unsigned not null auto_increment,username varchar(20) not null,primary key (userId));
<br/>
<br/>
Pentru rulare:
<br/>
In /build/libs se afla jar ul compilat de gradle.
<br/>
java -jar build/libs/gs-accessing-data-mysql-0.1.0.jar // pentru a porni server ul 
<br/>
In browser:
<br/>
localhost:8080/demo/all // pentru a vedea continutul DB ului;
<br/>
localhost:8080/demo/add?name=Sorin&id=5 // pentru a adauga in baza de date; 
