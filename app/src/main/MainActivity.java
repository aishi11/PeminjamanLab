package com.example.notificationapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonShowNotification;
    private NotificationHelper notificationHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        notificationHelper = new NotificationHelper(this);

        buttonShowNotification = findViewById(id.buttonShowNotification);
        buttonShowNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notificationHelper.sendNotification("New Notification", "This is a sample notification");
            }
        });
    }
}
