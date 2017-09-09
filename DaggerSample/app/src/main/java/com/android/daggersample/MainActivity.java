package com.android.daggersample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject Hello mHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HelloComponent build = DaggerHelloComponent.builder().helloModule(new HelloModule()).build();
        build.inject(this);
        mHello.sayHello("sagar");

        new SecondClass();
    }
}
