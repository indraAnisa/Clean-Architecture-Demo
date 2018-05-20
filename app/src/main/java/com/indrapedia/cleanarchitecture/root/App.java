package com.indrapedia.cleanarchitecture.root;

import android.app.Application;

import com.indrapedia.cleanarchitecture.http.ApiModuleForInfo;
import com.indrapedia.cleanarchitecture.http.ApiModuleForName;
import com.indrapedia.cleanarchitecture.topmovies.TopMoviesModule;


public class App extends Application {

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .apiModuleForName(new ApiModuleForName())
                .topMoviesModule(new TopMoviesModule())
                .apiModuleForInfo(new ApiModuleForInfo())
                .build();
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
