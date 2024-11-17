#Build the application
FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean install

#Run the application
FROM openjdk:17-alpine
WORKDIR /app
COPY --from=build /app/target/smsapp.jar ./smsapp.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "smsapp.jar" ]