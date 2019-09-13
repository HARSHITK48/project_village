package com.example.project_village;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class EastPointInfoActivity extends AppCompatActivity {

    TextView eastpointaddresstag;
    TextView eastpointaddress;
    TextView eastpointwebsitetag;
    TextView eastpointwebsite;
    TextView eastpointemergencytag;
    TextView eastpointemergency;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_east_point_info);

        eastpointaddresstag=findViewById(R.id.activity_east_point_address_tag);
        eastpointaddress=findViewById(R.id.activity_east_point_address);
        eastpointwebsitetag=findViewById(R.id.activity_east_point_websites_tag);
        eastpointwebsite=findViewById(R.id.activity_east_point_website);
        eastpointemergencytag=findViewById(R.id.activity_east_point_emergency_tag);
        eastpointemergency=findViewById(R.id.activity_east_point_emergency);
        
        eastpointaddresstag.setText(R.string.address);
        eastpointaddress.setText(R.string.east_point_location);
        eastpointwebsitetag.setText(R.string.website);
        eastpointwebsite.setText(R.string.east_point_website);
        eastpointemergencytag.setText(R.string.emergency);
        eastpointemergency.setText(R.string.east_point_emergency_services);


    }
}
