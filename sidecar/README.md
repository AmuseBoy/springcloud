#spring cloud sidecar项目

sidecar可以跨语言代理注册服务
本例子用来代理一个 图片上传服务zimg（php,部署很蛮烦，可以换个例子代替）-> https://github.com/buaazp/zimg.git
rpm下载：wget https://github.com/buaazp/zimg/releases/download/v3.1.0/zimg-3.1.0-Release.x86_64.rpm
zimg：环境搭建https://blog.csdn.net/renhuaniang/article/details/46376039

安装后位置：/usr/local/zimg
启动命令：./zimg conf/zimg.lua   
启动端口：4869


#zimg访问介绍
查询图片：http://192.168.32.128:4869/{上传后返回的id}
上传图片：http://192.168.32.128:4869/upload
该zimg服务不能直接通过sidecar端口访问，需要通过eureka实例访问，或者直接访问zimg
如：
zimg访问：http://192.168.32.128:4869/5377e185f4973db8a63f6b175dac14f0
zuul访问实例：http://localhost:8888/zimg/5377e185f4973db8a63f6b175dac14f0
restTemplate(ip)访问: http://localhost:5678/5377e185f4973db8a63f6b175dac14f0
restTemplate(实例)访问: http://sidecar:5678/5377e185f4973db8a63f6b175dac14f0

