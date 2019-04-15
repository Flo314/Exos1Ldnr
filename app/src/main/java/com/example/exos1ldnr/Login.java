package com.example.exos1ldnr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private EditText username;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);

    }

    protected void loginButtonClicked(View view){
        Toast.makeText(this, username.getText() + " " + password.getText() + " : You clicked !", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, ListActivity.class);
        startActivity(intent);
    }
}
