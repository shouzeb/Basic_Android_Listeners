package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Calendar;

public class screen4 extends AppCompatActivity implements View.OnClickListener, DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener {
    Button b,b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4);
        b2=findViewById(R.id.btnDate);
        b2.setOnClickListener(this);
        b3=findViewById(R.id.btnTime);
        b3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnDate:{
                DialogFragment date=new DatePickup();
                date.show(getSupportFragmentManager(),"date Picker");
                break;
            }
            case R.id.btnTime:{
                DialogFragment time=new Time();
                time.show(getSupportFragmentManager(),"Time Picker");
                break;
            }
        }
    }

    @Override
    public void onDateSet(DatePicker view, int i, int i1, int i2) {
        Calendar c=Calendar.getInstance();
        c.set(Calendar.YEAR,i );
        c.set(Calendar.MONTH,i1);
        c.set(Calendar.DAY_OF_MONTH,i2);
        String current= DateFormat.getDateInstance().format(c.getTime());
        Toast.makeText(getApplicationContext(),"You Selected: "+current,Toast.LENGTH_LONG).show();

    }

    @Override
    public void onTimeSet(TimePicker view, int i, int i1) {
        Toast.makeText(getApplicationContext(),"The time is "+i+" Hours and "+i1+" minutes.",Toast.LENGTH_LONG).show();

    }
}
