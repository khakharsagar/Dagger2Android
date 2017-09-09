package com.android.daggersample;

import dagger.Module;
import dagger.Provides;

/**
 * Created by user on 9/8/2017.
 */

@Module
public class HelloModule {

    @Provides
    public Hello providesHello() {
        return new Hello();
    }
}
