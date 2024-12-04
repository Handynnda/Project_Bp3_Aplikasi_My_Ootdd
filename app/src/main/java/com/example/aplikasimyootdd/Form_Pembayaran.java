package com.example.aplikasimyootdd;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
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

        textNamaBarang = findViewById(R.id.textNamaBarang);
        inputNamaPembeli = findViewById(R.id.inputNamaPembeli);
        inputAlamat = findViewById(R.id.inputAlamat);
        inputJumlah = findViewById(R.id.inputJumlah);
        radioGroupMetode = findViewById(R.id.radioGroupMetode);
        buttonSubmit = findViewById(R.id.buttonSubmit);

        Intent intent = getIntent();
        String namaBarang = intent.getStringExtra("namaBarang");
        double hargaBarang = intent.getDoubleExtra("hargaBarang", 0);
        textNamaBarang.setText(namaBarang);

        buttonSubmit.setOnClickListener(v -> {
            String namaPembeli = inputNamaPembeli.getText().toString();
            String alamat = inputAlamat.getText().toString();
            String jumlahStr = inputJumlah.getText().toString();
            int metodeId = radioGroupMetode.getCheckedRadioButtonId();

            if (namaPembeli.isEmpty() || alamat.isEmpty() || jumlahStr.isEmpty() || metodeId == -1) {
                Toast.makeText(this, "Mohon lengkapi semua data!", Toast.LENGTH_SHORT).show();
                return;
            }

            int jumlahBarang = Integer.parseInt(jumlahStr);

            RadioButton selectedMetode = findViewById(metodeId);
            String metodePembayaran = selectedMetode.getText().toString();

            Intent konfirmasiIntent = new Intent(this, Form_Konfirmasi.class);
            konfirmasiIntent.putExtra("namaPembeli", namaPembeli);
            konfirmasiIntent.putExtra("alamatPembeli", alamat);
            konfirmasiIntent.putExtra("jumlahBarang", jumlahBarang);
            konfirmasiIntent.putExtra("hargaBarang", hargaBarang);
            konfirmasiIntent.putExtra("metodePembayaran", metodePembayaran);

            startActivity(konfirmasiIntent);
        });
    }
}
