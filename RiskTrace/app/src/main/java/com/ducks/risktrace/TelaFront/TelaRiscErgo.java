package com.ducks.risktrace.TelaFront;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.ducks.risktrace.R;

public class TelaRiscErgo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela_risc_ergo);

        Button buttonVoltaMenu = findViewById(R.id.ButtonVoltarMenu);

        buttonVoltaMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent para trocar de Activity
                Intent intent = new Intent(TelaRiscErgo.this, TelaEscoRis.class);
                startActivity(intent);
            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}