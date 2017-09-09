package com.example.abhishekpc.movies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class action extends MainActivity {
    ListView l3 ;
    String[] action={"Wanted","Dabangg","Dhoom2","Ek tha Tiger","Race2","Krrish","Singham"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action);
        l3= (ListView) findViewById(R.id.listView4);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,action);
        l3.setAdapter(adapter);
    }
}
