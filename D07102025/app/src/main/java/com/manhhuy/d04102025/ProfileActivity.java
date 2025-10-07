package com.manhhuy.d04102025;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.manhhuy.d04102025.databinding.ActivityProfileBinding;

public class ProfileActivity extends AppCompatActivity {
    private ActivityProfileBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String email = getIntent().getStringExtra("USERNAME");
        if (email != null && !email.isEmpty()) {
            binding.tvEmail.setText(email);
        } else {
            binding.tvEmail.setText("Không có dữ liệu");
        }

        binding.imageView5.setOnClickListener(v -> {
            finish();
        });
    }
}
