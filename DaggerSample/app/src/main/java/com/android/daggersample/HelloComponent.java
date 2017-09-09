package com.android.daggersample;

import dagger.Component;

/**
 * Created by user on 9/8/2017.
 */

@Component(modules = {HelloModule.class})
public interface HelloComponent {

    void inject(MainActivity mainActivity);
    void inject(SecondClass secondClass);
}
