package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

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
        Button add_btn=(Button) findViewById(R.id.btn_add);
        Button sub_btn=(Button) findViewById(R.id.btn_sub);
        Button mul_btn=(Button) findViewById(R.id.btn_mult);
        Button div_btn=(Button) findViewById(R.id.btn_div);
        EditText edt_num1=(EditText) findViewById(R.id.edt1);
        EditText edt_num2=(EditText) findViewById(R.id.edt2);
        TextView res=(TextView) findViewById(R.id.res);

        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1=Integer.parseInt(edt_num1.getText().toString());
                int num2=Integer.parseInt(edt_num2.getText().toString());
                int temp=(num1+num2);
                res.setText(Integer.toString(temp));
            }
        });
        sub_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1=Integer.parseInt(edt_num1.getText().toString());
                int num2=Integer.parseInt(edt_num2.getText().toString());
                int temp=(num1-num2);
                res.setText(Integer.toString(temp));
            }
        });
        mul_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1=Integer.parseInt(edt_num1.getText().toString());
                int num2=Integer.parseInt(edt_num2.getText().toString());
                int temp=(num1*num2);
                res.setText(Integer.toString(temp));
            }
        });
        div_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1=Integer.parseInt(edt_num1.getText().toString());
                int num2=Integer.parseInt(edt_num2.getText().toString());
                int temp=(num1/num2);
                res.setText(Integer.toString(temp));
            }
        });
    }
}