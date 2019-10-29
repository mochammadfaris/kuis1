package com.example.kuis1mprecycleview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private KeluargaAdapter adapter;
    private ArrayList<Keluarga> mahasiswaArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView)findViewById(R.id.recyclerview_1);

        adapter = new KeluargaAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

    }

    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Keluarga("Jali", "Ayah", R.drawable.img5));
        mahasiswaArrayList.add(new Keluarga("Suparmi", "Ibu", R.drawable.img2));
        mahasiswaArrayList.add(new Keluarga("Raisyas", "Anak Pertama", R.drawable.img4));
        mahasiswaArrayList.add(new Keluarga("Mochammad Faris", "Anak Kedua", R.drawable.img1));
        mahasiswaArrayList.add(new Keluarga("Nurandini", "Anak Ketiga",R.drawable.img3));
    }
}


