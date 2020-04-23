#!/bin/bash

docker run -d \
--name backend \
-p 8080:8080 \
hub.baidubce.com/bootcamp/backend-house:jdk1.8
