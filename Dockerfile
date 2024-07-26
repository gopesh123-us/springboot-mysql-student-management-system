FROM openjdk:17 
ADD target/sms-mysql-app.jar sms-mysql-app.jar
ENTRYPOINT [ "java", "-jar", "/home/app/target/sms-mysql-app.jar" ]
