package com.example.aplikasimyootdd;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class form_celana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_celana);

        ImageView iconback = findViewById(R.id.imageView);
        iconback.setOnClickListener(view -> {
            Intent intent = new Intent(form_celana.this, DashboardUtama.class);
            startActivity(intent);
        });

        // Daftar harga yang berbeda untuk setiap celana
        double[] hargaCelana = {
                75000, 85000, 65000, 95000, 70000,
                88000, 73000, 80000, 92000, 67000,
                89000, 72000
        };

        for (int i = 1; i <= 12; i++) {
            int celanaId = getResources().getIdentifier("celana" + i, "id", getPackageName());
            int namacId = getResources().getIdentifier("namac" + i, "id", getPackageName());
            int hargacId = getResources().getIdentifier("hargac" + i, "id", getPackageName());

            ImageView celana = findViewById(celanaId);
            TextView namac = findViewById(namacId);
            TextView hargac = findViewById(hargacId);

            if (celana != null && namac != null && hargac != null) {
                // Set harga dari array ke TextView
                String hargaFormatted = String.format("Rp. %,d", (int) hargaCelana[i - 1]);
                hargac.setText(hargaFormatted);

                // Event klik untuk celana
                celana.setOnClickListener(view -> {
                    String namaProduk = namac.getText().toString();
                    String hargaString = hargac.getText().toString();

                    double hargaProduk = 0;
                    try {
                        String cleanHarga = hargaString.replaceAll("[^\\d]", "");
                        hargaProduk = Double.parseDouble(cleanHarga);
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }

                    Intent intent = new Intent(form_celana.this, Form_Pembayaran.class);
                    intent.putExtra("namaProduk", namaProduk);
                    intent.putExtra("hargaProduk", hargaProduk);
                    intent.putExtra("asalForm", "formCelana");

                    startActivity(intent);
                });
            }
        }
    }
}
