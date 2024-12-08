package com.example.aplikasimyootdd;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FormRegister extends AppCompatActivity {

    private EditText textEmail, textUsername, textPassword;
    private LinearLayout buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_register);

        textEmail = findViewById(R.id.TextEmail);
        textUsername = findViewById(R.id.TextUsername);
        textPassword = findViewById(R.id.TextPassword);
        buttonRegister = findViewById(R.id.buttonRegister);

        ImageView iconback = findViewById(R.id.imageBack);

        iconback.setOnClickListener(view -> {
            Intent intent = new Intent(FormRegister.this, DashBoardPertama.class);
            startActivity(intent);
        });

        buttonRegister.setOnClickListener(v -> {
            String email = textEmail.getText().toString().trim();
            String username = textUsername.getText().toString().trim();
            String password = textPassword.getText().toString().trim();

            if (email.isEmpty() || username.isEmpty() || password.isEmpty()) {
                Toast.makeText(FormRegister.this, "Harap isi semua field!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(FormRegister.this,
                        "Email: " + email + "\nUsername: " + username + "\nPassword: " + password,
                        Toast.LENGTH_LONG).show();

                Intent intent = new Intent(FormRegister.this,
                        FormLogin.class);
                intent.putExtra("email", email);
                intent.putExtra("username", username);
                startActivity(intent);
                finish();
            }
        });
    }
}
