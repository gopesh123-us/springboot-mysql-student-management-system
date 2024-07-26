FROM openjdk:17
EXPOSE 8080
COPY target/sms-mysql-app.jar sms-mysql-app.jar
ENTRYPOINT [ "java", "-jar", "/sms-mysql-app.jar" ]