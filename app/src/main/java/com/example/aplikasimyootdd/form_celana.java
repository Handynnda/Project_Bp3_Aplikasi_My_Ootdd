package com.example.aplikasimyootdd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class form_celana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_celana);

        ImageView celana1 = findViewById(R.id.celana);
        ImageView celana2 = findViewById(R.id.celana2);
        ImageView celana3 = findViewById(R.id.celana3);
        ImageView celana4 = findViewById(R.id.celana4);
        ImageView celana5 = findViewById(R.id.celana5);
        ImageView celana6 = findViewById(R.id.celana6);
        ImageView celana7 = findViewById(R.id.celana7);
        ImageView celana8 = findViewById(R.id.celana8);
        ImageView celana9 = findViewById(R.id.celana9);
        ImageView celana10 = findViewById(R.id.celana10);
        ImageView celana11 = findViewById(R.id.celana11);
        ImageView celana12 = findViewById(R.id.celana12);

        TextView namac1 = findViewById(R.id.namac);
        TextView hargac1 = findViewById(R.id.hargac);

        TextView namac2 = findViewById(R.id.namac2);
        TextView hargac2 = findViewById(R.id.hargac2);

        TextView namac3 = findViewById(R.id.namac3);
        TextView hargac3 = findViewById(R.id.hargac3);

        TextView namac4 = findViewById(R.id.namac4);
        TextView hargac4 = findViewById(R.id.hargac4);

        TextView namac5 = findViewById(R.id.namac5);
        TextView hargac5 = findViewById(R.id.hargac5);

        TextView namac6 = findViewById(R.id.namac6);
        TextView hargac6 = findViewById(R.id.hargac6);

        TextView namac7 = findViewById(R.id.namac7);
        TextView hargac7 = findViewById(R.id.hargac7);

        TextView namac8 = findViewById(R.id.namac8);
        TextView hargac8 = findViewById(R.id.hargac8);

        TextView namac9 = findViewById(R.id.namac9);
        TextView hargac9 = findViewById(R.id.hargac9);

        TextView namac10 = findViewById(R.id.namac10);
        TextView hargac10 = findViewById(R.id.hargac10);

        TextView namac11 = findViewById(R.id.namac11);
        TextView hargac11 = findViewById(R.id.hargac11);

        TextView namac12 = findViewById(R.id.namac12);
        TextView hargac12 = findViewById(R.id.hargac12);


        celana1.setOnClickListener(view -> {
            Intent intent = new Intent(form_celana.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namac1.getText().toString());
            intent.putExtra("hargaProduk", hargac1.getText().toString());
            startActivity(intent);
        });

        celana2.setOnClickListener(view -> {
            Intent intent = new Intent(form_celana.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namac2.getText().toString());
            intent.putExtra("hargaProduk", hargac2.getText().toString());
            startActivity(intent);
        });

        celana3.setOnClickListener(view -> {
            Intent intent = new Intent(form_celana.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namac3.getText().toString());
            intent.putExtra("hargaProduk", hargac3.getText().toString());
            startActivity(intent);
        });

        celana4.setOnClickListener(view -> {
            Intent intent = new Intent(form_celana.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namac4.getText().toString());
            intent.putExtra("hargaProduk", hargac4.getText().toString());
            startActivity(intent);
        });

        celana5.setOnClickListener(view -> {
            Intent intent = new Intent(form_celana.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namac5.getText().toString());
            intent.putExtra("hargaProduk", hargac5.getText().toString());
            startActivity(intent);
        });

        celana6.setOnClickListener(view -> {
            Intent intent = new Intent(form_celana.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namac6.getText().toString());
            intent.putExtra("hargaProduk", hargac6.getText().toString());
            startActivity(intent);
        });

        celana7.setOnClickListener(view -> {
            Intent intent = new Intent(form_celana.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namac7.getText().toString());
            intent.putExtra("hargaProduk", hargac7.getText().toString());
            startActivity(intent);
        });

        celana8.setOnClickListener(view -> {
            Intent intent = new Intent(form_celana.this, Form_Pembayaran.class);
            intent.putExtra("namaProduk", namac8.getText().toString());
            intent.putExtra("hargaProduk", hargac8.getText().toString());
            startActivity(intent);
        });
    }
}
