# MySQL image for House

This image is based on official `mysql:5.7` [Docker hub](https://hub.docker.com/_/mysql/), and with initialize database, schema, data and privileges.

## Docker build

To build this image, you can simply execute the following commands:

```shell
cd house/images/mysql
docker build -t mysql-house:5.7 .
```

## Start MySQL with Docker

In `house/start_docker/start_mysql.sh` , there is a minimum docker command to start the available house mysql:

```shell
docker run -d \
-e MYSQL_ROOT_PASSWORD="root123!" \
--name mysql \
-p 3306:3306 \
mysql-code-master:5.7
```

Generally, You can get the result below if mysql start and init successfully. 

```shell
# on container's host
$ docker exec -it mysql bash
root@[RANDOM]:/ mysql -uroot -proot123!

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| code_master        |
| mysql              |
| performance_schema |
| sys                |
+--------------------+
5 rows in set (0.00 sec)

mysql> use code_master;
Database changed

mysql> select count(1) from code_master_demo;
+----------+
| count(1) |
+----------+
|     2292 |
+----------+
1 row in set (0.01 sec)
```

