FROM openjdk:11-jdk-slim as build

LABEL maintainer="lucas.toulon@yahoo.de"

VOLUME /tmp

EXPOSE 8080

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
