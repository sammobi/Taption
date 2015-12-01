package com.example.simpalm.taption;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.jar.Attributes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ForgotPasswordActivity extends Activity implements View.OnClickListener {

    EditText mEmailEt;
    Button mRequestPasswordBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        mEmailEt = (EditText) findViewById(R.id.edittextemail_address);
        mRequestPasswordBtn = (Button) findViewById(R.id.requestpasswordbtn);

        mRequestPasswordBtn.setOnClickListener(this);
    }

    public static boolean emailValidator(final String mailAddress) {

        Pattern pattern;
        Matcher matcher;

        final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(mailAddress);
        return matcher.matches();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.requestpasswordbtn:

                if (emailValidator(mEmailEt.getText().toString())) {


                    AlertDialog.Builder alert = new AlertDialog.Builder(ForgotPasswordActivity.this);
                    alert.setTitle("Forgot Password");
                    alert.setMessage("You password has been sent to your email address");
                    alert.setPositiveButton("YES", null);


                    alert.show();
                    mEmailEt.setText(null);


                } else {
                    Toast.makeText(ForgotPasswordActivity.this, "invalid email address",
                            Toast.LENGTH_SHORT).show();

                }


        }
    }

}












