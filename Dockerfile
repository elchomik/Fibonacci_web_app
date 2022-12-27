FROM openjdk:17
LABEL maintaner = "Mateusz Markowski"
ADD fibonacci_web/fibonacci_app.jar fibonacci-app.jar
ENTRYPOINT ["java", "-jar", "fibonacci-app.jar"]
