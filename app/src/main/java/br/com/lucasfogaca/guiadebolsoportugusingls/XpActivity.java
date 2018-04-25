package br.com.lucasfogaca.guiadebolsoportugusingls;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class XpActivity extends AppCompatActivity {

    private ListView ListaXp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xp);

        String[] xp = new String[]{"For goodness’ sake! – Pelo amor de Deus!", "To have no clue – Não ter a menor ideia.", "Never heard of – Nunca ouvi falar.", "Never mind – Deixa prá lá.", "Pretty soon – Em breve.", "So far, so good – Até aqui, tudo bem.…", " To kill two birds with one stone – Matar dois pássaros com uma pedra só."};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, xp);

        ListaXp = findViewById(R.id.idListaXp);

        ListaXp.setAdapter(adapter);

        ListaXp.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                switch (position){
                    case 0:
                        intent = new Intent(getApplicationContext(), LXpActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        });

    }
}
