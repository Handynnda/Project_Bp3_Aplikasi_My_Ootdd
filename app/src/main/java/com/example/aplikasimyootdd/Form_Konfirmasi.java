package com.example.aplikasimyootdd;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Form_Konfirmasi extends AppCompatActivity {

    private TextView textNamaPembeli, textAlamatPembeli, textTotalHarga, textMetodePembayaran;
    private ImageView imageViewQR;
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
        imageViewQR = findViewById(R.id.imageViewQR);
        buttonSelesai = findViewById(R.id.buttonSelesai);

        // Mendapatkan data dari intent
        Intent intent = getIntent();
        String namaPembeli = intent.getStringExtra("namaPembeli");
        String alamatPembeli = intent.getStringExtra("alamatPembeli");
        double totalHarga = intent.getDoubleExtra("totalHarga", 0);
        String metodePembayaran = intent.getStringExtra("metodePembayaran");

        // Menampilkan data di TextView
        textNamaPembeli.setText(namaPembeli);
        textAlamatPembeli.setText(alamatPembeli);
        textTotalHarga.setText(String.format("Rp. %,d", (int) totalHarga));
        textMetodePembayaran.setText(metodePembayaran);

        // Tampilkan QR (Ganti dengan QR asli jika diperlukan)
        imageViewQR.setImageResource(R.drawable.img);

        // Tombol selesai
        buttonSelesai.setOnClickListener(v -> {
            Toast.makeText(this, "Terima kasih, pembayaran sedang diproses!", Toast.LENGTH_SHORT).show();
            Intent intentMain = new Intent(this, MainActivity.class);
            startActivity(intentMain);
            finish();
        });
    }
}
