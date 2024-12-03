package com.example.aplikasimyootdd;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Form_Konfirmasi extends AppCompatActivity {

    private TextView textNama, textAlamat, textTotal, textMetode, textBuktiUpload, textRekening;
    private Button buttonUploadBukti, buttonKonfirmasi;
    private static final int PICK_IMAGE_REQUEST = 1;
    private Uri selectedBuktiUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_konfirmasi);

        // Inisialisasi view
        textNama = findViewById(R.id.textNama);
        textAlamat = findViewById(R.id.textAlamat);
        textTotal = findViewById(R.id.textTotal);
        textMetode = findViewById(R.id.textMetode);
        textBuktiUpload = findViewById(R.id.textBuktiUpload);
        textRekening = findViewById(R.id.textRekening);  // TextView untuk menampilkan nomor rekening
        buttonUploadBukti = findViewById(R.id.buttonUploadBukti);
        buttonKonfirmasi = findViewById(R.id.buttonKonfirmasi);

        // Ambil data dari intent sebelumnya
        String nama = "John Doe";  // Contoh data, ganti sesuai implementasi
        String alamat = "Jl. Kebon Jeruk No. 10";  // Ambil dari form pembayaran
        String total = "Rp 1.500.000";  // Ambil dari form pembayaran
        String metode = "Transfer Bank";  // Ambil dari form pembayaran

        // Set data ke TextView
        textNama.setText("Nama: " + nama);
        textAlamat.setText("Alamat: " + alamat);
        textTotal.setText("Total Pembayaran: " + total);
        textMetode.setText("Metode Pembayaran: " + metode);

        // Menampilkan nomor rekening atau e-wallet berdasarkan metode pembayaran
        if (metode.equals("Transfer Bank")) {
            textRekening.setText("Nomor Rekening: 123-456-7890");  // Nomor rekening untuk transfer bank
            textRekening.setVisibility(TextView.VISIBLE);  // Menampilkan nomor rekening
        } else if (metode.equals("E-wallet")) {
            textRekening.setText("E-wallet: 081234567890");  // Nomor E-wallet
            textRekening.setVisibility(TextView.VISIBLE);  // Menampilkan e-wallet
        } else {
            textRekening.setVisibility(TextView.GONE);  // Menyembunyikan jika tidak ada metode pembayaran yang dipilih
        }

        // Handle upload bukti pembayaran
        buttonUploadBukti.setOnClickListener(v -> openFileChooser());

        // Handle konfirmasi pembayaran
        buttonKonfirmasi.setOnClickListener(v -> {
            if (selectedBuktiUri != null) {
                // Kirim data konfirmasi pembayaran ke server atau simpan
                Toast.makeText(this, "Pembayaran Dikonfirmasi", Toast.LENGTH_SHORT).show();
            } else {
                textBuktiUpload.setText("Bukti Pembayaran Belum Diupload");
                textBuktiUpload.setTextColor(Color.RED);
                textBuktiUpload.setVisibility(TextView.VISIBLE);  // Menampilkan pesan bukti belum di-upload
            }
        });
    }

    // Fungsi untuk membuka file chooser dan memilih bukti pembayaran
    private void openFileChooser() {
        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        intent.setType("image/*");
        startActivityForResult(intent, PICK_IMAGE_REQUEST);
    }

    // Mendapatkan hasil pemilihan file gambar (bukti pembayaran)
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null && data.getData() != null) {
            selectedBuktiUri = data.getData();
            textBuktiUpload.setText("Bukti Pembayaran: " + selectedBuktiUri.getLastPathSegment());
            textBuktiUpload.setTextColor(Color.GREEN);
            textBuktiUpload.setVisibility(TextView.VISIBLE);  // Menampilkan pesan bukti telah di-upload
        }
    }
}
