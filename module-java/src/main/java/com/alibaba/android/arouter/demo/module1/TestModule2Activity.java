package com.alibaba.android.arouter.demo.module1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

//@Route(path = "/module/2", group = "m2")
public class TestModule2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_module2);
    }
}
