package com.akhmadnur.extintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivitySecond extends AppCompatActivity {
//    Deklarasi variable
    TextView txtHello;
    private String nama;
    private String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
//        Menentukan View berdasarkan id
        txtHello = findViewById(R.id.txtHello);

//      Mendapatkan extras
        Bundle extras = getIntent().getExtras();
        nama = extras.getString(KEY_NAME);

//        Menampilkan kalimat
        txtHello.setText("Hello, " + nama + " !");
    }
}