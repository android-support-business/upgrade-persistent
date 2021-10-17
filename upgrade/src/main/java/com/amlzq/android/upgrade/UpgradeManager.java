package com.amlzq.android.upgrade;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;

/**
 * 应用程序持续升级管理者
 */
public class UpgradeManager {
    public static final String TAG = "UpgradeManager";

    private VersionInfo mVersionInfo;
    private Context mContext; // 上下文的弱引用

    public UpgradeManager(Context context) {
        mContext = context;
    }

    public VersionInfo getVersionInfo() {
        return mVersionInfo;
    }

    public void setVersionInfo(VersionInfo versionInfo) {
        this.mVersionInfo = versionInfo;
    }

    /**
     * 检查更新
     */
    public void check() {
        if (mVersionInfo.versionCode > getVersionCode()) {
            // 有新版本
        } else {
            Log.d(TAG, "");
            if ( boolean isShowLastNewTips){

            }
        }
    }


    private PackageInfo getPackageInfo() {
        PackageManager packageManager = mContext.getPackageManager();
        // getPackageName()是包名，0代表是获取版本信息
        PackageInfo packageInfo = null;
        try {
            // pm.getPackageInfo(context.getPackageName(), PackageManager.GET_CONFIGURATIONS);
            packageInfo = packageManager.getPackageInfo(mContext.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return packageInfo;
    }

    /**
     * @return 当前(本地)版本号
     */
    public int getVersionCode() {
        return getPackageInfo().versionCode;
    }

}
