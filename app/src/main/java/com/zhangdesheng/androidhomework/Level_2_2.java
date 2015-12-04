package com.zhangdesheng.androidhomework;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Administrator on 2015/12/1.
 */
public class Level_2_2 extends Activity {
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.layout_level_2_2);
        Button button1 = (Button) findViewById(R.id.register_register);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Level_2_2.this, "点就点吧，反正没什么用~", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
