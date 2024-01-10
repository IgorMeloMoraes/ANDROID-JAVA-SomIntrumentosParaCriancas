package com.example.intrumentosparacriancas;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Variavel para acessar as medias
    MediaPlayer mpViolao, mpGuitarra,mpBaixo, mpTeclado, mpPiano, mpBateria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Hooks
        mpViolao = MediaPlayer.create(MainActivity.this, R.raw.violao);
        mpGuitarra = MediaPlayer.create(MainActivity.this, R.raw.guitarra);
        mpBaixo = MediaPlayer.create(MainActivity.this, R.raw.baixo);
        mpTeclado = MediaPlayer.create(MainActivity.this, R.raw.teclado);
        mpBateria = MediaPlayer.create(MainActivity.this, R.raw.bateria);
        mpPiano = MediaPlayer.create(MainActivity.this, R.raw.piano);
    }

    public void violao(View view){
        mpViolao.start();
    }

    public void guitarra(View view){
        mpGuitarra.start();
    }

    public void baixo(View view){
        mpBaixo.start();
    }

    public void teclado(View view){
        mpTeclado.start();
    }

    public void bateria(View view){
        mpBateria.start();
    }

    public void piano(View view){
        mpPiano.start();
    }
}