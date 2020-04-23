#!/bin/bash

mysql -uroot -p${MYSQL_ROOT_PASSWORD} -e "CREATE DATABASE IF NOT EXISTS code_master default charset utf8 COLLATE utf8_general_ci;"
mysql -uroot -p${MYSQL_ROOT_PASSWORD} -e "grant all privileges on code_master.* to 'root'@'%' identified by '${MYSQL_ROOT_PASSWORD}'"
