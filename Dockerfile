from openjdk:11
EXPOSE 8761
ADD target/eurekaappserver.jar eurekaappserver.jar
ENTRYPOINT ["java","-jar","/eurekaappserver.jar"]