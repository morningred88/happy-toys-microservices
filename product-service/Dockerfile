FROM adoptopenjdk/openjdk11:alpine-jre

LABEL org.opencontainers.image.title="product-service" \
      org.opencontainers.image.description="Product microservice from happy-toys-app" \
      org.opencontainers.image.authors="@ Lily Ma"

ADD target/product-service-0.0.1-SNAPSHOT.jar app.jar

# Command for container to execute
ENTRYPOINT [ "java","-jar", "app.jar","-Dspring.profiles.active=prod"]

# Contain listens the request from port 8080
EXPOSE 8080


