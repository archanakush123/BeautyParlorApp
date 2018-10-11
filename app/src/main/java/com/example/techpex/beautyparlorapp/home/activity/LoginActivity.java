package com.example.techpex.beautyparlorapp.home.activity;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.techpex.beautyparlorapp.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private TextInputEditText tied_mobile_num,tied_password;
    private TextView txt_sign_up, txt_skip_login;
    private Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setLayoutRef();
        setOnClickListeners();
    }

    private void setOnClickListeners() {
        btn_login.setOnClickListener(this);
        txt_sign_up.setOnClickListener(this);
        txt_skip_login.setOnClickListener(this);
    }

    private void setLayoutRef() {
        tied_mobile_num= findViewById(R.id.tied_mobile_num);
        tied_password= findViewById(R.id.tied_password);
        btn_login= findViewById(R.id.btn_login);
        txt_sign_up= findViewById(R.id.txt_sign_up);
        txt_skip_login= findViewById(R.id.txt_skip_login);
    }

    @Override
    public void onClick(View view) {

        switch(view.getId()) {

            case R.id.btn_login:
                makeLogin();
                break;

            case R.id.txt_sign_up:
                openSignUpActivity();
                break;

            case R.id.txt_skip_login:
                openHomeScreen();
                break;

            default:
                break;
        }

    }

    private void makeLogin() {

    }

    private void openSignUpActivity() {
        Intent intent = new Intent(LoginActivity.this,SignUpActivity.class);
        startActivity(intent);
        finish();
    }

    private void openHomeScreen() {
        Intent intent = new Intent(LoginActivity.this,HomeScreenActivity.class);
        startActivity(intent);
        finish();
    }
}
