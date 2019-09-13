package com.example.project_village;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SeegehalliGovernmentHospital extends AppCompatActivity {

    TextView seegehalliaddresstag;
    TextView seegehalliaddress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seegehalli_government_hospital);

        seegehalliaddresstag=findViewById(R.id.activity_seegehalli_address_tag);
        seegehalliaddress=findViewById(R.id.activity_seegehalli_address);

        seegehalliaddresstag.setText(R.string.address);
        seegehalliaddress.setText(R.string.seegehalli_address);
    }
}
