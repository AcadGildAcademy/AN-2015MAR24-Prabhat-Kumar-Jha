package com.example.prabhat.preferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;

/**
 * Created by PRABHAT on 08-05-2015.
 */
public class preferenceact extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.user_setting);
        Intent i=getIntent();
        SharedPreferences SP = PreferenceManager.getDefaultSharedPreferences(getBaseContext());

        String strUserName = SP.getString("password", "NA");
        boolean bAppUpdates = SP.getBoolean("applicationUpdates",false);
        String downloadType = SP.getString("downloadType","1");
        i.putExtra("password",strUserName);
        i.putExtra("applicationUpdates",bAppUpdates);
        i.putExtra("downloadType",downloadType);
        setResult(1,i);
        finish();
    }
}
