package com.indrapedia.cleanarchitecture.topmovies;


import com.indrapedia.cleanarchitecture.http.MoreInfoApiService;
import com.indrapedia.cleanarchitecture.http.MovieApiService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class TopMoviesModule {

    @Provides
    public TopMoviesActivityMVP.Presenter provideTopMoviesActivityPresenter(TopMoviesActivityMVP.Model topMoviesModel) {
        return new TopMoviesPresenter(topMoviesModel);
    }

    @Provides
    public TopMoviesActivityMVP.Model provideTopMoviesActivityModel(Repository repository) {
        return new TopMoviesModel(repository);
    }

    @Singleton
    @Provides
    public Repository provideRepo(MovieApiService movieApiService, MoreInfoApiService moreInfoApiService) {
        return new TopMoviesRepository(movieApiService, moreInfoApiService);
    }


}
