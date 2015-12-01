package com.example.simpalm.taption;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class AddPhoneActivity extends Activity {

    Button mNextBtn, mONeBtn, mTwobtn, mThreeBtn, mFourBtn, mFiveBtn, mSixBtn, mSevenBtn, mEightBtn, mNineBtn, mZeroBtn;
    ImageView mBackSpaceImg;
    TextView mPlusoneTv, mUnitesStatesTv;
    LinearLayout mKeyboardLl;
    EditText mPhonenumberEt;

    public final static String MESSAGE_KEY = "com.example.simpalm.taption.message_key";

    // PhoneNumberFormattingTextWatcher mPhoneWatcher = new PhoneNumberFormattingTextWatcher();

    private android.content.Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_phone);

        mNextBtn = (Button) findViewById(R.id.nextbtn);
        mPlusoneTv = (TextView) findViewById(R.id.plusonetv);
        mPhonenumberEt = (EditText) findViewById(R.id.phonenumberet);
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

        mPhonenumberEt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mKeyboardLl.setVisibility(View.VISIBLE);

                // Hide native keyboard on click of the button

                InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
                imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);


            }
        });


        this.mPhonenumberEt.addTextChangedListener(new PhoneNumberFormattingTextWatcher("US"));

        mNextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mKeyboardLl.setVisibility(View.GONE);
                mPhonenumberEt.getText().toString();
                if (mPhonenumberEt.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Please enter your phone number",
                            Toast.LENGTH_LONG).show();
                } else {

                    AlertDialog.Builder alert = new AlertDialog.Builder(AddPhoneActivity.this);
                    alert.setTitle("Phone number verification");
                    alert.setMessage("Is this your correct phone number?");
                    alert.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                          /*  Intent intent = new Intent(AddPhoneActivity.this, PhoneVerificationActivity.class);


                            startActivity(intent);
                            finish();*/
                            String message = mPhonenumberEt.getText().toString();
                            Intent intent = new Intent(AddPhoneActivity.this, PhoneVerificationActivity.class);
                            intent.putExtra(MESSAGE_KEY, message);
                            startActivity(intent);

                        }
                    });
                    alert.setNegativeButton("NO", null);
                    alert.show();
                }
            }


        });


        mONeBtn.setOnClickListener(new View.OnClickListener()

                                   {
                                       @Override
                                       public void onClick(View v) {

                                           mPhonenumberEt.setText(mPhonenumberEt.getText() + "1");


                                       }
                                   }

        );
        mTwobtn.setOnClickListener(new View.OnClickListener()

                                   {
                                       @Override
                                       public void onClick(View v) {

                                           mPhonenumberEt.setText(mPhonenumberEt.getText() + "2");


                                       }
                                   }

        );

        mThreeBtn.setOnClickListener(new View.OnClickListener()

                                     {
                                         @Override
                                         public void onClick(View v) {

                                             mPhonenumberEt.setText(mPhonenumberEt.getText() + "3");


                                         }
                                     }

        );
        mFourBtn.setOnClickListener(new View.OnClickListener()

                                    {
                                        @Override
                                        public void onClick(View v) {

                                            mPhonenumberEt.setText(mPhonenumberEt.getText() + "4");


                                        }
                                    }

        );
        mFiveBtn.setOnClickListener(new View.OnClickListener()

                                    {
                                        @Override
                                        public void onClick(View v) {

                                            mPhonenumberEt.setText(mPhonenumberEt.getText() + "5");


                                        }
                                    }

        );
        mSixBtn.setOnClickListener(new View.OnClickListener()

                                   {
                                       @Override
                                       public void onClick(View v) {

                                           mPhonenumberEt.setText(mPhonenumberEt.getText() + "6");


                                       }
                                   }

        );
        mSevenBtn.setOnClickListener(new View.OnClickListener()

                                     {
                                         @Override
                                         public void onClick(View v) {

                                             mPhonenumberEt.setText(mPhonenumberEt.getText() + "7");


                                         }
                                     }

        );
        mEightBtn.setOnClickListener(new View.OnClickListener()

                                     {
                                         @Override
                                         public void onClick(View v) {

                                             mPhonenumberEt.setText(mPhonenumberEt.getText() + "8");


                                         }
                                     }

        );
        mNineBtn.setOnClickListener(new View.OnClickListener()

                                    {
                                        @Override
                                        public void onClick(View v) {

                                            mPhonenumberEt.setText(mPhonenumberEt.getText() + "9");


                                        }
                                    }

        );

        mZeroBtn.setOnClickListener(new View.OnClickListener()

                                    {
                                        @Override
                                        public void onClick(View v) {

                                            mPhonenumberEt.setText(mPhonenumberEt.getText() + "0");


                                        }
                                    }

        );

// delete one text at a time on backspace
        mBackSpaceImg.setOnClickListener(new View.OnClickListener()

                                         {
                                             @Override
                                             public void onClick(View v) {
                                                 int length = mPhonenumberEt.getText().length();
                                                 if (length > 0) {
                                                     mPhonenumberEt.getText().delete(length - 1, length);
                                                 }

                                             }
                                         }

        );


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

