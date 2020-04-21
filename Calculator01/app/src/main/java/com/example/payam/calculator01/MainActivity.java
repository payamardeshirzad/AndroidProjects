package com.example.payam.calculator01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public String Maintext = "";
    public String Firsttext = "";
    public String Secondtext = "";
    public String Cal = "";
    public boolean isFloat = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText maintext = (EditText) findViewById(R.id.tv);
        Maintext = maintext.toString();
    }

    public void cal_buttonClick(View view) {
        float firstnum = 0;
        float secondnum = 0;
        float totalnum = 0;
        if (Firsttext.length() > 0) {
            EditText maintext = (EditText) findViewById(R.id.tv);
            Maintext = maintext.getText().toString();
            if (Maintext.length() > 0) {
                Secondtext = Maintext;

                switch (Cal) {
                    case "multiple":
                        firstnum = Float.parseFloat(Firsttext);
                        secondnum = Float.parseFloat(Secondtext);
                        totalnum = firstnum * secondnum;
                        maintext.setText(Float.toString(totalnum));
                        break;
                    case "plus":
                        firstnum = Float.parseFloat(Firsttext);
                        secondnum = Float.parseFloat(Secondtext);
                        totalnum = firstnum + secondnum;
                        maintext.setText(Float.toString(totalnum));
                        break;
                    case "minus":
                        firstnum = Float.parseFloat(Firsttext);
                        secondnum = Float.parseFloat(Secondtext);
                        totalnum = firstnum - secondnum;
                        maintext.setText(Float.toString(totalnum));
                        break;
                    case "Division":
                        firstnum = Float.parseFloat(Firsttext);
                        secondnum = Float.parseFloat(Secondtext);
                        totalnum = firstnum / secondnum;
                        maintext.setText(Float.toString(totalnum));
                        break;
                }
            }
        }
    }

    public void button1click(View view) {
        EditText maintext = (EditText) findViewById(R.id.tv);
        Maintext = maintext.getText().toString();
        maintext.setText(Maintext + "1");
    }

    public void button2click(View view) {
        EditText maintext = (EditText) findViewById(R.id.tv);
        Maintext = maintext.getText().toString();
        maintext.setText(Maintext + "2");
    }

    public void button3click(View view) {
        EditText maintext = (EditText) findViewById(R.id.tv);
        Maintext = maintext.getText().toString();
        maintext.setText(Maintext + "3");
    }

    public void buttonpointclick(View view) {
        if (isFloat == false) {
            EditText maintext = (EditText) findViewById(R.id.tv);
            Maintext = maintext.getText().toString();

            maintext.setText(Maintext + ".");
            isFloat = true;
        }
    }

    public void button4click(View view) {
        EditText maintext = (EditText) findViewById(R.id.tv);
        Maintext = maintext.getText().toString();
        maintext.setText(Maintext + "4");
    }

    public void button5click(View view) {
        EditText maintext = (EditText) findViewById(R.id.tv);
        Maintext = maintext.getText().toString();
        maintext.setText(Maintext + "5");
    }

    public void button6click(View view) {
        EditText maintext = (EditText) findViewById(R.id.tv);
        Maintext = maintext.getText().toString();
        maintext.setText(Maintext + "6");
    }

    public void button7click(View view) {
        EditText maintext = (EditText) findViewById(R.id.tv);
        Maintext = maintext.getText().toString();
        maintext.setText(Maintext + "7");
    }

    public void button8click(View view) {
        EditText maintext = (EditText) findViewById(R.id.tv);
        Maintext = maintext.getText().toString();
        maintext.setText(Maintext + "8");
    }

    public void button9click(View view) {
        EditText maintext = (EditText) findViewById(R.id.tv);
        Maintext = maintext.getText().toString();
        maintext.setText(Maintext + "9");
    }

    public void button0click(View view) {
        EditText maintext = (EditText) findViewById(R.id.tv);
        Maintext = maintext.getText().toString();
        if (Maintext.length() > 0) {
            maintext.setText(Maintext + "0");
        }
    }

    public void buttonbackclick(View view) {
        char del;
        EditText maintext = (EditText) findViewById(R.id.tv);
        Maintext = maintext.getText().toString();
        if (Maintext.length()>0){
        del= Maintext.charAt(Maintext.length()-1);
          if(Character.toString(del)!=".") {
              maintext.setText(Maintext.substring(0, Maintext.length() - 1));
              isFloat=false;
          }else
          {
              maintext.setText(Maintext.substring(0, Maintext.length() - 2));
              isFloat=false;
          }
    }}

    public void buttonmultipleclick(View view) {
        EditText maintext = (EditText) findViewById(R.id.tv);
        Firsttext = maintext.getText().toString();
        Cal = "multiple";
        maintext.setText("");
        isFloat = false;
    }

    public void buttonplusclick(View view) {
        EditText maintext = (EditText) findViewById(R.id.tv);
        Firsttext = maintext.getText().toString();
        Cal = "plus";
        maintext.setText("");
        isFloat = false;
    }

    public void buttonminusclick(View view) {
        EditText maintext = (EditText) findViewById(R.id.tv);
        Firsttext = maintext.getText().toString();
        Cal = "minus";
        maintext.setText("");
        isFloat = false;
    }

    public void buttondivclick(View view) {
        EditText maintext = (EditText) findViewById(R.id.tv);
        Firsttext = maintext.getText().toString();
        Cal = "Division";
        maintext.setText("");
        isFloat = false;
    }

    public void buttoncclick(View view) {
        EditText maintext = (EditText) findViewById(R.id.tv);
        Firsttext = "";
        Secondtext = "";
        Cal = "";
        maintext.setText("");
        isFloat = false;
    }

}
