package com.example.techpex.beautyparlorapp.home.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.techpex.beautyparlorapp.R;

public class SignUpActivity extends AppCompatActivity {

    TextView txt_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        setLayoutRef();
    }

    private void setLayoutRef() {
        //txt_login = findViewById(R.id.txt_login);
        /*txt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpActivity.this,LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });*/
    }
}
