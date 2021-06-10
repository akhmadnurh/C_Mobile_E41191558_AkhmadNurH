package com.akhmadnur.extintentapp
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//    Deklarasi Variable
    EditText name;
    Button btnSend;

    private String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//      Menentukan View berdasarkan id
        name = findViewById(R.id.edt_nama);
        btnSend = findViewById(R.id.btn_send);

//        Event handler
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = name.getText().toString();
//                Exception
                try {
                    if(nama != ""){
//                        Menuju intent selanjutnya
                        Intent i = new Intent(MainActivity.this, ActivitySecond.class);
                        i.putExtra(KEY_NAME, nama);
                        startActivity(i);
                    }else{
//                        Menampilkan toast
                        Toast.makeText(getApplication(), "YOU NEED TO FILL YOUR NAME", Toast.LENGTH_SHORT);
                    }
                }catch (Exception e){
//                    Menampilkan exception dan toast error
                    e.printStackTrace();
                    Toast.makeText(getApplication(), "ERROR, TRY AGAIN!", Toast.LENGTH_SHORT);
                }

            }
        });
    }
}