FROM openjdk:17

WORKDIR /usr/src/bootapp

COPY ./sms-mysql-app.jar /usr/src/bootapp/

ENTRYPOINT [ "java", "-jar", "sms-mysql-app.jar" ]
