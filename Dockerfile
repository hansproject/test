FROM openjdk:8
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} demo-0.0.1-SNAPSHOT2.jar
ENTRYPOINT ["java","-jar","/demo-0.0.1-SNAPSHOT2.jar"]
EXPOSE 8080