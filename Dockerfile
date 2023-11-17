FROM openjdk:21-bullseye
ADD target/LearningSpringBoot.jar LearningSpringBoot.jar
ENTRYPOINT ["java", "-jar","LearningSpringBoot.jar"]
EXPOSE 8080