# OnlyGradleCrashApp

以下の部分のコードが
https://github.com/mapyo/OnlyGradleCrashApp/blob/master/app/src/main/java/com/example/myapplication/MainActivity.kt#L21-L25
コマンドラインでビルドした時だけクラッシュします。AndroidStudioでビルドした場合はなぜかクラッシュしません

```
./gradlew assembleDebug; adb install -r app/build/outputs/apk/debug/app-debug.apk; adb shell am force-stop com.example.myapplication; adb shell monkey -p com.example.myapplication -c android.intent.category.LAUNCHER 1
```

