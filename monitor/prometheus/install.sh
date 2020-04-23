#!/bin/bash
np="$1"
kubectl create namespace $np
kubectl create -f clusterRole.yaml -n $np;
kubectl create -f config-map.yaml -n $np;
kubectl create -f prometheus-deployment.yaml -n $np;
kubectl create -f prometheus-service.yaml -n $np;
kubectl create -f grafana-deployment.yaml -n $np;
