# use official open jdk library
FROM openjdk:26

#setup working directory
WORKDIR /app

#copy compiled jar to container directory
COPY build/libs/EcommerceGeneric-0.0.1-SNAPSHOT-plain.jar /app

#run app with this commands
CMD ["java", "-jar", "EcommerceGeneric-0.0.1-SNAPSHOT-plain.jar"]

