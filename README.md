# StatusBarAPi

[APIDemo](https://github.com/577fkj/StatusBarApiExample)

[Jitpack](https://www.jitpack.io/#577fkj/StatusBarApiExample/v2.0)

You need to add in build.gradle
```
allprojects {
    repositories {
        ....
        maven { url 'https://www.jitpack.io' }
    }
}


dependencies {
    implementation 'com.github.577fkj:StatusBarApiExample:v2.0'
}
```

```java
import StatusBarLyric.API.StatusBarLyric;
```

Add under application in AndroidManifest.xml
```xml
<meta-data
android:name="XStatusBarLyric"
android:value="true" />
```

Attention: if proguard is enabled, make sure API class won't be obfuscated:
```shrinker_config
-keep class StatusBarLyric.API.StatusBarLyric {*;}
```


# StatusBarAPi

[APIDemo](https://github.com/577fkj/StatusBarApiExample)

[Jitpack](https://www.jitpack.io/#577fkj/StatusBarApiExample/v2.0)

需要在 build.gradle 添加
```
allprojects {
    repositories {
        ....
        maven { url 'https://www.jitpack.io' }
    }
}


dependencies {
    implementation 'com.github.577fkj:StatusBarApiExample:v2.0'
}
```

```java
import StatusBarLyric.API.StatusBarLyric;
```

在AndroidManifest.xml 中的 application 下添加
```xml
<meta-data
android:name="XStatusBarLyric"
android:value="true" />
```

注意: 若开启了 proguard 请保证 API 类不被混淆:
```shrinker_config
-keep class StatusBarLyric.API.StatusBarLyric {*;}
```
