FROM openjdk:8-alpine
ADD target/LearningSpringBoot.jar LearningSpringBoot.jar
ENTRYPOINT ["java", "-jar","LearningSpringBoot.jar"]
EXPOSE 8080