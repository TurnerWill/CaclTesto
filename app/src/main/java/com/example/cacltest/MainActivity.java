package com.example.cacltest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnDecimal, btnClear;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn_0);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);
        btnDecimal = findViewById(R.id.btn_decimalPoint);
        btnClear = findViewById(R.id.btn_c);

        display = findViewById(R.id.textview_display);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnDecimal.setOnClickListener(this);
        btnClear.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btn_decimalPoint:
                display.append(".");
                break;

            case R.id.btn_9:
                display.append("9");
                break;
                
            case R.id.btn_8:
                display.append("8");
                break;

            case R.id.btn_7:
                display.append("7");
                break;

            case R.id.btn_6:
                display.append("6");
                break;


            case R.id.btn_5:
                display.append("5");
                break;

            case R.id.btn_4:
                display.append("4");
                break;

            case R.id.btn_3:
                display.append("3");
                break;

            case R.id.btn_2:
                display.append("2");
                break;

            case R.id.btn_1:
                display.append("1");
                break;

            case R.id.btn_0:
                display.append("0");
                break;

            case R.id.btn_c:
                display.setText("");

        }

    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
