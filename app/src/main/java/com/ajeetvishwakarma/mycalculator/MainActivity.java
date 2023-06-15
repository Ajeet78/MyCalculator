package com.ajeetvishwakarma.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnclear,btnequal,btnaddition,btnsubstract,btndivide,btndot,btnmultiply,btnmod,btnbackspace;
   TextView textDisplayText;

    double firstNumber,secondNumber;
    String actionType;
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
        btnequal = findViewById(R.id.btn_equal);
        btnaddition = findViewById(R.id.btn_addition);
        btnsubstract = findViewById(R.id.btn_subtract);
        btndivide = findViewById(R.id.btn_divide);
        btnmultiply = findViewById(R.id.btn_multiply);
        btndot = findViewById(R.id.btn_dot);
        btnclear = findViewById(R.id.btn_clear);
        btnbackspace = findViewById(R.id.btn_backspace);
        textDisplayText = findViewById(R.id.txt_result);


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textDisplayText.setText(textDisplayText.getText().toString() + "0");
            }
        });

         btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textDisplayText.setText(textDisplayText.getText().toString() + "1");
            }
        });

         btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textDisplayText.setText(textDisplayText.getText() + "2");
            }
        });

         btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textDisplayText.setText(textDisplayText.getText() + "3");
            }
        });

         btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textDisplayText.setText(textDisplayText.getText() + "4");
            }
        });

         btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textDisplayText.setText(textDisplayText.getText() + "5");
            }
        });

         btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textDisplayText.setText(textDisplayText.getText() + "6");
            }
        });

         btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textDisplayText.setText(textDisplayText.getText() + "7");
            }
        });

         btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textDisplayText.setText(textDisplayText.getText() + "8");
            }
        });

         btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textDisplayText.setText(textDisplayText.getText() + "9");
            }
        });

        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textDisplayText.setText(textDisplayText.getText() + ".");


            }
        });

        btnaddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textDisplayText.setText(textDisplayText.getText() + "+");

            }
        });

        btnsubstract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textDisplayText.setText(textDisplayText.getText() + "-");

            }
        });

           btnmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textDisplayText.setText(textDisplayText.getText() + "x");

            }
        });

        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textDisplayText.setText(textDisplayText.getText() + "÷");

            }
        });

        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = textDisplayText.getText().toString();
                if(number.contains("÷")){
                    String[] splitNumber = number.split("÷");
                    double firstNumber = Double.valueOf(splitNumber[0]);
                    double secondNumber = Double.valueOf(splitNumber[1]);
                    textDisplayText.setText(String.valueOf(divide(firstNumber, secondNumber)));

                } else if (number.contains("x")){
                    String[] splitNumber = number.split("x");
                    double firstNumber = Double.valueOf(splitNumber[0]);
                    double secondNumber = Double.valueOf(splitNumber[1]);
                    textDisplayText.setText(String.valueOf(multiply(firstNumber, secondNumber)));

                }
                else if (number.contains("+")){
                    String[] splitNumber = number.split("\\+");
                    double firstNumber = Double.valueOf(splitNumber[0]);
                    double secondNumber = Double.valueOf(splitNumber[1]);
                    textDisplayText.setText(String.valueOf(add(firstNumber, secondNumber)));

                } else if (number.contains("-")){
                    String[] splitNumber = number.split("-");
                    double firstNumber = Double.valueOf(splitNumber[0]);
                    double secondNumber = Double.valueOf(splitNumber[1]);
                    textDisplayText.setText(String.valueOf(subtract(firstNumber, secondNumber)));

                }
            }
        });

        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textDisplayText.setText("");


            }
        });

        btnbackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    // Get the text from the text display.
                    String text = textDisplayText.getText().toString();

                    // If the text is not empty, then delete the last character.
                    if (!text.isEmpty()) {
                        text = text.substring(0, text.length() - 1);
                    }

                    // Set the text display to the new text.
                    textDisplayText.setText(text);
                }

        });

    }
    double add(double a, double b){
        return a+b;
    }

     double subtract(double a, double b){
        return a-b;
    }

     double multiply(double a, double b){
        return a*b;
    }

     double divide(double a, double b){
        return a/b;

    }

    double modulo(double a, double b){
        return a/b*100;
    }


}