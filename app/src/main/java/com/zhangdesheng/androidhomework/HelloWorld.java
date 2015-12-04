package com.zhangdesheng.androidhomework;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Administrator on 2015/11/30.
 */
public class HelloWorld extends Activity {
    @Override                     /*有两个按钮，一个到Level2，一个退出*/
    protected void onCreate(Bundle saveInstanceState){              /*怎么将这个传到github上啊。。？？？*/
        super.onCreate(saveInstanceState);
        setContentView(R.layout.layout_helloworld);                   /*为什么没有标题？？？  Activity 和ActionBarActivity有什么不一样？*/
        Button button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {          /* 一个Toast 一个显示Intent */
                Toast.makeText(HelloWorld.this, "loading level2", Toast.LENGTH_SHORT).show();
                Intent intent_1 = new Intent(HelloWorld.this, Level_2_1.class);
                startActivity(intent_1);

            }
        });
        Button button2 = (Button) findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View b) {
                Toast.makeText(HelloWorld.this, "exit", Toast.LENGTH_SHORT).show();
               finish();

            }
        });

    }
    @Override                      /*加一个菜单玩玩， BUT  ？？？？为什么不能显示？？？？*/
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_1, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this, "This is add",Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "This is remove", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }


}
