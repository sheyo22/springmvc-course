实现ssm框架步骤：
0.新建数据库和所需的表文件；
1.新建maven web项目；
2.加入依赖：springmvc，spring，mybatis，jackson，mysql驱动，druid连接池，jsp，servlet；
3.写web.xml：
    1)注册DispatcherServlet，目的：1.创建springmvc容器对象；2.创建servlet接收用户请求；
    2)注册spring监听器：ContextLoaderListener，目的：创建spring容器对象；
    3)注册字符集过滤器，解决post请求乱码的问题；
4.创建包
5.写springmvc，spring，mybatis，数据库的配置文件
6.写dao接口和mapper，service和实现类，controller，实体类；
7.写jsp页面