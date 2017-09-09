package com.android.daggersample;

import javax.inject.Inject;

/**
 * Created by user on 9/8/2017.
 */

class SecondClass {

    @Inject Hello mHello;

    public SecondClass() {
        HelloComponent build = DaggerHelloComponent.builder().helloModule(new HelloModule()).build();
        build.inject(this);
        mHello.sayHello("Second class");
    }
}
