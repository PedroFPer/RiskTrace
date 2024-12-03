package com.ducks.risktrace.TelaFront;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.ducks.risktrace.R;

public class TelaFormulGeral extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formul_geral);


        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.TelaFormulGeral, new TelaFormul1())
                    .commit();
        }
    }


    public void changeFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.TelaFormulGeral, fragment)
                .addToBackStack(null)
                .commit();
    }
}
