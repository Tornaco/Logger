package org.newstand.logger.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.newstand.logger.AndroidLogAdapter;
import org.newstand.logger.Logger;
import org.newstand.logger.Settings;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(org.newstand.logger.R.layout.activity_main);

        Logger.config(Settings.builder()
                .logAdapter(new AndroidLogAdapter())
                .logLevel(Logger.LogLevel.WARN)
                .build());

        Logger.d("Debug info");
        Logger.d("Hello I am %s, I am %d years old.", "Nick", "24");
    }
}
