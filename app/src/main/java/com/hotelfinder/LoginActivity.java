package com.hotelfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    EditText email,password;
    TextView create_account;
    Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email=findViewById(R.id.et_email);
        password=findViewById(R.id.et_password);
        create_account = findViewById(R.id.tv_signup);
        login=findViewById(R.id.btn_login);


        create_account.setOnClickListener(this);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.tv_signup) {
            final Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
            startActivity(intent);

        }

        if (view.getId()==R.id.btn_login){

            String user_email=email.getText().toString();
            String user_password=password.getText().toString();

            if (user_email.isEmpty()){
                email.setError("Please enter the username");
                email.requestFocus();
            }
            else  if (user_password.isEmpty()){
                password.setError("Please enter the password");
                password.requestFocus();
            }

            else {
                final  Intent intent=new Intent(LoginActivity.this,Admin_Dashboard.class);
                startActivity(intent);
            }

        }
    }
}
