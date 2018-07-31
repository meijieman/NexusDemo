Sonatype Nexus

 Maven 仓库管理软件来搭建私服
Nexus 专业版是需要付费的，可以下载开源版 Nexus OSS

nexus3 配置 jdk 1.8+

端口修改
nexus-3.13.0-01\etc\nexus-default.properties


启动
cmd  nexus-3.13.0-01\bin
nexus.exe /start


打开Nexus管理系统，点击右上角“Log in”，输入默认用户名(admin)和默认密码（admin123）登录
http://127.0.0.1:8081



构件（Artifact）


Repository的type属性有：proxy，hosted，group三种
proxy：即你可以设置代理，设置了代理之后，在你的nexus中找不到的依赖就会去配置的代理的地址中找。
hosted：你可以上传你自己的项目到这里面。
group：它可以包含前面两个，是一个聚合体。一般用来给客户一个访问nexus的统一地址。


快照库上传的版本号（version）必须以“-SNAPSHOT”结束，并上传至私服后系统将自动将“-SNAPSHOT”替换为时间戳串（本地代码引用时依然用“-SNAPSHOT”结束的版本号，无需替换时间戳）

在 Gradle 引用 snapshot 库版本时,若遇到已经上传最新版本，但是好像没有作用时，使用以下命令清理一下 gradle的缓存(会删除项目所有依赖，然后重新下载)
gradlew build --refresh-dependencies


Gradle 设置本地缓存的更新策略
configurations.all {
	// check for updates every build
    resolutionStrategy.cacheChangingModulesFor 0, 'seconds'
    resolutionStrategy.cacheDynamicVersionsFor 0, 'seconds'
}

查看Gradle项目包依赖情况
gradlew 模块名：dependencies

参考资料
https://blog.csdn.net/qq_32452623/article/details/79385595
https://blog.csdn.net/jf_1994/article/details/51228560

gradle 统一依赖管理

compile 'advertise:advertise-release:0.1@aar'



 错误 Could not start service. Error code: 1060
 调用 nexus.exe /start 会产生如上错误，改为 nexus.exe /run



C:\Users\Major\.gradle\caches\modules-2\files-2.1\com.major\lib1\1.0.6-SNAPSHOT
C:\Users\Major\.gradle\caches\transforms-1\files-1.1\lib2-1.0.1-SNAPSHOT.aar