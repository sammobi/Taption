package com.example.simpalm.taption;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Locale;

public class AddPhoneActivity extends Activity {

    Button mNextBtn, mONeBtn, mTwobtn, mThreeBtn, mFourBtn, mFiveBtn, mSixBtn, mSevenBtn, mEightBtn, mNineBtn, mZeroBtn;
    ImageView mBackSpaceImg;
    TextView mPlusoneTv, mUnitesStatesTv;
    LinearLayout mKeyboardLl;
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
        mKeyboardLl = (LinearLayout) findViewById(R.id.keyboardll);
        mONeBtn = (Button) findViewById(R.id.btn1);
        mTwobtn = (Button) findViewById(R.id.btn2);
        mZeroBtn = (Button) findViewById(R.id.btn0);

        mThreeBtn = (Button) findViewById(R.id.btn3);
        mFourBtn = (Button) findViewById(R.id.btn4);
        mFiveBtn = (Button) findViewById(R.id.btn5);

        mSixBtn = (Button) findViewById(R.id.btn6);
        mSevenBtn = (Button) findViewById(R.id.btn7);
        mEightBtn = (Button) findViewById(R.id.btn8);
        mNineBtn = (Button) findViewById(R.id.btn9);
        mBackSpaceImg = (ImageView) findViewById(R.id.imgbackspace);

                /*.addTextChangedListener(new TextWatcher() {
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



                    PhoneNumber numberProto = phoneUtil.parse(numberStr, "US");
                    //Since you know the country you can format it as follows:
                    System.out.println(phoneUtil.format(numberProto, PhoneNumberFormat.NATIONAL));
                    mFormatting = false;
                }

                mPhonenumberTv.setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
            }
        });
*/

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
                mKeyboardLl.setVisibility(View.VISIBLE);

                // Hide native keyboard on click of the button

                InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
                imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);

            }
        });

        mNextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mKeyboardLl.setVisibility(View.GONE);


            }
        });

        mONeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mPhonenumberTv.setText(mPhonenumberTv.getText() + "1");


            }
        });
        mTwobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mPhonenumberTv.setText(mPhonenumberTv.getText() + "2");


            }
        });

        mThreeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mPhonenumberTv.setText(mPhonenumberTv.getText() + "3");


            }
        });
        mFourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mPhonenumberTv.setText(mPhonenumberTv.getText() + "4");


            }
        });
        mFiveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mPhonenumberTv.setText(mPhonenumberTv.getText() + "5");


            }
        });
        mSixBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mPhonenumberTv.setText(mPhonenumberTv.getText() + "6");


            }
        });
        mSevenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mPhonenumberTv.setText(mPhonenumberTv.getText() + "7");


            }
        });
        mEightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mPhonenumberTv.setText(mPhonenumberTv.getText() + "8");


            }
        });
        mNineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mPhonenumberTv.setText(mPhonenumberTv.getText() + "9");


            }
        });

        mZeroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mPhonenumberTv.setText(mPhonenumberTv.getText() + "0");


            }
        });


        mBackSpaceImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int length = mPhonenumberTv.getText().length();
                if (length > 0) {
                    mPhonenumberTv.getText().delete(length - 1, length);
                }

            }
        });


    }


    // back button pressed visiblity gone of certain component
    @Override
    public void onBackPressed() {

        if (mKeyboardLl.getVisibility() == (View.VISIBLE))
            mKeyboardLl.setVisibility(View.GONE);


        else

            super.onBackPressed();


    }


}
