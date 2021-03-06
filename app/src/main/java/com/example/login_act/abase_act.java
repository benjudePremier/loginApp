package com.example.login_act;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.UUID;

import Models.Clientes;

public class abase_act extends AppCompatActivity {
    private EditText ednombre, eddestino, edpromocion;
    private Button btn;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abase_act);

        ednombre=(EditText)findViewById(R.id.etnombre);
        eddestino=(EditText)findViewById(R.id.etdestino);
        edpromocion=(EditText)findViewById(R.id.etpromocion);
        btn=(Button)findViewById(R.id.bt1);

        InicializarFirebase();

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                if (!ednombre.equals("")) {


                    Clientes c = new Clientes();

                    c.setId(UUID.randomUUID().toString());
                    c.setNombre(ednombre.getText().toString());
                    c.setDestino(eddestino.getText().toString());
                    c.setPromocion(edpromocion.getText().toString());

                    databaseReference.child("Clientes").child(c.getId()).setValue(c);

                    Toast.makeText(getBaseContext(),"No se ha guardado un cliente",Toast.LENGTH_LONG).show();



                }else{
                    Toast.makeText(getBaseContext(),"No se ha guardado",Toast.LENGTH_LONG).show();
                }


            }
        });
    }
    // Obtendo la intencia de mi base de datos cloud
    public void InicializarFirebase()
    {
        FirebaseApp.initializeApp(this);
        firebaseDatabase= FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();
    }
    public void listado (View v){
        Intent i = new Intent(this,listado_act.class);
        startActivity(i);

    }
}