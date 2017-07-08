package com.example.archit.androidtutorial;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        SharedPreferences sp = getSharedPreferences("My_Sp",MODE_PRIVATE);
//        String check_null = sp.getString("USERNAME",null);
//
//        if(check_null != null){
//            startActivity(new Intent(LoginActivity.this,FirstActivity.class));
//        }
        setContentView(R.layout.activity_login);
    }

    public void login(View v){

        EditText username = (EditText) findViewById(R.id.username);
        EditText password = (EditText) findViewById(R.id.password);

        String entered_usr = username.getText().toString();
        String entered_pass = password.getText().toString();

        SharedPreferences sp = getSharedPreferences("My_Sp",MODE_PRIVATE);
        String stored_usr = sp.getString("USERNAME",null);
        String stored_pass = sp.getString("PASSWORD",null);

        if(entered_usr.equals(stored_usr)){
            if (entered_pass.equals(stored_pass)) {
                startActivity(new Intent(LoginActivity.this,FirstActivity.class));
            }
            else{
                Toast.makeText(this, "Invalid Credentials !", Toast.LENGTH_SHORT).show();
            }
        }
        else{
            Toast.makeText(this, "Invalid Credentials !", Toast.LENGTH_SHORT).show();
        }

        finish();

    }

    public void register(View v){
        startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
        finish();
    }

    public void skip(View v){
        startActivity(new Intent(LoginActivity.this,FirstActivity.class));

        finish();
    }
}
