package com.estsoft.sendval;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CalleeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_callee);

        Intent intent = getIntent();
        Integer i = intent.getIntExtra("data_int", -1);
        String s = intent.getStringExtra("data_string");

        String result = "data_int:"+i+", data_string:"+s;
        TextView txtView = (TextView)findViewById(R.id.textView3);
        txtView.setText(result);
    }
}
