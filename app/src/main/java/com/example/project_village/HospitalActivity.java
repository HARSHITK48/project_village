package com.example.project_village;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HospitalActivity extends AppCompatActivity {



    Button call_ambulance_button;

    Button hospital_info_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);


        call_ambulance_button=findViewById(R.id.activity_hospital_call_ambulance_button);

        hospital_info_button=findViewById(R.id.activity_hospital_location_button);


        call_ambulance_button.setText(R.string.call_ambulance);

        hospital_info_button.setText(R.string.location_info);

        call_ambulance_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] colors = {"Government" ,"Private-1(East-Point Hospital)","Private-2(East-Point Hospital"};

                AlertDialog.Builder builder = new AlertDialog.Builder(HospitalActivity.this);
                builder.setTitle("Select type");
                builder.setItems(colors, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if(which==0){
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:108"));
                            startActivity(intent);
                        }
                        else if(which==1){
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:080-25136200"));
                            startActivity(intent);
                        }
                        else{
                            Intent intent = new Intent(Intent.ACTION_DIAL);
                            intent.setData(Uri.parse("tel:78290 52999"));
                            startActivity(intent);
                        }

                    }
                });
                builder.show();

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
