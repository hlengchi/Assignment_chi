package com.example.hlengchi.assignment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_assignment_layout);
        listView=findViewById(R.id.listViewMenu);

        final ArrayList<String> menu=new ArrayList<>();
        menu.add("Currency Exchange");
        menu.add("BMI Calculate");
        menu.add("Calculator");
        menu.add("Recycler View ");
        menu.add("Other");
        ArrayAdapter<String> menuAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,menu);
        listView.setAdapter(menuAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent intent=new Intent(MenuActivity.this,CurrencyExchangeActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intentBMI=new Intent(MenuActivity.this,HomeActivity.class);
                        startActivity(intentBMI);
                        break;
                    case 2:
                        Intent intentCal=new Intent(MenuActivity.this,CalculatorActivity.class);
                        startActivity(intentCal);
                        break;
                    case 3:
                        Intent intentRc=new Intent(MenuActivity.this,MovieRecycleViewActivity.class);
                        startActivity(intentRc);
                        break;
                        default: Toast.makeText(MenuActivity.this, "This is empty activity", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
