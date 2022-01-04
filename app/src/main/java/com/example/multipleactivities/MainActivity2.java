package com.example.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;
    String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.textView2);
        Intent intent =getIntent();
        username = intent.getStringExtra("userInput");
        textView.setText(username);
    }
    public void changeAct(View view){
        username = textView.getText().toString();
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        intent.putExtra("userInput2",username);
        startActivity(intent);
    }
}