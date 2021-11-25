package com.example.lab2b_oct2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listView);

        String[] values = new String[]{
                "ICT602",
                "Mobile",
                "Tech",
                "Android",
                "Welcome",
                    "Goodgame",
                    "TeamSpirit",
                    "Pfizer",
                    "Astrazeneca"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, android.R.id.text1, values);
        listView.setAdapter(adapter);
    }
}