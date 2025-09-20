
FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY target/Gateway-3.5.6.war /app/Gateway-3.5.6.war

EXPOSE 8084

CMD ["java", "-jar", "/app/Gateway-3.5.6.war"]
