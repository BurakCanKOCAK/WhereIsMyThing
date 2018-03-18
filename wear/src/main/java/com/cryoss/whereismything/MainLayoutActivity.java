package com.cryoss.whereismything;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.widget.TextView;

public class MainLayoutActivity extends WearableActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        mTextView = (TextView) findViewById(R.id.text);

        // Enables Always-on
        setAmbientEnabled();
    }
}
