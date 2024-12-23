package com.example.aplikasimyootdd;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class form_jaket extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_jaket);

        ImageView iconback = findViewById(R.id.imageView);
        iconback.setOnClickListener(view -> {
            Intent intent = new Intent(form_jaket.this, DashboardUtama.class);
            startActivity(intent);
        });

        // Daftar harga berbeda untuk setiap jaket
        double[] hargaJaket = {
                150000, 135000, 160000, 145000, 170000,
                155000, 165000, 140000, 175000, 180000,
                190000, 158000
        };

        for (int i = 1; i <= 12; i++) {
            int jaketId = getResources().getIdentifier("jaket" + i, "id", getPackageName());
            int namajId = getResources().getIdentifier("namaj" + i, "id", getPackageName());
            int hargajId = getResources().getIdentifier("hargaj" + i, "id", getPackageName());

            ImageView jaket = findViewById(jaketId);
            TextView namaj = findViewById(namajId);
            TextView hargaj = findViewById(hargajId);

            if (jaket != null && namaj != null && hargaj != null) {
                // Set harga dari array ke TextView
                String hargaFormatted = String.format("Rp. %,d", (int) hargaJaket[i - 1]);
                hargaj.setText(hargaFormatted);

                // Event klik untuk jaket
                jaket.setOnClickListener(view -> {
                    String namaProduk = namaj.getText().toString();
                    String hargaString = hargaj.getText().toString();

                    double hargaProduk = 0;
                    try {
                        String cleanHarga = hargaString.replaceAll("[^\\d]", "");
                        hargaProduk = Double.parseDouble(cleanHarga);
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }

                    Intent intent = new Intent(form_jaket.this, Form_Pembayaran.class);
                    intent.putExtra("namaProduk", namaProduk);
                    intent.putExtra("hargaProduk", hargaProduk);
                    startActivity(intent);
                });
            }
        }
    }
}
