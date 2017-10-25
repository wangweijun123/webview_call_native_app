package com.le.www.clicklinktostartotherappactivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;

/**
 * 跳转androidstandarddev 应用的 MainActivity.java
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.bt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Intent.ACTION_VIEW);
//                Uri uri = Uri.parse("m://my.com");

                Uri uri = Uri.parse("example://gizmos");
                in.setData(uri);
                startActivity(in);
            }
        });

        WebView webView = (WebView) findViewById(R.id.webview);
        webView.loadUrl("file:///android_asset/index.html");
    }
}
