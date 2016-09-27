package com.example.fabiansebban.firstproject;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private ListView mainListView;
    private Button mainButtonView;
    private ArrayList<Users> users;

    // Permet d'initialiser l'appli
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ex4);

        mainListView = (ListView)findViewById(R.id.toto);
        mainButtonView = (Button)findViewById(R.id.confirmButton);

        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_single_choice);

        listAdapter.add("First");
        listAdapter.add("Second");
        listAdapter.add("Third");

        /*
        mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), view + " Removed", Toast.LENGTH_LONG).show();

                ArrayAdapter adapterL = (ArrayAdapter)parent.getAdapter();
                //adapterL.remove(adapterL.getItem(position));
            }
        });
*/

        mainListView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        mainListView.setAdapter(listAdapter);

        mainButtonView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int i = 0;
                String toPrint = "";

                SparseBooleanArray checkedElements = mainListView.getCheckedItemPositions();

                while(i < mainListView.getAdapter().getCount())
                {
                    if(checkedElements.get(i))
                    {
                        toPrint = toPrint + mainListView.getAdapter().getItem(i) + "\n";
                    }

                    i++;
                }
                Log.d("Mes logs", toPrint);
            }
        });
    }

    // Délancher quand l'utilisateur quitte l'appli
    protected void onPause(Bundle savedInstanceState) {

    }
}
