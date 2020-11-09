<h1 align="center"><a href="https://github.com/wtyicy/wtyicy-file-demo" target="_blank">wtyicy-file-demo Project</a></h1>

![maven](https://img.shields.io/maven-central/v/com.github.wtyicy/wtyicy-file-demo)
[![License](https://img.shields.io/badge/license-Apache%202-green.svg)](https://www.apache.org/licenses/LICENSE-2.0)
![closed pull requests](https://img.shields.io/github/issues-pr-closed/wtyicy/wtyicy-file-demo)
![java version](https://img.shields.io/badge/JAVA-1.8+-green.svg)
[![gitee ](https://gitee.com/cyiwty/wtyicy-file-demo/badge/star.svg?theme=white)](https://gitee.com/cyiwty/wtyicy-file-demo/stargazers)
[![github ](https://img.shields.io/github/stars/wtyicy/wtyicy-file-demo.svg?style=social)](https://github.com/wtyicy/wtyicy-file-demo)


## 什么是 wtyicy-file-demo
   wtyicy-file的测试用例

## 快速开始
   - 引入依赖
   ```xml
    <dependency>
        <groupId>com.github.wtyicy</groupId>
        <artifactId>wtyicy-file</artifactId>
        <version>1.0.2</version>
    </dependency>
   ```
   - 配置文件application.yml
   **最小配置单元：** 
   ```
   wtyicy:
     # 文件存储地址 默认 wtyicy
     filePath: wtyicy
     # 默认上传云端  默认 qiniuyun
     defaultType: 
     # ===================================================================
     # 七牛云对象存储
     # ===================================================================
     qiniuyun:
       # 存储和访问地址
       endpoint: 
       # Id
       accessKeyId: 
       # 密钥
       accessKeySecret: 
       # 存储桶
       bucketName: 
   ```
   **详细配置说明** 
   ```
   wtyicy:
     # 文件存储地址 默认 wtyicy
     filePath: wtyicy
     # 默认上传云端  默认 qiniuyun
     defaultType: 
     # ===================================================================
     # 阿里云对象存储
     # ===================================================================
     aliyun:
       # 上传地址
       endpoint: 
       # ID
       accessKeyId: 
       # 密钥
       accessKeySecret: 
       # 存储桶
       bucketName: 
       # 访问地址
       url: 
     # ===================================================================
     # 七牛云对象存储
     # ===================================================================
     qiniuyun:
       # 存储和访问地址
       endpoint: 
       # Id
       accessKeyId: 
       # 密钥
       accessKeySecret: 
       # 存储桶
       bucketName: 
     # ===================================================================
     # 分布式文件系统FDFS配置
     # ===================================================================
     fdfs:
       # 访问地址
       url: 
       # 上传地址
       trackerList:
         - 
     # ===================================================================
     # 腾讯云对象存储
     # ===================================================================
     qcloudyun:
       # ID
       accessKeyId: 
       # 密钥
       accessKeySecret: 
       # 上传区域地点
       bucket: 
       # 存储桶
       bucketName: 
       # 访问地址
       url: 
     # ===================================================================
     # 百度云对象存储
     # ===================================================================
     baiduyun:
       # Id
       accessKeyId: 
       # 密钥
       accessKeySecret: 
       # 存储桶
       bucketName: 
       # 访问地址
       url: 
       # 上传地址
       endpoint: 
     # ===================================================================
     # 华为云对象存储
     # ===================================================================
     huaweiyun:
       # Id
       accessKeyId: 
       # 密钥
       accessKeySecret: 
       # 存储桶
       bucketName: 
       # 访问地址
       url: 
       # 上传地址
       endpoint: 
     # ===================================================================
     # 京东云对象存储
     # ===================================================================
     jingdongyun:
       # Id
       accessKeyId: 
       # 密钥
       accessKeySecret: 
       # 存储桶
       bucketName: 
       # 上传区域地点
       bucket: 
       # 访问地址
       url: 
       # 上传地址
       endpoint: 
   ```
   - 调用api  
   ```java
     @Resource
     private FileUploader fileUploader;

    @Resource
    private BaseConfig baseConfig;


     VirtualFile upload = fileUploader.upload(multipartFile, baseConfig.getFilePath(), true);
   ```

## 开源推荐
- `spring-boot-demo` 深度学习并实战 spring boot 的项目: [https://github.com/xkcoding/spring-boot-demo](https://github.com/xkcoding/spring-boot-demo)
- `mica` SpringBoot 微服务高效开发工具集: [https://github.com/lets-mica/mica](https://github.com/lets-mica/mica)
- `pig` 微服务认证授权脚手架(架构师必备): [https://gitee.com/log4j/pig](https://gitee.com/log4j/pig)
- `SpringBlade` 完整的线上解决方案（企业开发必备）: [https://gitee.com/smallc/SpringBlade](https://gitee.com/smallc/SpringBlade)

## 鸣谢
- 感谢 JetBrains 提供的免费开源 License：
<img src="https://images.gitee.com/uploads/images/2020/0406/220236_f5275c90_5531506.png" alt="图片引用自lets-mica" style="float:left;">

<a href="https://www.producthunt.com/posts/wtyicy-file-demo?utm_source=badge-featured&utm_medium=badge&utm_souce=badge-justauth" target="_blank"><img src="https://api.producthunt.com/widgets/embed-image/v1/featured.svg?post_id=196886&theme=dark" alt="wtyicy-file-demo - upload, so easy! | Product Hunt Embed" style="width: 250px; height: 54px;" width="250px" height="54px" /></a>

## 其他

- [PLAN](https://gitee.com/cyiwty/wtyicy-file-demo/issues/I243X6)

