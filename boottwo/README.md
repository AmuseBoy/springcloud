#spring cloud boottwo 测试项目

spring-boot-starter-actuator 提供了一套监控功能，包含/refresh接口
访问post请求：http://localhost:8091/refresh 来刷新配置，但是这样做很麻烦，
github有webhooks功能，在config-repo项目提交时，可以自动触发该请求
