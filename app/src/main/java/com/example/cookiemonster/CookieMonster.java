package com.example.cookiemonster;

import android.widget.ImageView;
import android.widget.TextView;

public class CookieMonster {
    private boolean isHungry;
    private ImageView imageView;
    private TextView textView;
    public CookieMonster(ImageView imageView, TextView textView) {
        isHungry = true;
        this.imageView = imageView;
        this.textView = textView;
    }

    public void updateStatus() {
        if(isHungry) {
            isHungry = false;
            imageView.setImageResource(R.mipmap.full);
            textView.setText("I'm so full");
        }
        else {
            isHungry = true;
            imageView.setImageResource(R.mipmap.hungry);
            textView.setText("I'm so hungry");
        }
    }

    public boolean getStatus() {
        return isHungry;
    }
}
