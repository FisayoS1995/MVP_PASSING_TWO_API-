package com.example.starwarsmasterdetail.Model.FilmsResponse.example.starwarsmasterdetail.Home;

import com.example.starwarsmasterdetail.Model.FilmsResponse.example.starwarsmasterdetail.Result;

import java.util.List;

public interface HomeContract  {
    interface Presenter {
    void loadAllFilms();
    void onPlanetSelected();

    }

    interface  View{
        void showFilms (List<Result> films);
        void showPlanetDetails(String name, List<String> films);
        void showError(String message);
    }
}
