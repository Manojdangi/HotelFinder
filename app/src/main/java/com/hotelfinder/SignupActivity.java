package com.hotelfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

public class SignupActivity extends AppCompatActivity implements View.OnClickListener {

EditText fullname,phone,address,email,password,cpassword;
Button register;
RadioGroup type;
TextView already_member;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
       // getSupportActionBar().setTitle("SignUp Form");

//Referencing the element from the xml form

        fullname=findViewById(R.id.et_name);
        phone=findViewById(R.id.et_contact);
        address=findViewById(R.id.et_address);
        email=findViewById(R.id.et_email);
        password=findViewById(R.id.et_password);
        cpassword=findViewById(R.id.et_cpassword);
        type=findViewById(R.id.rg_type);
        register=findViewById(R.id.btn_register);
        already_member=findViewById(R.id.tv_login);


        register.setOnClickListener(this);
        already_member.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        String full_name,phone_no,a_address,e_email,pass_word,c_password;
        full_name=fullname.getText().toString();
        phone_no=phone.getText().toString();
        a_address=address.getText().toString();
        e_email=email.getText().toString();
        pass_word=password.getText().toString();
        c_password=cpassword.getText().toString();



        if (view.getId()==R.id.tv_login){
            final  Intent intent=new Intent(SignupActivity.this,LoginActivity.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.btn_register){
            if (full_name.isEmpty() && !full_name.matches("[a-z a-z A-Z A-Z]+")) {
                fullname.setError("Enter the Fullname");
                fullname.requestFocus();
            }

            else  if(phone_no.isEmpty()){
                phone.setError("Enter the phone number");
                phone.requestFocus();
            }

            else if (a_address.isEmpty()){
                address.setError("Enter the address");
                address.requestFocus();
            }

            else if (e_email.isEmpty()){
                email.setError("Enter your email");
                email.requestFocus();
            }

            else if (pass_word.isEmpty()){
                password.setError("Enter the password");
                password.requestFocus();
            }

            else if (c_password.isEmpty()){
                cpassword.setError("Conform your password");
                cpassword.requestFocus();
            }

            else if (!full_name.matches("[a-z a-z A-Z A-Z]+")){
                fullname.setError("Please enter the valid name");
                fullname.requestFocus();

            }

            else  if(!phone_no.isEmpty() && !phone_no.matches("[0-9]{10,}")){
                phone.setError("Enter the valid phone number");
                phone.requestFocus();
            }

            else if (!a_address.isEmpty() && !a_address.matches("[a-zA-Z0-9-,_ ]+")){
                address.setError("Enter the valid address");
                address.requestFocus();
            }

            else if (!e_email.isEmpty() && !e_email.matches("^[0-9a-zA-Z!#$%&;'*+\\-/\\=\\?\\^_`\\."
                    + "{|}~]{1,64}@[0-9a-zA-Z]{1,255}\\.[a-zA-Z]{1,10}")) {
                email.setError("Enter your valid email");
                email.requestFocus();
            }

            else if (!pass_word.isEmpty() && pass_word.length()<8){
                password.setError("Enter the valid password");
                password.requestFocus();
            }

//            else {
//
//                final  Intent intent=new Intent(SignupActivity.this,LoginActivity.class);
//                startActivity(intent);
//            }

        }

        }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if (id==android.R.id.home){
            Intent intent=new Intent(SignupActivity.this,LoginActivity.class);
        }
        return super.onOptionsItemSelected(item);
    }
}


