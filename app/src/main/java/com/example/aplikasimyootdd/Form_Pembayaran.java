package com.example.aplikasimyootdd;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Form_Pembayaran extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioTransfer, radioEwallet;
    private EditText inputCatatan;
    private Button buttonBayar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_pembayaran);

        // Inisialisasi elemen UI
        radioGroup = findViewById(R.id.radioGroup);
        radioTransfer = findViewById(R.id.radioTransfer);
        radioEwallet = findViewById(R.id.radioEwallet);
        inputCatatan = findViewById(R.id.inputCatatan);
        buttonBayar = findViewById(R.id.buttonBayar);

        // Atur tombol bayar untuk memproses pembayaran
        buttonBayar.setOnClickListener(view -> processPayment());
    }

    private void processPayment() {
        // Periksa apakah metode pembayaran telah dipilih
        int selectedId = radioGroup.getCheckedRadioButtonId();
        if (selectedId == -1) {
            Toast.makeText(this, "Pilih metode pembayaran terlebih dahulu", Toast.LENGTH_SHORT).show();
        } else {
            // Dapatkan metode pembayaran yang dipilih
            String paymentMethod = selectedId == R.id.radioTransfer ? "Transfer Bank" : "E-Wallet";

            // Ambil catatan dari input pengguna
            String catatan = inputCatatan.getText().toString().trim();

            // Tampilkan pesan konfirmasi
            String message = "Pembayaran menggunakan: " + paymentMethod;
            if (!catatan.isEmpty()) {
                message += "\nCatatan: " + catatan;
            }
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();

            // Tambahkan logika tambahan seperti API atau navigasi ke layar lain di sini
        }
    }
}
