package com.example.project_village;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CmrActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmr);
        Button cmrit=findViewById(R.id.activity_cmr_cmrit);
        Button cmru=findViewById(R.id.activity_cmr_cmr_university);
        Button cmrim=findViewById(R.id.activity_cmr_institute_of_mgmnt);
        Button cmrlaw=findViewById(R.id.activity_cmr_legal);
        Button cmrskill=findViewById(R.id.activity_cmr_skills);
        Button cmrbussiness=findViewById(R.id.activity_cmr_bussiness);
        Button ekyaschl=findViewById(R.id.activity_cmr_ekya_plus_2);
        Button ekyabtm=findViewById(R.id.activity_cmr_ekya_btm);
        Button ekyakanakpura=findViewById(R.id.activity_cmr_ekya_kanakpura);
        Button ekyajpnagar=findViewById(R.id.activity_cmr_ekya_jpnagar);
        Button cmrhigh=findViewById(R.id.activity_cmr_high_school);
        Button cmrpu=findViewById(R.id.activity_cmr_pu_colledge);
        Button cmrnps=findViewById(R.id.activity_cmr_national_public_school);
        Button npsint=findViewById(R.id.activity_cmr_nps_international);


        cmrit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CmrActivity.this,CmrInfoActivity.class);
                intent.putExtra("information","Affiliated to Visvesvaraya Technological University\n" +
                        "Recognised by Govt. of Karnataka\n" +
                        "Approved by AICTE, New Delhi\n" +
                        "NBA Accreditation with 'A+' Grade");
                intent.putExtra("website","http://cmrit.ac.in/");
                startActivity(intent);
            }
        });
        cmru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CmrActivity.this,CmrInfoActivity.class);
                intent.putExtra("information","Private University Established in Karnataka State by Act No. 45 of 2013");
                intent.putExtra("website","http://cmr.edu.in/");
                startActivity(intent);
            }
        });
        cmrim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CmrActivity.this,CmrInfoActivity.class);
                intent.putExtra("information","Affiliated to Bangalore University\n" +
                        "Recognised by Govt. of Karnataka\n" +
                        "Approved by AICTE, New Delhi,\n" +
                        "Re-Accreditation by NAAC with ‘A’ Grade\n" +
                        "Status: Autonomous since 2009");
                intent.putExtra("website"," http://ims.cmr.ac.in/");
                startActivity(intent);
            }
        });
        cmrlaw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CmrActivity.this,CmrInfoActivity.class);
                intent.putExtra("information","Formerly CMR Law School");
                intent.putExtra("website","http://ls.cmr.ac.in/");
                startActivity(intent);
            }
        });
        cmrskill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CmrActivity.this,CmrInfoActivity.class);
                intent.putExtra("information","Promoted by CMR Jnanadhara Trust");
                intent.putExtra("website"," http://www.cmr.ac.in/lifeskills/");
                startActivity(intent);
            }
        });
        cmrbussiness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CmrActivity.this,CmrInfoActivity.class);
                intent.putExtra("information","Affiliated to Bangalore University\n" +
                        "Approved by AICTE, New Delhi\n" +
                        "Recognised by Govt. of Karnataka");
                intent.putExtra("website","http://cmrcbs.cmr.ac.in/");
                startActivity(intent);
            }
        });
        ekyaschl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CmrActivity.this,CmrInfoActivity.class);
                intent.putExtra("information","Affiliated to Central Board of Secondary Education (CBSE), New Delhi\n" +
                        "Approved by Govt. of Karnataka");
                intent.putExtra("website","http://www.ekyaschools.com/itpl");
                startActivity(intent);
            }
        });
        ekyajpnagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CmrActivity.this,CmrInfoActivity.class);
                intent.putExtra("information","Affiliated to Indian Certificate of Secondary Examination (ICSE), New Delhi\n" +
                        "Approved by Govt. of Karnataka");
                intent.putExtra("website","http://www.ekyaschools.com/jpnagar/");
                startActivity(intent);
            }
        });
        ekyabtm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CmrActivity.this,CmrInfoActivity.class);
                intent.putExtra("information","Launched in 2016.");
                intent.putExtra("website","http://www.ekyaschools.com/btm/");
                startActivity(intent);
            }
        });
        ekyakanakpura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CmrActivity.this,CmrInfoActivity.class);
                intent.putExtra("information","Extended Preschool & Montessori Campus");
                intent.putExtra("website","N/A");
                startActivity(intent);
            }
        });
        cmrhigh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CmrActivity.this,CmrInfoActivity.class);
                intent.putExtra("information","Affiliated to Karnataka Secondary Education Examination Board (KSEEB)\n" +
                        "Recognised by Govt. of Karnataka");
                intent.putExtra("website","N/A");
                startActivity(intent);
            }
        });
        cmrpu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CmrActivity.this,CmrInfoActivity.class);
                intent.putExtra("information","Approved by Karnataka Pre-University Education Board");
                intent.putExtra("website"," http://npuc.cmr.ac.in/");
                startActivity(intent);
            }
        });
        cmrnps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CmrActivity.this,CmrInfoActivity.class);
                intent.putExtra("information","Affiliated to Central Board of Secondary Education (CBSE), New Delhi\n" +
                        "Approved by Govt. of Karnataka");
                intent.putExtra("website","http://nps.cmr.ac.in/");
                startActivity(intent);
            }
        });
        npsint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CmrActivity.this,CmrInfoActivity.class);
                intent.putExtra("information","CBSE / CBSE International\n" +
                        "IGCSE (University of Cambridge, UK)\n" +
                        "IB (IBO, Switzerland)");
                intent.putExtra("website","http://www.npsinternational.com.sg/");
                startActivity(intent);
            }
        });



    }
}
