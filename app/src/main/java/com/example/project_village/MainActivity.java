package com.example.project_village;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button hospital_button;
    Button transport_button;
    Button garbage_button;
    Button education_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hospital_button=findViewById(R.id.activity_main_hospital_button);
        transport_button=findViewById(R.id.activity_main_transport_button);
        garbage_button=findViewById(R.id.activity_main_garbage_button);
        education_button=findViewById(R.id.activity_main_education_button);

        hospital_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,HospitalActivity.class);
                startActivity(intent);

            }
        });

        transport_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,TransportActivity.class);
                startActivity(intent);
            }
        });

        garbage_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,GarbageActivity.class);
                startActivity(intent);
            }
        });

        education_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,EducationActivity.class);
                startActivity(intent);
            }
        });




    }
}
