package com.example.kafe;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class CafeRecommend extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        String[] values = new String[] {
                "The Koffee",
                "Kopimeo",
                "Hirup Cafe",
                "Kopi Daun",
                "Makan Ngopi",
                "Take Five",
                "The Third Letter",
                "Sebentar Kopi",
                "The Komunal Cafe",
                "Coffee Dock",
                "Eighteen Cafe",
                "Sip Sip Cafe",
                "Kopi Pokok",
                "Kedai Kopi Kebun",
                "Rumah Ketupat Cafe",
                "Common Cafe"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1, android.R.id.text1, values);
        listView.setAdapter(adapter);
    }
}
