package com.exalt.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    private double num1 = 0;
    private double num2 = 0;
    private double result;
    char op;
    Button mButton_0;
    Button mButton_1;
    Button mButton_2;
    Button mButton_3;
    Button mButton_4;
    Button mButton_5;
    Button mButton_6;
    Button mButton_7;
    Button mButton_8;
    Button mButton_9;
    Button mButton_c;
    Button mButton_plus;
    Button mButton_minus;
    Button mButton_mul;
    Button mButton_div;
    Button mButton_eqal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initButtons();
    }

    private void initButtons() {
        mButton_0 = (Button) findViewById(R.id.activity_main_0);
        mButton_0.setOnClickListener(this);
        mButton_1 = (Button) findViewById(R.id.activity_main_1);
        mButton_1.setOnClickListener(this);
        mButton_2 = (Button) findViewById(R.id.activity_main_2);
        mButton_2.setOnClickListener(this);
        mButton_3 = (Button) findViewById(R.id.activity_main_3);
        mButton_3.setOnClickListener(this);
        mButton_4 = (Button) findViewById(R.id.activity_main_4);
        mButton_4.setOnClickListener(this);
        mButton_5 = (Button) findViewById(R.id.activity_main_5);
        mButton_5.setOnClickListener(this);
        mButton_6 = (Button) findViewById(R.id.activity_main_6);
        mButton_6.setOnClickListener(this);
        mButton_7 = (Button) findViewById(R.id.activity_main_7);
        mButton_7.setOnClickListener(this);
        mButton_8 = (Button) findViewById(R.id.activity_main_8);
        mButton_8.setOnClickListener(this);
        mButton_9 = (Button) findViewById(R.id.activity_main_9);
        mButton_9.setOnClickListener(this);
        mButton_c = (Button) findViewById(R.id.activity_main_c);
        mButton_c.setOnClickListener(this);
        mButton_plus = (Button) findViewById(R.id.activity_main_plus);
        mButton_plus.setOnClickListener(this);
        mButton_minus = (Button) findViewById(R.id.activity_main_sub);
        mButton_minus.setOnClickListener(this);
        mButton_mul = (Button) findViewById(R.id.activity_main_mul);
        mButton_mul.setOnClickListener(this);
        mButton_div = (Button) findViewById(R.id.activity_main_div);
        mButton_div.setOnClickListener(this);
        mButton_eqal = (Button) findViewById(R.id.activity_main_equal);
        mButton_eqal.setOnClickListener(this);
    }


    private double calculate() {
        if (op == '+') {
            return num1 + num2;
        } else if (op == '-') {
            return num1 - num2;

        } else if (op == '*') {
            return num1 * num2;
        } else if (op == '/') {
            return num1 / num2;
        }
        return 0;
    }

    @Override
    public void onClick(View view) {
        TextView textView = (TextView) findViewById(R.id.activity_main_text_view);
        switch (view.getId()) {
            case R.id.activity_main_0:
                textView.setText(textView.getText() + "0");
                break;
            case R.id.activity_main_1:
                textView.setText(textView.getText() + "1");
                break;
            case R.id.activity_main_2:
                textView.setText(textView.getText() + "2");
                break;
            case R.id.activity_main_3:
                textView.setText(textView.getText() + "3");
                break;
            case R.id.activity_main_4:
                textView.setText(textView.getText() + "4");
                break;
            case R.id.activity_main_5:
                textView.setText(textView.getText() + "5");
                break;
            case R.id.activity_main_6:
                textView.setText(textView.getText() + "6");
                break;
            case R.id.activity_main_7:
                textView.setText(textView.getText() + "7");
                break;
            case R.id.activity_main_8:
                textView.setText(textView.getText() + "8");
                break;
            case R.id.activity_main_9:
                textView.setText(textView.getText() + "9");
                break;
            case R.id.activity_main_c:
                num1 = 0;
                num2 = 0;
                textView.setText("0");
                break;
            case R.id.activity_main_div:
                num1 = Double.parseDouble(textView.getText().toString());
                op = '/';
                textView.setText(textView.getText() + "/");
                break;
            case R.id.activity_main_mul:
                num1 = Double.parseDouble(textView.getText().toString());
                op = '*';
                textView.setText(textView.getText() + "*");
                break;
            case R.id.activity_main_plus:
                num1 = Double.parseDouble(textView.getText().toString());
                op = '+';
                textView.setText(textView.getText() + "+");
                break;
            case R.id.activity_main_sub:
                num1 = Double.parseDouble(textView.getText().toString());
                op = '-';
                textView.setText(textView.getText() + "-");
                break;
            case R.id.activity_main_equal:
                num2 = Double.parseDouble(textView.getText().toString().split("[+\\-*/]")[1]);
                textView.setText(String.valueOf(calculate()));
                break;

        }
    }
}
