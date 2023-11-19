# FROM openjdk:17
# WORKDIR /app

# COPY /employeemanagement/target/employeemanagement-0.0.1-SNAPSHOT.jar app.jar
# COPY /employeemanagement/src/main/resources/application.yml application.yml
# EXPOSE 8080

# CMD ["java","-jar","app.jar"]

FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080