package com.example.android.try_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import org.w3c.dom.Text;
import android.text.Editable;
import android.text.TextWatcher;

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

        imgV = (ImageView) findViewById(R.id.img1);
        btnV = (Button) findViewById(R.id.btn1);

        btnV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgV.setImageResource(R.drawable.pizza);
                btnV.setText("I got Pizza");
            }
        });


    }
}
