#!/bin/bash

docker run -d \
-e MYSQL_ROOT_PASSWORD="root123!" \
--name mysql \
-p 3306:3306 \
hub.baidubce.com/bootcamp/mysql-house:5.7
