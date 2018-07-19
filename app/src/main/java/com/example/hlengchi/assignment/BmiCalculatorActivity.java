package com.example.hlengchi.assignment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class BmiCalculatorActivity extends AppCompatActivity{
    static EditText editTextWeight,editTextHeight;
    static TextView textViewShow;
    TextInputLayout textInputLayoutWeight,textInputLayoutHeight;
    //double bmi,mass,heightm;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi_calculator_layout);

        editTextWeight=findViewById(R.id.editTextWeight);
        editTextHeight=findViewById(R.id.editTextHeight);
         textViewShow=findViewById(R.id.textViewShow);

        textInputLayoutWeight=findViewById(R.id.textInputLayoutWeight);
        textInputLayoutHeight=findViewById(R.id.textInputLayoutHeight);





        editTextWeight.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            if(editTextWeight.getText().toString().isEmpty()){
                textViewShow.setText("");
            }else if(editTextHeight.getText().toString().isEmpty()) {
                textViewShow.setText("");
            } else{
                bmiCalculate(Double.parseDouble(editTextWeight.getText().toString()),Double.parseDouble(editTextHeight.getText().toString()));
            }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        editTextHeight.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(editTextWeight.getText().toString().isEmpty()){
                    textViewShow.setText("");
                }else if(editTextHeight.getText().toString().isEmpty()) {
                    textViewShow.setText("");
                } else{
                    bmiCalculate(Double.parseDouble(editTextWeight.getText().toString()),Double.parseDouble(editTextHeight.getText().toString()));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


    }

    public static void bmiCalculate(double mass, double heightm){
        Double bmi=mass/(heightm*heightm);

        if(bmi>=0 && bmi<=15){
            textViewShow.setText(String.valueOf("Very severely underweight"));
        }else if(bmi>=15 && bmi<=16){
            textViewShow.setText(String.valueOf("Severely underweight"));
        }else if(bmi>=16 && bmi<=18.5){
            textViewShow.setText(String.valueOf("Underweight"));
        }else if(bmi>=18.5 && bmi<=25){
            textViewShow.setText(String.valueOf("Normal (healthy weight)"));
        }else if(bmi>=25 && bmi<=30){
            textViewShow.setText(String.valueOf("Overweight"));
        }else if(bmi>=30 && bmi<=35){
            textViewShow.setText(String.valueOf("Obese Class I (Moderately obese)"));
        }else if(bmi>=35 && bmi<=40){
            textViewShow.setText(String.valueOf("Obese Class II (Severely obese)"));
        }else if(bmi<40){
            textViewShow.setText(String.valueOf("Obese Class III (Very Severely obese)"));
        }else{
            textViewShow.setText(String.valueOf("Unknown"));
        }


    }
}
