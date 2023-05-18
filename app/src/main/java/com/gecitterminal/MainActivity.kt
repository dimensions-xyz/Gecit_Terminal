package com.gecitterminal

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.webkit.WebView
import android.webkit.WebViewClient
import com.gecitterminal.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.webView.webViewClient = WebViewClient()
        binding.webView.loadUrl("http://gecitpanel.com/")

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.web_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){

            R.id.item1 -> {
                binding.webView.loadUrl("http://gecitpanel.com/")
            }

            R.id.item2 -> {
                binding.webView.loadUrl("http://google.com/")
            }

        }

        return super.onOptionsItemSelected(item)
    }

}