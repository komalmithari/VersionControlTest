package com.example.versioncontroltest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Successful", Toast.LENGTH_SHORT).show();

        for (int i=0 ; i<10 ; i++)
        {
            Toast.makeText(this, i, Toast.LENGTH_SHORT).show();
        }




    }
}
