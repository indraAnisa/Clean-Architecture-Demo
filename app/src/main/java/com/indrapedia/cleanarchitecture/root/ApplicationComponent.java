package com.indrapedia.cleanarchitecture.root;


import com.indrapedia.cleanarchitecture.http.ApiModuleForInfo;
import com.indrapedia.cleanarchitecture.http.ApiModuleForName;
import com.indrapedia.cleanarchitecture.topmovies.TopMoviesActivity;
import com.indrapedia.cleanarchitecture.topmovies.TopMoviesModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, ApiModuleForName.class, ApiModuleForInfo.class,TopMoviesModule.class})
public interface ApplicationComponent {

    void inject(TopMoviesActivity target);

}
