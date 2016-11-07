package com.example.cocktailapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setTitle("Login");
    }

    public void signIn(View view)
    {
        Intent intent = new Intent(this, SignInActivity.class);
        startActivity(intent);

        //Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        //startActivity(browserIntent);

    }

    public void signUp(View view)
    {
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }
}

