package com.example.loginscreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash); // Menghubungkan dengan layout splash

        // Handler untuk menunda splash screen selama beberapa detik
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Setelah delay, pindah ke MainActivity (login)
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Mengakhiri SplashActivity
            }
        }, 3000); // 3000 ms = 3 detik
    }
}
