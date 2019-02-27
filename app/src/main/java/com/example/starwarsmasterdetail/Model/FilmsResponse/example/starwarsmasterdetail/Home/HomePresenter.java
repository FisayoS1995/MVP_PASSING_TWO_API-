package com.example.starwarsmasterdetail.Model.FilmsResponse.example.starwarsmasterdetail.Home;

import com.example.starwarsmasterdetail.Model.DataSource;
import com.example.starwarsmasterdetail.Model.FilmsResponse.example.starwarsmasterdetail.FilmsResponse;
import com.example.starwarsmasterdetail.Model.RemoteDataSource;
import com.example.starwarsmasterdetail.Model.FilmsResponse.example.starwarsmasterdetail.PlanetResponse;

public class HomePresenter implements HomeContract.Presenter, DataSource.DataListener {
    private final HomeContract.View view;
    private final DataSource dataSource;

    public HomePresenter(HomeContract.View view) {
        this.view = view;
        dataSource = new RemoteDataSource(this);
    }
    @Override
    public void loadAllFilms() {
        dataSource.getAllFilms();

    }

    @Override
    public void onPlanetSelected() {

    }


    @Override
    public void onFilmsRetrieve(FilmsResponse filmsResponse) {
        view.showFilms(filmsResponse.getResults());
    }

    @Override
    public void onError(Throwable throwable) {
        view.showError(throwable.getMessage());
    }

    @Override
    public void onPlanetDetailRetreieved(PlanetResponse planetResponse) {
    }
}
