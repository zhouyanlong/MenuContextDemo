package com.example.lenovo.menucontextdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //没有下面的内容点击是无反应的
        TextView tv = new TextView(this);
        tv.setText("长按可获得金币*10000");
        registerForContextMenu(tv);
        setContentView(tv);
    }
    public boolean onContextItemSelected(MenuItem item) {
        // TODO Auto-generated method stub
        super.onContextItemSelected(item);
        switch (item.getItemId()) {
            case 1://做新建的事情
                break;
            case 2://做打开的事情
                break;
        }
        return super.onContextItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        // TODO Auto-generated method stub
        menu.add(0, 1, 1, R.string.newfile);
        menu.add(0, 2, 2, R.string.open);
        super.onCreateContextMenu(menu, v, menuInfo);
    }
}
