package com.example.aplikasimyootdd;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Form_Pembayaran extends AppCompatActivity {

    private TextView textNamaBarang, textHargaBarang;
    private EditText inputNamaPembeli, inputAlamat, inputJumlah;
    private RadioGroup radioGroupMetode;
    private Button buttonSubmit;
    private ImageView imageBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_pembayaran);

        // Inisialisasi view dari layout
        textNamaBarang = findViewById(R.id.textNamaBarang);
        textHargaBarang = findViewById(R.id.textHargaBarang); // Referensi harga barang
        inputNamaPembeli = findViewById(R.id.inputNamaPembeli);
        inputAlamat = findViewById(R.id.inputAlamat);
        inputJumlah = findViewById(R.id.inputJumlah);
        radioGroupMetode = findViewById(R.id.radioGroupMetode);
        buttonSubmit = findViewById(R.id.buttonSubmit);
        imageBack = findViewById(R.id.imageView);

        // Mendapatkan data barang dari Intent
        Intent intent = getIntent();
        String namaProduk = intent.getStringExtra("namaProduk");
        double hargaProduk = intent.getDoubleExtra("hargaProduk", 0);
        String asalForm = intent.getStringExtra("asalForm");

        // Menampilkan nama dan harga barang
        textNamaBarang.setText(namaProduk);
        textHargaBarang.setText(String.format("Rp. %,d", (int) hargaProduk));

        // Aksi pada tombol submit
        buttonSubmit.setOnClickListener(v -> {
            String namaPembeli = inputNamaPembeli.getText().toString();
            String alamat = inputAlamat.getText().toString();
            String jumlahStr = inputJumlah.getText().toString();
            int metodeId = radioGroupMetode.getCheckedRadioButtonId();

            // Validasi input
            if (namaPembeli.isEmpty() || alamat.isEmpty() || jumlahStr.isEmpty() || metodeId == -1) {
                Toast.makeText(this, "Mohon lengkapi semua data!", Toast.LENGTH_SHORT).show();
                return;
            }

            // Parsing jumlah barang
            int jumlahBarang = Integer.parseInt(jumlahStr);

            // Mendapatkan metode pembayaran yang dipilih
            RadioButton selectedMetode = findViewById(metodeId);
            String metodePembayaran = selectedMetode.getText().toString();

            // Mengirim data ke halaman konfirmasi pembayaran
            Intent konfirmasiIntent = new Intent(this, Form_Konfirmasi.class);
            konfirmasiIntent.putExtra("namaPembeli", namaPembeli);
            konfirmasiIntent.putExtra("alamatPembeli", alamat);
            konfirmasiIntent.putExtra("jumlahBarang", jumlahBarang);
            konfirmasiIntent.putExtra("hargaBarang", hargaProduk);
            konfirmasiIntent.putExtra("metodePembayaran", metodePembayaran);

            startActivity(konfirmasiIntent);
        });

        // Aksi pada ikon kembali
        imageBack.setOnClickListener(v -> {
            if (asalForm != null) {
                switch (asalForm) {
                    case "formCelana":
                        startActivity(new Intent(this, form_celana.class));
                        break;
                    case "formBaju":
                        startActivity(new Intent(this, form_baju.class));
                        break;
                    case "formJaket":
                        startActivity(new Intent(this, form_jaket.class));
                        break;
                    case "formSepatu":
                        startActivity(new Intent(this, form_sepatu.class));
                        break;
                    default:
                        finish(); // Kembali ke aktivitas sebelumnya
                        break;
                }
            } else {
                finish(); // Jika asal tidak diketahui, hanya kembali ke aktivitas sebelumnya
            }
        });
    }
}
