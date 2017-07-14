package com.isaacmiguelsg.tt.tuzo_time;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class HorarioAlimentadora extends AppCompatActivity {
    TextView Alimentadora;
    public int Asegundos, Aminutos, Ahora;
    public int tres;
    public Spinner SAlimentadora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horario_alimentadora);
        Alimentadora = (TextView) findViewById(R.id.Alimentadora);
        SAlimentadora = (Spinner) findViewById(R.id.SAlimentadora);
        String []opciones={"Ruta 01", "Ruta 02a", "Ruta 02b", "Ruta 02c", "Ruta 03", "Ruta 04", "Ruta 05", "Ruta 06", "Ruta 07", "Ruta 08", "Ruta 09", "Ruta 10", "Ruta 11", "Ruta 12", "Ruta 13", "Ruta 14", "Ruta 15a", "Ruta 15b", "Ruta 15c", "Ruta 16", "Ruta 17"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, opciones);
        SAlimentadora.setAdapter(adapter);


        tres = 900000;
        Asegundos = tres / 1000;
        Asegundos = 20;
        Asegundos = (tres - 700000) / 1000;

        while(Asegundos >= 60){
            Aminutos++;
            Asegundos = Asegundos - 60;
        }

        new CountDownTimer(tres, 1000) {
            public void onTick(long millisUntilFinished) {
                if (Asegundos <= 0) {
                    Asegundos = 60;
                    Aminutos--;
                }
                Asegundos--;
                if (Asegundos <= 9 && Aminutos <= 9) {
                    Alimentadora.setText(Ahora + ":0" + Aminutos + ":0" + Asegundos);
                } else if (Aminutos <= 9 && Asegundos > 10) {
                    Alimentadora.setText(Ahora + ":0" + Aminutos + ":" + Asegundos);
                } else if (Aminutos > 10 && Asegundos <= 9) {
                    Alimentadora.setText(Ahora + ":" + Aminutos + ":0" + Asegundos);
                }
            }
            public void onFinish() {
                Alimentadora.setText("En Parada");
            }
        }.start();
    }
}
