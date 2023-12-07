FROM openjdk:latest
EXPOSE 9010
ADD target/team2-backend-1.jar team2-backend-1.jar
ENTRYPOINT ["java","-jar", "/team2-backend-1.jar"]