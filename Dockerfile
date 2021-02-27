FROM openjdk:8-jdk-alpine
EXPOSE 8989
ARG JAR_FILE=target/dockerspringbootexample.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]