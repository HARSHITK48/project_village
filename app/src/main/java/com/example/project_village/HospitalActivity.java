package com.example.project_village;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HospitalActivity extends AppCompatActivity {



    Button call_ambulance_button;
    Button call_doctor_button;
    Button hospital_info_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);


        call_ambulance_button=findViewById(R.id.activity_hospital_call_ambulance_button);
        call_doctor_button=findViewById(R.id.activity_hospital_call_doctor_button);
        hospital_info_button=findViewById(R.id.activity_hospital_location_button);


        call_ambulance_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:108"));
                startActivity(intent);
            }
        });

        hospital_info_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1= new Intent(HospitalActivity.this,HospitalInfoActivity.class);
                startActivity(intent1);
            }
        });



    }
}
