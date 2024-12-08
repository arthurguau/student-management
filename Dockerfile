FROM openjdk:17
WORKDIR /app
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /app/studentmanagement.jar
ENTRYPOINT ["java","-jar","/app/studentmanagement.jar"]
  