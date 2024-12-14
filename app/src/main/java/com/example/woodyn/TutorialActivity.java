package com.example.woodyn;

import android.os.Build;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TutorialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to_use);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.black)); // Gunakan warna dari res/colors.xml
        }
        

        // Tombol "Take Picture"
        Button takePictureButton = findViewById(R.id.btn_next_page);
        takePictureButton.setOnClickListener(v -> {
            // Arahkan ke CameraActivity
            Intent intent = new Intent(TutorialActivity.this, CameraActivity.class);
            startActivity(intent);
        });
    }
}
