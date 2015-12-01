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
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends Activity implements View.OnClickListener {

    EditText mUserNameEt, mPasswordEt;
    Button mLogInBtn, mSignUpBtn;
    TextView mForgotPasswordTv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mUserNameEt = (EditText) findViewById(R.id.usernameet);
        mPasswordEt = (EditText) findViewById(R.id.passwordet);
        mLogInBtn = (Button) findViewById(R.id.loginbtn);
        mSignUpBtn = (Button) findViewById(R.id.signupbtn);
        mForgotPasswordTv = (TextView) findViewById(R.id.forgotpasstv);


        mLogInBtn.setOnClickListener(this);
        mSignUpBtn.setOnClickListener(this);
        mForgotPasswordTv.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
         /*   case R.id.loginbtn:
                if (mUserNameEt.getText().toString().length() < 1) {
                    // Display toast
                    Toast.makeText(LoginActivity.this, "Please enter username !", Toast.LENGTH_LONG).show();

                    mUserNameEt.requestFocus();
                } else if (mPasswordEt.getText().toString().length() < 1) {
                    // display toast

                    Toast.makeText(LoginActivity.this, "Please enter password !", Toast.LENGTH_LONG).show();

                    mPasswordEt.requestFocus();


                }


            case R.id.signupbtn:

                Intent intent = new Intent(LoginActivity.this, SignupActivity.class);

                startActivity(intent);

                break;

            case R.id.forgotpasstv:

                Intent intent1 = new Intent(LoginActivity.this, ForgotPasswordActivity.class);

                startActivity(intent1);

                break;


        }
*/
            case R.id.loginbtn:

                final String Name = mUserNameEt.getText().toString();
                final String word = mPasswordEt.getText().toString();
                if (Name.length() == 0) {
                    mUserNameEt.requestFocus();
                    mUserNameEt.setError("USERNAME CANNOT BE EMPTY");
                } else if (!Name.matches("[a-zA-Z ]+")) {
                    mUserNameEt.requestFocus();
                    mUserNameEt.setError("ENTER ONLY ALPHABETICAL CHARACTER");
                } else if (word.length() == 0) {
                    mPasswordEt.requestFocus();
                    mPasswordEt.setError("PASSWORD CANNOT BE EMPTY");
                } else {
                    Toast.makeText(LoginActivity.this, "Login Successful", Toast.LENGTH_LONG).show();
                }
                break;



            case R.id.signupbtn:

                Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(intent);
                break;


            case R.id.forgotpasstv:

                Intent intent1 = new Intent(LoginActivity.this, ForgotPasswordActivity.class);

                startActivity(intent1);
                break;


        }
    }

}





