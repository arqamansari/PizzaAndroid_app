package com.example.pizza_android_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class NestedActivity extends AppCompatActivity {

    private ListView list;
    private Spinner spin;

    String contents[] = {"Alphabet","Blogger","Cardboard","Deepmind","Earth","Fiber","Hangouts","Jump","Keep","Lion"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nested);

            list=(ListView)findViewById(R.id.listview);
            spin=(Spinner)findViewById(R.id.spinner);

            ArrayAdapter adapter=new ArrayAdapter(NestedActivity.this,android.R.layout.simple_list_item_1,contents);
            list.setAdapter(adapter);

            spin.setAdapter(adapter);

            list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView txt = (TextView) view;
                    Toast.makeText(NestedActivity.this, txt.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            });

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
              TextView txt = (TextView)view;
                Toast.makeText(NestedActivity.this, txt.getText().toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



    }
}
