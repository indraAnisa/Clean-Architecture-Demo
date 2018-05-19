package com.indrapedia.cleanarchitecture.root;




import com.indrapedia.cleanarchitecture.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, }  )
public interface ApplicationComponent {
    void inject(MainActivity target);
}
