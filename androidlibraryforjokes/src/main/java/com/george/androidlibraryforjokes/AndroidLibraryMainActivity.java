package com.george.androidlibraryforjokes;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class AndroidLibraryMainActivity extends AppCompatActivity {

    public static final String JOKE_FROM_JAVA = "joke_from_java";
    private String incomingJoke;
    private TextView androidText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_library_main);

        androidText = findViewById(R.id.androidTextView);

        Intent intent = getIntent();
        if (intent.hasExtra(JOKE_FROM_JAVA)) {
            incomingJoke = intent.getStringExtra(JOKE_FROM_JAVA);
        }

        androidText.setText(incomingJoke);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
