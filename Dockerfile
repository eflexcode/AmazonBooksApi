FROM openjdk:17-jdk-alpine
ARG JAR_FILE=*.jar
COPY target/AmazonBooksApi-0.0.1.jar AmazonBooksApi-0.0.1.jar
ENTRYPOINT ["java", "-jar", "AmazonBooksApi-0.0.1.jar"]
