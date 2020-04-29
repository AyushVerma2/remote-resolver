FROM openjdk:11
WORKDIR /home
COPY target/resolver-operation.jar /home/resolver-operation.jar 
CMD java -jar resolver-operation.jar
