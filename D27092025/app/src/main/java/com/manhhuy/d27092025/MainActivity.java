package com.manhhuy.d27092025;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.manhhuy.d27092025.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        addEvent();
    }

    private void addEvent() {
        binding.buttonSignIn.setOnClickListener(this::onClickSignIn);
    }

    private void onClickSignIn(View view) {
        Intent intent = new Intent(this, CreateAccount.class);
        startActivity(intent);
    }
}