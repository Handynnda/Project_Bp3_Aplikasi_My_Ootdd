package com.example.aplikasimyootdd;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardUtama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_utama);

        LinearLayout buttonBertanya = findViewById(R.id.buttonBertanya);
        buttonBertanya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardUtama.this, Form_Admin.class);
                startActivity(intent);
            }
        });

        LinearLayout buttonLokasi = findViewById(R.id.buttonLokasi);
        buttonLokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mapsUrl = "https://maps.app.goo.gl/gnanWXipAhydj5Qe7?g_st=com.google.maps.preview.copy";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(mapsUrl));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });


        TextView textLogout = findViewById(R.id.textLogout);
        textLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardUtama.this, FormLogin.class);
                startActivity(intent);
                finish();
            }
        });

        LinearLayout buttonBaju = findViewById(R.id.bottombaju);
        buttonBaju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardUtama.this, form_baju.class);
                startActivity(intent);
            }
        });

        LinearLayout buttonJaket = findViewById(R.id.bottomjaket);
        buttonJaket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardUtama.this, form_jaket.class);
                startActivity(intent);
            }
        });

        LinearLayout buttonSepatu = findViewById(R.id.bottomsepatu);
        buttonSepatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardUtama.this, form_sepatu.class);
                startActivity(intent);
            }
        });

        LinearLayout buttonCelana = findViewById(R.id.bottomcelana);
        buttonCelana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardUtama.this, form_celana.class);
                startActivity(intent);
            }


        });
    }
}
