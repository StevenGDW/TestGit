package com.gdw.testgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "git版本控制", Toast.LENGTH_SHORT).show();

        Toast.makeText(this, "git版本控制，第二次更新", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "git版本控制，第三次更新", Toast.LENGTH_SHORT).show();

    }
}
