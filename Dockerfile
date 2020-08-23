FROM openjdk:11

COPY ./target/spring-docker-example-0.0.1-SNAPSHOT.jar /

WORKDIR /

RUN sh -c 'touch spring-docker-example-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","spring-docker-example-0.0.1-SNAPSHOT.jar"]