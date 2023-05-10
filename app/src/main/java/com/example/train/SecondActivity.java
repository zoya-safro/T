package com.example.train;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;
    private User user;
    private Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        button = findViewById(R.id.button2);

        textView = findViewById(R.id.textView3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            user = (User) bundle.getSerializable("user1");
        }

        textView.setText("ID пользователя: " + user.getName() + "\n" +
        "Место: " + user.getAddress() + "\n" +
        "Время отправления и прибытия: " + user.getEmail());
    }
}