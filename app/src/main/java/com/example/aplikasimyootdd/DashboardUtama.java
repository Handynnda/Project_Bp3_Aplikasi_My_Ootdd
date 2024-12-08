package com.example.aplikasimyootdd;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class DashboardUtama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_utama);

        LinearLayout buttonBaju = findViewById(R.id.bottombaju);
        buttonBaju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardUtama.this, form_baju.class);
                startActivity(intent);
            }
        });

        LinearLayout buttonJaket = findViewById(R.id.bottomjaket);
        buttonJaket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardUtama.this, form_jaket.class);
                startActivity(intent);
            }
        });

        LinearLayout buttonSepatu = findViewById(R.id.bottomsepatu);
        buttonSepatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardUtama.this, form_sepatu.class);
                startActivity(intent);
            }
        });

        LinearLayout buttonCelana = findViewById(R.id.bottomcelana);
        buttonCelana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardUtama.this, form_celana.class);
                startActivity(intent);
            }


        });
//        ImageView whatsappIcon = findViewById(R.id.imageView3);
//        whatsappIcon.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String phoneNumber = "62895413920668";
//                Uri uri = Uri.parse("https://api.whatsapp.com/send?phone=" + phoneNumber);
//                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//                startActivity(intent);
//            }
//        });
//
//        ImageView gmailIcon = findViewById(R.id.imageView2);
//        gmailIcon.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Intent.ACTION_SEND);
//                intent.setType("text/plain");
//                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"Handynandaf@gmail.com"});
//                intent.putExtra(Intent.EXTRA_SUBJECT, "Pertanyaan ke Admin");
//                intent.putExtra(Intent.EXTRA_TEXT, "Halo Admin, saya ingin bertanya...");
//                startActivity(Intent.createChooser(intent, "Kirim Email menggunakan:"));
//            }
//        });
    }
}
