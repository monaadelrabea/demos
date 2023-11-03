FROM openjdk:8-jre-alpine

RUN apk add --update-cache \
    nano \
    tzdata

ENV TZ="UTC"

RUN date

WORKDIR /workdir

ADD docker/log4j2.xml config/

COPY out/libs libs/

COPY out/elk-logs-demo.jar libs/

ENTRYPOINT ["java", "-jar", "-XX:+UseG1GC", "-Dfile.encoding=UTF-8", "-Dlogging.config=config/log4j2.xml", "libs/elk-logs-demo.jar"]
