package com.major.nexusdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.google.gson.Gson;
import com.major.lib1.PrintUtil;
import com.major.lib2.StringUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, PrintUtil.getValue("keep on"), Toast.LENGTH_SHORT).show();
            }
        });

        String s = new Gson().toJson(MainActivity.class);

        String res = StringUtil.getRes(this);
    }
}
