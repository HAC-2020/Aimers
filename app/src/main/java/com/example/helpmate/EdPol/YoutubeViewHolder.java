package com.example.helpmate.EdPol;

import android.annotation.SuppressLint;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.helpmate.R;


public class YoutubeViewHolder extends RecyclerView.ViewHolder {
    WebView webView;
    Button button;

    @SuppressLint("SetJavaScriptEnabled")
    public YoutubeViewHolder(@NonNull View itemView) {
        super(itemView);
        webView = itemView.findViewById(R.id.video_view);
        webView.setWebViewClient(new WebViewClient());
        webView.setWebChromeClient(new WebChromeClient());
        webView.getSettings().setJavaScriptEnabled(true);
    }
}