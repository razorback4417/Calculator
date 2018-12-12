package com.example.razorback.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //github testing...
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
        Button point = (Button) findViewById(R.id.point);


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView resultTextView = (TextView) findViewById(R.id.textView);

                int result = num1 + num2;
                resultTextView.setText(result + "");
            }
        });














    }
}
