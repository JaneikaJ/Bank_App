package com.example.banking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.log);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenLogin();
            }
        });
    }
    public void OpenLogin(){
        Intent intent = new Intent(this, login.class);
        startActivity(intent);

        button = (Button) findViewById(R.id.sign);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenSignup();
            }
        });
    }
    public void OpenSignup(){
        Intent intent = new Intent(this, signup.class);
        startActivity(intent);
    }
}