# PBL_ZXHN
- 项目名称：置信惠农-农产品供需平台（类网上商城）
- 开发语言: Java
- 开发环境: IDEA2023 ， window 10 or 11
- 原型框架: 基于Maven org.apache.maven.archetypes:maven-archetype-webapp
- 开源许可证: Apache-2.0
- 本地调试: 基于Tomcat Server,Edge 浏览器
- 源代码管理: 基于git 托管于github和gitee

## 项目分工：
熊悦童:
- 项目框架设计
- 技术需求分析
- 后端及前后端交互api代码实现
- 数据库交互代码实现
- 技术文档撰写
- 项目组外部对接

易蓝宇：
- 产品文档撰写
- 项目进度把控
- 团队内部沟通

文晨曦：
- 产品原型设计
- 产品功能分析

唐明杨、冯春玲、罗立悟：
- 前端美术设计
- 前端框架设计
- 用户交互设计
- 前端代码实现
- 用户调研
- 用户需求分析

## 源码
### github:
- https://github.com/iceselen/pbl_zxhn.git
- git@github.com:iceselen/pbl_zxhn.git

### gitee:
- https://gitee.com/iceselen/pbl_zxhn.git
- git@gitee.com:iceselen/pbl_zxhn.git

## 开发日志：
注：开发在分支v1.0上 master分支仅做大版本发布。
- 20230901 和同组小伙伴们决定写这个要命的项目
- 20230902 初步确定代码方案，这是最要命的后端
- 20230903 建立后端仓库
- 20230904 确立后端分层及项目框架
- 20230905 新建项目需求分析文档
- 20230906 更换string和tomcat版本，运行报错待解决
- 20230910 重构项目名，大写好看。
- 20230912 重构pom.xml，解决了20230906的报错问题。完成dao层封装，Web-INF待修改。
- 20230913 细化项目分工
- 20230918 修改dispatcher_servlet.xml，还是没解决web.xml，高度怀疑是pagerhelper版本问题。
- 20230918 已解决web.xml问题
- 20230918 创建UserController接口，登录功能接口完成，顺手写好了ServeResponser可重用类。更新db层及对应xml接口实现。待解决@Service注入错误问题。
- 20230929 用git回退到fix paperhelper版本（版本号：534b5c0）,排查注入问题。确认pagerhelper5.x配置正确，注入问题待解决。考虑直接源码引用？

changed the page in:20230901