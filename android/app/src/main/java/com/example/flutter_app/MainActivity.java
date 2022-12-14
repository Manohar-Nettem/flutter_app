package com.example.flutter_app;
import android.os.Bundle;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

import io.flutter.embedding.android.FlutterActivity;

public class MainActivity extends FlutterActivity {
        
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCenter.start(getApplication(), "e8aa9dbc-dea5-4e47-b543-f3c9634c3da5",
                    Analytics.class, Crashes.class);
    }
}
