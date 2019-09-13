package com.example.project_village;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HospitalInfoActivity extends AppCompatActivity {




    Button east_point_hospital;
    Button varthur_government_hospital;
    Button seegehalli_hospital;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_info);


        east_point_hospital=findViewById(R.id.activity_hospital_one_button);
        varthur_government_hospital=findViewById(R.id.activity_hospital_second_button);
        seegehalli_hospital=findViewById(R.id.activity_hospital_third_button);

        east_point_hospital.setText(R.string.east_point_hospital);
        varthur_government_hospital.setText(R.string.varthur_government_hospital);
        seegehalli_hospital.setText(R.string.seegehalli_government_hospital);


        east_point_hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HospitalInfoActivity.this,EastPointInfoActivity.class);
                startActivity(intent);
            }
        });

        varthur_government_hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HospitalInfoActivity.this,VarthurGovernmentHospital.class);
                startActivity(intent);

            }
        });

        seegehalli_hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HospitalInfoActivity.this,SeegehalliGovernmentHospital.class);
                startActivity(intent);

            }
        });

    }
}
