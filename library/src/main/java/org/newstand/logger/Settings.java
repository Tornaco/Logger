package org.newstand.logger;

/**
 * Created by Nick@NewStand.org on 2017/3/31 17:50
 * E-Mail: NewStand@163.com
 * All right reserved.
 */

public class Settings {

    public static final Settings DEFAULT_SETTINGS = Settings
            .builder()
            .logAdapter(new AndroidLogAdapter())
            .logLevel(Logger.LogLevel.ALL)
            .tag("Logger")
            .build();

    private Logger.LogLevel logLevel;
    private LogAdapter logAdapter;
    private String tag;

    private Settings(Logger.LogLevel logLevel, LogAdapter logAdapter, String tag) {
        this.logLevel = logLevel;
        this.logAdapter = logAdapter;
        this.tag = tag;
    }

    public static SettingsBuilder builder() {
        return new SettingsBuilder();
    }

    public Logger.LogLevel getLogLevel() {
        return this.logLevel;
    }

    public LogAdapter getLogAdapter() {
        return this.logAdapter;
    }

    public String getTag() {
        return this.tag;
    }

    public static class SettingsBuilder {

        private Logger.LogLevel logLevel = Logger.LogLevel.WARN;
        private LogAdapter logAdapter = null;
        private String tag = "Logger";

        SettingsBuilder() {
        }

        public SettingsBuilder logLevel(Logger.LogLevel logLevel) {
            this.logLevel = logLevel;
            return this;
        }

        public SettingsBuilder logAdapter(LogAdapter logAdapter) {
            this.logAdapter = logAdapter;
            return this;
        }

        public SettingsBuilder tag(String tag) {
            this.tag = tag;
            return this;
        }

        public Settings build() {
            if (logAdapter == null) logAdapter = new AndroidLogAdapter();
            return new Settings(logLevel, logAdapter, tag);
        }
    }
}
