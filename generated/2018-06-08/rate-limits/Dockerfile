FROM centos:7
ENV RELEASE_PATH target/rate-limits-swarm.jar
RUN yum install -y \
    java-1.8.0-openjdk-headless \
  && yum clean all

WORKDIR /opt/rate-limits

ADD ${RELEASE_PATH} /opt/rate-limits

RUN groupadd -r duser -g 1001 \
    && useradd -u 1001 -r -g duser -d /opt/rate-limits/ -s /sbin/nologin -c "Docker image user" duser \
    && chown -R duser:duser /opt/rate-limits/ \
    && chgrp -R 0 /opt/rate-limits && chmod -R g=u /opt/rate-limits

USER 1001


EXPOSE 8080

ENV PORT_OFFSET=0
ENV LOGGING_LEVEL=INFO

CMD java -jar /opt/rate-limits/rate-limits-swarm.jar \
    -Dswarm.port.offset=${PORT_OFFSET} \
    -Dswarm.logging=${LOGGING_LEVEL}
