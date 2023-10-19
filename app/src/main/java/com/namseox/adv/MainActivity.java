package com.namseox.adv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.lvt.ads.util.Admob;

public class MainActivity extends AppCompatActivity {
    Button btnInterstitialAds;
    Button btnInitRewardAds;
    Button btnOpenSplash;
    Button btnNativeAds;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNativeAds = (Button) findViewById(R.id.btn_nativeAds);
        btnOpenSplash = findViewById(R.id.btn_openSplash);
        btnInterstitialAds = findViewById(R.id.btn_interstitialAds);
        btnInitRewardAds = findViewById(R.id.btn_initRewardAds);
        Admob.getInstance().loadBanner(this,"ca-app-pub-3940256099942544/6300978111");
        onCLick();

    }

    private void onCLick() {
        btnNativeAds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MainActivity.class));
            }
        });
        btnOpenSplash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MainActivity.class));
            }
        });
        btnInterstitialAds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MainActivity.class));
            }
        });
        btnInitRewardAds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MainActivity.class));
            }
        });
    }
}