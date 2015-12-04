package com.zhangdesheng.androidhomework;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Administrator on 2015/12/1.
 */
public class Level_2_1 extends Activity {
    @Override
    protected void onCreate(Bundle saveInstanceState){     /*隐式Intent*/
        super.onCreate(saveInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.layout_level_2_1);
        Button button_to_level_2_2 =(Button) findViewById(R.id.button_to_level_2_2);
        button_to_level_2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Level_2_1.this, "正在跳转，请稍候...", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent("com.example.activitytest.ACTION_START");
                startActivity(intent2);

            }

        });
        Button button1 = (Button) findViewById(R.id.button_loading);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Level_2_1.this, "诶？要我实现登录咩？我还不会= =+", Toast.LENGTH_SHORT).show();
            }
        });

        Button button2 = (Button) findViewById(R.id.title_back);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Level_2_1.this, HelloWorld.class);
                startActivity(intent3);
            }
        });


    }

}
