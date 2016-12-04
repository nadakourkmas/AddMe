package com.example.user.addedme11;

import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wv = new WebView(this);
        //setContentView(wv);
    }

    public void sendFacebook(View view){

        Uri uri = Uri.parse("https://facebook.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
        System.out.println(uri.toString());
        wv.loadUrl(uri.toString());


    }


}
