package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText firstNum;
    private EditText secondNum;

    private Button btn_multiple;
    private Button btn_percent;
    private Button btn_subtract;
    private Button btn_add;
    private Button bnt_divide;

    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View view){
        EditText editText1 = findViewById(R.id.firstNum);
        EditText editText2 = findViewById(R.id.secondNum);
        EditText editText3 = findViewById(R.id.result);

        int num1 = Integer.parseInt(editText1.getText().toString());
        int num2 = Integer.parseInt(editText2.getText().toString());

        int result = num1+num2;

        editText3.setText("Результат: " + result);
    }

    public void divide(View view){
        EditText editText1 = findViewById(R.id.firstNum);
        EditText editText2 = findViewById(R.id.secondNum);
        EditText editText3 = findViewById(R.id.result);

        int num1 = Integer.parseInt(editText1.getText().toString());
        int num2 = Integer.parseInt(editText2.getText().toString());

        int result = num1/num2;

        editText3.setText("Результат: " + result);
    }

    public void multiply(View view){
        EditText editText1 = findViewById(R.id.firstNum);
        EditText editText2 = findViewById(R.id.secondNum);
        EditText editText3 = findViewById(R.id.result);

        int num1 = Integer.parseInt(editText1.getText().toString());
        int num2 = Integer.parseInt(editText2.getText().toString());

        int result = num1*num2;

        editText3.setText("Результат: " + result);
    }

    public void subtract(View view){
        EditText editText1 = findViewById(R.id.firstNum);
        EditText editText2 = findViewById(R.id.secondNum);
        EditText editText3 = findViewById(R.id.result);

        int num1 = Integer.parseInt(editText1.getText().toString());
        int num2 = Integer.parseInt(editText2.getText().toString());

        int result = num1-num2;

        editText3.setText("Результат: " + result);
    }

    public void percent(View view){
        EditText editText1 = findViewById(R.id.firstNum);
        EditText editText2 = findViewById(R.id.secondNum);
        EditText editText3 = findViewById(R.id.result);

        int num1 = Integer.parseInt(editText1.getText().toString());
        int num2 = Integer.parseInt(editText2.getText().toString());

        int result = num1-(num1*num2)/100;

        editText3.setText("Результат: " + result);
    }

    public void factorial(View view){
        EditText editText1 = findViewById(R.id.firstNum);
        EditText editText3 = findViewById(R.id.result);

        int num1 = Integer.parseInt(editText1.getText().toString());

        int result = fact(num1);

        editText3.setText("Результат: " + result);
    }



    public static int fact(int n){
        if(n==0){
            return 0;
        }
        return n*(n-1);
    }


}