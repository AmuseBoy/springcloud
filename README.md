#spring cloud项目合集

#关于spring cloud版本的一点说明
-- Finchley构建并使用Spring Boot 2.0.x，并且不期望与Spring Boot 1.5.x一起使用。

-- Dalston和Edgware建立在Spring Boot 1.5.x上，并不期望与Spring Boot 2.0.x一起使用。

-- Camden搭载Spring Boot 1.4.x，但也经过1.5.x测试。

-- Brixton搭载Spring Boot 1.3.x，但也经过1.4.x测试。

-- Angel版本建立在Spring Boot 1.2.x上，在某些领域与Spring Boot 1.3.x不兼容。
   Brixton构建在Spring Boot 1.3.x上，与1.2.x类似。某些libraries和大部分基于Angel的应用程序都将在Brixton上运行良好，
   但是在使用Spring-cloud-security 1.0.x的OAuth2功能之前，它们将会在任何地方进行更改。