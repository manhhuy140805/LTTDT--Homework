package com.manhhuy.d27092025;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.manhhuy.d27092025.databinding.ActivityCreateAccountBinding;

public class CreateAccount extends AppCompatActivity {
    private ActivityCreateAccountBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCreateAccountBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        addEvent();
    }

    private void addEvent() {
        binding.buttonLogin.setOnClickListener(this::onClickLogin);
    }

    private void onClickLogin(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}