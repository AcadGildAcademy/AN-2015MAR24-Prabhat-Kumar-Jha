package com.example.prabhat.preferences;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by PRABHAT on 08-05-2015.
 */
public class Mainactivity extends Activity {
    private TextView mtxtpasswd;
    private Button mbtnstart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       //
        setContentView(R.layout.act_main);
        init();
        mbtnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Mainactivity.this,preferenceact.class);
                startActivityForResult(intent,1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent i) {
        super.onActivityResult(requestCode, resultCode, i);
       // String[] passwd=i.getStringArrayExtra("password");
        String passwd=i.getStringExtra("password");
        mtxtpasswd.setText(passwd);


    }

    private void init() {
        mtxtpasswd= (TextView) findViewById(R.id.txt_act_main);
        mbtnstart= (Button) findViewById(R.id.btn_act_main);

    }
}


