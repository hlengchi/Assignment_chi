package com.example.hlengchi.assignment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener{
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bAdd,bSub,bDiv,bMul,bEqu,bpiont;
    EditText edNum;
    Double valOne,valTwo;
    boolean add,sub,mul,div;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_layout);
        edNum=findViewById(R.id.editTextNumber);
        b0=findViewById(R.id.btn0);
        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        b3=findViewById(R.id.btn3);
        b4=findViewById(R.id.btn4);
        b5=findViewById(R.id.btn5);
        b6=findViewById(R.id.btn6);
        b7=findViewById(R.id.btn7);
        b8=findViewById(R.id.btn8);
        b9=findViewById(R.id.btn9);
        bAdd=findViewById(R.id.btnAdd);
        bSub=findViewById(R.id.btnSubtract);
        bDiv=findViewById(R.id.btnDivide);
        bMul=findViewById(R.id.btnMultiplie);
        bEqu=findViewById(R.id.btnEqual);
        bpiont=findViewById(R.id.btnPoint);

        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        bAdd.setOnClickListener(this);
        bSub.setOnClickListener(this);
        bMul.setOnClickListener(this);
        bDiv.setOnClickListener(this);
        bEqu.setOnClickListener(this);
        bpiont.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String value=edNum.getText().toString();
        switch (v.getId()){
            case R.id.btn0:
                edNum.setText(value+b0.getText().toString());
                break;
            case R.id.btn1:
                edNum.setText(value+b1.getText().toString());
                break;
            case R.id.btn2:
                edNum.setText(value+b2.getText().toString());
                break;
            case R.id.btn3:
                edNum.setText(value+b3.getText().toString());
                break;
            case R.id.btn4:
                edNum.setText(value+b4.getText().toString());
                break;
            case R.id.btn5:
                edNum.setText(value+b5.getText().toString());
                break;
            case R.id.btn6:
                edNum.setText(value+b6.getText().toString());
                break;
            case R.id.btn7:
                edNum.setText(value+b7.getText().toString());
                break;
            case R.id.btn8:
                edNum.setText(value+b8.getText().toString());
                break;
            case R.id.btn9:
                edNum.setText(value+b9.getText().toString());
                break;
            case R.id.btnAdd:
                valOne=Double.parseDouble(edNum.getText().toString());
                add=true;
                edNum.setText(null);
                break;
            case R.id.btnSubtract:
                valOne=Double.parseDouble(edNum.getText().toString());
                sub=true;
                edNum.setText(null);
                break;
            case R.id.btnMultiplie:
                valOne=Double.parseDouble(edNum.getText().toString());
                mul=true;
                edNum.setText(null);
                break;
            case R.id.btnDivide:
                valOne=Double.parseDouble(edNum.getText().toString());
                div=true;
                edNum.setText(null);
                break;
            case R.id.btnPoint:
                edNum.setText(value+bpiont.getText().toString());
                break;
                default:
                    valTwo=Double.parseDouble(edNum.getText().toString());
                    if(add==true) {
                        edNum.setText(valOne+valTwo+"");
                        add=false;
                    }else if(sub==true){
                        edNum.setText(valOne-valTwo+"");
                        sub=false;
                    }else if(mul==true){
                        edNum.setText(valOne*valTwo+"");
                        mul=false;
                    }else if(div==true){
                        edNum.setText(valOne/valTwo+"");
                        div=false;
                    }else{
                        edNum.setText(null);
                    }

        }



    }
}
