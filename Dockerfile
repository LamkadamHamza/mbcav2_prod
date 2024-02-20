FROM openjdk:17-oracle
VOLUME  /tmp
COPY target/MB-CA-V2.jar  app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
