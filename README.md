# K8S Bootcamp
简要说明:  This is for Kubernetes bootcamp（K8S入门训练营） , 配合线下培训课程的实操环境

## 介绍:
K8S入门训练营是社区内由志愿者组织的，给同学们介绍容器和Kubernetes的实操入门课程。

## 目前参与授课的志愿者名单如下：
  * 谭中意
  * 徐晓强
  * 王然
  * 李子昂
  * 涂强
  * 邬乔

## 快速开始
如何构建、安装、运行

git clone后，可以看到php, node, tomcat, python, nginx几个子目录
  * 子目录按照运行环境进行区分，其下的子目录
    * docker子目录下存放Dockerfile，主程序和两个版本的主程序
    * deployments目录下存放几个相关deploy的yaml
    * service下存放相关几个service的yaml

  * 运行
    * 进入docker目录，创建docker image，并push到registry
    * 进入deployments目录，使用kubectl根据yaml创建deployments
    * 进入service目录，使用kubectl和yaml创建service


## 测试
暂无，欢迎贡献

## 如何贡献
欢迎贡献，贡献流程如下
先提Issue，然后贡献Patch，经过Review之后即可进入

## 讨论
请直接在issue提问题，thanks

