package com.example.simpalm.taption;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PhoneVerificationActivity extends Activity implements View.OnClickListener {
    public final static String MESSAGE_KEY = "com.example.simpalm.taption.message_key";


    TextView mPhoneNumberTv;

    ImageView mBackSpaceImg;
    TextView mPhone1tv, mPhone2tv, mPhone3tv, mPhone4tv, mPhone5tv, mPhone6tv;
    Button mNextBtn, mONeBtn, mTwobtn, mThreeBtn, mFourBtn, mFiveBtn, mSixBtn, mSevenBtn, mEightBtn, mNineBtn, mZeroBtn, mPhoneNumberEdit;
    LinearLayout mKeyboardLl;
    ImageButton mBackBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_verification);

        mPhoneNumberEdit = (Button) findViewById(R.id.editnumberbtn);

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
        mBackBtn = (ImageButton) findViewById(R.id.backarrow);


        mPhone1tv = (TextView) findViewById(R.id.phonever1);
        mPhone2tv = (TextView) findViewById(R.id.phonever2);
        mPhone3tv = (TextView) findViewById(R.id.phonever3);
        mPhone4tv = (TextView) findViewById(R.id.phonever4);
        mPhone5tv = (TextView) findViewById(R.id.phonever5);
        mPhone6tv = (TextView) findViewById(R.id.phonever6);
        mPhoneNumberTv = (TextView) findViewById(R.id.phoneverified);


        mPhoneNumberEdit.setOnClickListener(this);
        mONeBtn.setOnClickListener(this);
        mTwobtn.setOnClickListener(this);
        mZeroBtn.setOnClickListener(this);
        mThreeBtn.setOnClickListener(this);
        mFourBtn.setOnClickListener(this);
        mFiveBtn.setOnClickListener(this);
        mSixBtn.setOnClickListener(this);
        mSevenBtn.setOnClickListener(this);
        mEightBtn.setOnClickListener(this);
        mNineBtn.setOnClickListener(this);
        mBackSpaceImg.setOnClickListener(this);
        mBackBtn.setOnClickListener(this);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MESSAGE_KEY);
        mPhoneNumberTv.setText(message);


    }

    void appendValue(int value) {
        if (mPhone1tv.getText().toString().trim().equals("-")) {
            mPhone1tv.setText("" + value);
        } else if (mPhone2tv.getText().toString().trim().equals("-")) {
            mPhone2tv.setText("" + value);
        } else if (mPhone3tv.getText().toString().trim().equals("-")) {
            mPhone3tv.setText("" + value);
        } else if (mPhone4tv.getText().toString().trim().equals("-")) {
            mPhone4tv.setText("" + value);
        } else if (mPhone5tv.getText().toString().trim().equals("-")) {
            mPhone5tv.setText("" + value);
        } else if (mPhone6tv.getText().toString().trim().equals("-")) {
            mPhone6tv.setText("" + value);
        }
    }

    void deleteValue() {
        if (!mPhone6tv.getText().toString().trim().equals("-")) {
            mPhone6tv.setText("-");
        } else if (!mPhone5tv.getText().toString().trim().equals("-")) {
            mPhone5tv.setText("-");
        } else if (!mPhone4tv.getText().toString().trim().equals("-")) {
            mPhone4tv.setText("-");
        } else if (!mPhone3tv.getText().toString().trim().equals("-")) {
            mPhone3tv.setText("-");
        } else if (!mPhone2tv.getText().toString().trim().equals("-")) {
            mPhone2tv.setText("-");
        } else if (!mPhone1tv.getText().toString().trim().equals("-")) {
            mPhone1tv.setText("-");
        }
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {


            case R.id.backarrow:
                finish();

                break;


            case R.id.editnumberbtn:

                Intent intent = new Intent(PhoneVerificationActivity.this, AddPhoneActivity.class);

                startActivity(intent);

                break;


         /*   case R.id.btn1:

                switch (entered_value_length) {

                    case 0:
                        if (mPhone1tv.getText().toString().equals("-")) ;
                        mPhone1tv.setText("1");
                        entered_value_length++;
                        break;


                    case 1:
                        mPhone2tv.setText("1");
                        entered_value_length++;
                        break;


                    case 2:
                        mPhone3tv.setText("1");
                        entered_value_length++;
                        break;

                    case 3:
                        mPhone4tv.setText("1");
                        entered_value_length++;
                        break;

                    case 4:
                        mPhone5tv.setText("1");
                        entered_value_length++;
                        break;

                    case 5:
                        mPhone6tv.setText("1");
                        entered_value_length++;
                        break;


                }

            case R.id.btn2:

                switch (entered_value_length) {

                    case 0:

                        mPhone1tv.setText("2");
                        entered_value_length++;
                        break;


                    case 1:
                        mPhone2tv.setText("2");
                        entered_value_length++;
                        break;


                    case 2:
                        mPhone3tv.setText("2");
                        entered_value_length++;
                        break;

                    case 3:
                        mPhone4tv.setText("2");
                        entered_value_length++;
                        break;

                    case 4:
                        mPhone5tv.setText("2");
                        entered_value_length++;
                        break;

                    case 5:
                        mPhone6tv.setText("2");
                        entered_value_length++;
                        break;


                }

            case R.id.btn3:

                switch (entered_value_length) {

                    case 0:

                        mPhone1tv.setText("3");
                        entered_value_length++;
                        break;


                    case 1:
                        mPhone2tv.setText("3");
                        entered_value_length++;
                        break;


                    case 2:
                        mPhone3tv.setText("3");
                        entered_value_length++;
                        break;

                    case 3:
                        mPhone4tv.setText("3");
                        entered_value_length++;
                        break;

                    case 4:
                        mPhone5tv.setText("3");
                        entered_value_length++;
                        break;

                    case 5:
                        mPhone6tv.setText("3");
                        entered_value_length++;
                        break;


                }


            case R.id.btn4:

                switch (entered_value_length) {

                    case 0:

                        mPhone1tv.setText("4");
                        entered_value_length++;
                        break;


                    case 1:
                        mPhone2tv.setText("4");
                        entered_value_length++;
                        break;


                    case 2:
                        mPhone3tv.setText("4");
                        entered_value_length++;
                        break;

                    case 3:
                        mPhone4tv.setText("4");
                        entered_value_length++;
                        break;

                    case 4:
                        mPhone5tv.setText("4");
                        entered_value_length++;
                        break;

                    case 5:
                        mPhone6tv.setText("4");
                        entered_value_length++;
                        break;


                }


            case R.id.btn5:

                switch (entered_value_length) {

                    case 0:

                        mPhone1tv.setText("5");
                        entered_value_length++;
                        break;


                    case 1:
                        mPhone2tv.setText("5");
                        entered_value_length++;
                        break;


                    case 2:
                        mPhone3tv.setText("5");
                        entered_value_length++;
                        break;

                    case 3:
                        mPhone4tv.setText("5");
                        entered_value_length++;
                        break;

                    case 4:
                        mPhone5tv.setText("5");
                        entered_value_length++;
                        break;

                    case 5:
                        mPhone6tv.setText("5");
                        entered_value_length++;
                        break;


                }*/


            case R.id.btn1:

                appendValue(1);

              /*  if (mPhone1tv.getText().toString().isEmpty() && mPhone1tv.getText().toString().equals("-")) {

                    mPhone1tv.setText("1");
                    break;
                } else if (mPhone2tv.getText().toString().isEmpty() && mPhone2tv.getText().toString().equals("-")) {

                    mPhone2tv.setText("1");
                } else if (mPhone3tv.getText().toString().isEmpty() && mPhone3tv.getText().toString().equals("-")) {

                    mPhone3tv.setText("1");
                } else if (mPhone4tv.getText().toString().isEmpty() && mPhone4tv.getText().toString().equals("-")) {

                    mPhone4tv.setText("1");
                } else if (mPhone5tv.getText().toString().isEmpty() && mPhone5tv.getText().toString().equals("-")) {

                    mPhone5tv.setText("1");
                } else if (mPhone6tv.getText().toString().isEmpty() && mPhone5tv.getText().toString().equals("-")) {

                    mPhone6tv.setText("1");
                    Intent intent1 = new Intent(getApplicationContext(), LoginActivity.class);

                    startActivity(intent1);*/

/*
                }*/
                break;
            case R.id.btn2:
                appendValue(2);


           /*     if (mPhone1tv.getText().toString().isEmpty() && mPhone1tv.getText().toString().equals("-")) {

                    mPhone1tv.setText("2");
                } else if (mPhone2tv.getText().toString().isEmpty() && mPhone2tv.getText().toString().equals("-")) {

                    mPhone2tv.setText("2");
                } else if (mPhone3tv.getText().toString().isEmpty() && mPhone3tv.getText().toString().equals("-")) {

                    mPhone3tv.setText("2");
                } else if (mPhone4tv.getText().toString().isEmpty() && mPhone4tv.getText().toString().equals("-")) {

                    mPhone4tv.setText("2");
                } else if (mPhone5tv.getText().toString().isEmpty() && mPhone5tv.getText().toString().equals("-")) {

                    mPhone5tv.setText("2");
                } else if (mPhone6tv.getText().toString().isEmpty() && mPhone6tv.getText().toString().equals("-")) {

                    mPhone6tv.setText("2");
                    Intent intent1 = new Intent(getApplicationContext(), LoginActivity.class);

                    startActivity(intent1);
                }*/
                break;

            case R.id.btn3:
                appendValue(3);
            /*    if (mPhone1tv.getText().toString().isEmpty() && mPhone1tv.getText().toString().equals("-")) {

                    mPhone1tv.setText("3");
                } else if (mPhone2tv.getText().toString().isEmpty() && mPhone2tv.getText().toString().equals("-")) {

                    mPhone2tv.setText("3");
                } else if (mPhone3tv.getText().toString().isEmpty() && mPhone3tv.getText().toString().equals("-")) {

                    mPhone3tv.setText("3");
                } else if (mPhone4tv.getText().toString().isEmpty() && mPhone4tv.getText().toString().equals("-")) {

                    mPhone4tv.setText("3");
                } else if (mPhone5tv.getText().toString().isEmpty() && mPhone5tv.getText().toString().equals("-")) {

                    mPhone5tv.setText("3");
                } else if (mPhone6tv.getText().toString().isEmpty() && mPhone6tv.getText().toString().equals("-")) {

                    mPhone6tv.setText("3");
                    Intent intent1 = new Intent(getApplicationContext(), LoginActivity.class);

                    startActivity(intent1);
                }*/
                break;


            case R.id.btn5:
                appendValue(5);
           /*     if (mPhone1tv.getText().toString().isEmpty() && mPhone1tv.getText().toString().equals("-")) {

                    mPhone1tv.setText("5");
                } else if (mPhone2tv.getText().toString().isEmpty() && mPhone2tv.getText().toString().equals("-")) {

                    mPhone2tv.setText("5");
                } else if (mPhone3tv.getText().toString().isEmpty() && mPhone3tv.getText().toString().equals("-")) {

                    mPhone3tv.setText("5");
                } else if (mPhone4tv.getText().toString().isEmpty() && mPhone4tv.getText().toString().equals("-")) {

                    mPhone4tv.setText("5");
                } else if (mPhone5tv.getText().toString().isEmpty() && mPhone5tv.getText().toString().equals("-")) {

                    mPhone5tv.setText("5");
                } else if (mPhone6tv.getText().toString().isEmpty() && mPhone6tv.getText().toString().equals("-")) {

                    mPhone6tv.setText("5");
                    Intent intent1 = new Intent(getApplicationContext(), LoginActivity.class);

                    startActivity(intent1);
                }*/
                break;

            case R.id.btn6:
                appendValue(6);
            /*    if (mPhone1tv.getText().toString().isEmpty() && mPhone1tv.getText().toString().equals("-")) {

                    mPhone1tv.setText("6");
                } else if (mPhone2tv.getText().toString().isEmpty() && mPhone2tv.getText().toString().equals("-")) {

                    mPhone2tv.setText("6");
                } else if (mPhone3tv.getText().toString().isEmpty() && mPhone3tv.getText().toString().equals("-")) {

                    mPhone3tv.setText("6");
                } else if (mPhone4tv.getText().toString().isEmpty() && mPhone4tv.getText().toString().equals("-")) {

                    mPhone4tv.setText("6");
                } else if (mPhone5tv.getText().toString().isEmpty() && mPhone5tv.getText().toString().equals("-")) {

                    mPhone5tv.setText("6");
                } else if (mPhone6tv.getText().toString().isEmpty() && mPhone6tv.getText().toString().equals("-")) {

                    mPhone6tv.setText("6");
                    Intent intent1 = new Intent(getApplicationContext(), LoginActivity.class);

                    startActivity(intent1);
                }*/
                break;

            case R.id.btn7:
                appendValue(7);
              /*  if (mPhone1tv.getText().toString().isEmpty() && mPhone1tv.getText().toString().equals("-")) {

                    mPhone1tv.setText("7");
                } else if (mPhone2tv.getText().toString().isEmpty() && mPhone2tv.getText().toString().equals("-")) {

                    mPhone2tv.setText("7");
                } else if (mPhone3tv.getText().toString().isEmpty() && mPhone3tv.getText().toString().equals("-")) {

                    mPhone3tv.setText("7");
                } else if (mPhone4tv.getText().toString().isEmpty() && mPhone4tv.getText().toString().equals("-")) {

                    mPhone4tv.setText("7");
                } else if (mPhone5tv.getText().toString().isEmpty() && mPhone5tv.getText().toString().equals("-")) {

                    mPhone5tv.setText("7");
                } else if (mPhone6tv.getText().toString().isEmpty() && mPhone6tv.getText().toString().equals("-")) {

                    mPhone6tv.setText("7");
                    Intent intent1 = new Intent(getApplicationContext(), LoginActivity.class);

                    startActivity(intent1);
                }*/
                break;

            case R.id.btn8:
                appendValue(8);
              /*  if (mPhone1tv.getText().toString().isEmpty() && mPhone1tv.getText().toString().equals("-")) {

                    mPhone1tv.setText("8");
                } else if (mPhone2tv.getText().toString().isEmpty() && mPhone2tv.getText().toString().equals("-")) {

                    mPhone2tv.setText("8");
                } else if (mPhone3tv.getText().toString().isEmpty() && mPhone3tv.getText().toString().equals("-")) {

                    mPhone3tv.setText("8");
                } else if (mPhone4tv.getText().toString().isEmpty() && mPhone4tv.getText().toString().equals("-")) {

                    mPhone4tv.setText("8");
                } else if (mPhone5tv.getText().toString().isEmpty() && mPhone5tv.getText().toString().equals("-")) {

                    mPhone5tv.setText("8");
                } else if (mPhone6tv.getText().toString().isEmpty() && mPhone6tv.getText().toString().equals("-")) {

                    mPhone6tv.setText("8");
                    Intent intent1 = new Intent(getApplicationContext(), LoginActivity.class);

                    startActivity(intent1);
                }*/
                break;

            case R.id.btn9:
                appendValue(9);
              /*  if (mPhone1tv.getText().toString().isEmpty() && mPhone1tv.getText().toString().equals("-")) {

                    mPhone1tv.setText("9");
                } else if (mPhone2tv.getText().toString().isEmpty() && mPhone2tv.getText().toString().equals("-")) {

                    mPhone2tv.setText("9");
                } else if (mPhone3tv.getText().toString().isEmpty() && mPhone3tv.getText().toString().equals("-")) {

                    mPhone3tv.setText("9");
                } else if (mPhone4tv.getText().toString().isEmpty() && mPhone4tv.getText().toString().equals("-")) {

                    mPhone4tv.setText("9");
                } else if (mPhone5tv.getText().toString().isEmpty() && mPhone5tv.getText().toString().equals("-")) {

                    mPhone5tv.setText("9");
                } else if (mPhone6tv.getText().toString().isEmpty() && mPhone6tv.getText().toString().equals("-")) {

                    mPhone6tv.setText("9");
                    Intent intent1 = new Intent(getApplicationContext(), LoginActivity.class);

                    startActivity(intent1);
                }*/
                break;

            case R.id.btn0:
                appendValue(0);
              /*  if (mPhone1tv.getText().toString().isEmpty() && mPhone1tv.getText().toString().equals("-")) {

                    mPhone1tv.setText("0");
                } else if (mPhone2tv.getText().toString().isEmpty() && mPhone2tv.getText().toString().equals("-")) {

                    mPhone2tv.setText("0");
                } else if (mPhone3tv.getText().toString().isEmpty() && mPhone3tv.getText().toString().equals("-")) {

                    mPhone3tv.setText("0");
                } else if (mPhone4tv.getText().toString().isEmpty() && mPhone4tv.getText().toString().equals("-")) {

                    mPhone4tv.setText("0");
                } else if (mPhone5tv.getText().toString().isEmpty() && mPhone5tv.getText().toString().equals("-")) {

                    mPhone5tv.setText("0");
                } else if (mPhone6tv.getText().toString().isEmpty() && mPhone6tv.getText().toString().equals("-")) {

                    mPhone6tv.setText("0");
                    Intent intent1 = new Intent(getApplicationContext(), LoginActivity.class);

                    startActivity(intent1);
                }*/
                break;

            case R.id.btn4:
                appendValue(4);
             /*   if (mPhone1tv.getText().toString().isEmpty() && mPhone1tv.getText().toString().equals("-")) {

                    mPhone1tv.setText("4");
                } else if (mPhone2tv.getText().toString().isEmpty() && mPhone2tv.getText().toString().equals("-")) {

                    mPhone2tv.setText("4");
                } else if (mPhone3tv.getText().toString().isEmpty() && mPhone3tv.getText().toString().equals("-")) {

                    mPhone3tv.setText("4");
                } else if (mPhone4tv.getText().toString().isEmpty() && mPhone4tv.getText().toString().equals("-")) {

                    mPhone4tv.setText("4");
                } else if (mPhone5tv.getText().toString().isEmpty() && mPhone5tv.getText().toString().equals("-")) {

                    mPhone5tv.setText("4");
                } else if (mPhone6tv.getText().toString().isEmpty() && mPhone6tv.getText().toString().equals("-")) {

                    mPhone6tv.setText("4");
                    Intent intent1 = new Intent(getApplicationContext(), LoginActivity.class);

                    startActivity(intent1);
                }*/
                break;

            case R.id.imgbackspace:

                deleteValue();

             /*   if (mPhone6tv.getText().toString().length() > 0 && !mPhone6tv.getText().toString().equals("-")) {

                    mPhone6tv.setText("-");
                    break;
                } else if (mPhone5tv.getText().toString().length() > 0 && !mPhone5tv.getText().toString().equals("-")) {

                    mPhone5tv.setText("-");
                    break;
                } else if (mPhone4tv.getText().toString().length() > 0 && !mPhone4tv.getText().toString().equals("-")) {

                    mPhone4tv.setText("-");
                    break;
                } else if (mPhone3tv.getText().toString().length() > 0 && !mPhone3tv.getText().toString().equals("-")) {

                    mPhone3tv.setText("-");
                    break;
                } else if (mPhone2tv.getText().toString().length() > 0 && !mPhone2tv.getText().toString().equals("-")) {

                    mPhone2tv.setText("-");
                    break;
                } else if (mPhone1tv.getText().toString().length() > 0 && !mPhone1tv.getText().toString().equals("-")) {

                    mPhone1tv.setText("-");
                }*/
                break;


        }


    }


}


// TODO: 11/4/15







