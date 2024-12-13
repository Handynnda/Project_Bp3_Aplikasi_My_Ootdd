package com.example.aplikasimyootdd;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class Form_Admin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_admin);

        ImageView imageBack = findViewById(R.id.imageback);
        imageBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Form_Admin.this, DashboardUtama.class);
                startActivity(intent);
                finish();
            }
        });

        ImageView waAdmin1 = findViewById(R.id.waadmin1);
        waAdmin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWhatsAppWithMessage("+62895413920668", "Saya ingin bertanya sesuatu"); // Ganti dengan nomor WhatsApp Handy
            }
        });

        ImageView gmailAdmin1 = findViewById(R.id.gmailadmin1);
        gmailAdmin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendEmail("Handynandaf@gmail.com");
            }
        });

        ImageView waAdmin2 = findViewById(R.id.waadmin2);
        waAdmin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWhatsAppWithMessage("+6285797434134", "Saya ingin bertanya sesuatu"); // Ganti dengan nomor WhatsApp Iseu
            }
        });

        ImageView gmailAdmin2 = findViewById(R.id.gmailadmin2);
        gmailAdmin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendEmail("iseuernawati14@gmail.com");
            }
        });

        ImageView waAdmin3 = findViewById(R.id.waadmin3);
        waAdmin3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWhatsAppWithMessage("+6283829335748", "Saya ingin bertanya sesuatu"); // Ganti dengan nomor WhatsApp Arga
            }
        });

        ImageView gmailAdmin3 = findViewById(R.id.gmailadmin3);
        gmailAdmin3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendEmail("argapratama994@gmail.com");
            }
        });
    }

    private void openWhatsAppWithMessage(String phoneNumber, String message) {
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://wa.me/" + phoneNumber + "?text=" + Uri.encode(message)));
            startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method untuk mengirim email
    private void sendEmail(String email) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:" + email));
        startActivity(intent);
    }
}
