package com.mrwhitehat.context_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.list);
        String lists [] = {"Store One", "Store Two", "XYZ Shop", "ABC Store", "Store A", "Store B"};
        ArrayAdapter<String> shops = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, lists);
        list.setAdapter(shops);

        registerForContextMenu(list);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        getMenuInflater().inflate(R.menu.menus, menu);

    }
}