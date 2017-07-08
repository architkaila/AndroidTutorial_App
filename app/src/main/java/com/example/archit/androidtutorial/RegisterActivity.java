package com.example.archit.androidtutorial;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void submit(View v){

        EditText usr = (EditText) findViewById(R.id.usr);
        EditText pass = (EditText) findViewById(R.id.pass);

        String entered_usr = usr.getText().toString();
        String entered_pass = pass.getText().toString();

        SharedPreferences sp = getSharedPreferences("My_Sp",MODE_PRIVATE);
        SharedPreferences.Editor e = sp.edit();

        e.putString("USERNAME",entered_usr);
        e.putString("PASSWORD",entered_pass);

        e.commit();

        startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
        finish();
    }
}

