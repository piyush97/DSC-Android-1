package com.example.android.try_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final TextView txtView = (TextView) findViewById(R.id.text1);
        txtView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               txtView.setText("Hello india");
            }
        });
    }
}
/*
    Please note: We have three methods, on textChanged, beforeTextChnaged and after text changed.
    The explanation is given as:
    
    

    beforeTextChanged(CharSequence s, int start, int count, int after).
    This means that the characters are about to be replaced with some new text. The text is uneditable.
    Use: when you need to take a look at the old text which is about to change.

    onTextChanged(CharSequence s, int start, int before, int count).
    Changes have been made, some characters have just been replaced. The text is uneditable.
    Use: when you need to see which characters in the text are new.

    afterTextChanged(Editable s).
    The same as above, except now the text is editable.
    Use: when you need to see and possibly edit the new text.

*/
//https://stackoverflow.com/questions/8543449/how-to-use-the-textwatcher-class-in-android
//This is a nice resource to learn differnce between three methods.
