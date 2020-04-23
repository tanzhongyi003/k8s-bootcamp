#!/bin/sh

java -jar $VM_OPTIONS -Dspring.config.location=/app/config/application.properties /app/lib/backend-1.0.0-SNAPSHOT.jar
