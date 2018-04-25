package br.com.lucasfogaca.guiadebolsoportugusingls;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton btnSaudacao;
    private ImageButton btnFamiliares;
    private ImageButton btnNumbers;
    private ImageButton btnXp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSaudacao = findViewById(R.id.idBtnSaudacao);
        btnFamiliares = findViewById(R.id.idBtnFamiliares);
        btnNumbers = findViewById(R.id.ibBtnNumbers);
        btnXp = findViewById(R.id.idBtnXp);

        btnSaudacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SaudacaoActivity.class);
                startActivity(intent);
            }
        });

        btnFamiliares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FamiliaresActivity.class);
                startActivity(intent);
            }
        });

        btnNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NumbersActivity.class);
                startActivity(intent);
            }
        });

        btnXp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), XpActivity.class);
                startActivity(intent);
            }
        });

    }
}
