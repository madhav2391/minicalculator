FROM --platform=linux/arm64 openjdk:11
COPY ./target/minicalculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-jar", "minicalculator-1.0-SNAPSHOT-jar-with-dependencies.jar"]
