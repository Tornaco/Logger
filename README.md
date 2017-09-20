# Logger
Simple logger impl for Android

## Download
```
git clone https://github.com/Tornaco/Logger
```

### Gradle
[![](https://jitpack.io/v/Tornaco/Logger.svg)](https://jitpack.io/#Tornaco/Logger)

```gradle
compile 'com.github.Tornaco:Logger:${version}'
```

### Usage
```java
 // Init
 Logger.config(Settings.builder()
                .logAdapter(new AndroidLogAdapter())
                .logLevel(Logger.LogLevel.INFO)
                .build());

Logger.d("Debug info");
Logger.d("Hello I am %s, I am %d years old.", "Nick", 24);
Logger.i("Hello I am %s %i %s FF *()#@$^%^~");
```
