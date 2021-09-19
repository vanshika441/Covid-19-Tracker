package com.example.covid_19tracker.Network;

import com.example.covid_19tracker.CountryData;
import com.example.covid_19tracker.Model.GlobalResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("India")
    Call<GlobalResponse> globalResponse();
    Call<List<CountryData>> getCountryData();
}
