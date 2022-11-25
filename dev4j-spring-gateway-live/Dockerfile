#Imágen base a utilizar 
FROM openjdk:8u181-alpine
#Información del equipo de contacto 
LABEL maintainer="contacto@devs4j.com" 
#Archivo Jar de la aplicación(Será asignado por el #pluging de Maven) 
# Refer to Maven build -> finalName
ARG JAR_FILE=target/dev4j-spring-gateway-live-0.0.1-SNAPSHOT.jar
#Agregar el Jar al contenedor 
COPY ${JAR_FILE} /app.jar 
#Ejecución de la aplicación 
ENTRYPOINT ["java","-jar","/app.jar"]

 