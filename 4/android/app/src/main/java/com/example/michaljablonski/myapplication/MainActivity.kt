package com.example.michaljablonski.myapplication

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView : WebView = findViewById(R.id.web_view)
        webView.clearCache(true)
        webView.webViewClient = WebViewClient()
        webView.settings.databaseEnabled = true
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
        webView.loadUrl("https://fc.put.poznan.pl/index.php")
    }
}
