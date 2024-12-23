package com.example.aplikasimyootdd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class form_jaket extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_jaket);

        ImageView jaket1 = findViewById(R.id.jaket);
        ImageView jaket2 = findViewById(R.id.jaket2);
        ImageView jaket3 = findViewById(R.id.jaket3);
        ImageView jaket4 = findViewById(R.id.jaket4);
        ImageView jaket5 = findViewById(R.id.jaket5);
        ImageView jaket6 = findViewById(R.id.jaket6);
        ImageView jaket7 = findViewById(R.id.jaket7);
        ImageView jaket8 = findViewById(R.id.jaket8);
        ImageView jaket9 = findViewById(R.id.jaket9);
        ImageView jaket10 = findViewById(R.id.jaket10);
        ImageView jaket11 = findViewById(R.id.jaket11);
        ImageView jaket12 = findViewById(R.id.jaket12);
        ImageView iconback = findViewById(R.id.imageView);

        iconback.setOnClickListener(view -> {
            Intent intent = new Intent(form_jaket.this, DashboardUtama.class);
            startActivity(intent);
        });

        TextView namaj1 = findViewById(R.id.namaj);
        TextView hargaj1 = findViewById(R.id.hargaj);

        jaket1.setOnClickListener(view -> {
            String namaProduk = namaj1.getText().toString();
            String hargaString = hargaj1.getText().toString();

            // Pastikan format parsing aman
            double hargaProduk = 0;
            try {
                // Hapus semua karakter selain angka
                String cleanHarga = hargaString.replaceAll("[^\\d]", "");
                hargaProduk = Double.parseDouble(cleanHarga);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }

            Intent intent = new Intent(form_jaket.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namaProduk);
            intent.putExtra("hargaProduk", hargaProduk);  // Kirim sebagai double
            startActivity(intent);
        });


        TextView namaj2 = findViewById(R.id.namaj2);
        TextView hargaj2 = findViewById(R.id.hargaj2);
        jaket2.setOnClickListener(view -> {
            Intent intent = new Intent(form_jaket.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namaj2.getText().toString());
            intent.putExtra("hargaProduk", hargaj2.getText().toString());
            startActivity(intent);
        });

        TextView namaj3 = findViewById(R.id.namaj3);
        TextView hargaj3 = findViewById(R.id.hargaj3);
        jaket3.setOnClickListener(view -> {
            Intent intent = new Intent(form_jaket.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namaj3.getText().toString());
            intent.putExtra("hargaProduk", hargaj3.getText().toString());
            startActivity(intent);
        });

        TextView namaj4 = findViewById(R.id.namaj4);
        TextView hargaj4 = findViewById(R.id.hargaj4);
        jaket4.setOnClickListener(view -> {
            Intent intent = new Intent(form_jaket.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namaj4.getText().toString());
            intent.putExtra("hargaProduk", hargaj4.getText().toString());
            startActivity(intent);
        });

        TextView namaj5 = findViewById(R.id.namaj5);
        TextView hargaj5 = findViewById(R.id.hargaj5);
        jaket5.setOnClickListener(view -> {
            Intent intent = new Intent(form_jaket.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namaj5.getText().toString());
            intent.putExtra("hargaProduk", hargaj5.getText().toString());
            startActivity(intent);
        });

        TextView namaj6 = findViewById(R.id.namaj6);
        TextView hargaj6 = findViewById(R.id.hargaj6);
        jaket6.setOnClickListener(view -> {
            Intent intent = new Intent(form_jaket.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namaj6.getText().toString());
            intent.putExtra("hargaProduk", hargaj6.getText().toString());
            startActivity(intent);
        });

        TextView namaj7 = findViewById(R.id.namaj7);
        TextView hargaj7 = findViewById(R.id.hargaj7);
        jaket7.setOnClickListener(view -> {
            Intent intent = new Intent(form_jaket.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namaj7.getText().toString());
            intent.putExtra("hargaProduk", hargaj7.getText().toString());
            startActivity(intent);
        });

        TextView namaj8 = findViewById(R.id.namaj8);
        TextView hargaj8 = findViewById(R.id.hargaj8);
        jaket8.setOnClickListener(view -> {
            Intent intent = new Intent(form_jaket.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namaj8.getText().toString());
            intent.putExtra("hargaProduk", hargaj8.getText().toString());
            startActivity(intent);
        });

        TextView namaj9 = findViewById(R.id.namaj9);
        TextView hargaj9 = findViewById(R.id.hargaj9);
        jaket9.setOnClickListener(view -> {
            Intent intent = new Intent(form_jaket.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namaj9.getText().toString());
            intent.putExtra("hargaProduk", hargaj9.getText().toString());
            startActivity(intent);
        });

        TextView namaj10 = findViewById(R.id.namaj10);
        TextView hargaj10 = findViewById(R.id.hargaj10);
        jaket10.setOnClickListener(view -> {
            Intent intent = new Intent(form_jaket.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namaj10.getText().toString());
            intent.putExtra("hargaProduk", hargaj10.getText().toString());
            startActivity(intent);
        });

        TextView namaj11 = findViewById(R.id.namaj11);
        TextView hargaj11 = findViewById(R.id.hargaj11);
        jaket11.setOnClickListener(view -> {
            Intent intent = new Intent(form_jaket.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namaj11.getText().toString());
            intent.putExtra("hargaProduk", hargaj11.getText().toString());
            startActivity(intent);
        });

        TextView namaj12 = findViewById(R.id.namaj12);
        TextView hargaj12 = findViewById(R.id.hargaj12);
        jaket12.setOnClickListener(view -> {
            Intent intent = new Intent(form_jaket.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namaj12.getText().toString());
            intent.putExtra("hargaProduk", hargaj12.getText().toString());
            startActivity(intent);
        });
    }
}
