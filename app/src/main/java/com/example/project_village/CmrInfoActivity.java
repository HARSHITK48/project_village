package com.example.project_village;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CmrInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmr_info);
        TextView info=findViewById(R.id.activity_cmr_info_details);
        TextView webs=findViewById(R.id.activity_cmr_website_details);

        String information=getIntent().getExtras().getString("information");
        info.setText(information);
        String website=getIntent().getExtras().getString("website");
        webs.setText(website);


    }
}
