package com.heyri.myviewandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button BtnDonasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Donasi Pesawat R80");
        }

        BtnDonasi = findViewById(R.id.BtnDonasi);
        BtnDonasi.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.BtnDonasi:
                Intent Donate = new Intent(MainActivity.this, DonasiActivity.class);
                startActivity(Donate);
                break;
        }
    }
}
