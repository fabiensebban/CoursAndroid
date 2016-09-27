package com.example.fabiansebban.firstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView mainListView;

    // Permet d'initialiser l'appli
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ex4);
        mainListView = (ListView)findViewById(R.id.simple_list_item_1);

        final ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);

        listAdapter.add("First");
        listAdapter.add("Second");
        listAdapter.add("Third");

        mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), listAdapter.getItem(position) + " Removed", Toast.LENGTH_LONG).show();

                listAdapter.remove(listAdapter.getItem(position));
            }
        });


        mainListView.setAdapter(listAdapter);
    }

    // Délancher quand l'utilisateur quitte l'appli
    protected void onPause(Bundle savedInstanceState) {

    }
}
