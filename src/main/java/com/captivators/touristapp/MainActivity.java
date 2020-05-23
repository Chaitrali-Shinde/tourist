package com.captivators.touristapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_up;
    Button btn_rajasthan;
    Button btn_delhi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_delhi= (Button)findViewById(R.id.DelhiButton);
        btn_rajasthan= (Button)findViewById(R.id.RajasthanButton);
        btn_up= (Button)findViewById(R.id.UPButton);

        btn_rajasthan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLocationActivity();
            }
        });
        btn_delhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDelhiActivity();
            }
        });
        btn_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUPActivity();
            }
        });


    }

    public  void openLocationActivity(){
        Intent intend= new Intent(this, places.class);
        startActivity(intend);
    }

    public  void openDelhiActivity(){
        Intent intend= new Intent(this, capital.class);
        startActivity(intend);
    }
    public  void openUPActivity(){
        Intent intend= new Intent(this, answer.class);
        startActivity(intend);
    }



}
