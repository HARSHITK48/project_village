package com.example.project_village;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TransportActivity extends AppCompatActivity {



    Button busbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport);

        busbutton=findViewById(R.id.activity_transport_bus_button);
        busbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TransportActivity.this,BusActivity.class);
                startActivity(intent);
            }
        });
    }
}
