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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PhoneVerificationActivity extends Activity implements View.OnClickListener {

    TextView mPhoneNumberTv;
    Button mPhoneNumberEdit;
    ImageView mBackSpaceImg;
    TextView mPhone1tv, mPhone2tv, mPhone3tv, mPhone4tv, mPhone5tv, mPhone6tv;
    Button mNextBtn, mONeBtn, mTwobtn, mThreeBtn, mFourBtn, mFiveBtn, mSixBtn, mSevenBtn, mEightBtn, mNineBtn, mZeroBtn, mEditBtn;
    LinearLayout mKeyboardLl;

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


        mPhone1tv = (TextView) findViewById(R.id.phonever1);
        mPhone2tv = (TextView) findViewById(R.id.phonever2);
        mPhone3tv = (TextView) findViewById(R.id.phonever3);
        mPhone4tv = (TextView) findViewById(R.id.phonever4);
        mPhone5tv = (TextView) findViewById(R.id.phonever5);
        mPhone6tv = (TextView) findViewById(R.id.phonever6);


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


    }

    int entered_value_length = 0;

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.editnumberbtn:

                Intent intent = new Intent(PhoneVerificationActivity.this, AddPhoneActivity.class);

                startActivity(intent);

                break;



          /*  case R.id.btn1:

                switch (entered_value_length) {

                    case 0:
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


                }*/

            case R.id.btn1:

                if (mPhone1tv.getText().toString().isEmpty()) {

                    mPhone1tv.setText("1");
                } else if (mPhone2tv.getText().toString().isEmpty()) {

                    mPhone2tv.setText("1");
                } else if (mPhone3tv.getText().toString().isEmpty()) {

                    mPhone3tv.setText("1");
                } else if (mPhone4tv.getText().toString().isEmpty()) {

                    mPhone4tv.setText("1");
                } else if (mPhone5tv.getText().toString().isEmpty()) {

                    mPhone5tv.setText("1");
                } else if (mPhone6tv.getText().toString().isEmpty()) {

                    mPhone6tv.setText("1");
                }
                break;

            case R.id.btn2:


                if (mPhone1tv.getText().toString().isEmpty()) {

                    mPhone1tv.setText("2");
                } else if (mPhone2tv.getText().toString().isEmpty()) {

                    mPhone2tv.setText("2");
                } else if (mPhone3tv.getText().toString().isEmpty()) {

                    mPhone3tv.setText("2");
                } else if (mPhone4tv.getText().toString().isEmpty()) {

                    mPhone4tv.setText("2");
                } else if (mPhone5tv.getText().toString().isEmpty()) {

                    mPhone5tv.setText("2");
                } else if (mPhone6tv.getText().toString().isEmpty()) {

                    mPhone6tv.setText("2");
                }
                break;

            case R.id.btn3:
                if (mPhone1tv.getText().toString().isEmpty()) {

                    mPhone1tv.setText("3");
                } else if (mPhone2tv.getText().toString().isEmpty()) {

                    mPhone2tv.setText("3");
                } else if (mPhone3tv.getText().toString().isEmpty()) {

                    mPhone3tv.setText("3");
                } else if (mPhone4tv.getText().toString().isEmpty()) {

                    mPhone4tv.setText("3");
                } else if (mPhone5tv.getText().toString().isEmpty()) {

                    mPhone5tv.setText("3");
                } else if (mPhone6tv.getText().toString().isEmpty()) {

                    mPhone6tv.setText("3");
                }
                break;


            case R.id.btn5:
                if (mPhone1tv.getText().toString().isEmpty()) {

                    mPhone1tv.setText("5");
                } else if (mPhone2tv.getText().toString().isEmpty()) {

                    mPhone2tv.setText("5");
                } else if (mPhone3tv.getText().toString().isEmpty()) {

                    mPhone3tv.setText("5");
                } else if (mPhone4tv.getText().toString().isEmpty()) {

                    mPhone4tv.setText("5");
                } else if (mPhone5tv.getText().toString().isEmpty()) {

                    mPhone5tv.setText("5");
                } else if (mPhone6tv.getText().toString().isEmpty()) {

                    mPhone6tv.setText("5");
                }
                break;

            case R.id.btn6:
                if (mPhone1tv.getText().toString().isEmpty()) {

                    mPhone1tv.setText("6");
                } else if (mPhone2tv.getText().toString().isEmpty()) {

                    mPhone2tv.setText("6");
                } else if (mPhone3tv.getText().toString().isEmpty()) {

                    mPhone3tv.setText("6");
                } else if (mPhone4tv.getText().toString().isEmpty()) {

                    mPhone4tv.setText("6");
                } else if (mPhone5tv.getText().toString().isEmpty()) {

                    mPhone5tv.setText("6");
                } else if (mPhone6tv.getText().toString().isEmpty()) {

                    mPhone6tv.setText("6");
                }
                break;

            case R.id.btn7:
                if (mPhone1tv.getText().toString().isEmpty()) {

                    mPhone1tv.setText("7");
                } else if (mPhone2tv.getText().toString().isEmpty()) {

                    mPhone2tv.setText("7");
                } else if (mPhone3tv.getText().toString().isEmpty()) {

                    mPhone3tv.setText("7");
                } else if (mPhone4tv.getText().toString().isEmpty()) {

                    mPhone4tv.setText("7");
                } else if (mPhone5tv.getText().toString().isEmpty()) {

                    mPhone5tv.setText("7");
                } else if (mPhone6tv.getText().toString().isEmpty()) {

                    mPhone6tv.setText("7");
                }
                break;

            case R.id.btn8:
                if (mPhone1tv.getText().toString().isEmpty()) {

                    mPhone1tv.setText("8");
                } else if (mPhone2tv.getText().toString().isEmpty()) {

                    mPhone2tv.setText("8");
                } else if (mPhone3tv.getText().toString().isEmpty()) {

                    mPhone3tv.setText("8");
                } else if (mPhone4tv.getText().toString().isEmpty()) {

                    mPhone4tv.setText("8");
                } else if (mPhone5tv.getText().toString().isEmpty()) {

                    mPhone5tv.setText("8");
                } else if (mPhone6tv.getText().toString().isEmpty()) {

                    mPhone6tv.setText("8");
                }
                break;

            case R.id.btn9:
                if (mPhone1tv.getText().toString().isEmpty()) {

                    mPhone1tv.setText("9");
                } else if (mPhone2tv.getText().toString().isEmpty()) {

                    mPhone2tv.setText("9");
                } else if (mPhone3tv.getText().toString().isEmpty()) {

                    mPhone3tv.setText("9");
                } else if (mPhone4tv.getText().toString().isEmpty()) {

                    mPhone4tv.setText("9");
                } else if (mPhone5tv.getText().toString().isEmpty()) {

                    mPhone5tv.setText("9");
                } else if (mPhone6tv.getText().toString().isEmpty()) {

                    mPhone6tv.setText("9");
                }
                break;

            case R.id.btn0:
                if (mPhone1tv.getText().toString().isEmpty()) {

                    mPhone1tv.setText("0");
                } else if (mPhone2tv.getText().toString().isEmpty()) {

                    mPhone2tv.setText("0");
                } else if (mPhone3tv.getText().toString().isEmpty()) {

                    mPhone3tv.setText("0");
                } else if (mPhone4tv.getText().toString().isEmpty()) {

                    mPhone4tv.setText("0");
                } else if (mPhone5tv.getText().toString().isEmpty()) {

                    mPhone5tv.setText("0");
                } else if (mPhone6tv.getText().toString().isEmpty()) {

                    mPhone6tv.setText("0");
                }
                break;

            case R.id.btn4:
                if (mPhone1tv.getText().toString().isEmpty()) {

                    mPhone1tv.setText("4");
                } else if (mPhone2tv.getText().toString().isEmpty()) {

                    mPhone2tv.setText("4");
                } else if (mPhone3tv.getText().toString().isEmpty()) {

                    mPhone3tv.setText("4");
                } else if (mPhone4tv.getText().toString().isEmpty()) {

                    mPhone4tv.setText("4");
                } else if (mPhone5tv.getText().toString().isEmpty()) {

                    mPhone5tv.setText("4");
                } else if (mPhone6tv.getText().toString().isEmpty()) {

                    mPhone6tv.setText("4");
                }
                break;

            case R.id.imgbackspace:

                if (mPhone6tv.getText().toString().length() > 0) {

                    mPhone6tv.setText("-");
                    break;
                } else if (mPhone5tv.getText().toString().length() > 0) {

                    mPhone5tv.setText("-");
                    break;
                } else if (mPhone4tv.getText().toString().length() > 0) {

                    mPhone4tv.setText("-");
                    break;
                } else if (mPhone3tv.getText().toString().length() > 0) {

                    mPhone3tv.setText("-");
                    break;
                } else if (mPhone2tv.getText().toString().length() > 0) {

                    mPhone2tv.setText("-");
                    break;
                } else if (mPhone1tv.getText().toString().length() > 0) {

                    mPhone1tv.setText("-");
                }
                break;


        }


    }


}


// TODO: 11/4/15







