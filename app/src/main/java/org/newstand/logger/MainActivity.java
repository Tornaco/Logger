package org.newstand.logger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Logger.config(Settings.builder()
                .bugReportEnabled(false)
                .logAdapter(new AndroidLogAdapter())
                .logLevel(Logger.LogLevel.WARN)
                .build());

        Logger.d("Debug info");
        Logger.d("Hello I am %s, I am %d years old.", "Nick", "24");
    }
}
