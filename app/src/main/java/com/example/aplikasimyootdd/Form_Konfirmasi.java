package com.example.aplikasimyootdd;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Form_Konfirmasi extends AppCompatActivity {

    private TextView textNamaPembeli, textAlamatPembeli, textTotalPembayaran, textMetodePembayaran, textInfoPembayaran;
    private Button buttonUploadBukti, buttonKonfirmasiPembayaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_konfirmasi);

        textNamaPembeli = findViewById(R.id.textNamaPembeli);
        textAlamatPembeli = findViewById(R.id.textAlamatPembeli);
        textTotalPembayaran = findViewById(R.id.textTotalPembayaran);
        textMetodePembayaran = findViewById(R.id.textMetodePembayaran);
        textInfoPembayaran = findViewById(R.id.textInfoPembayaran);
        buttonUploadBukti = findViewById(R.id.buttonUploadBukti);
        buttonKonfirmasiPembayaran = findViewById(R.id.buttonKonfirmasiPembayaran);

        Intent intent = getIntent();
        String namaPembeli = intent.getStringExtra("namaPembeli");
        String alamatPembeli = intent.getStringExtra("alamatPembeli");
        int jumlahBarang = intent.getIntExtra("jumlahBarang", 1);
        double hargaBarang = intent.getDoubleExtra("hargaBarang", 0);
        String metodePembayaran = intent.getStringExtra("metodePembayaran");

        double totalPembayaran = hargaBarang * jumlahBarang;

        textNamaPembeli.setText(namaPembeli);
        textAlamatPembeli.setText(alamatPembeli);
        textTotalPembayaran.setText("Rp " + String.format("%.2f", totalPembayaran));
        textMetodePembayaran.setText(metodePembayaran);

        if (metodePembayaran.equalsIgnoreCase("Transfer Bank")) {
            textInfoPembayaran.setText("Nomor Rekening: 879654312 (Bank BNI)");
        } else if (metodePembayaran.equalsIgnoreCase("E-Wallet")) {
            textInfoPembayaran.setText("Nomor E-Wallet: 081234567890 (GoPay)");
        } else {
            textInfoPembayaran.setText("Informasi pembayaran tidak tersedia");
        }

        buttonUploadBukti.setOnClickListener(v ->
                Toast.makeText(this, "Pilih bukti pembayaran untuk diupload", Toast.LENGTH_SHORT).show()
        );

        buttonKonfirmasiPembayaran.setOnClickListener(v -> {
            Toast.makeText(this, "Pembayaran berhasil dikonfirmasi!", Toast.LENGTH_SHORT).show();

            Intent detailIntent = new Intent(this, Form_Detail.class);
            detailIntent.putExtra("namaPembeli", namaPembeli);
            detailIntent.putExtra("alamatPembeli", alamatPembeli);
            detailIntent.putExtra("namaProduk", "Produk Anda"); // Ganti sesuai dengan data produk jika ada
            detailIntent.putExtra("jumlahBeli", jumlahBarang);
            detailIntent.putExtra("hargaProduk", hargaBarang);
            detailIntent.putExtra("metodePembayaran", metodePembayaran);

            startActivity(detailIntent);
            finish(); // Menutup halaman ini
        });
    }

