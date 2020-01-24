package com.example.votingapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PartyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_party);
    }

    public void prev(View v)
    {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
