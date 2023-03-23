package com.aby.landmarkbookjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.aby.landmarkbookjava.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity
{
    private ActivityMainBinding binding;

    ArrayList<Landmark> landmarks;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        landmarks = new ArrayList<Landmark>();

        // Data
        Landmark pisa = new Landmark("Pisa", "Italy", R.drawable.pisa);
        Landmark eiffel = new Landmark("Eiffel", "France", R.drawable.eiffel);
        Landmark colosseum = new Landmark("Colosseum", "Italy", R.drawable.colosseum);
        Landmark bosphorus = new Landmark("Bosphorus", "Turkey", R.drawable.bosphorus);

        landmarks.add(pisa);
        landmarks.add(eiffel);
        landmarks.add(colosseum);
        landmarks.add(bosphorus);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter = new LandmarkAdapter(landmarks);
        binding.recyclerView.setAdapter(landmarkAdapter);

        /*
        // Adapter: Veri kaynagiyla xml ve listView'u birbirine baglayan yapi
        // List view

        // Mapping: Bir yapiyi baska bir yapiya donusturmek icin kullanilir
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                landmarks.stream().map(landmark -> landmark.name).collect(Collectors.toList())
        );
        binding.listView.setAdapter(arrayAdapter);

        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                intent.putExtra("landmark", landmarks.get(position));
                startActivity(intent);
            }
        });
        */
    }
}