package com.example.starwarsmasterdetail.Model;

import com.example.starwarsmasterdetail.Model.FilmsResponse.example.starwarsmasterdetail.FilmsResponse;
import com.example.starwarsmasterdetail.Model.FilmsResponse.example.starwarsmasterdetail.PlanetResponse;

public interface DataSource {
    void getAllFilms();
    void getFilmData(int planetNumber);


    interface DataListener {
        void onFilmsRetrieve(FilmsResponse filmsResponse);
        void onError(Throwable throwable);

        void onPlanetDetailRetreieved(PlanetResponse planetResponse);
    }
}
