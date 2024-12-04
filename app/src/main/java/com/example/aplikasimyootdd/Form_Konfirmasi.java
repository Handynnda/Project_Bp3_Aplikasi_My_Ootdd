package com.example.aplikasimyootdd;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Form_Konfirmasi extends AppCompatActivity {

    private TextView textNamaPembeli, textAlamatPembeli, textTotalPembayaran, textMetodePembayaran;
    private Button buttonUploadBukti, buttonKonfirmasiPembayaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_konfirmasi);

        // Inisialisasi View
        textNamaPembeli = findViewById(R.id.textNamaPembeli);
        textAlamatPembeli = findViewById(R.id.textAlamatPembeli);
        textTotalPembayaran = findViewById(R.id.textTotalPembayaran);
        textMetodePembayaran = findViewById(R.id.textMetodePembayaran);
        buttonUploadBukti = findViewById(R.id.buttonUploadBukti);
        buttonKonfirmasiPembayaran = findViewById(R.id.buttonKonfirmasiPembayaran);

        // Terima data dari Intent
        Intent intent = getIntent();
        String namaPembeli = intent.getStringExtra("namaPembeli");
        String alamatPembeli = intent.getStringExtra("alamatPembeli");
        String namaBarang = intent.getStringExtra("namaBarang");
        int jumlahBarang = intent.getIntExtra("jumlahBarang", 1);
        double hargaBarang = intent.getDoubleExtra("hargaBarang", 0);
        String metodePembayaran = intent.getStringExtra("metodePembayaran");

        // Hitung total pembayaran
        double totalPembayaran = hargaBarang * jumlahBarang;

        // Set data pada TextView
        textNamaPembeli.setText(namaPembeli);
        textAlamatPembeli.setText(alamatPembeli);
        textTotalPembayaran.setText("Rp " + totalPembayaran);
        textMetodePembayaran.setText(metodePembayaran);

        // Listener untuk Tombol Upload Bukti Pembayaran
        buttonUploadBukti.setOnClickListener(v -> {
            // Implementasikan logika upload bukti pembayaran
            Toast.makeText(this, "Pilih bukti pembayaran untuk diupload", Toast.LENGTH_SHORT).show();
        });

        // Listener untuk Tombol Konfirmasi Pembayaran
        buttonKonfirmasiPembayaran.setOnClickListener(v -> {
            // Simulasikan konfirmasi pembayaran
            Toast.makeText(this, "Pembayaran berhasil dikonfirmasi!", Toast.LENGTH_SHORT).show();
        });
    }
}
