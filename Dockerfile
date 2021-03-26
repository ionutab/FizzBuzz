FROM openjdk:8-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
COPY target/fizzBuzz-0.0.1-SNAPSHOT.jar fizzBuzz-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/fizzBuzz-0.0.1-SNAPSHOT.jar"]