package br.com.lucasfogaca.guiadebolsoportugusingls;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FamiliaresActivity extends AppCompatActivity {

    private ListView ListaFamiliares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_familiares);

        String[] familiares = new String[]{"Grandfather : avô", "Grandmother : avó", "Grandson : neto", "Granddaughter : neta", "Uncle : tio", "Aunt : tia", "Father-in-law : sogro"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, familiares);

        ListaFamiliares = findViewById(R.id.idListFamiliares);

        ListaFamiliares.setAdapter(adapter);

        ListaFamiliares.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                switch (position){
                    case 0:
                        intent = new Intent(getApplicationContext(), GrandfatherActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        });



    }
}
