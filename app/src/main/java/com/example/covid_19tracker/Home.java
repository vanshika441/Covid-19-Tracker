package com.example.covid_19tracker;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.covid_19tracker.Model.GlobalResponse;
import com.example.covid_19tracker.Network.ApiClientPrivate;
import com.example.covid_19tracker.Network.ApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Home extends AppCompatActivity {
    TextView cases, todaycases, deaths, todaydeaths, recovered, active;
    Button countrytracker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        cases=findViewById(R.id.tv1);
        todaycases=findViewById(R.id.tv2);
        deaths=findViewById(R.id.tv3);
        todaydeaths=findViewById(R.id.tv4);
        recovered=findViewById(R.id.tv5);
        active=findViewById(R.id.tv6);
        countrytracker=findViewById(R.id.countrytracker);

        countrytracker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MainIntent = new Intent(Home.this,MainActivity2.class);
                startActivity(MainIntent);
            }
        });

        apiCall();

    }
    @RequiresApi(api = Build.VERSION_CODES.N)
    private void apiCall() {
        ApiInterface apiInterface = null;
        apiInterface= ApiClientPrivate.getApiClient().create(ApiInterface.class);

        Call<GlobalResponse> call = apiInterface.globalResponse();

        call.enqueue(new Callback<GlobalResponse>() {
            @Override
            public void onResponse(Call<GlobalResponse> call, Response<GlobalResponse> response) {
                if (response.isSuccessful()){
                    String stCase=String.valueOf(response.body().getCases());
                    String sttodayCases=String.valueOf(response.body().getTodayCases());
                    String stDeaths=String.valueOf(response.body().getDeaths());
                    String stTodayDeath=String.valueOf(response.body().getTodayDeaths());
                    String stRecovered=String.valueOf(response.body().getRecovered());
                    String stActive=String.valueOf(response.body().getActive());

                    cases.setText(stCase);
                    todaycases.setText(sttodayCases);
                    deaths.setText(stDeaths);
                    todaydeaths.setText(stTodayDeath);
                    recovered.setText(stRecovered);
                    active.setText(stActive);
                    Log.d("cases",stCase);
                    Log.d("Todaycases" ,sttodayCases);
                    Log.d("Deaths" ,stDeaths);
                    Log.d("Todaydeaths" ,stTodayDeath);
                    Log.d("Recovered" ,stRecovered);
                    Log.d("Active" ,stActive);

                }
            }

            @Override
            public void onFailure(Call<GlobalResponse> call, Throwable t) {

            }
        });
    }
}