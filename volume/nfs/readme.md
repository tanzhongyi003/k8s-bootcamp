https://www.katacoda.com/courses/kubernetes/storage-introduction

this example is got from katacoda

it uses docker's nfs server as nfs server,

mysql and http mount nfs directory as their data directory

the sample is tested  on CCE,
  
Steps：

1. ssh to CCE node, run start_nfs_server.sh

2. install nfs lib on CCE node
   on Centos:  #yum install -y nfs-utils
   on Ubuntu:  #apt install -y nfs-common

3. get CCE node's Node IP, put it into nfs-0001.yaml and nfs-0002.yaml

4. create volume by run
   $kubectl create -f nfs-0001.yaml
   $kubectl create -f nfs-0002.yaml

5. create volume claim by run
   $kubectl create -f pvc-http.yaml
   $kubectl create -f pvc-mysql.yaml

6. create pod to use volume claim
   $kubectl create -f pod-www.yaml

7. access www's content
   docker exec -it nfs-server bash -c "echo 'Hello World' > /exports/data-0001/index.html"
   ip=$(kubectl get pod www -o yaml |grep podIP | awk '{split($0,a,":"); print a[2]}'); echo $ip
   curl $ip

8. change nfs's content by using commands below
   docker exec -it nfs-server bash -c "echo 'Hello NFS World' > /exports/data-0001/index.html"
   curl $ip

9. delete www pod and create another pod www2
   kubectl delete pod pod-www
   kubectl create -f pod-www2.yaml

10.access www2's content to check if the change has been persisted.
   ip=$(kubectl get pod www2 -o yaml |grep podIP | awk '{split($0,a,":"); print a[2]}'); echo $ip
   curl $ip
