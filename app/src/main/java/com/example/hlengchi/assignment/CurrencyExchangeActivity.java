package com.example.hlengchi.assignment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class CurrencyExchangeActivity extends Activity {
    Switch switchCurrency;
    EditText editText1,editText2;
    TextView textViewCal, textViewRes,textViewAmount,textViewRate;
    TextInputLayout textLayout1,textLayout2;
    Double val1,val2,res;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.currency_exchange_layout);

        switchCurrency=findViewById(R.id.switch1);
        editText1=findViewById(R.id.editValueOneCurrency);
        editText2=findViewById(R.id.editValueTwoCurrency);
        textViewCal=findViewById(R.id.textCalculateCurrency);
        textViewRes=findViewById(R.id.textResultCurrency);
        textLayout1=findViewById(R.id.textInputLayoutCurrency1);
        textLayout2=findViewById(R.id.textInputLayoutCurrency2);
        textViewAmount=findViewById(R.id.textView4);
        textViewRate=findViewById(R.id.textView5);

        switchCurrency.setChecked(false);
//        switchCurrency.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if(isChecked){
//                    textViewAmount.setText(getResources().getString(R.string.app_riel));
//                    textViewRate.setText(getResources().getString(R.string.app_usa));
//
//                }else {
//                    textViewAmount.setText(getResources().getString(R.string.app_usa));
//                    textViewRate.setText(getResources().getString(R.string.app_riel));
//                }
//
//            }
//        });

        textViewCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switchCurrency.isChecked()){
                    if(editText1.getText().toString().trim().isEmpty()){
                        //Toast.makeText(MainActivity.this, "Enter Value in USA!", Toast.LENGTH_SHORT).show();
                        textLayout1.setError("Enter Value in USA!");
                        textLayout1.setErrorEnabled(true);
                        textLayout2.setErrorEnabled(false);



                    }else if(editText2.getText().toString().trim().isEmpty()){
                        //Toast.makeText(MainActivity.this, "Enter Value in Rate!", Toast.LENGTH_SHORT).show();
                        textLayout2.setError("Enter Value in Rate!");
                        textLayout2.setErrorEnabled(true);
                        textLayout1.setErrorEnabled(false);

                    }else{
                        val1=Double.parseDouble(editText1.getText().toString());
                        val2=Double.parseDouble(editText2.getText().toString());
                        textLayout1.setErrorEnabled(false);
                        textLayout2.setErrorEnabled(false);
                        if(val1>=val2) {
                            res = val1 / val2;
                            textViewRes.setText(res.toString() + "  " + getResources().getString(R.string.app_dolar));
                        }else {
                            textLayout1.setError("Number of Amount more than Rate!");
                            textLayout1.setErrorEnabled(true);
                        }
                    }

                }else{
                    if(editText1.getText().toString().trim().isEmpty()){
                        //Toast.makeText(MainActivity.this, "Enter Value in USA!", Toast.LENGTH_SHORT).show();
                        textLayout1.setError("Enter Value in USA!");
                        textLayout1.setErrorEnabled(true);
                        textLayout2.setErrorEnabled(false);



                    }else if(editText2.getText().toString().trim().isEmpty()){
                        //Toast.makeText(MainActivity.this, "Enter Value in Rate!", Toast.LENGTH_SHORT).show();
                        textLayout2.setError("Enter Value in Rate!");
                        textLayout2.setErrorEnabled(true);
                        textLayout1.setErrorEnabled(false);

                    }else{
                        val1=Double.parseDouble(editText1.getText().toString());
                        val2=Double.parseDouble(editText2.getText().toString());
                        textLayout1.setErrorEnabled(false);
                        textLayout2.setErrorEnabled(false);
                        res=val1*val2;
                        textViewRes.setText(res.toString()+"  "+getResources().getString(R.string.app_khmer));
                    }

                }
            }
        });

       }
}
