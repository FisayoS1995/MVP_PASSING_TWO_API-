package com.example.starwarsmasterdetail.Model;


import com.example.starwarsmasterdetail.Model.FilmsResponse.example.starwarsmasterdetail.FilmsResponse;
import com.example.starwarsmasterdetail.Model.FilmsResponse.example.starwarsmasterdetail.PlanetResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface StarWarsService {
    @GET(Constants.FILMS_ENDPOINT)
    Call<FilmsResponse> getAllFilms();

    @GET(Constants.PLANET_ENDPOINT)
    Call<PlanetResponse> getPlanetDetails(@Path("planetNumber")int planetNumber);
}
