package com.example.prabhat.hideseek;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by PRABHAT on 30-04-2015.
 */
public class HIDESEEK extends Activity {
    private TextView mTxtdata;
    private Button mHide;
    private View.OnClickListener mclicklistener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hide_seek);
        init();
        mclicklistener=new Mybtn();
        mHide.setOnClickListener(mclicklistener);

    }
    private void init()
    {
        mTxtdata= (TextView) findViewById(R.id.textData);
        mHide= (Button) findViewById(R.id.btnhideseek);
    }
    class Mybtn implements View.OnClickListener
    {

        @Override
        public void onClick(View v)
        {
            String currenttxt;
         currenttxt =  mHide.getText().toString();
            if(currenttxt=="HIDE")
            {
                mHide.setText("SHOW");
                mTxtdata.setVisibility(View.INVISIBLE);
            }
            else
            {
                mHide.setText("HIDE");
                mTxtdata.setVisibility(View.VISIBLE);
            }
        }
    }
}
