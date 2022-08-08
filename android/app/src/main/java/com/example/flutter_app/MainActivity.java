package com.example.flutter_app;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;


import io.flutter.embedding.android.FlutterActivity;

public class MainActivity extends FlutterActivity {
@Override
protected void onCreate(Bundle savedInstanceState) {
        AppCenter.start(getApplication(), "628b8f76-091f-434a-bb6a-1a9e4b9184b9",
                Analytics.class, Crashes.class);
}
