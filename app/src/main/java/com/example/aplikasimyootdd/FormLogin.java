package com.example.aplikasimyootdd;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FormLogin extends AppCompatActivity {

    private EditText textUser, textPass;
    private LinearLayout buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        textUser = findViewById(R.id.TextUser);
        textPass = findViewById(R.id.TextPass);
        buttonLogin = findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(v -> {
            String username = textUser.getText().toString().trim();
            String password = textPass.getText().toString().trim();

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(FormLogin.this,
                        "Harap isi username dan password!", Toast.LENGTH_SHORT).show();
            } else {
                if (username.equals("admin") && password.equals("12345")) {
                    Toast.makeText(FormLogin.this,
                            "Login Berhasil!", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(FormLogin.this, DashboardUtama.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(FormLogin.this, "Username atau Password salah!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
