package com.example.login_act;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    // Decalaraciones de varaiables
    private EditText editText;
    private EditText editText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Aqui llamo los  elemntos por id
        editText = (EditText) findViewById(R.id.edit);
        editText1 = (EditText) findViewById(R.id.edit1);
    }

    public void IniciarSession(View v) {
        if (editText.getText().toString().equals("Android") && editText1.getText().toString().equals("123")) {
            Intent i = new Intent(this, menu_act.class);
            startActivity(i);
        }
    }
}
