package com.example.project_village;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EducationActivity extends AppCompatActivity {

    Button cmru;
    Button preschool;
    Button primaryschool;
    Button secondaryschool;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);

        cmru=findViewById(R.id.activity_education_cmr_group);
        preschool=findViewById(R.id.activity_education_pre);
        primaryschool=findViewById(R.id.activity_education_primary);
        secondaryschool=findViewById(R.id.activity_education_secondary);

        cmru.setText(R.string.cmr_group);
        preschool.setText(R.string.pre_school);
        primaryschool.setText(R.string.primary_school);
        secondaryschool.setText(R.string.secondary_school);



        cmru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(EducationActivity.this,CmrActivity.class);
                startActivity(intent);
            }
        });
        preschool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(EducationActivity.this,EducationInfoActivity.class);
                String address=getString(R.string.time_address);
                intent.putExtra("address",address);
                String website=getString(R.string.time_website);
                intent.putExtra("website",website);
                String phone=getString(R.string.time_phone);
                intent.putExtra("phone",phone);
                startActivity(intent);
            }
        });

        primaryschool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] schools = {"Brilliant National School" ,"Government Higher Primary School (GHPS)"};

                AlertDialog.Builder builder = new AlertDialog.Builder(EducationActivity.this);
                builder.setTitle("Select type");
                builder.setItems(schools, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if(which==0){
                            Intent intent=new Intent(EducationActivity.this,EducationInfoActivity.class);
                            String address=getString(R.string.bns_address);
                            intent.putExtra("address",address);
                            String website=getString(R.string.bns_website);
                            intent.putExtra("website",website);
                            String phone=getString(R.string.bns_phone);
                            intent.putExtra("phone",phone);
                            startActivity(intent);
                        }
                        if(which==1){
                            Intent intent=new Intent(EducationActivity.this,EducationInfoActivity.class);
                            String address=getString(R.string.ghps_address);
                            intent.putExtra("address",address);
                            String website=getString(R.string.ghps_website);
                            intent.putExtra("website",website);
                            String phone=getString(R.string.ghps_phone);
                            intent.putExtra("phone",phone);
                            startActivity(intent);
                        }


                    }
                });
                builder.show();
            }
        });


        secondaryschool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] schools = {"Government High School" ,"Holy Saviour English High School"};

                AlertDialog.Builder builder = new AlertDialog.Builder(EducationActivity.this);
                builder.setTitle("Select type");
                builder.setItems(schools, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if(which==0){
                            Intent intent=new Intent(EducationActivity.this,EducationInfoActivity.class);
                            String address=getString(R.string.ghs_address);
                            intent.putExtra("address",address);
                            String website=getString(R.string.ghs_website);
                            intent.putExtra("website",website);
                            String phone=getString(R.string.ghs_phone);
                            intent.putExtra("phone",phone);
                            startActivity(intent);
                        }
                        if(which==1){
                            Intent intent=new Intent(EducationActivity.this,EducationInfoActivity.class);
                            String address=getString(R.string.hses_address);
                            intent.putExtra("address",address);
                            String website=getString(R.string.hses_website);
                            intent.putExtra("website",website);
                            String phone=getString(R.string.hses_phone);
                            intent.putExtra("phone",phone);
                            startActivity(intent);
                        }



                    }
                });
                builder.show();

            }
        });
    }
}
