package com.example.aplikasimyootdd;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Form_Detail extends AppCompatActivity {

    private TextView textNama, textAlamat, textProduk, textJumlah, textMetode, textTotal, textTanggal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_detail);

        // Inisialisasi view
        textNama = findViewById(R.id.textNama);
        textAlamat = findViewById(R.id.textAlamat);
        textProduk = findViewById(R.id.textProduk);
        textJumlah = findViewById(R.id.textJumlah);
        textMetode = findViewById(R.id.textMetode);
        textTotal = findViewById(R.id.textTotal);
        textTanggal = findViewById(R.id.textTanggal);

        // Ambil data dari intent atau gunakan data dummy untuk testing
        String nama = "John Doe";
        String alamat = "Jl. Kebon Jeruk No. 10";
        String produk = "Kaos Polos Hitam";
        int jumlah = 2;
        String metode = "Transfer Bank";
        String total = "Rp 300.000";
        String tanggal = "3 Desember 2024";

        // Set data ke TextView
        textNama.setText("Nama: " + nama);
        textAlamat.setText("Alamat: " + alamat);
        textProduk.setText("Produk: " + produk);
        textJumlah.setText("Jumlah: " + jumlah);
        textMetode.setText("Metode Pembayaran: " + metode);
        textTotal.setText("Total Pembayaran: " + total);
        textTanggal.setText("Tanggal Pesanan: " + tanggal);
    }
}
