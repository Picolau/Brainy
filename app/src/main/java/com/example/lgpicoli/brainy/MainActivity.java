package com.example.lgpicoli.brainy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    private BrainyActivity brainyActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.removeNotificationBar();

        this.brainyActivity = new BrainyActivity(this);
        this.setContentView(this.brainyActivity);
    }

    private void removeNotificationBar() {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}
