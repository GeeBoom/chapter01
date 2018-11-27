## 这是一个基于smart 框架的Web 应用

### 

> git fock 多人协同开发

1、添加原作者的远程仓库连接

git remote add upstream https://github.com/GoogleChrome/lighthouse.git

1）从原仓库获取最新版本到本地

git fetch upstream master

（2）保证当前位于 master 分支上

git checkout master

（3）将最新版本整合到本地 master 分支上

git merge upstream/master

（4）将更新发送到自己的 GitHub 仓库里

git push origin master

>>

#### 需求

>模块> 客户管理

- 当用户进入"客户管理" 模块时，可通过列表方式来查看所有客户
- 可通过"客户名称" 关键字进行模糊查询
- 单击客户列表中的 "客户名称" 链接，可查看客户基本信息
- 单击"新增" 按钮，进入"新增客户" 界面，可新增客户基本信息
- 单击客户列表中的"编辑" 按钮，进入"编辑客户" 界面，可更新客户基本信息
- 单击客户列表中的"删除" 按钮，可删除当前所选择的客户，需提示是否删除
 
 ---
> customer 表结构

| 字段名 | 数据类型 | 是否为空 | 字段描述 |
| ----------- | ----------- | ----------- | ----------- |
| id | BIGINT| Y | ID(自增主键)
| name | VARCHAR(255) | Y | 客户名称
| contact | VARCHAR(255) | Y | 联系人
| telephone | VARCHAR(255) | N | 电话号码
| email | VARCHAR(255) | N | 邮箱地址
| remark | TEXT | N | 备注 


> URL 表

| 序号 | URL | 描述 | 
| ----------- | ----------- | ----------- |
| 1 | GET:/customer| 进入"客户列表"界面
| 2 | POST:/customer_search | 查询客户
| 3 | GET:/customer_show?id={id} | 进入"查看客户" 界面
| 4 | GET:/customer_create | 进入"创建客户" 界面
| 5 | POST:/customer_create | 创建客户
| 6 | GET:/customer_edit?id={id} | 进入"编辑客户" 界面
| 7 | PUT:/customer_edit?id={id} | 编辑客户
| 8 | DELETE:/customer_delete?id={id} | 删除客户


> 项目结构

```
.
├── README.md
├── bin
│   ├── pom.xml
│   └── src
│       └── main
│           ├── java
│           │   └── org
│           │       └── smart4j
│           │           └── chapter1
│           │               └── HelloServlet.class
│           └── webapp
│               └── WEB-INF
│                   ├── jsp
│                   │   └── hello.jsp
│                   └── web.xml
├── chapter1.iml
├── doc
│   └── home.png
├── pom.xml
└── src
    ├── main
    │   ├── java
    │   │   └── org
    │   │       └── smart4j
    │   │           └── chapter1
    │   │               ├── HelloServlet.java
    │   │               ├── controller
    │   │               │   ├── CustomerCreateServlet.java
    │   │               │   ├── CustomerDeleteServlet.java
    │   │               │   ├── CustomerEditServlet.java
    │   │               │   ├── CustomerServlet.java
    │   │               │   └── CustomerShowServlet.java
    │   │               ├── helper
    │   │               │   └── DatabaseHelper.java
    │   │               ├── model
    │   │               │   └── Customer.java
    │   │               ├── service
    │   │               │   └── CustomerService.java
    │   │               └── util
    │   │                   └── StringUtil.java
    │   └── webapp
    │       └── WEB-INF
    │           ├── jsp
    │           │   └── hello.jsp
    │           └── web.xml
    └── test
        └── java
            └── org.smart4j.chapter1


```


### 关系型数据库 MariaDB | MySQL
- 一对一
- 一对多
- 多对多



