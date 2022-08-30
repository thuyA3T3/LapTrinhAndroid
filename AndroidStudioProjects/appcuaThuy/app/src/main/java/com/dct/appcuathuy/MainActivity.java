package com.dct.appcuathuy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Object MainActivity2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}

        setContentView(R.layout.activity_main);
    }
    public void onButtonClick(View view){
      EditText name = (EditText)findViewById(R.id.editTextTextPersonName);
      EditText passwor = (EditText)findViewById(R.id.editTextTextPassword);
        if ((name.getText().toString().equals("Admin")) && (passwor.getText().toString().equals("123"))){
            Intent intent = new Intent(MainActivity.this,MainActivity2.class);startActivity(intent);
        }
    }

}