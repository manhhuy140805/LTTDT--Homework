package com.manhhuy.d01112025;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.manhhuy.d01112025.databinding.ListItemBinding;
import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {
    private final ArrayList<Food> Foodlist;
    private final OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClicked(int position, Food androidVersion);
    }

    public FoodAdapter(ArrayList<Food> list, OnItemClickListener listener) {
        this.Foodlist = list;
        this.listener = listener;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final ListItemBinding binding;

        public ViewHolder(ListItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ListItemBinding binding = ListItemBinding.inflate(
                LayoutInflater.from(parent.getContext()),
                parent,
                false
        );
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.binding.tvName.setText(Foodlist.get(position).getName() + Foodlist.get(position).getWeight());
        holder.binding.tvDescription.setText(Foodlist.get(position).getDescription());
        holder.binding.textPrice.setText(Foodlist.get(position).getPrice());
        int imageResId = holder.itemView.getContext()
                .getResources()
                .getIdentifier(Foodlist.get(position).getUrlImage(), "drawable", holder.itemView.getContext().getPackageName());

        holder.binding.ivImage.setImageResource(imageResId);
    }

    @Override
    public int getItemCount() {
        return Foodlist.size();
    }
}