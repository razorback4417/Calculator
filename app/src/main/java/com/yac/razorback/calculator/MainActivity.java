package com.yac.razorback.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {//implements View.OnClickListener {

    //@Override
    float old_value = 0;
    boolean p = false;
    boolean s = false;
    boolean m = false;
    boolean d = false;
    boolean e = false;
    //int new_value = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // not using "."; point or "%"; percent
        Button one = (Button) findViewById(R.id.one);
        Button two = (Button) findViewById(R.id.two);
        Button three = (Button) findViewById(R.id.three);
        Button four = (Button) findViewById(R.id.four);
        Button five = (Button) findViewById(R.id.five);
        Button six = (Button) findViewById(R.id.six);
        Button seven = (Button) findViewById(R.id.seven);
        Button eight = (Button) findViewById(R.id.eight);
        Button nine = (Button) findViewById(R.id.nine);
        Button zero = (Button) findViewById(R.id.zero);
        Button plus = (Button) findViewById(R.id.plus);
        Button subtract = (Button) findViewById(R.id.subtract);
        Button mult = (Button) findViewById(R.id.mult);
        Button divide = (Button) findViewById(R.id.divide);
        Button clear = (Button) findViewById(R.id.clear);
        Button equal = (Button) findViewById(R.id.equal);
        // Button point = (Button) findViewById(R.id.point);
        final TextView result1 = (TextView) findViewById(R.id.textView);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1.setText(result1.getText() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1.setText(result1.getText() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1.setText(result1.getText() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1.setText(result1.getText() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1.setText(result1.getText() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1.setText(result1.getText() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1.setText(result1.getText() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1.setText(result1.getText() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1.setText(result1.getText() + "9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result1.setText(result1.getText() + "0");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p = true;
                old_value = Float.parseFloat(result1.getText().toString());
                result1.setText("");

            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = true;
                old_value = Float.parseFloat(result1.getText().toString());
                result1.setText("");
            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m = true;
                old_value = Float.parseFloat(result1.getText().toString());
                result1.setText("");
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d = true;
                old_value = Float.parseFloat(result1.getText().toString());
                result1.setText("");
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                old_value = 0;
                result1.setText("");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (p == true) {
                    float new_value = Float.parseFloat(result1.getText().toString());
                    float result = old_value + new_value;
                    result1.setText(Float.toString(result));
                    p = false;
                }

                if (s == true) {
                    float new_value1 = Float.parseFloat(result1.getText().toString());
                    float result = old_value - new_value1;
                    result1.setText(Float.toString(result));
                    s = false;
                }

                if (m == true) {
                    float new_value2 = Float.parseFloat(result1.getText().toString());
                    float result = old_value * new_value2;
                    result1.setText(Float.toString(result));
                    m = false;
                }

                if (d == true) {
                    float new_value3 = Float.parseFloat(result1.getText().toString());
                    float result = old_value / new_value3;
                    result1.setText(Float.toString(result));
                    d = false;
                }

            }
        });
    }
}