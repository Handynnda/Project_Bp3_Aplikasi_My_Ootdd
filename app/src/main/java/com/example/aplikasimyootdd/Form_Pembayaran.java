package com.example.aplikasimyootdd;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Form_Pembayaran extends AppCompatActivity {

    private TextView textNamaBarang;
    private EditText inputNamaPembeli, inputAlamat, inputJumlah;
    private RadioGroup radioGroupMetode;
    private Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_pembayaran);

        // Inisialisasi View
        textNamaBarang = findViewById(R.id.textNamaBarang);
        inputNamaPembeli = findViewById(R.id.inputNamaPembeli);
        inputAlamat = findViewById(R.id.inputAlamat);
        inputJumlah = findViewById(R.id.inputJumlah);
        radioGroupMetode = findViewById(R.id.radioGroupMetode);
        buttonSubmit = findViewById(R.id.buttonSubmit);

        // Terima data dari Intent
        Intent intent = getIntent();
        String namaBarang = intent.getStringExtra("namaBarang");
        textNamaBarang.setText(namaBarang);

        // Listener untuk Tombol Submit
        buttonSubmit.setOnClickListener(v -> {
            // Validasi Input Pengguna
            String namaPembeli = inputNamaPembeli.getText().toString();
            String alamat = inputAlamat.getText().toString();
            String jumlah = inputJumlah.getText().toString();
            int metodeId = radioGroupMetode.getCheckedRadioButtonId();

            // Periksa apakah semua input sudah terisi
            if (namaPembeli.isEmpty() || alamat.isEmpty() || jumlah.isEmpty() || metodeId == -1) {
                Toast.makeText(this, "Mohon lengkapi semua data!", Toast.LENGTH_SHORT).show();
                return;
            }

            // Menampilkan Pesan Pembayaran
            Toast.makeText(this, "Pembayaran berhasil diajukan!", Toast.LENGTH_SHORT).show();
        });
    }
}
