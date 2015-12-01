package com.example.simpalm.taption;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class SignupActivity extends Activity implements OnClickListener {

    EditText mCreateUserNameEt, mCreatePasswordEt, mConfirmPasswordEt, mEmailAddressEt;
    TextView mAgeTv, mGenderTv;
    Button mSignUpBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        mCreateUserNameEt = (EditText) findViewById(R.id.createusernameet);

        mCreateUserNameEt.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            public void onFocusChange(View view, boolean hasfocus) {
                if (hasfocus) {

                    view.setBackgroundResource(R.color.black);
                } else {
                    view.setBackgroundResource(R.color.black);
                }
            }
        });
        mCreatePasswordEt = (EditText) findViewById(R.id.createpasswordet);
        mConfirmPasswordEt = (EditText) findViewById(R.id.confirmpasswordet);
        mEmailAddressEt = (EditText) findViewById(R.id.enteremailet);
        mAgeTv = (TextView) findViewById(R.id.enteragetv);
        mGenderTv = (TextView) findViewById(R.id.gendertv);
        mSignUpBtn = (Button) findViewById(R.id.signupbtn);

        mGenderTv.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.gendertv:

                CharSequence gender[] = new CharSequence[]{"Male", "Female"};

                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Pick a Gender");
                builder.setItems(gender, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                builder.show();
                break;

            case R.id.enteragetv:


            case R.id.signupbtn:


        }
    }
}
