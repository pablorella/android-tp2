package com.example.tp2_appmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.List;

public class CuartoActivity extends AppCompatActivity {
    public WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuarto);


    }
    public void link1(View view){
    webView=(WebView)findViewById(R.id.webview);
    webView.getSettings().setLoadsImagesAutomatically(true);
    webView.getSettings().setJavaScriptEnabled(true);
    webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
    webView.setWebViewClient(new WebViewClient());
     webView.loadUrl("https://www.lacapitalmdp.com/como-hacer-tu-propia-cerveza-artesanal-en-5-simples-pasos/");
}
    public void link2(View view){
        webView=(WebView)findViewById(R.id.webview);
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://loopulo.com/recetas-de-cerveza-casera/como-hacer-tu-propia-cerveza-ipa/");
    }
    public void link3(View view){
        webView=(WebView)findViewById(R.id.webview);
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://elrincondelcervecero.com/elaboracion-kit-basico/");
    }

}
