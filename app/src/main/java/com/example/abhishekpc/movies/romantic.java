package com.example.abhishekpc.movies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class romantic extends MainActivity {
    ListView l1 ;
    String[] romantic={"Mohabbatein","Aashiqui","Luv story","Pyaar ka punchnama","Raanjhana","Jab tak hai jaan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_romantic);
        l1= (ListView) findViewById(R.id.listView2);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,romantic);
        l1.setAdapter(adapter);

    }
}
