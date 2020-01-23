package com.heyri.midsemester;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this,getMylist());
        mRecyclerView.setAdapter(myAdapter);
    }
    private ArrayList<Model> getMylist(){

        ArrayList<Model> models = new ArrayList<>();

        Model model = new Model();
        model.setTitle("Monkey D Luffy");
        model.setDescription("Monkey D Luffy adalah Kapten dari kelompok bajak laut Topi Jerami Harga Pertama yang diraih Luffy adalah 30.000.000 Berry.");
        model.setImg(R.drawable.luffy);
        models.add(model);

        model = new Model();
        model.setTitle("Roronoa Zoro");
        model.setDescription("Roronoa Zoro adalah seorang pendekar 3 pedang yang juga merupakan  Wakil Kapten dari Luffy.");
        model.setImg(R.drawable.zoro);
        models.add(model);

        model = new Model();
        model.setTitle("Nami");
        model.setDescription("Sang Navigator dikapal ini mendapat harga buronan pertama yang diraihnya adalah 16.000.000 Berry, setelah kejadian di Ennies Lobby dan mengalahkan Califa dari CP9 dengan jurus tunder lance tempo.");
        model.setImg(R.drawable.nami);
        models.add(model);

        model = new Model();
        model.setTitle("Usopp");
        model.setDescription("Usopp adalah penembak jitu dari kelompok bajak laut Topi Jerami  Dalam daftar buronan terbaru Usopp dinamakan sebagai God Usopp .");
        model.setImg(R.drawable.usop);
        models.add(model);

        model = new Model();
        model.setTitle("Sanji");
        model.setDescription("Kuro Ashi No Sanji adalah sang juru masak atau koki di kapal kelompok bajak laut Topi Jerami.");
        model.setImg(R.drawable.sanji);
        models.add(model);

        model = new Model();
        model.setTitle("Tony Tony Chopper");
        model.setDescription("Chopper merupakan seorang Dokter di kelompok bajak laut Topi Jerami. Harga pertama yang diraihnya adalah 50 Berry, setelah tragedi di Enies Lobby.");
        model.setImg(R.drawable.chopper);
        models.add(model);

        model = new Model();
        model.setTitle("Nico Robin");
        model.setDescription("Nico Robin merupakan sang Arkeolog. Harga pertama yang diraihnya adalah 79.000.000 Berry pada saat dia berumur 8 tahun.");
        model.setImg(R.drawable.robin);
        models.add(model);

        model = new Model();
        model.setTitle("Franky");
        model.setDescription("“Cyborg” Franky adalah anggota kru bajak laut Topi Jerami yang bertugas sebagai mekanik kapal Thousand Sunny sekaligus pembuat kapal tersebut.");
        model.setImg(R.drawable.franky);
        models.add(model);

        model = new Model();
        model.setTitle("Brook");
        model.setDescription("Harga pertama yang diraihnya adalah 33.000.000 Berry saat ia masih bergabung menjadi anggota bajak laut Rumbar. Brook adalah seorang bajak laut dan musisi dari kelompok Bajak Laut Topi Jerami.");
        model.setImg(R.drawable.brook);
        models.add(model);


        return models;
    }
    public boolean onCreateOptionsMenu (Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.profil:
                Intent activity1 = new Intent(this, Toolbar.class);
                startActivity(activity1);
                return true;
            default:
                return true;
        }
    }
}
