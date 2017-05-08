# Logger
Simple logger impl for Android

### Usage
```java
 // Init
 Logger.config(Settings.builder()
                .bugReportEnabled(false)
                .logAdapter(new AndroidLogAdapter())
                .logLevel(Logger.LogLevel.WARN)
                .build());

 Logger.d("Debug info");
 Logger.d("Hello I am %s, I am %d years old.", "Nick", "24");
```
