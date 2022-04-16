FROM openjdk:11
MAINTAINER madhav Pasuamrthy psvsaimadhav@gmail.com
COPY ./target/minicalculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-jar", "minicalculator-1.0-SNAPSHOT.jar"]
