package com.example.spinnerfrutas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner sfrutas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        crearSpinner();
    }

    public void crearSpinner() {
        String[] frutas = {"Selecciona una fruta", "Fresas", "Platanos", "Manzanas"};
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, frutas);
        sfrutas = (Spinner) findViewById(R.id.sFrutas);
        sfrutas.setAdapter(adapter);

    }

    public void cargarFoto(View v) {
        ImageView ivFrutas = (ImageView) findViewById(R.id.ivFrutas);
        switch (sfrutas.getSelectedItemPosition()) {
            case 1:
                ivFrutas.setImageResource(R.drawable.fresas);
                break;
            case 2:
                ivFrutas.setImageResource(R.drawable.platanos);
                break;
            case 3:
                ivFrutas.setImageResource(R.drawable.manzana);
                break;
            default:
                Toast.makeText(this, "Debes seleccionar una opcion", Toast.LENGTH_SHORT).show();
        }
    }
}