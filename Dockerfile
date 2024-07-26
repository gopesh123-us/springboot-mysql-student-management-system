FROM openjdk:17
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package
EXPOSE 8080 
WORKDIR /app
ENTRYPOINT [ "java", "-jar", "/home/app/target/sms-mysql-app.jar" ]
