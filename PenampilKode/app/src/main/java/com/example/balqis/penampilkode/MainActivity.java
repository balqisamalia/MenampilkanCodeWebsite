package com.example.balqis.penampilkode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity extends AppCompatActivity {

    private WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        web = (WebView)findViewById(R.id.web);
        WebSettings ws=web.getSettings();
        ws.setJavaScriptEnabled(true);
        web.loadUrl("http://www.google.co.ic");
        web.setWebViewClient(new WebViewClient(){
                                 @Override
                                 public boolean shouldOverrideUrlLoading(WebView view, String url) {
                                     return super.shouldOverrideUrlLoading(view, url);
                                 }

                                 @Override
                                 public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                                     web.loadUrl("file://android_asset/error.html");
                                 }
                             }
        );
    }
}
