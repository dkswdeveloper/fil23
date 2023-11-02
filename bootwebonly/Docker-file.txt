# change the packaging to jar in pom.xml
# run as maven build : package
FROM openjdk:8
ADD target/bootwebonly-0.0.1-SNAPSHOT.jar bootwebonly-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar" , "bootwebonly-0.0.1-SNAPSHOT.jar" ]

# docker build -t bootwebonly .
# run the container as 
# docker run -d -p 9898:8080 bootwebonly
# docker container stop idofcontainer
# docker container rm idofcontainer
# docker image rm bootwebonly

# 