package com.example.prabhat.sqlitedemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.List;

/**
 * Created by PRABHAT on 18-05-2015.
 */
public class MainActivity extends Activity {
    /*
    * Change to type CustomAutoCompleteView instead of AutoCompleteTextView
    * since we are extending to customize the view and disable filter
    * The same with the XML view, type will be CustomAutoCompleteView
    */
    AutoCompleteTextView myAutoComplete;

    // adapter for auto-complete
    ArrayAdapter<String> myAdapter;

    // for database operations
    DatabaseHandler databaseH;

    // just to add some initial value
    String[] item = new String[] {"Please search..."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.auto_complete);

        try{

            // instantiate database handler
            databaseH = new DatabaseHandler(MainActivity.this);

            // put sample data to database
            insertSampleData();

            // autocompletetextview is in activity_main.xml
            myAutoComplete = (AutoCompleteTextView) findViewById(R.id.myautocomplete);

            // add the listener so it will tries to suggest while the user types
            myAutoComplete.addTextChangedListener(new CustomAutoCompleteTextChangedListener(this));

            // set our adapter
            myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, item);
            myAutoComplete.setAdapter(myAdapter);

        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertSampleData(){

        // CREATE
        databaseH.create( new MyObject("January") );
        databaseH.create( new MyObject("February") );
        databaseH.create( new MyObject("March") );
        databaseH.create( new MyObject("April") );
        databaseH.create( new MyObject("May") );
        databaseH.create( new MyObject("June") );
        databaseH.create( new MyObject("July") );
        databaseH.create( new MyObject("August") );
        databaseH.create( new MyObject("September") );
        databaseH.create( new MyObject("October") );
        databaseH.create( new MyObject("November") );
        databaseH.create( new MyObject("December") );
        databaseH.create( new MyObject("New Caledonia") );
        databaseH.create( new MyObject("New Zealand") );
        databaseH.create( new MyObject("Papua New Guinea") );
        databaseH.create( new MyObject("COFFEE-1K") );
        databaseH.create( new MyObject("coffee raw") );
        databaseH.create( new MyObject("authentic COFFEE") );
        databaseH.create( new MyObject("k12-coffee") );
        databaseH.create( new MyObject("view coffee") );
        databaseH.create( new MyObject("Indian-coffee-two") );

    }

    // this function is used in CustomAutoCompleteTextChangedListener.java
    public String[] getItemsFromDb(String searchTerm){

        // add items on the array dynamically
        List<MyObject> products = databaseH.read(searchTerm);
        int rowCount = products.size();

        String[] item = new String[rowCount];
        int x = 0;

        for (MyObject record : products) {

            item[x] = record.objectName;
            x++;
        }

        return item;
    }

}
