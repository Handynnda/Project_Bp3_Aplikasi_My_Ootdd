package com.example.aplikasimyootdd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class form_baju extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_baju);

        ImageView iconback = findViewById(R.id.imageView);
        iconback.setOnClickListener(view -> {
            Intent intent = new Intent(form_baju.this, DashboardUtama.class);
            startActivity(intent);
        });

        for (int i = 1; i <= 12; i++) {
            int bajuId = getResources().getIdentifier("baju" + i, "id", getPackageName());
            int namabId = getResources().getIdentifier("namab" + i, "id", getPackageName());
            int hargabId = getResources().getIdentifier("hargab" + i, "id", getPackageName());

            ImageView baju = findViewById(bajuId);
            TextView namab = findViewById(namabId);
            TextView hargab = findViewById(hargabId);

            if (baju != null && namab != null && hargab != null) {
                baju.setOnClickListener(view -> {
                    String namaProduk = namab.getText().toString();
                    String hargaString = hargab.getText().toString();

                    double hargaProduk = 0;
                    try {
                        String cleanHarga = hargaString.replaceAll("[^\\d]", "");
                        hargaProduk = Double.parseDouble(cleanHarga);
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }

                    Intent intent = new Intent(form_baju.this, Form_Pembayaran.class);
                    intent.putExtra("namaProduk", namaProduk);
                    intent.putExtra("hargaProduk", hargaProduk);
                    startActivity(intent);
                });
            }
        }
    }
}
