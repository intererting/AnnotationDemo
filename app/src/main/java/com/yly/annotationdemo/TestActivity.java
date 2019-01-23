package com.yly.annotationdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.yly.processor.Bind;

public class TestActivity extends AppCompatActivity {

    @Bind(R.id.textv)
    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewInjector.injectView(this);
        textView.setText("XXXXXXxxx");
    }
}
