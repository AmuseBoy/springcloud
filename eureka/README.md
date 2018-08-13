# Eureka
spring cloud eureka项目

#1.确保集群中的所有服务中的 spring.application.name 或者 eureka.instance.appname 的属性值相同

#2.eureka.client.register-with-eureka 与 eureka.client.fetch-registry 均需要设置为 true，表示允许 eureka server 服务之间相互注册

#3.设置 eureka.instance.hostname，eureka.client.defaultZone 中配置的注册地址别用 IP 使用 hostname

C:\Windows\System32\drivers\etc\hosts 配置ip
127.0.0.1 peer1
127.0.0.1 peer2
127.0.0.1 peer3


#其他没用的
spring cloud eureka提供了服务注册与发现功能，可以与负载均衡配合使用；
供各个项目之间以微服务的形式互相访问；不在配置IP、port,或者引文IP、port变化而困扰；

服务访问之间常遇到的问题总结（假设都想通过实例名eureka来访问）：

1.spring cloud项目访问非此框架的项目，使用 spring cloud sidecar项目代理非spring cloud项目注册到eureka,实现通信；

2.非此框架项目访问spring cloud项目，若不想设置代理，则使用spring cloud zuul项目路由到实例名；

3.非cloud项目互相访问，可通过zuul路由到eureka，再通过sidecar项目访问

cat /etc/hosts  注意每台服务器的hosts文件里的名称要唯一，重名的会被顶掉
instanceId: ${spring.application.name}-${application.version}@${spring.cloud.client.ipAddress}:${server.port}(${spring.cloud.client.hostname})
