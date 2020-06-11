package com.example.myapplication.Activity;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "Main Activity" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById();
    }

       private void findViewById() {
           findViewById(R.id.card1).setOnClickListener(this);
           findViewById(R.id.card2).setOnClickListener(this);
           findViewById(R.id.card3).setOnClickListener(this);
           findViewById(R.id.card4).setOnClickListener(this);
           findViewById(R.id.card5).setOnClickListener(this);
           findViewById(R.id.card6).setOnClickListener(this);
       }


    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.card1:
                startActivity(new Intent(MainActivity.this, CoreJavaActivity.class));
                break;

            case R.id.card2:
                startActivity(new Intent(MainActivity.this, SpringActivity.class));
                break;

        }
    }
}
