package com.example.abhishekpc.movies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class thriller extends MainActivity {
    ListView l4 ;
    String[] thriller={"A Wednesday","Taalash","Kartik Calling Kartik","Special 26","NH10"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thriller);
        l4= (ListView) findViewById(R.id.listView5);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,thriller);
        l4.setAdapter(adapter);
    }
}
