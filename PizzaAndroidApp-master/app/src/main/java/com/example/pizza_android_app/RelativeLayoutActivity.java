package com.example.pizza_android_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RelativeLayoutActivity extends AppCompatActivity {

    private Button nestedbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);

        nestedbutton = (Button) findViewById(R.id.tonested);
        nestedbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RelativeLayoutActivity.this,NestedActivity.class);
                startActivity(i);
            }
        });
    }
}
