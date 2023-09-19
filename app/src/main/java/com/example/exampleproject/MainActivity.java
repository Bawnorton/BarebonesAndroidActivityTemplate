package com.example.exampleproject;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.exampleproject.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    /*
    This is the main activity of the app. It is responsible for setting up the view and binding the
    controller to the view.
     */
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
