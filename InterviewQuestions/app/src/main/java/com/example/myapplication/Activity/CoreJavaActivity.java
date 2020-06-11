package com.example.myapplication.Activity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.example.myapplication.Database.Database;
import com.example.myapplication.Model.Model;
import com.example.myapplication.R;
import com.example.myapplication.ViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class CoreJavaActivity extends AppCompatActivity{

    private ViewPager viewPager;
    private PagerAdapter pagerAdapter;
    List<Model> models;
    int j,k;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        viewPager = findViewById(R.id.viewPager);

        models = new ArrayList<>();
        for (j=0,k=0; j < Database.coreJavaQuestions.length && k < Database.coreJavaAnswers.length; j++,k++ ) {
            models.add(new Model(Database.coreJavaQuestions[j], Database.coreJavaAnswers[k]));
        }

        pagerAdapter = new ViewPagerAdapter(models,this);
        viewPager.setAdapter(pagerAdapter);
    }
}
