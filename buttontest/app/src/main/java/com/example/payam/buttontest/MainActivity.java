package com.example.payam.buttontest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClick(View view) {
        Button button2 = (Button) view;
        TextView textview1 = (TextView) findViewById(R.id.textView);
        EditText edittext1 = (EditText) findViewById(R.id.editText);

        if (edittext1 != null) {
            textview1.setText(edittext1.getText()+"is clicked");
        }
    }
}
