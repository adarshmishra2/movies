package com.example.abhishekpc.movies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class horror extends MainActivity {
    ListView l2 ;
    String[] horror={"Phook","Bhootnath","The Ring","Raaz","Horror story"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horror);
        l2= (ListView) findViewById(R.id.listView3);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,horror);
        l2.setAdapter(adapter);
    }
}
