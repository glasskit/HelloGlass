package com.jordanreger.helloglass;

import android.app.Activity;
import android.os.Bundle;

public class CardActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card);
    }
}