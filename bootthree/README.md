#spring cloud bootthree 测试项目

#启动feign实现远程服务调用,通过eureka实例实现访问

#加入熔断机制Hystrix

测试接口：http://localhost:8092/testRemote

#Hystrix-dashboard是一款针对Hystrix进行实时监控的工具，通过Hystrix Dashboard我们可以在直观地看到各Hystrix Command的请求响应时间, 请求成功率等数据
1.启动该项目，打开http://localhost:8092/hystrix地址，能看到Hystrix Dashboard页面
2.在页面输入http://localhost:8092/hystrix.stream能看到面板
3.如果没数据的话，要先调用测试接口，才会有数据信息

![](E:\liupeizhen\springcloud\bootthree\Hystrix Dashboard.png)