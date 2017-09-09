package com.example.abhishekpc.movies;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ListMenuItemView;
import android.support.v7.widget.ListViewCompat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class secondactivity extends MainActivity {
    ListView l ;
    String[] comedy={"All is well","Pk","3 Idiot","Golmaal","Phir Hera Pheri","Bhagambhag","Welcome"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
l= (ListView) findViewById(R.id.listView1);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,comedy);
        l.setAdapter(adapter);

    }

}
