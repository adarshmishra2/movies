package com.example.abhishekpc.movies;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.view.View.OnClickListener;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radio;
    private RadioButton radiobutton,rb1,rb2,rb3,rb4,rb5,rb6;
    private Button btndisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radio=(RadioGroup) findViewById(R.id.radiogroup);
        rb1= (RadioButton) findViewById(R.id.comedy);
        rb2= (RadioButton) findViewById(R.id.romantic);
        rb3= (RadioButton) findViewById(R.id.horror);
        rb4= (RadioButton) findViewById(R.id.action);
        rb5= (RadioButton) findViewById(R.id.thriller);
        rb6= (RadioButton) findViewById(R.id.truestory);
        final Context context = this;
       btndisplay= (Button) findViewById(R.id.select);
        btndisplay.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId=radio.getCheckedRadioButtonId();
                radiobutton=(RadioButton)findViewById(selectedId);
                Toast.makeText(MainActivity.this,radiobutton.getText(),Toast.LENGTH_SHORT).show();
                    if (rb1.isChecked()) {

                        Intent intent = new Intent(context, secondactivity.class);
                        startActivity(intent);
                    }
                    else if(rb2.isChecked()){

                        Intent intent=new Intent(context, romantic.class);
                        startActivity(intent);
                    }
                    else if (rb3.isChecked()){

                        Intent intent=new Intent(context, horror.class);
                        startActivity(intent);
                    }
                    else if (rb4.isChecked()){

                        Intent intent=new Intent(context, action.class);
                        startActivity(intent);
                    }
                    else if (rb5.isChecked()){

                        Intent intent=new Intent(context, thriller.class);
                        startActivity(intent);
                    }
                    else if (rb6.isChecked()){

                        Intent intent=new Intent(context, truestory.class);
                        startActivity(intent);
                    }}

        });





    }
}
