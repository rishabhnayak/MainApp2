package com.example.raja.mainapp2;

import android.support.constraint.solver.widgets.Snapshot;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReservedTrainDataEntry extends AppCompatActivity {
    StringBuffer response;
    int year,day,month;
    TextView departureDate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserved_train_data_entry);

        //adding BufferedReader
        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(getApplicationContext().getAssets().open("rtbs.json")));
            response=new StringBuffer();
            String line;
            while ((line=buffer.readLine())!=null){
                response.append(line);
                response.append("\n");
            }
        } catch (IOException e) {
        }
        //data is in string form:json format assingned in responsed
        String responsed=response.toString();
        System.out.println(responsed);
        final DatePicker dp= (DatePicker) findViewById(R.id.datepicker);

          day=dp.getDayOfMonth();
          month=dp.getMonth()+1;
          year=dp.getYear();

        departureDate= (TextView) findViewById(R.id.ddate);
        departureDate.setText(day+"/"+month+"/"+year);

        findViewById(R.id.datepicker).setVisibility(View.GONE);

        CardView ddbutton= (CardView) findViewById(R.id.ddbutton);

        ddbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.datepicker).setVisibility(View.VISIBLE);
                findViewById(R.id.ddbutton).setVisibility(View.GONE);
                findViewById(R.id.cardview).setVisibility(View.VISIBLE);
            }
        });
       ImageButton su= (ImageButton) findViewById(R.id.submitButton);
        su.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                findViewById(R.id.ddbutton).setVisibility(View.VISIBLE);
                findViewById(R.id.cardview).setVisibility(View.GONE);
                findViewById(R.id.datepicker).setVisibility(View.GONE);
                day=dp.getDayOfMonth();
                month=dp.getMonth()+1;
                year=dp.getYear();
                departureDate= (TextView) findViewById(R.id.ddate);
                departureDate.setText(day+"/"+month+"/"+year);
                Toast.makeText(ReservedTrainDataEntry.this,"Departure Date Selected", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
