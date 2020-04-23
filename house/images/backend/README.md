# Backend image for House

This image is based on `et-dr.baidu.com/macross/java:jdk-8u152-mix`, and the project is rewrited using springboot.

`src` is the source code of project. In order to make docker build more faster, there is a built binary file in `bin`.

## Build from source

In order to to build the source project, `jdk8` and `maven 3` is needed.

Here is the build command:

```shell
mvn clean package
```

## Docker build

To build this image, you can simply execute the following commands:

```shell
cd house/images/backend/bin
docker build -t backend-house:jdk1.8 .
```

## Start backend with Docker

Before start app, `mysql-house:5.7` is needed to start. Remember to replace backend's database config if you start directly using docker. The config file is located in `/app/config/application.properties`

In `house/start_docker/start_backend.sh`, there is a minimum docker command to start the app:

```shell
docker run -d \
--name backend \
-p 8080:8080 \
backend-house:jdk1.8
```

You can visit `http://127.0.0.1:8080/healthcheck` to get the page if the container start successfully. The url will return a json string:

```json
{
    "success": true,
    "code": 200
}
```

