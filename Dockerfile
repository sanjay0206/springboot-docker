# openjdk:8 image is available in docker hub
FROM openjdk:8

# make port 8080 available outside the container
EXPOSE 8080

ADD target/*.jar dockerapp.jar

ENTRYPOINT ["java", "-jar", "/dockerapp.jar"]