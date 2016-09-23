package com.example.buckys.buckys;

import android.app.Activity;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        String[] countries = res.getStringArray(R.array.country);
        ListAdapter listAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, countries);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String country= String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(MainActivity.this, country, Toast.LENGTH_SHORT).show();

            }
        });




}
}
