package com.example.simpalm.taption;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class AddPhoneActivity extends Activity {

    Button mNextBtn;
    TextView mPlusoneTv, mUnitesStatesTv;
    EditText mPhonenumberTv;
    private android.content.Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_phone);

        mNextBtn = (Button) findViewById(R.id.nextbtn);
        mPlusoneTv = (TextView) findViewById(R.id.plusonetv);
        mPhonenumberTv = (EditText) findViewById(R.id.phonenumberet);
        mUnitesStatesTv = (TextView) findViewById(R.id.unitedstatestv);

        mPhonenumberTv.addTextChangedListener(new TextWatcher() {
            private boolean mFormatting; // this is a flag which prevents the  stack overflow.
            private int mAfter;

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // nothing to do here..
            }

            //called before the text is changed...
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                mAfter = after; // flag to detect backspace..

            }
            //current 555-555-5555     required (555) 555-5555

            @Override
            public void afterTextChanged(Editable s) {
                // Make sure to ignore calls to afterTextChanged caused by the work done below
                if (!mFormatting) {
                    mFormatting = true;
                    // using US formatting...
                    if (mAfter != 0) // in case back space ain't clicked...
                      PhoneNumberUtils.formatNumber(s.toString());


                  /*  PhoneNumber numberProto = phoneUtil.parse(numberStr, "US");
                    //Since you know the country you can format it as follows:
                    System.out.println(phoneUtil.format(numberProto, PhoneNumberFormat.NATIONAL));*/
                    mFormatting = false;
                }
//                if (s.toString().startsWith("1")) {
//                    mMobileEt.setFilters(new InputFilter[]{new InputFilter.LengthFilter(14)});
//                } else
                mPhonenumberTv.setFilters(new InputFilter[]{new InputFilter.LengthFilter(12)});
            }
        });


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
