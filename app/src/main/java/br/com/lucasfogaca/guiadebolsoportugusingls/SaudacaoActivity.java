package br.com.lucasfogaca.guiadebolsoportugusingls;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SaudacaoActivity extends AppCompatActivity {

    private ListView ListaSaudacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saudacao);

        String[] saudacao = new String[]{"Hello, Hi - Olá, oi", "Good morning - Bom dia", "Good afternoon - Boa tarde", "Good evening - Boa noite", "What's your name? - Qual é o seu nome?", "Hi, my name is - Oi, meu nome é…", "I'm sorry, (but) what was your name again? - Desculpe, (mas) qual é mesmo o seu nome?"};


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, saudacao);

        ListaSaudacao = findViewById(R.id.idListaSaudacao);

        ListaSaudacao.setAdapter(adapter);

        ListaSaudacao.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                switch (position){
                    case 0:
                        intent = new Intent(getApplicationContext(), HelloActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        });


    }


}
