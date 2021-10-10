package com.example.grocerytogo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class EditDataDiri extends AppCompatActivity {

    private Button simpan;
    private ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_data_diri);

        simpan = findViewById(R.id.simpan_datadiri);
        back = findViewById(R.id.imageView5);

        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Intent in = new Intent(EditDataDiri.this, Pengaturan.class);
                startActivity(in);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Intent in = new Intent(EditDataDiri.this, LihatDataDiri.class);
                startActivity(in);
            }
        });
    }
}