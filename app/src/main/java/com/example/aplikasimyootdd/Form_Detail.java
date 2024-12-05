package com.example.aplikasimyootdd;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Form_Detail extends AppCompatActivity {

    private TextView textNamaPembeli, textAlamatPembeli, textProduk, textJumlahBeli, textMetodePembayaran, textTotalPembayaran;
    private Button buttonKembaliHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_detail);

        // Inisialisasi elemen-elemen UI
        textNamaPembeli = findViewById(R.id.textNamaPembeli);
        textAlamatPembeli = findViewById(R.id.textAlamatPembeli);
        textProduk = findViewById(R.id.textProduk);
        textJumlahBeli = findViewById(R.id.textJumlahBeli);
        textMetodePembayaran = findViewById(R.id.textMetodePembayaran);
        textTotalPembayaran = findViewById(R.id.textTotalPembayaran);
        buttonKembaliHome = findViewById(R.id.buttonKembaliHome);

        // Mendapatkan data dari Intent
        Intent intent = getIntent();
        String namaPembeli = intent.getStringExtra("namaPembeli");
        String alamatPembeli = intent.getStringExtra("alamatPembeli");
        String namaProduk = intent.getStringExtra("namaProduk");
        int jumlahBeli = intent.getIntExtra("jumlahBeli", 1);
        double hargaProduk = intent.getDoubleExtra("hargaProduk", 0);
        String metodePembayaran = intent.getStringExtra("metodePembayaran");

        // Menghitung total pembayaran
        double totalPembayaran = hargaProduk * jumlahBeli;

        // Menampilkan data pada TextView
        textNamaPembeli.setText(namaPembeli);
        textAlamatPembeli.setText(alamatPembeli);
        textProduk.setText(namaProduk);
        textJumlahBeli.setText("Jumlah Beli: " + jumlahBeli);
        textMetodePembayaran.setText(metodePembayaran);
        textTotalPembayaran.setText("Rp " + totalPembayaran);

        // Mengatur tombol kembali ke halaman utama
        buttonKembaliHome.setOnClickListener(v -> {
            Intent homeIntent = new Intent(this, DashboardUtama.class); // Ganti dengan activity utama Anda
            startActivity(homeIntent);
            finish();
        });
    }
}
