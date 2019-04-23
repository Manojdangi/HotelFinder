package com.hotelfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity implements View.OnClickListener {
TextView already_member;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        getSupportActionBar().setTitle("SignUp Form");
        already_member=findViewById(R.id.tv_login);
        already_member.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.tv_login){
            final  Intent intent=new Intent(SignupActivity.this,LoginActivity.class);
            startActivity(intent);
        }

        }
    }

