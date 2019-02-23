package com.example.android.try_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import org.w3c.dom.Text;
import android.text.Editable;
import android.text.TextWatcher;

import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    ImageView imgV;
    Button btnV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView acTextView;
        TextView txtView;
        String[] inputs = {"Raghav","Rohit","Hemanth","Piyush","Australia"};
    //Store all of them in the curly brace.
        acTextView = (AutoCompleteTextView)findViewById(R.id.acTextView);
        txtView = (TextView) findViewById(R.id.textView);

        txtView.setText("Raghav,Hemanth,Piyush,Rohit,Australia");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,inputs);
        acTextView.setAdapter(adapter);

    }
}
