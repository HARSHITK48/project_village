package com.example.project_village;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

public class BusActivity extends AppCompatActivity {


    TextView name;
    private RecyclerView bus;
    private RecyclerView.Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus);

        name=findViewById(R.id.activit_bus_name_textview);
        name.setText(R.string.bus_name);
        ArrayList<Bus> bus=initBus();
        this.bus=findViewById(R.id.activity_bus_recycler_view);
        RecyclerView.LayoutManager layoutManager =new LinearLayoutManager(this);
        //RecyclerView.addItemDecoration(new DividerItemDecoration(this,
         //       DividerItemDecoration.HORIZONTAL));
       // RecyclerView.addItemDecoration(new DividerItemDecoration(this,
        //        DividerItemDecoration.VERTICAL));
        this.bus.setLayoutManager(layoutManager);

        adapter=new BusAdapter(bus);
        this.bus.setAdapter(adapter);


    }
    private ArrayList<Bus> initBus() {
        ArrayList<Bus> list = new ArrayList<>();

        list.add(new Bus("Yelahanka Old Town  (289-L)  ", "7:16 pm"));
        list.add(new Bus("KR Market   (308-B)", "8:25 pm"));
        list.add(new Bus("MVJ Medical Hospital   (289-L) ", " 9:08 pm"));
        list.add(new Bus("KR Market  (308-B)", "4:25 am"));
        list.add(new Bus("KR Market  (308-B)", "6:15 am"));
        list.add(new Bus("Kempegowda Bus Station  (308-A)", "7:05 am"));
        list.add(new Bus("Yelahanka Old Town     (289-L) ", "7:26 am"));
        list.add(new Bus("MVJ Medical Hospital   (289-L)", " 9:18 am"));
        list.add(new Bus("KR Market   (308-B)", " 9:35 am"));
        list.add(new Bus("Yelahanka Old Town      (289-L)", " 9:46 am"));
        list.add(new Bus("KR Puram Market       (12F-4)", "10:00 am"));
        list.add(new Bus("Yelahanka Old Town     (289-L) ", "10:01 am"));
        list.add(new Bus("KR Puram Market       (12F-4)", "10:30 am"));
        list.add(new Bus("MVJ Medical Hospital   (289-L) ", " 11:33 am"));
        list.add(new Bus("KR Puram Market       (12F-4)", "1:00 pm"));
        list.add(new Bus("Yelahanka Old Town     (289-L) ", "1:11 pm"));
        list.add(new Bus("Kempegowda Bus Station  (308-A)", "3:05 pm"));
        list.add(new Bus("KR Puram Market       (12F-4)", "2:30 pm"));
        list.add(new Bus("MVJ Medical Hospital   (289-L) ", "2:33 pm"));
        list.add(new Bus("KR Puram Market       (12F-4)", "4:25 pm"));
        list.add(new Bus("Yelahanka Old Town     (289-L) ", "4:36 pm"));
        list.add(new Bus("MVJ Medical Hospital   (289-L)", " 5:33 pm"));
        list.add(new Bus("KR Puram Market       (12F-4)", "5:55 pm"));
        list.add(new Bus("Kempegowda Bus Station  (308-A)", "6:45 pm"));



        return list;
    }
}
