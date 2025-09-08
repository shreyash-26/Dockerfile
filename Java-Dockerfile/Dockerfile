FROM openjdk:17
WORKDIR /usr/src/app
COPY Hello.java .
RUN javac Hello.java
EXPOSE 2000
CMD ["java", "Hello"]
