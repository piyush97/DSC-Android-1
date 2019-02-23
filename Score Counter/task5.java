package com.example.android.try_app;

import android.graphics.Color;
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
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    RadioGroup radioG;
    RelativeLayout relativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioG = (RadioGroup)findViewById(R.id.group);
        relativeLayout = (RelativeLayout)findViewById(R.id.relativeLayout);

        radioG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.btn1:
                            relativeLayout.setBackgroundColor(Color.RED);
                            break;
                    case R.id.btn2:
                            relativeLayout.setBackgroundColor(Color.BLUE);
                            break;
                    case R.id.btn3:
                            relativeLayout.setBackgroundColor(Color.GREEN);
                }
            }
        });
    }
}
