package com.example.android.try_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import org.w3c.dom.Text;
import android.text.Editable;
import android.text.TextWatcher;

import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    ImageView imgV;
    TextView txtV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgV = (ImageView) findViewById(R.id.img1);
        txtV = (TextView) findViewById(R.id.text1);

        imgV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtV.setText("Hi! My name is Rohit");
            }
        });


    }
}
