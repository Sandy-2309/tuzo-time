package com.isaacmiguelsg.tt.tuzo_time;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class QuejasSugerencias extends AppCompatActivity {
    EditText mensaje;
    public TextView mensajes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quejas_sugerencias);
        mensaje = (EditText) findViewById(R.id.Mensaje);
        mensajes = (TextView) findViewById(R.id.Mensajes);

    }

    public void Enviar(View view){
        mensajes.setText(mensajes.getText() + "\n" + mensaje.getText());
        mensaje.setText("");
    }
}
