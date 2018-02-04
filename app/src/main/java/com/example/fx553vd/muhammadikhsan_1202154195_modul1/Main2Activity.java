package com.example.fx553vd.muhammadikhsan_1202154195_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String Sajian = intent.getStringExtra("Sajian");
        String jporsi = intent.getStringExtra("jporsi");
        String ResMkn = intent.getStringExtra("ResMkn");
        TextView textmakanan = findViewById(R.id.NamaMakanan);
        TextView Jmlh = findViewById(R.id.Jumlah);
        TextView ResEatbos = findViewById(R.id.RumahMakan2);
        TextView Hitung = findViewById(R.id.Jumlah2);
        int AB = Integer.parseInt(jporsi);

        int HargaEatbus = 50000 * AB;
        String BC = String.valueOf(HargaEatbus);

        int CD = Integer.parseInt(jporsi);
        int HargaAbnormal = 30000 * CD;
        String DE = String.valueOf(HargaAbnormal);


        if (ResMkn.equalsIgnoreCase("EATBUS")) {
            int uang = 65500;
            if (HargaEatbus > uang) {

                textmakanan.setText(Sajian);
                Jmlh.setText(jporsi);
                ResEatbos.setText(ResMkn);
                Hitung.setText(BC);
                Toast.makeText(this, "Jangan makan disini makan malamnya , uang kamu tidak cukup", Toast.LENGTH_LONG).show();
            } else {
                textmakanan.setText(Sajian);
                Jmlh.setText(jporsi);
                ResEatbos.setText(ResMkn);
                Hitung.setText(BC);
                Toast.makeText(this, "disini aja makan malamnya", Toast.LENGTH_LONG).show();
            }

        } else {
            int uang = 65500;
            if (HargaAbnormal > uang) {

                textmakanan.setText(Sajian);
                Jmlh.setText(jporsi);
                ResEatbos.setText(ResMkn);
                Hitung.setText(DE);
                Toast.makeText(this, "Jangan makan disini makan malamnya , uang kamu tidak cukup", Toast.LENGTH_LONG).show();
            } else {
                textmakanan.setText(Sajian);
                Jmlh.setText(jporsi);
                ResEatbos.setText(ResMkn);
                Hitung.setText(DE);
                Toast.makeText(this, "disini aja makan malamnya", Toast.LENGTH_LONG).show();
            }
        }

    }

}