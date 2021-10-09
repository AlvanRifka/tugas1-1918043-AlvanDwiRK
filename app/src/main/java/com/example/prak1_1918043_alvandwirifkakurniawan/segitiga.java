package com.example.prak1_1918043_alvandwirifkakurniawan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class segitiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        final EditText alas = (EditText)findViewById(R.id.txt_alas);
        final EditText tinggi = (EditText)findViewById(R.id.txt_tinggi);
        final TextView luas = (TextView)findViewById(R.id.txt_luas);
        final Button tampil = (Button)findViewById(R.id.btn_hitung);

        tampil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String alas1 = alas.getText().toString();
                String tinggi1 = tinggi.getText().toString();
                double a = Double.parseDouble(alas1);
                double t = Double.parseDouble(tinggi1);
                double l = 0.5*a*t;
                String output = String.valueOf(l);
                luas.setText(output.toString());

            }
        });
    }
}