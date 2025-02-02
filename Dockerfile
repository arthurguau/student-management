FROM eclipse-temurin:17-alpine
WORKDIR /app
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /app/studentmanagement.jar
ENTRYPOINT ["java","-jar","/app/studentmanagement.jar"]
  