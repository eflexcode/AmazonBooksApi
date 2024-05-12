FROM openjdk:17-jdk-alpine
ARG JAR_FILE=*.jar
COPY target/AmazonBooksApi-0.0.1.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
