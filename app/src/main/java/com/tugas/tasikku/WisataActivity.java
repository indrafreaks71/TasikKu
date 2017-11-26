package com.tugas.tasikku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebSettings;

public class WisataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata);
        //identifies the webview
        WebView mWebView = (WebView) findViewById(R.id.webviewwisata);

        // Enable Javascript
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //loads the url
        mWebView.loadUrl("http://liburan.hadiahgratis.site/category/wisata/");

        //cancels all hyperlinks
        mWebView.setWebViewClient(new WebViewClient() {
                                      public boolean shouldOverrideUrlLoading(WebView view, String url) {
                                          return false;
                                      }
                                  }
        );
    }
}
