FROM maven:3.9.8-amazoncorretto-17 AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "/home/app/target/sms-mysql-app.jar" ]