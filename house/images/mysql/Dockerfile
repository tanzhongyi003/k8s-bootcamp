FROM mysql:5.7
MAINTAINER xuxiaoqiang <xuxiaoqiang@baidu.com>

RUN sed -i 's|/var/lib/mysql|/var/lib/mysql2|g' /etc/mysql/my.cnf

COPY grant.sh schema.sql /docker-entrypoint-initdb.d/
