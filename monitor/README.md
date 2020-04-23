# k8s with 监控 配套课件
## written by tuqiang

## usage

./probe 目录中提供两种probe的三种策略共六个yaml文件 

执行kubectl create -f file 进行 deployment 建立。

./prometheus 

sh install.sh yournamespace  建立普罗米修斯服务于nodePort 30000端口
sh uninstall.sh yournamespace 卸载所有普罗米修斯服务
