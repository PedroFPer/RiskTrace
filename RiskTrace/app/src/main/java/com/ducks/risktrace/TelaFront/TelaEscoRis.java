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

public class TelaEscoRis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela_esco_ris);

        Button buttonEscolEngo = findViewById(R.id.ButtonRiscEngo);
        Button buttonEscolFis = findViewById(R.id.ButtonRiscFis);
        Button buttonEscolQui = findViewById(R.id.ButtonRiscQuim);
        Button buttonEscolBio = findViewById(R.id.ButtonRiscBio);
        Button buttonEscolAci = findViewById(R.id.ButtonRiscAcid);

        buttonEscolEngo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent para trocar de Activity
                Intent intent = new Intent(TelaEscoRis.this, TelaRiscErgo.class);
                startActivity(intent);
            }
        });

        buttonEscolFis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent para trocar de Activity
                Intent intent = new Intent(TelaEscoRis.this, TelaEscoFis.class);
                startActivity(intent);
            }
        });

        buttonEscolQui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent para trocar de Activity
                Intent intent = new Intent(TelaEscoRis.this, TelaEscoQuim.class);
                startActivity(intent);
            }
        });

        buttonEscolBio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent para trocar de Activity
                Intent intent = new Intent(TelaEscoRis.this, TelaEscoBiol.class);
                startActivity(intent);
            }
        });

        buttonEscolAci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent para trocar de Activity
                Intent intent = new Intent(TelaEscoRis.this, TelaEscoAcid.class);
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