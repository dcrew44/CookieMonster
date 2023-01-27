package com.example.cookiemonster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CookieMonster cookiemonster = new CookieMonster((ImageView) findViewById(R.id.imageView), (TextView) findViewById(R.id.textView));

        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(view -> {
            cookiemonster.updateStatus();
            button.setText(cookiemonster.getStatus()? "EAT COOKIE":"DONE");
        });

    }
}