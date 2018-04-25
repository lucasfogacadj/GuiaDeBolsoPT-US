package br.com.lucasfogaca.guiadebolsoportugusingls;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NumbersActivity extends AppCompatActivity {

    private ListView ListaNumbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        String[] numbers = new String[]{"1 - one", "2 - two", "3 - three", "4 - four", "Uncle : tio", "Aunt : tia", "Father-in-law : sogro"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, numbers);

        ListaNumbers = findViewById(R.id.idListaNumbers);

        ListaNumbers.setAdapter(adapter);

        ListaNumbers.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                switch (position){
                    case 0:
                        intent = new Intent(getApplicationContext(), NumerandoActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        });

    }
}
