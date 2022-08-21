# Compilar
#FROM maven:3.8.2-jdk-8 AS builder
#WORKDIR /app
#COPY . /app
#RUN mvn clean package

# Executar
#FROM openjdk:17-slim
#WORKDIR /app
#COPY --from=builder /usr/src/project/my_project.jar ./my_project.jar
FROM openjdk:8-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
COPY maven/${project.build.finalName}.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]