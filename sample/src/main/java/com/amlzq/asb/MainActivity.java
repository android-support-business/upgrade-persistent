package com.amlzq.asb;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    String response = "{\n" +
            "    \"data\": {\n" +
            "        \"downloadUrl\": \"http://a5.pc6.com/cx3/weixin.pc6.apk\",\n" +
            "        \"version\": \"1.0.1\",\n" +
            "        \"versionCode\": 2,\n" +
            "        \"versionDesc\": \"主要修改:\\n1.增加多项新功能;\\n2.修复已知bug。\"\n" +
            "    },\n" +
            "    \"errCode\": 0,\n" +
            "    \"errMsg\": \"\",\n" +
            "    \"success\": true\n" +
            "}";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}