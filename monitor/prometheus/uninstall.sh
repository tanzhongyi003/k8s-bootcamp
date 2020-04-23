#!/bin/bash
# usage: sh uninstall.sh {{your_namespace}}
np="$1"

kubectl delete service/prometheus-service -n $np;
kubectl delete service/mysql-exporter-svc -n $np;
kubectl delete service/grafana-svc -n $np;
kubectl get service -n $np;

kubectl delete deployment/prometheus-deployment -n $np;
kubectl delete deployment/grafana -n $np;
kubectl delete deployment/mysqld-exporter -n $np;
kubectl get deployment -n $np;

kubectl delete configmaps/prometheus-server-conf -n $np;
kubectl get configmaps -n $np;


kubectl delete clusterroles.rbac.authorization.k8s.io/prometheus-test;
kubectl get clusterroles.rbac.authorization.k8s.io;

kubectl delete clusterrolebindings.rbac.authorization.k8s.io/prometheus-test;
kubectl get clusterrolebindings.rbac.authorization.k8s.io;
