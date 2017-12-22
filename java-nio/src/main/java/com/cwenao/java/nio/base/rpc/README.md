## RPC（Remote Promote Call）
  - 一种进程间通信方式。允许像调用本地服务一样调用远程服务。
  - RPC框架负责屏蔽底层的传输方式（TCP或者UDP）、序列化方式（XML/JSON/二进制）和通信细节

![RPC 框架原理图 1](http://bimg.kakme.com/markdown-img-paste-20171222095317398.png)
![RPC 框架原理图 2](http://bimg.kakme.com/markdown-img-paste-20171222095347232.png)

### java.net.socket 实现方式
  - 使用socket进行服务间通信
  - 本地通过动态Proxy代理屏蔽调用细节
  - 服务方通过反序列化 invoke 调用的实例以及方法
 