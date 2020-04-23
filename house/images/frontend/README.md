# Frontend image for House

This image is based on official `nginx:1.15.5-alpine`[Docker hub](https://hub.docker.com/_/nginx/), and add all statics file into the image.

## Docker build

To build this image, you can simply execute the following commands:

```shell
cd house/images/frontend
docker build -t frontend-house:1.15.5-alpine .
``` 

## Start frontend with Docker

In `house/start_docker/start_frontend.sh`, there is a minimum docker command to start the app:

```shell
docker run -d \
-e be_host=127.0.0.1 \
-e be_port=8080 \
--name frontend \
-p 8000:80 \
frontend-house:1.15.5-alpine
```

The `be_host` and `be_port` stands for backend host address and backend port. These variables is optional. 
`127.0.0.1` and `8080` will be used if unset. 

You can visit `http://127.0.0.1:8000` to get the page if the container start successfully.

