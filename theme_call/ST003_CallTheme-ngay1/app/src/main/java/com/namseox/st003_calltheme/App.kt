package com.namseox.st003_calltheme

import com.lvt.ads.util.AdsApplication

class App : AdsApplication() {
    override fun enableAdsResume(): Boolean {
        return false;
    }

    override fun getListTestDeviceId(): MutableList<String>? {
        return null
    }

    override fun getResumeAdId(): String? {
        return null
    }

    override fun buildDebug(): Boolean? {
        return null
    }
}