FROM alpine:3.16.0

RUN apk add openjdk11
COPY target/MicroserviceSimple-2.7.0.jar target/app.jar

ENTRYPOINT ["java", "-jar", "/target/app.jar"]