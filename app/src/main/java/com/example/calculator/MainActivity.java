package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    TextView e3;
    Button b1,b2,b3,b4,b5,b6,b7;
    float num1,num2,add,subtract,multiply,divide,modulo;
    String s1,s2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=findViewById(R.id.id1);
        e2=findViewById(R.id.id2);
        e3=findViewById(R.id.id3);
        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button4);
        b3=findViewById(R.id.button6);
        b4=findViewById(R.id.button7);
        b5=findViewById(R.id.button8);
        b6=findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {

                    
                    if(TextUtils.isEmpty(e1.getText().toString()))
                    {
                        Toast.makeText(MainActivity.this, "Enter first number", Toast.LENGTH_SHORT).show();
                    }
                    else if(TextUtils.isEmpty(e2.getText().toString()))
                    {
                        Toast.makeText(MainActivity.this, "Enter second number", Toast.LENGTH_SHORT).show();
                    }
                    else if(TextUtils.isEmpty(e1.getText().toString())||TextUtils.isEmpty(e2.getText().toString()))
                    {
                        Toast.makeText(MainActivity.this, "Enter first and second number", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        s1=e1.getText().toString();
                        s2=e2.getText().toString();
                        num1=Float.parseFloat(s1);
                        num2=Float.parseFloat(s2);
                        add=num1+num2;
                        e3.setText(Float.toString(add));
                    }
            }
        });
        b2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {

                if(TextUtils.isEmpty(e1.getText().toString())||TextUtils.isEmpty(e2.getText().toString()))
                {
                    if(TextUtils.isEmpty(e1.getText().toString()))
                    {
                        Toast.makeText(MainActivity.this, "Enter first number", Toast.LENGTH_SHORT).show();
                    }
                    else if(TextUtils.isEmpty(e2.getText().toString()))
                    {
                        Toast.makeText(MainActivity.this, "Enter second number", Toast.LENGTH_SHORT).show();
                    }
                    else if(TextUtils.isEmpty(e1.getText().toString())||TextUtils.isEmpty(e2.getText().toString()))
                    {
                        Toast.makeText(MainActivity.this, "Enter first and second number", Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    s1=e1.getText().toString();
                    s2=e2.getText().toString();
                    num1=Float.parseFloat(s1);
                    num2=Float.parseFloat(s2);
                    subtract=num1-num2;
                    e3.setText(Float.toString(subtract));
                }

            }
        });
        b3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {

                if(TextUtils.isEmpty(e1.getText().toString())||TextUtils.isEmpty(e2.getText().toString()))
                {
                    if(TextUtils.isEmpty(e1.getText().toString()))
                    {
                        Toast.makeText(MainActivity.this, "Enter first number", Toast.LENGTH_SHORT).show();
                    }
                    else if(TextUtils.isEmpty(e2.getText().toString()))
                    {
                        Toast.makeText(MainActivity.this, "Enter second number", Toast.LENGTH_SHORT).show();
                    }
                    else if(TextUtils.isEmpty(e1.getText().toString())||TextUtils.isEmpty(e2.getText().toString()))
                    {
                        Toast.makeText(MainActivity.this, "Enter first and second number", Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    s1=e1.getText().toString();
                    s2=e2.getText().toString();
                    num1=Float.parseFloat(s1);
                    num2=Float.parseFloat(s2);
                    multiply=num1*num2;
                    e3.setText(Float.toString(multiply));
                }

            }
        });
        b4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {

                if(TextUtils.isEmpty(e1.getText().toString())||TextUtils.isEmpty(e2.getText().toString()))
                {
                    if(TextUtils.isEmpty(e1.getText().toString()))
                    {
                        Toast.makeText(MainActivity.this, "Enter first number", Toast.LENGTH_SHORT).show();
                    }
                    else if(TextUtils.isEmpty(e2.getText().toString()))
                    {
                        Toast.makeText(MainActivity.this, "Enter second number", Toast.LENGTH_SHORT).show();
                    }
                    else if(TextUtils.isEmpty(e1.getText().toString())||TextUtils.isEmpty(e2.getText().toString()))
                    {
                        Toast.makeText(MainActivity.this, "Enter first and second number", Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    s1=e1.getText().toString();
                    s2=e2.getText().toString();
                    num1=Float.parseFloat(s1);
                    num2=Float.parseFloat(s2);
                    if(num2==0)
                    {
                        Toast toast=Toast.makeText(getApplicationContext(),"Cant divide a number by zero",Toast.LENGTH_SHORT);
                        toast.setMargin(100,100);
                        toast.show();
                    }
                    else {
                        divide=num1/num2;
                        e3.setText(Float.toString(divide));

                    }
                }

            }
        });
        b5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {

                if(TextUtils.isEmpty(e1.getText().toString())||TextUtils.isEmpty(e2.getText().toString()))
                {
                    if(TextUtils.isEmpty(e1.getText().toString()))
                    {
                        Toast.makeText(MainActivity.this, "Enter first number", Toast.LENGTH_SHORT).show();
                    }
                    else if(TextUtils.isEmpty(e2.getText().toString()))
                    {
                        Toast.makeText(MainActivity.this, "Enter second number", Toast.LENGTH_SHORT).show();
                    }
                    else if(TextUtils.isEmpty(e1.getText().toString())||TextUtils.isEmpty(e2.getText().toString()))
                    {
                        Toast.makeText(MainActivity.this, "Enter first and second number", Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    s1=e1.getText().toString();
                    s2=e2.getText().toString();
                    num1=Float.parseFloat(s1);
                    num2=Float.parseFloat(s2);
                    modulo=num1%num2;
                    e3.setText(Float.toString(modulo));
                }

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(null);
                e2.setText(null);
                e3.setText(null);
            }
        });





    }
}