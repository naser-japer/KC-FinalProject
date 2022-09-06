package com.example.animebook;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText Email;
private EditText password;
private EditText username;
private Button Next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Email = findViewById(R.id.myEmail);
        password = findViewById(R.id.myPassword);
        username = findViewById(R.id.myUserName);
        Next = findViewById(R.id.button);

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }


        });

        username.addTextChangedListener(loginTextWatcher);
        Email.addTextChangedListener(loginTextWatcher);
        password.addTextChangedListener(loginTextWatcher);
 }
 private TextWatcher loginTextWatcher = new TextWatcher() {
     @Override
     public void beforeTextChanged(CharSequence CharSequence, int i, int i1, int i2) {

     }

     @Override
     public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
String userName = username.getText().toString().trim();
String passwordInput = password.getText().toString().trim();
String EmailInput = Email.getText().toString().trim();
Next.setEnabled(!userName.isEmpty() && !passwordInput.isEmpty() && !EmailInput.isEmpty());
     }

     @Override
     public void afterTextChanged(Editable editable) {

     }
 };
}














