
# Use the OpenJDK 17 on Alpine Linux as the base image
FROM openjdk:17-jdk-alpine

# Create a volume to persist data
VOLUME /tmp

# Argument to pass Java options
ARG JAVA_OPTS

# Set the environment variable for Java options
ENV JAVA_OPTS=$JAVA_OPTS

# Copy the Spring Boot application JAR file into the container
COPY target/quiz-service-0.0.1-SNAPSHOT.jar quizservice.jar

# Expose port 8082 to the outside world
EXPOSE 8082

# Run the Spring Boot application
ENTRYPOINT exec java $JAVA_OPTS -jar quizservice.jar

# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
#ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar quizservice.jar
