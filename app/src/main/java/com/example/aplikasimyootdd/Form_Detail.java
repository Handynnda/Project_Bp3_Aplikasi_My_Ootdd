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

        // Inisialisasi elemen UI
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
        String jumlahBeli = intent.getStringExtra("jumlahBeli");
        String totalHarga = intent.getStringExtra("totalHarga");
        String metodePembayaran = intent.getStringExtra("metodePembayaran");

        // Menampilkan data pada TextView
        textNamaPembeli.setText("Nama: " + namaPembeli);
        textAlamatPembeli.setText("Alamat: " + alamatPembeli);
        textProduk.setText("Produk: " + namaProduk);
        textJumlahBeli.setText("Jumlah Beli: " + jumlahBeli);
        textMetodePembayaran.setText("Metode: " + metodePembayaran);
        textTotalPembayaran.setText("Total: Rp. " + totalHarga);

        // Tombol kembali ke halaman utama
        buttonKembaliHome.setOnClickListener(v -> {
            Intent homeIntent = new Intent(this, DashboardUtama.class);
            startActivity(homeIntent);
            finish();
        });
    }
}
