package com.isaacmiguelsg.tt.tuzo_time;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Foro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foro);


        WebView myWebView = (WebView) findViewById(R.id.webView);
        myWebView.loadUrl("https://es-la.facebook.com/tuzobusmx");
    }
}
