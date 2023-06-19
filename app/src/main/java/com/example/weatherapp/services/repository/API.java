package com.example.weatherapp.services.repository;

import com.example.weatherapp.services.model.DataModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface API {
    String BASE_URL = "https://api.openweathermap.org/data/2.5/";
    // String KEY="4a7c67224a312ffae9171bc97f274f47";

    @GET("forecast?appid=3d57ec37b099c396b2102cf93ff1d9e9")
    Call<DataModel> getWeatherInfo(@Query(value = "q") String cityName);
}
