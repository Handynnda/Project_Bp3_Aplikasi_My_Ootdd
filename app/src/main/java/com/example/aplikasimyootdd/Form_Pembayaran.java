package com.example.aplikasimyootdd;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.text.TextUtils;

public class Form_Pembayaran extends AppCompatActivity {

    private TextView textNamaBarang, textHargaBarang, selectedUkuran;
    private EditText inputNamaPembeli, inputAlamat, inputJumlah;
    private RadioGroup radioGroupMetode;
    private Button buttonSubmit;
    private ImageView imageBack;
    private String[] ukuranSepatuArray, ukuranBajuArray, ukuranJaketArray, ukuranCelanaArray;
    private String asalForm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_pembayaran);

        // Inisialisasi view dari layout
        textNamaBarang = findViewById(R.id.textNamaBarang);
        textHargaBarang = findViewById(R.id.textHargaBarang);
        inputNamaPembeli = findViewById(R.id.inputNamaPembeli);
        inputAlamat = findViewById(R.id.inputAlamat);
        inputJumlah = findViewById(R.id.inputJumlah);
        selectedUkuran = findViewById(R.id.datalistview); // Ukuran
        radioGroupMetode = findViewById(R.id.radioGroupMetode);
        buttonSubmit = findViewById(R.id.buttonSubmit);
        imageBack = findViewById(R.id.imageView);

        // Mendapatkan data barang dari Intent
        Intent intent = getIntent();
        String namaProduk = intent.getStringExtra("namaProduk");
        double hargaProduk = intent.getDoubleExtra("hargaProduk", 0);
        asalForm = intent.getStringExtra("asalForm");

        // Debugging asalForm dan namaProduk
        Log.d("Form_Pembayaran", "asalForm: " + asalForm);
        Log.d("Form_Pembayaran", "namaProduk: " + namaProduk);

        // Cegah namaProduk null
        if (TextUtils.isEmpty(namaProduk)) {
            namaProduk = "Produk Default";
        }

        // Menampilkan nama dan harga barang
        textNamaBarang.setText(namaProduk);
        textHargaBarang.setText(String.format("Rp. %,d", (int) hargaProduk));

        // Inisialisasi array ukuran
        ukuranSepatuArray = getResources().getStringArray(R.array.list_ukuran_sepatu);
        ukuranBajuArray = getResources().getStringArray(R.array.list_ukuran_baju);
        ukuranJaketArray = getResources().getStringArray(R.array.list_ukuran_jaket);
        ukuranCelanaArray = getResources().getStringArray(R.array.list_ukuran_celana);

        // Klik TextView untuk memilih ukuran
        selectedUkuran.setOnClickListener(view -> showUkuranDialog());

        String finalNamaProduk = namaProduk;  // Buat variabel final

        buttonSubmit.setOnClickListener(v -> {
            String namaPembeli = inputNamaPembeli.getText().toString();
            String alamat = inputAlamat.getText().toString();
            String jumlahStr = inputJumlah.getText().toString();
            String ukuran = selectedUkuran.getText().toString();
            int metodeId = radioGroupMetode.getCheckedRadioButtonId();

            if (TextUtils.isEmpty(namaPembeli) || TextUtils.isEmpty(alamat) || TextUtils.isEmpty(jumlahStr) || TextUtils.isEmpty(ukuran) || metodeId == -1) {
                Toast.makeText(this, "Mohon lengkapi semua data!", Toast.LENGTH_SHORT).show();
                return;
            }

            int jumlahBarang = Integer.parseInt(jumlahStr);
            double totalHarga = hargaProduk * jumlahBarang;

            RadioButton selectedMetode = findViewById(metodeId);
            String metodePembayaran = selectedMetode.getText().toString();

            // Mengirim data ke Form_Konfirmasi
            Intent konfirmasiIntent = new Intent(this, Form_Konfirmasi.class);
            konfirmasiIntent.putExtra("namaPembeli", namaPembeli);
            konfirmasiIntent.putExtra("alamatPembeli", alamat);
            konfirmasiIntent.putExtra("jumlahBarang", jumlahBarang);
            konfirmasiIntent.putExtra("totalHarga", totalHarga);
            konfirmasiIntent.putExtra("metodePembayaran", metodePembayaran);
            konfirmasiIntent.putExtra("ukuranBarang", ukuran);
            konfirmasiIntent.putExtra("namaProduk", finalNamaProduk);  // Pakai finalNamaProduk
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
                        finish();
                        break;
                }
            } else {
                finish();
            }
        });
    }

    // Menampilkan dialog ukuran sesuai asal form
    private void showUkuranDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Pilih Ukuran");

        String[] ukuranArray;

        // Memastikan asalForm tidak kosong atau null
        if (TextUtils.isEmpty(asalForm)) {
            Toast.makeText(this, "Form tidak dikenali. Menggunakan ukuran default.", Toast.LENGTH_SHORT).show();
            ukuranArray = ukuranSepatuArray; // Default ukuran sepatu
        } else {
            switch (asalForm) {
                case "formSepatu":
                    ukuranArray = ukuranSepatuArray;
                    break;
                case "formBaju":
                    ukuranArray = ukuranBajuArray;
                    break;
                case "formJaket":
                    ukuranArray = ukuranJaketArray;
                    break;
                case "formCelana":
                    ukuranArray = ukuranCelanaArray;
                    break;
                default:
                    ukuranArray = ukuranSepatuArray;
                    break;
            }
        }

        builder.setItems(ukuranArray, (dialogInterface, item) -> {
            selectedUkuran.setText(ukuranArray[item]);
            dialogInterface.dismiss();
        });
        builder.show();
    }
}
