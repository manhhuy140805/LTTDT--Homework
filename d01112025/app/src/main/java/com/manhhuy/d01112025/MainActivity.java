package com.manhhuy.d01112025;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.os.Bundle;
import android.widget.Toast;

import com.manhhuy.d01112025.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private FoodAdapter adapter;
    private ArrayList<Food> foodList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initializeData();
        setupRecyclerView();
    }

    private void initializeData() {
        foodList = new ArrayList<Food>();
        foodList.add(new Food("Cupcake", "150g", "25.000đ",
                "cupcake",
                "Bánh cupcake thơm ngon với lớp kem bơ mềm mịn, phù hợp cho mọi dịp."));

        foodList.add(new Food("Donut", "120g", "20.000đ",
                "donut",
                "Bánh donut ngọt ngào phủ socola, giòn nhẹ bên ngoài, mềm bên trong."));

        foodList.add(new Food("Eclair", "180g", "28.000đ",
                "eclair",
                "Bánh su kem Pháp nhân vani, hương vị béo ngậy và thanh thoát."));

        foodList.add(new Food("Gingerbread", "200g", "30.000đ",
                "gingerbread",
                "Bánh gừng thơm lừng, mang hương vị Giáng sinh truyền thống."));

        foodList.add(new Food("Honeycomb", "130g", "22.000đ",
                "honeycomb",
                "Kẹo tổ ong giòn tan, vị ngọt tự nhiên từ mật ong nguyên chất."));

    }

    private void setupRecyclerView() {
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setHasFixedSize(true);

        adapter = new FoodAdapter(foodList, (position, food) -> {
            Toast.makeText(MainActivity.this,
                    "Version: " + food.getName(),
                    Toast.LENGTH_SHORT).show();
        });

        binding.recyclerView.setAdapter(adapter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding = null;
    }
}