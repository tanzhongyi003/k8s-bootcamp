# Builder image
FROM golang:1.12-alpine as builder
COPY . /go/src/hello-app
RUN go install hello-app

# Executable image
FROM alpine:latest
COPY --from=builder /go/bin/hello-app .
EXPOSE 8080
CMD ["./hello-app"]
