package com.example.aplikasimyootdd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class form_sepatu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_sepatu);

        ImageView sepatu1 = findViewById(R.id.sepatu);
        ImageView sepatu2 = findViewById(R.id.sepatu2);
        ImageView sepatu3 = findViewById(R.id.sepatu3);
        ImageView sepatu4 = findViewById(R.id.sepatu4);
        ImageView sepatu5 = findViewById(R.id.sepatu5);
        ImageView sepatu6 = findViewById(R.id.sepatu6);
        ImageView sepatu7 = findViewById(R.id.sepatu7);
        ImageView sepatu8 = findViewById(R.id.sepatu8);
        ImageView sepatu9 = findViewById(R.id.sepatu9);
        ImageView sepatu10 = findViewById(R.id.sepatu10);
        ImageView sepatu11 = findViewById(R.id.sepatu11);
        ImageView sepatu12 = findViewById(R.id.sepatu12);
        ImageView iconback = findViewById(R.id.imageView);

        iconback.setOnClickListener(view -> {
            Intent intent = new Intent(form_sepatu.this, DashboardUtama.class);
            startActivity(intent);
        });

        TextView namas1 = findViewById(R.id.namas);
        TextView hargas1 = findViewById(R.id.hargas);
        sepatu1.setOnClickListener(view -> {
            Intent intent = new Intent(form_sepatu.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namas1.getText().toString());
            intent.putExtra("hargaProduk", hargas1.getText().toString());
            startActivity(intent);
        });

        TextView namas2 = findViewById(R.id.namas2);
        TextView hargas2 = findViewById(R.id.hargas2);
        sepatu2.setOnClickListener(view -> {
            Intent intent = new Intent(form_sepatu.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namas2.getText().toString());
            intent.putExtra("hargaProduk", hargas2.getText().toString());
            startActivity(intent);
        });

        TextView namas3 = findViewById(R.id.namas3);
        TextView hargas3 = findViewById(R.id.hargas3);
        sepatu3.setOnClickListener(view -> {
            Intent intent = new Intent(form_sepatu.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namas3.getText().toString());
            intent.putExtra("hargaProduk", hargas3.getText().toString());
            startActivity(intent);
        });

        TextView namas4 = findViewById(R.id.namas4);
        TextView hargas4 = findViewById(R.id.hargas4);
        sepatu4.setOnClickListener(view -> {
            Intent intent = new Intent(form_sepatu.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namas4.getText().toString());
            intent.putExtra("hargaProduk", hargas4.getText().toString());
            startActivity(intent);
        });

        TextView namas5 = findViewById(R.id.namas5);
        TextView hargas5 = findViewById(R.id.hargas5);
        sepatu5.setOnClickListener(view -> {
            Intent intent = new Intent(form_sepatu.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namas5.getText().toString());
            intent.putExtra("hargaProduk", hargas5.getText().toString());
            startActivity(intent);
        });

        TextView namas6 = findViewById(R.id.namas6);
        TextView hargas6 = findViewById(R.id.hargas6);
        sepatu6.setOnClickListener(view -> {
            Intent intent = new Intent(form_sepatu.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namas6.getText().toString());
            intent.putExtra("hargaProduk", hargas6.getText().toString());
            startActivity(intent);
        });

        TextView namas7 = findViewById(R.id.namas7);
        TextView hargas7 = findViewById(R.id.hargas7);
        sepatu7.setOnClickListener(view -> {
            Intent intent = new Intent(form_sepatu.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namas7.getText().toString());
            intent.putExtra("hargaProduk", hargas7.getText().toString());
            startActivity(intent);
        });

        TextView namas8 = findViewById(R.id.namas8);
        TextView hargas8 = findViewById(R.id.hargas8);
        sepatu8.setOnClickListener(view -> {
            Intent intent = new Intent(form_sepatu.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namas8.getText().toString());
            intent.putExtra("hargaProduk", hargas8.getText().toString());
            startActivity(intent);
        });

        TextView namas9 = findViewById(R.id.namas9);
        TextView hargas9 = findViewById(R.id.hargas9);
        sepatu9.setOnClickListener(view -> {
            Intent intent = new Intent(form_sepatu.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namas9.getText().toString());
            intent.putExtra("hargaProduk", hargas9.getText().toString());
            startActivity(intent);
        });

        TextView namas10 = findViewById(R.id.namas10);
        TextView hargas10 = findViewById(R.id.hargas10);
        sepatu10.setOnClickListener(view -> {
            Intent intent = new Intent(form_sepatu.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namas10.getText().toString());
            intent.putExtra("hargaProduk", hargas10.getText().toString());
            startActivity(intent);
        });

        TextView namas12 = findViewById(R.id.namas12);
        TextView hargas12 = findViewById(R.id.hargas12);
        sepatu12.setOnClickListener(view -> {
            Intent intent = new Intent(form_sepatu.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namas12.getText().toString());
            intent.putExtra("hargaProduk", hargas12.getText().toString());
            startActivity(intent);
        });
    }
}
