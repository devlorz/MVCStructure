package com.leeway.mvcstructure.activity;

import android.os.Build;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.leeway.mvcstructure.R;
import com.leeway.mvcstructure.util.ScreenUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int screenWidth = ScreenUtils.getInstance().getScreenWidth();
        int screenHeight = ScreenUtils.getInstance().getScreenHeight();

        Toast.makeText(MainActivity.this,
                "Width = " + screenWidth + " Height = " + screenHeight,
                Toast.LENGTH_SHORT).show();

        // seperate by android version
        if (Build.VERSION.SDK_INT >= 21) {
            // Run on android 21+
        } else {

        }
    }
}
