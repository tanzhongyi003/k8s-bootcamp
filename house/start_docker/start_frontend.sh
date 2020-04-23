#!/bin/bash

docker run -d \
-e be_host=127.0.0.1 \
-e be_port=8080 \
--name frontend \
-p 8000:80 \
hub.baidubce.com/bootcamp/frontend-house:1.15.5-alpine
