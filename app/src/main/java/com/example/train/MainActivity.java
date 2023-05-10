package com.example.train;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText nameEdText;
    private EditText addressEdText;
    private EditText emailEdText;

    private Button button;
    private String name;
    private String address;
    private String email;


    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEdText = findViewById(R.id.name);
        addressEdText = findViewById(R.id.address);
        emailEdText = findViewById(R.id.email);
        button = findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                name = nameEdText.getText().toString();
                address = addressEdText.getText().toString();
                email = emailEdText.getText().toString();


                User user = new User(name, address, email);

                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("user1", user);
                startActivity(intent);



            }
        });

    }
}