package com.sgsteel.erp.horsligne

import android.app.Activity
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : Activity() {
    private lateinit var web: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        web = WebView(this)
        setContentView(web)
        web.settings.javaScriptEnabled = true
        web.settings.domStorageEnabled = true
        web.settings.allowContentAccess = false
        web.webViewClient = object : WebViewClient() {
            // Lecture seule et hors ligne : aucune navigation vers l'extérieur
            override fun shouldOverrideUrlLoading(v: WebView, r: WebResourceRequest) = !r.url.toString().startsWith("file:///android_asset/")
        }
        if (savedInstanceState == null) web.loadUrl("file:///android_asset/index.html") else web.restoreState(savedInstanceState)
    }

    override fun onSaveInstanceState(out: Bundle) { super.onSaveInstanceState(out); web.saveState(out) }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() { if (web.canGoBack()) web.goBack() else super.onBackPressed() }
}
