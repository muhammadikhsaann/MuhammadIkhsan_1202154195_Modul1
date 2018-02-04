package com.example.fx553vd.muhammadikhsan_1202154195_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText GantiMenu;
    private EditText Jumlah;
    private Button ResEatbus;
    private Button ResAbnormal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GantiMenu = findViewById(R.id.Psn);
        Jumlah = findViewById(R.id.Jp);
        ResEatbus = findViewById(R.id.button_eatbus);
        ResAbnormal = findViewById(R.id.button_abnormal);


    }

    public void Eatbus(View view) {
        Intent intent = new Intent(this, Main2Activity.class);

        String Sajian = GantiMenu.getText().toString();
        String jporsi = Jumlah.getText().toString();
        String ResMkn = ResEatbus.getText().toString();


        intent.putExtra("Sajian", Sajian);
        intent.putExtra("jporsi", jporsi);
        intent.putExtra("ResMkn", ResMkn);

        startActivity(intent);
    }

    public void Abnormal(View view) {

        Intent intent = new Intent(this, Main2Activity.class);

        String Sajian = GantiMenu.getText().toString();
        String jporsi = Jumlah.getText().toString();
        String ResMkn = ResAbnormal.getText().toString();


        intent.putExtra("Sajian", Sajian);
        intent.putExtra("jporsi", jporsi);
        intent.putExtra("ResMkn", ResMkn);

        startActivity(intent);
    }
}