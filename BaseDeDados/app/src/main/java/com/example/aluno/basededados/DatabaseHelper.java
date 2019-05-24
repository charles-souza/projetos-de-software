package com.example.aluno.basededados;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by aluno on 30/04/2019.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String BANCO_DADOS = "MeuBanco";
    private static int VERSAO = 1;

    public DatabaseHelper(Context context) {
        super(context, BANCO_DADOS, null, VERSAO);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        String ddl = "CREATE TABLE PESSOA(" +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nome TEXT NOT NULL;";

        db.execSQL(ddl);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        String ddl = "ALTER TABLE PESSOA ADD COLUMN sobrenome TEXT;";

        db.execSQL(ddl);
    }
}
