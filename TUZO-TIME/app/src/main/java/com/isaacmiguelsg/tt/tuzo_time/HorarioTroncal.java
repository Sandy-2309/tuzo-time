package com.isaacmiguelsg.tt.tuzo_time;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HorarioTroncal extends AppCompatActivity {
    public int  T02hora = 0, T02minutos = 0, T02segundos = 0;
    public int  T04hora = 0, T04minutos = 0, T04segundos = 0;
    public int  T05hora = 0, T05minutos = 0, T05segundos = 0;
    public int tres;
    public long msegundo;
    public TextView T05, T04, T02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horario_troncal);
        T02 = (TextView) findViewById(R.id.txtT02);
        T04 = (TextView) findViewById(R.id.txtT04);
        T05 = (TextView) findViewById(R.id.txtT05);


        tres = 70000;
        T02segundos = tres / 1000;
        T04segundos = tres / 1000;
        T05segundos = tres / 1000;

        while(T02segundos >= 60){
            T02minutos++;
            T02segundos = T05segundos - 60;
        }

        while(T04segundos >= 60){
            T04minutos++;
            T04segundos = T05segundos - 60;
        }

        while(T05segundos >= 60){
            T05minutos++;
            T05segundos = T05segundos - 60;
        }

        new CountDownTimer(tres, 1000) {
            public void onTick(long millisUntilFinished) {
                if(T02segundos <= 0){
                    T02segundos = 60;
                    T02minutos--;
                }
                T02segundos--;
                if(T02segundos <= 9 && T02minutos <= 9){
                    T02.setText(T02hora + ":0" + T02minutos + ":0" + T02segundos);
                } else if(T02minutos <= 9 && T02segundos > 10){
                    T02.setText(T02hora + ":0" + T02minutos + ":" + T02segundos);
                } else if(T05minutos >10 && T05segundos <= 9){
                    T02.setText(T02hora + ":" + T02minutos + ":0" + T02segundos);
                }


                if(T04segundos <= 0){
                    T04segundos = 60;
                    T04minutos--;
                }
                T04segundos--;
                if(T04segundos <= 9 && T04minutos <= 9){
                    T04.setText(T04hora + ":0" + T04minutos + ":0" + T04segundos);
                } else if(T04minutos <= 9 && T04segundos > 10){
                    T04.setText(T04hora + ":0" + T04minutos + ":" + T04segundos);
                } else if(T04minutos >10 && T04segundos <= 9){
                    T04.setText(T04hora + ":" + T04minutos + ":0" + T04segundos);
                }


                if(T05segundos <= 0){
                    T05segundos = 60;
                    T05minutos--;
                }
                T05segundos--;
                if(T05segundos <= 9 && T05minutos <= 9){
                    T05.setText(T05hora + ":0" + T05minutos + ":0" + T05segundos);
                } else if(T05minutos <= 9 && T05segundos > 10){
                    T05.setText(T05hora + ":0" + T05minutos + ":" + T05segundos);
                } else if(T05minutos >10 && T05segundos <= 9){
                    T05.setText(T05hora + ":" + T05minutos + ":0" + T05segundos);
                }
            }
            public void onFinish() {
                T05.setText("En Estación");
            }
        }.start();
    }
}
