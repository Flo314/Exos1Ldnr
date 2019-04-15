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
        // récupération des entré clavier
        String enterLog = username.getText().toString();
        String enterPwd = password.getText().toString();
        // comparaison entré clavier avec les ressources
        if(enterLog.equals(getResources().getString(R.string.valueUsername)) && enterPwd.equals(getResources().getString(R.string.valuePassword))){
            Intent intent = new Intent(this, ListActivity.class);
            startActivity(intent);
            // si entré clavier == chaîne vide
        }else if(enterLog.matches("") && enterPwd.matches("")) {
            Toast.makeText(this, "Veuillez remplir tous les champs", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Le login ou le mot de passe est incorrect", Toast.LENGTH_SHORT).show();
        }

    }
}
