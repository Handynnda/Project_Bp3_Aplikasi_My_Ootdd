package com.example.aplikasimyootdd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class form_baju extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_baju);

        ImageView baju1 = findViewById(R.id.baju);
        ImageView baju2 = findViewById(R.id.baju2);
        ImageView baju3 = findViewById(R.id.baju3);
        ImageView baju4 = findViewById(R.id.baju4);
        ImageView baju5 = findViewById(R.id.baju5);
        ImageView baju6 = findViewById(R.id.baju6);
        ImageView baju7 = findViewById(R.id.baju7);
        ImageView baju8 = findViewById(R.id.baju8);
        ImageView baju9 = findViewById(R.id.baju9);
        ImageView baju10 = findViewById(R.id.baju10);
        ImageView baju11 = findViewById(R.id.baju11);
        ImageView baju12 = findViewById(R.id.baju12);
        ImageView iconback = findViewById(R.id.imageView);

        iconback.setOnClickListener(view -> {
            Intent intent = new Intent(form_baju.this, DashboardUtama.class);
            startActivity(intent);
        });

        TextView namab1 = findViewById(R.id.namab);
        TextView hargab1 = findViewById(R.id.hargab);
        baju1.setOnClickListener(view -> {
            Intent intent = new Intent(form_baju.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namab1.getText().toString());
            intent.putExtra("hargaProduk", hargab1.getText().toString());
            startActivity(intent);
        });

        TextView namab2 = findViewById(R.id.namab2);
        TextView hargab2 = findViewById(R.id.hargab2);
        baju2.setOnClickListener(view -> {
            Intent intent = new Intent(form_baju.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namab2.getText().toString());
            intent.putExtra("hargaProduk", hargab2.getText().toString());
            startActivity(intent);
        });

        TextView namab3 = findViewById(R.id.namab3);
        TextView hargab3 = findViewById(R.id.hargab3);
        baju3.setOnClickListener(view -> {
            Intent intent = new Intent(form_baju.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namab3.getText().toString());
            intent.putExtra("hargaProduk", hargab3.getText().toString());
            startActivity(intent);
        });

        TextView namab4 = findViewById(R.id.namab4);
        TextView hargab4 = findViewById(R.id.hargab4);
        baju4.setOnClickListener(view -> {
            Intent intent = new Intent(form_baju.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namab4.getText().toString());
            intent.putExtra("hargaProduk", hargab4.getText().toString());
            startActivity(intent);
        });

        TextView namab5 = findViewById(R.id.namab5);
        TextView hargab5 = findViewById(R.id.hargab5);
        baju5.setOnClickListener(view -> {
            Intent intent = new Intent(form_baju.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namab5.getText().toString());
            intent.putExtra("hargaProduk", hargab5.getText().toString());
            startActivity(intent);
        });

        TextView namab6 = findViewById(R.id.namab6);
        TextView hargab6 = findViewById(R.id.hargab6);
        baju6.setOnClickListener(view -> {
            Intent intent = new Intent(form_baju.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namab6.getText().toString());
            intent.putExtra("hargaProduk", hargab6.getText().toString());
            startActivity(intent);
        });

        TextView namab7 = findViewById(R.id.namab7);
        TextView hargab7 = findViewById(R.id.hargab7);
        baju7.setOnClickListener(view -> {
            Intent intent = new Intent(form_baju.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namab7.getText().toString());
            intent.putExtra("hargaProduk", hargab7.getText().toString());
            startActivity(intent);
        });

        TextView namab8 = findViewById(R.id.namab8);
        TextView hargab8 = findViewById(R.id.hargab8);
        baju8.setOnClickListener(view -> {
            Intent intent = new Intent(form_baju.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namab8.getText().toString());
            intent.putExtra("hargaProduk", hargab8.getText().toString());
            startActivity(intent);
        });

        TextView namab9 = findViewById(R.id.namab9);
        TextView hargab9 = findViewById(R.id.hargab9);
        baju9.setOnClickListener(view -> {
            Intent intent = new Intent(form_baju.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namab9.getText().toString());
            intent.putExtra("hargaProduk", hargab9.getText().toString());
            startActivity(intent);
        });

        TextView namab10 = findViewById(R.id.namab10);
        TextView hargab10 = findViewById(R.id.hargab10);
        baju10.setOnClickListener(view -> {
            Intent intent = new Intent(form_baju.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namab10.getText().toString());
            intent.putExtra("hargaProduk", hargab10.getText().toString());
            startActivity(intent);
        });

        TextView namab11 = findViewById(R.id.namab11);
        TextView hargab11 = findViewById(R.id.hargab11);
        baju11.setOnClickListener(view -> {
            Intent intent = new Intent(form_baju.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namab11.getText().toString());
            intent.putExtra("hargaProduk", hargab11.getText().toString());
            startActivity(intent);
        });

        TextView namab12 = findViewById(R.id.namab12);
        TextView hargab12 = findViewById(R.id.hargab12);
        baju12.setOnClickListener(view -> {
            Intent intent = new Intent(form_baju.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namab12.getText().toString());
            intent.putExtra("hargaProduk", hargab12.getText().toString());
            startActivity(intent);
        });
    }
}
