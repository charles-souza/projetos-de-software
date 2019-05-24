package com.example.aluno.basededados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BaseDeDados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_de_dados);

        DatabaseHelper bd = new DatabaseHelper(this);
    }
}
