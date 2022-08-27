package com.example.easymoney;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.registration.MESSAGE";
    public EditText user,pass;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user=findViewById(R.id.tfUser);
        pass=findViewById(R.id.tfPass1);
        login=findViewById(R.id.button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = user.getText().toString();
                String pass1 = pass.getText().toString();
                if (email.isEmpty() && pass1.isEmpty()){
                    Toast.makeText(MainActivity.this,"Pleas fill all fields",Toast.LENGTH_SHORT).show();
                }
                else {
                    mainActivity();
                }
            }
        });
    }

    private void mainActivity() {
        Intent intent = new Intent(this, EasyMoney.class);
        String user1 = user.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, user1);
        startActivity(intent);
    }
}