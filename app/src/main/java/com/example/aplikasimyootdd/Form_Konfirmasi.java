package com.example.aplikasimyootdd;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Form_Konfirmasi extends AppCompatActivity {

    private TextView textNamaPembeli, textAlamatPembeli, textTotalHarga, textMetodePembayaran, textUkuranBarang;
    private ImageView imageViewQR, imageViewBack;
    private Button buttonSelesai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_konfirmasi);

        // Inisialisasi view dari layout
        textNamaPembeli = findViewById(R.id.textNamaPembeli);
        textAlamatPembeli = findViewById(R.id.textAlamatPembeli);
        textTotalHarga = findViewById(R.id.textTotalPembayaran);
        textMetodePembayaran = findViewById(R.id.textMetodePembayaran);
        textUkuranBarang = findViewById(R.id.textUkuranBarang);  // Menambahkan TextView untuk ukuran barang
        imageViewQR = findViewById(R.id.imageViewQR);
        imageViewBack = findViewById(R.id.imageViewBack);
        buttonSelesai = findViewById(R.id.buttonSelesai);

        // Mendapatkan data dari intent
        Intent intent = getIntent();
        String namaPembeli = intent.getStringExtra("namaPembeli");
        String alamatPembeli = intent.getStringExtra("alamatPembeli");
        double totalHarga = intent.getDoubleExtra("totalHarga", 0);
        String metodePembayaran = intent.getStringExtra("metodePembayaran");
        String ukuranBarang = intent.getStringExtra("ukuranBarang");  // Ambil ukuran barang dari Intent

        // Menampilkan data di TextView
        textNamaPembeli.setText(namaPembeli);
        textAlamatPembeli.setText(alamatPembeli);
        textTotalHarga.setText(String.format("Rp. %,d", (int) totalHarga));
        textMetodePembayaran.setText(metodePembayaran);
        textUkuranBarang.setText("Ukuran: " + ukuranBarang);  // Menampilkan ukuran barang

        // Tampilkan QR
        imageViewQR.setImageResource(R.drawable.img);

        // Tombol selesai - Buka Form_Detail
        buttonSelesai.setOnClickListener(v -> {
            Toast.makeText(this, "Pembayaran Berhasil!", Toast.LENGTH_SHORT).show();
            Intent detailIntent = new Intent(this, Form_Detail.class);
            detailIntent.putExtra("namaPembeli", namaPembeli);
            detailIntent.putExtra("alamatPembeli", alamatPembeli);
            detailIntent.putExtra("namaProduk", "Produk A");  // Misalkan produk A
            detailIntent.putExtra("jumlahBeli", "2");  // Misal 2 produk
            detailIntent.putExtra("totalHarga", String.format("%,d", (int) totalHarga));  // Kirim harga dalam bentuk string
            detailIntent.putExtra("metodePembayaran", metodePembayaran);
            detailIntent.putExtra("ukuranBarang", ukuranBarang);  // Kirim ukuran barang ke Form_Detail
            startActivity(detailIntent);
            finish();
        });

        // Fungsi untuk tombol back
        imageViewBack.setOnClickListener(v -> finish());
    }
}
