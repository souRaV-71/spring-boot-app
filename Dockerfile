FROM openjdk:17

COPY target/springboot-docker-aws-ecs.jar  /usr/app/

WORKDIR /usr/app/

ENTRYPOINT ["java", "-jar", "springboot-docker-aws-ecs.jar"]