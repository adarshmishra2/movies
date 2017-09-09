package com.example.abhishekpc.movies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class truestory extends MainActivity {
    ListView l5 ;
    String[] truestory={"Talvaar","Rustom","Bhaag Milkha Bhaag","M.S.dhoni","Sachin","Shoot out at lokhandwala","attack on 26/11"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_truestory);
        l5= (ListView) findViewById(R.id.listView6);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,truestory);
        l5.setAdapter(adapter);
    }
}
