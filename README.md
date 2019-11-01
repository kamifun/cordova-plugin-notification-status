# cordova-plugin-notification-status
获取应用通知开启状态

## 安装
cordova plugin add https://github.com/kamifun/cordova-plugin-notification-status.git

## 使用方式

```javascript

  // status: 1已开启 0已关闭
  cordova.plugins.NotificationStatus.getStatus((status)=>{console.log(status)})

```