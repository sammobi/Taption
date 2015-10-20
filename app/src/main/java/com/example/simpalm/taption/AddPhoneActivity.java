package com.example.simpalm.taption;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AddPhoneActivity extends Activity {

    Button mNextBtn;
    TextView mPlusoneTv, mPhonenumberTv, mUnitesStatesTv;
    private android.content.Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_phone);

        mNextBtn = (Button) findViewById(R.id.nextbtn);
        mPlusoneTv = (TextView) findViewById(R.id.plusonetv);
        mPhonenumberTv = (TextView) findViewById(R.id.phonenumberet);
        mUnitesStatesTv = (TextView) findViewById(R.id.unitedstatestv);


        mPlusoneTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                AlertDialog.Builder alert = new AlertDialog.Builder(AddPhoneActivity.this);
                alert.setTitle("Alert");
                alert.setMessage("Taption is currently only available in the U.S");
                alert.setPositiveButton("OK", null);
                alert.show();
            }
        });

        mUnitesStatesTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alert = new AlertDialog.Builder(AddPhoneActivity.this);
                alert.setTitle("Alert");
                alert.setMessage("Taption is currently only available in the U.S");
                alert.setPositiveButton("OK", null);
                alert.show();

            }
        });

        mPhonenumberTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }


}
