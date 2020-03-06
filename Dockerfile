FROM openjdk:8-jdk-alpine
COPY ./target/*.jar /usr/app/api.jar
WORKDIR /usr/app
EXPOSE 8080
ENTRYPOINT ["java","-jar","api.jar"]