package com.example.exos1ldnr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {

    private ArrayAdapter<String> tableau;
    private ListView myListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        // récupération de la listView
         myListView = (ListView) findViewById(R.id.myListView);

        // intanciation d'un adapteur avec ma liste et mon layout et l'id du textView
        final ArrayAdapter<String> tableau = new ArrayAdapter<>(myListView.getContext(),R.layout.listview_elements,R.id.textMyListView);

        // on ajoute nos chaînes de caractère
        for(int i = 1; i<41; i++){
            tableau.add("Item n°" + i);
        }

        // on affiche cet adapteur
        myListView.setAdapter(tableau);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Content item: " + myListView.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
