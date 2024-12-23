package com.example.aplikasimyootdd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class form_sepatu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_sepatu);

        ImageView iconback = findViewById(R.id.imageView);
        iconback.setOnClickListener(view -> {
            Intent intent = new Intent(form_sepatu.this, DashboardUtama.class);
            startActivity(intent);
        });

        for (int i = 1; i <= 12; i++) {
            int sepatuId = getResources().getIdentifier("sepatu" + i, "id", getPackageName());
            int namasId = getResources().getIdentifier("namas" + i, "id", getPackageName());
            int hargasId = getResources().getIdentifier("hargas" + i, "id", getPackageName());

            ImageView sepatu = findViewById(sepatuId);
            TextView namas = findViewById(namasId);
            TextView hargas = findViewById(hargasId);

            if (sepatu != null && namas != null && hargas != null) {
                sepatu.setOnClickListener(view -> {
                    String namaProduk = namas.getText().toString();
                    String hargaString = hargas.getText().toString();

                    double hargaProduk = 0;
                    try {
                        String cleanHarga = hargaString.replaceAll("[^\\d]", "");
                        hargaProduk = Double.parseDouble(cleanHarga);
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }

                    Intent intent = new Intent(form_sepatu.this, Form_Pembayaran.class);
                    intent.putExtra("namaProduk", namaProduk);
                    intent.putExtra("hargaProduk", hargaProduk);
                    startActivity(intent);
                });
            }
        }
    }
}
