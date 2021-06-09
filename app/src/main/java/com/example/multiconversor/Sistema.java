package com.example.multiconversor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

import com.example.multiconversor.views.ViewRentabilidade;

public class Sistema extends AppCompatActivity {

    private Button btnRentabilidade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sistema);

        btnRentabilidade = findViewById(R.id.btnRentabilidade);

        btnRentabilidade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Sistema.this, ViewRentabilidade.class);
                startActivity(i);
            }
        });

    }
}