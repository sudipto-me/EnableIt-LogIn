package com.example.sudipto.logindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    String messageName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void btnLogIn(View view){

        Intent logInIntent = new Intent(MainActivity.this,UserLoginActivity.class);

        EditText userName = (EditText)findViewById(R.id.et_user_name);
        String name = userName.getText().toString();

        EditText passWord = (EditText)findViewById(R.id.et_pass_word);
        String pass = passWord.getText().toString();

        logInIntent.putExtra(EXTRA_MESSAGE,name);
        startActivity(logInIntent);

    }

}




