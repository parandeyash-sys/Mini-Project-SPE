FROM openjdk:17.0.1-jdk-slim

WORKDIR /app

COPY target/SPEMiniProject-1.0-SNAPSHOT.jar app.jar

CMD ["/bin/sh"]