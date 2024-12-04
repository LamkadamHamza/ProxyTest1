FROM openjdk:17-oracle
VOLUME /tmp
ADD target/*.jar app.jar
CMD ["java", "-jar", "app.jar", "--spring.profiles.active=prod"]
EXPOSE 2222
