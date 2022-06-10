package com.moringaschool.chatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.signupBtn) Button mButton;
    @BindView(R.id.emailSignup) TextInputLayout mEmail;
    @BindView(R.id.password) TextInputLayout mPassword;
    @BindView(R.id.confirmpassword) TextInputLayout mConfirmpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

}