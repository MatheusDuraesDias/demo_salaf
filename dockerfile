#BUILD
FROM maven:3.8.3-openjdk-17 AS BUILD

COPY . .
RUN mvn clean package -DskipTests

# Stage Package
FROM openjdk:17-jdk-slim

COPY --from=BUILD /target/demo_salaf-0.0.1-SNAPSHOT.jar fidalgo.jar

EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "fidalgo.jar" ]