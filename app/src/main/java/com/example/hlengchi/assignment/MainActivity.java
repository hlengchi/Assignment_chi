package com.example.hlengchi.assignment;

import android.app.Activity;
import android.support.design.widget.TextInputLayout;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    EditText editValOne,editValTwo;
    TextView textCal,textResults;
    TextInputLayout textLayout1,textLayout2;
    Double val1,val2,res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editValOne=findViewById(R.id.editValueOneCurrency);
        editValTwo=findViewById(R.id.editValueTwo);
        textCal=findViewById(R.id.textCalculateCurrency);
        textResults=findViewById(R.id.textResult);
        textLayout1=findViewById(R.id.textInputLayoutCurrency1);
        textLayout2=findViewById(R.id.textInputLayoutCurrency2);




        textCal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                if(editValOne.getText().toString().trim().isEmpty()){
                    //Toast.makeText(MainActivity.this, "Enter Value in USA!", Toast.LENGTH_SHORT).show();
                    textLayout1.setError("Enter Value in USA!");
                    textLayout1.setErrorEnabled(true);
                    textLayout2.setErrorEnabled(false);



                }else if(editValTwo.getText().toString().trim().isEmpty()){
                    //Toast.makeText(MainActivity.this, "Enter Value in Rate!", Toast.LENGTH_SHORT).show();
                    textLayout2.setError("Enter Value in Rate!");
                    textLayout2.setErrorEnabled(true);
                    textLayout1.setErrorEnabled(false);

                }else{
                    val1=Double.parseDouble(editValOne.getText().toString());
                    val2=Double.parseDouble(editValTwo.getText().toString());
                    textLayout1.setErrorEnabled(false);
                    textLayout2.setErrorEnabled(false);
                    res=val1*val2;
                    textResults.setText(res.toString()+"  "+getResources().getString(R.string.app_riels));
                }
            }
        });


    }

}
