package com.erenyilmaz.gradefinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void go_first(View view){
        Intent i = new Intent(this, first_type.class);
        startActivity(i);
    }
    public void go_second(View view){
        Intent i = new Intent(this, second_type.class);
        startActivity(i);
    }
    public void go_third(View view){
        Intent i = new Intent(this, third_type.class);
        startActivity(i);
    }
    public void go_fourth(View view){
        Intent i = new Intent(this, fourth_type.class);
        startActivity(i);
    }

    public void go_fifth(View view){
        Intent i = new Intent(this, fifth_type.class);
        startActivity(i);
    }

    public void go_sixth(View view){
        Intent i = new Intent(this, sixth_type.class);
        startActivity(i);
    }

    public void go_seventh(View view){
        Intent i = new Intent(this, seventh_type.class);
        startActivity(i);
    }
}