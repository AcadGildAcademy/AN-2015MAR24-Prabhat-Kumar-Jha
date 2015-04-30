package com.example.prabhat.myapplication23;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by PRABHAT on 29-04-2015.
 */
public class Prabhat123 extends Activity {

    private EditText mEdtCardBalance, mEdtInterestRate, mEdtPayement,mEdtFinalBalance,mEdtMonthsRemaining,mEdtInterestpaid;
    private Button mBtnCompute, mBtnClear;
    private TextView mTxtCardBalance, mTxtInterestRate, mTxtPayement,mTxtFinalBalance,mTxtMonthsRemaining,mTxtInterestpaid;
    private View.OnClickListener mclickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prabhat_cre);
        init();

        mclickListener = new MyBtnListener();
        mBtnCompute.setOnClickListener(mclickListener);
        mBtnClear.setOnClickListener(mclickListener);

    }

    class MyBtnListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.btnCompute:
                    int principle= Integer.parseInt(mEdtCardBalance.getText().toString());
                    int interest= Integer.parseInt(mEdtInterestRate.getText().toString());
                    int minpayement= Integer.parseInt(mEdtPayement.getText().toString());
                    int count=1,monthlybalance,monthlyprinciple,monthlyinterest;
                    int interestpaid;

                    while(principle!=0)
                    {
                        int flag=0;
                        monthlyinterest = Math.round((principle * interest) / (100 * 12));
                        if(monthlyinterest==0)
                             {
                               mEdtMonthsRemaining.setText(""+count);
                               mEdtInterestpaid.setText(""+principle);
                               mEdtFinalBalance.setText(""+0);
                                 break;
                             }

                        monthlyprinciple= minpayement-monthlyinterest;
                        monthlybalance=principle-monthlyprinciple;
                        principle=monthlybalance;
                        count++;

                    }

                    break;
                case R.id.btnClear:
                  Toast  .makeText(Prabhat123.this, "now its clear", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }
    private void init(){

        mEdtCardBalance = (EditText) findViewById(R.id.edtCardBalance);
        mEdtInterestRate = (EditText) findViewById(R.id.edtInterestRate);
        mEdtPayement= (EditText) findViewById(R.id.edtPayement);
        mEdtFinalBalance= (EditText) findViewById(R.id.edtFinalCardBalance);
        mEdtMonthsRemaining= (EditText) findViewById(R.id.edtMonthsRemaining);
        mEdtInterestpaid= (EditText) findViewById(R.id.edtFinalInterest);

        mBtnCompute = (Button) findViewById(R.id.btnCompute);
        mBtnClear = (Button) findViewById(R.id.btnClear);

        mTxtCardBalance= (TextView) findViewById(R.id.textCardBalance);
        mTxtInterestRate= (TextView) findViewById(R.id.txtInterestRate);
        mTxtPayement= (TextView) findViewById(R.id.txtPayement);
        mTxtFinalBalance= (TextView) findViewById(R.id.txtFinaCardBalance);
        mTxtMonthsRemaining= (TextView) findViewById(R.id.MonthsRemaining);
        mTxtInterestpaid= (TextView) findViewById(R.id.txtFinalInterest);

    }
}


