package com.example.fabiansebban.firstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    // Permet d'initialiser l'appli
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Délancher quand l'utilisateur quitte l'appli
    protected void onPause(Bundle savedInstanceState) {

    }
}
