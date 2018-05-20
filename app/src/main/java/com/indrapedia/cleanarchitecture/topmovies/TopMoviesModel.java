package com.indrapedia.cleanarchitecture.topmovies;



import io.reactivex.Observable;
import io.reactivex.functions.BiFunction;
import com.indrapedia.cleanarchitecture.http.apimodel.Result;



public class TopMoviesModel implements TopMoviesActivityMVP.Model {

    private Repository repository;

    public TopMoviesModel(Repository repository) {
        this.repository = repository;
    }

    @Override
    public Observable<ViewModel> result() {
        return Observable.zip(
                repository.getResultData(),
                repository.getCountryData(),
                new BiFunction<Result, String, ViewModel>() {
                    @Override
                    public ViewModel apply(Result result, String s) {
                        return new ViewModel(result.title, s);
                    }
                }
        );
    }

}
