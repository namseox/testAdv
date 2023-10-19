package com.namseox.adv;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.lvt.ads.callback.AdCallback;
import com.lvt.ads.util.AppOpenManager;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        AdCallback adCallback;
        adCallback = new AdCallback(){
            @Override
            public void onNextAction() {
                super.onNextAction();
                startActivity(new Intent(SplashActivity.this,MainActivity.class));
            }
        };
        AppOpenManager.getInstance().loadOpenAppAdSplash(this,"ca-app-pub-3940256099942544/3419835294",3000,10000,true,adCallback);
        AppOpenManager.getInstance().onCheckShowSplashWhenFail(this,adCallback,1000);
    }
}
