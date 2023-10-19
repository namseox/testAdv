package com.namseox.adv;

import com.lvt.ads.util.AdsApplication;

import java.util.List;

public class MyApplication extends AdsApplication {
    @Override
    public boolean enableAdsResume() {
        return false;
    }

    @Override
    public List<String> getListTestDeviceId() {
        return null;
    }

    @Override
    public String getResumeAdId() {
        return null;
    }

    @Override
    public Boolean buildDebug() {
        return null;
    }
}
