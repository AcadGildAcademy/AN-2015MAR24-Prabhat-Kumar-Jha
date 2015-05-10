package com.example.prabhat.menu;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by PRABHAT on 10-05-2015.
 */
public class Actmenu extends ActionBarActivity {
    private ListView mlstactmenu;
    private   ArrayList<String> contacts;
    private ArrayAdapter <String> madapter;

    @Nullable
    @Override
    public android.support.v7.app.ActionBar getSupportActionBar() {
        return super.getSupportActionBar();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_menu);
        mlstactmenu= (ListView) findViewById(R.id.lstview_actmenu);
        contacts=new ArrayList<>();
        contacts.add("prabhat");
        contacts.add("subhash");
        contacts.add("ashish");
        madapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,contacts);
mlstactmenu.setAdapter(madapter);
        mlstactmenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Actmenu.this,"Welcome :"+contacts.get(position),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_res,menu);
        return super.onCreateOptionsMenu(menu);
    }
}
