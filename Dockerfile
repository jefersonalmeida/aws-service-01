FROM openjdk:17-alpine

VOLUME /tmp

ARG DEPENDENCY=target/dependency

COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/BOOT-INF/classes /app

ENTRYPOINT ["java","-cp","app:app/lib/*","br.com.jefersonalmeida.aws_service_01.AwsService01Application"]
