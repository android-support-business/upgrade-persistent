package com.amlzq.android.upgrade;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * 应用程序版本信息
 */
public class VersionInfo implements Parcelable {

    public boolean isForceUpgrade() {
        return forceUpgrade == 1;
    }

    public String appName;
    public String packageName;
    public int versionCode;
    public String versionName;
    public long fileSize;
    public long updateTime;
    public String updateDesc;
    public String downloadUrl;
    public String companyName;
    public String channelId;
    public String channelName;
    public int forceUpgrade;
    public int status;

    public VersionInfo() {
    }

    protected VersionInfo(Parcel in) {
        appName = in.readString();
        packageName = in.readString();
        versionCode = in.readInt();
        versionName = in.readString();
        fileSize = in.readLong();
        updateTime = in.readLong();
        updateDesc = in.readString();
        downloadUrl = in.readString();
        companyName = in.readString();
        channelId = in.readString();
        channelName = in.readString();
        forceUpgrade = in.readInt();
        status = in.readInt();
    }

    public static final Creator<VersionInfo> CREATOR = new Creator<VersionInfo>() {
        @Override
        public VersionInfo createFromParcel(Parcel in) {
            return new VersionInfo(in);
        }

        @Override
        public VersionInfo[] newArray(int size) {
            return new VersionInfo[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(appName);
        dest.writeString(packageName);
        dest.writeInt(versionCode);
        dest.writeString(versionName);
        dest.writeLong(fileSize);
        dest.writeLong(updateTime);
        dest.writeString(updateDesc);
        dest.writeString(downloadUrl);
        dest.writeString(companyName);
        dest.writeString(channelId);
        dest.writeString(channelName);
        dest.writeInt(forceUpgrade);
        dest.writeInt(status);
    }

}
