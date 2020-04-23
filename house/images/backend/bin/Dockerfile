FROM macross/java:jdk-8u152-mix
MAINTAINER xuxiaoqiang <xuxiaoqiang@baidu.com>

RUN mkdir -p /app /logs
ADD *-application.tar.gz /app
ADD start.sh /
VOLUME /logs
WORKDIR /app

EXPOSE 8080

ENTRYPOINT ["/start.sh"]
