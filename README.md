# swaggerDemo
API文档工具——Swagger
# 1.Swagger概念
```
a.描述：Swagger 是一个规范和完整的框架，用于生成、描述、调用和可视化 RESTful 风格的 Web 服务

　　b.作用：

　　　　1）接口的文档在线自动生成

　　　　2）功能测试

　　c.注解：

　　　　1）@ApiModel：用于类，表示对类进行说明，用于参数用实体类接收

　　　　　　·value：表示对象名

　　　　　　·description：描述

　　　　2）@ApiModelProperty：用于方法，字段；表示对model属性的说明或者数据操作更改

　　　　　　·value：字段说明

　　　　　　·name：重写属性名字

　　　　　　·dataType：重写属性类型

　　　　　　·required：是否必填

　　　　　　·example：举例说明

　　　　　　·hidden：隐藏

　　　　3）@Api：修饰整个类，描述Controller的作用

　　　　　　·tags：控制类功能说明，tags是一个字符串数组，可以添加多个标签

　　　　　　·value：也是说明，可以使用tags替代

　　　　4）@ApiOperation：描述一个类的一个方法，或者说一个接口

　　　　　　·value：用于方法描述

　　　　　　·notes：用于提示内容

　　　　　　·tags：可以重新分组

　　　　5）@ApiParam：单个参数描述

　　　　　　·name：参数名

　　　　　　·value：参数说明

　　　　　　·required：是否必填

　　　　6）@ApiImplicitParams、@ApiImplicitParam：用于方法，描述方法的参数（@ApiImplicitParams包含多个@AplimplicitParam）

　　　　　　·name：参数名

　　　　　　·value：参数说明

　　　　　　·dataType：数据类型

　　　　　　·paramType：参数类型

　　　　　　·example：举例说明

　　　　7）@ApiIgnore：用于类或者方法上，可以不被swagger显示在页面上
```
# 2.Spring整合Swagger
  导入maven依赖
  ```
  		<!--swagger文档工具-->
		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger2</artifactId>
			<version>2.7.0</version>
		</dependency>
		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger-ui</artifactId>
			<version>2.7.0</version>
		</dependency>
```
  注意spring-boot-starter-parent <version>2.2.0.RELEASE</version>  
  创建Controller  
  访问 http://localhost:8080/（项目名）/swagger-ui.html 测试  
# 3.server.servlet.context-path配置的作用
```
定义： server.servlet.context-path= # Context path of the application. 应用的上下文路径，也可以称为项目路径，是构成url地址的一部分。

server.servlet.context-path不配置时，默认为 / ，如：localhost:8080/xxxxxx

当server.servlet.context-path有配置时，比如 /demo，此时的访问方式为localhost:8080/demo/xxxxxx
```
  
