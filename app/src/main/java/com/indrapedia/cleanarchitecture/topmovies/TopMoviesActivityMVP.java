package com.indrapedia.cleanarchitecture.topmovies;


import io.reactivex.Observable;

public interface TopMoviesActivityMVP {

    interface View {

        void updateData(ViewModel viewModel);

        void showSnackbar(String s);

    }

    interface Presenter {

        void loadData();

        void rxUnsubscribe();

        void setView(View view);

    }

    interface Model {

        Observable<ViewModel> result();

    }
}
