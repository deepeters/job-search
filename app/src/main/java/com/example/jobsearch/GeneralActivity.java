package com.example.jobsearch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GeneralActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();
    private Button mlogInButton;
    private EditText mlocationEditText;
    private EditText mnameEditText;
    private EditText memailEditText;
    private EditText mpasswordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general);

        mlocationEditText = (EditText) findViewById(R.id.locationEditText);
        mnameEditText = (EditText) findViewById(R.id.nameEditText);
        memailEditText = (EditText) findViewById(R.id.emailEditText);
        mpasswordEditText = (EditText) findViewById(R.id.passwordEditText);
        mlogInButton = (Button)findViewById(R.id.logInButton);
        mlogInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String location = mlocationEditText.getText().toString();
                Log.d(TAG, location);
                Intent intent = new Intent(GeneralActivity.this, GeneralActivity.class);
                startActivity(intent);
            }
        });
    }
}