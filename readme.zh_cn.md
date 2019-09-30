## 特性
- 首页静默下载检查更新
- 提供下载
- 提供安装
- 使用DownloadManager下载
- 使用透明Activity实现主动弹框提示
- 后台下载，再提示安装
- 提示有新版本，单击更新
- 强制更新开关
- 有首页主动提示，有检查更新，两个入口。
- 提示更新弹框有三个按钮，跳过（避免非强制更新每次打开都弹框），取消，确定。
- 下载对话框，有后台下载按钮，单击后在通知栏下载
- 

## 发布
- 最新版本
| groupId | artifactId | version |
| -------- | -------- | -------- |
| com.amlzq.android | upgrade |  |

* 使用
```
dependencies{
    ...
    // 方式一：远程依赖
    implementation 'com.amlzq.android:upgrade:latest.integration'
    // 方式二：本地aar
    implementation files('libs/amlzq-android-upgrade.aar')
}
```

## 工程
* ./upgrade
> upgrade library
```
package: com.amlzq.android.upgrade
```
* ./sample
> sample application
```
package: com.amlzq.asb
appName: Upgrade支持库
applicationId: com.amlzq.asb.upgrade
```

## 实践
- 第一期需求
```
V1.0
- 首页静默下载检查更新
- 提供下载
- 提供安装
- 使用DownloadManager下载
- 使用透明Activity实现主动弹框提示
- 后台下载，再提示安装
- 提示有新版本，单击更新
- 强制更新开关
- 有首页主动提示，有检查更新，两个入口。
- 提示更新弹框有三个按钮，跳过（避免非强制更新每次打开都弹框），取消，确定。
- 下载对话框，有后台下载按钮，单击后在通知栏下载
- 适配到Android10.0
```

- 第二期需求
V2.0
```
可定制对话框，通知栏
可选择下载器，OHttp
可文件缓存，判断APK版本号
可断点续传
```

- 第三期需求
V3.0
```
通过应用商店升级
应用内升级

```

- 第四期需求
建立分支，考虑国内和海外差异
```
其他升级方式
增量更新
app bundle
热更新
```

## 参考
- [DownloadManager实现下载功能](https://blog.csdn.net/yushuangping/article/details/82425707)
- [Android 7.0 8.0版本更新安装遇到的坑](https://www.jianshu.com/p/e05f35fbb569)
