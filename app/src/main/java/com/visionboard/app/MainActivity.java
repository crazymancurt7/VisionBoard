package com.visionboard.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // This is the editor screen
        Toast.makeText(this, "Welcome to Vision Board Editor", Toast.LENGTH_SHORT).show();
    }
}
