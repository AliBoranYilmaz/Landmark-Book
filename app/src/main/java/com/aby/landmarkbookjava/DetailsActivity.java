package com.aby.landmarkbookjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.aby.landmarkbookjava.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity
{
    // View binding kullanimi
    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();

        // Casting
        Landmark chosenLandmark = (Landmark) intent.getSerializableExtra("landmark");

        binding.imageView.setImageResource(chosenLandmark.image);
        binding.nameText.setText(chosenLandmark.name);
        binding.infoText.setText(chosenLandmark.country);
    }
}