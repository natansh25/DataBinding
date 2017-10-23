package com.example.natan.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.natan.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mbinding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mbinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        Info fake=FakeData.generateFakeData();
        display(fake);
    }


    public void display(Info info)
    {
        mbinding.textView.setText(info.studentName);
        mbinding.textView2.setText(info.studentSurname);
        mbinding.textView3.setText(info.studentNumber);
        mbinding.textView4.setText(info.studentEmail);

    }





}
