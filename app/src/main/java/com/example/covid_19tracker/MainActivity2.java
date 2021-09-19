package com.example.covid_19tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.VectorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;


import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    ListView listView;
    ImageButton backvector;
    ArrayList<String> months = new ArrayList<>();
    ArrayAdapter<String> arrayAdapter;
    EditText etSearch;


    public static List<mood> ModelList = new ArrayList<>();
    mood model;
    Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listView = findViewById(R.id.listView);
        etSearch = findViewById(R.id.etSearch);




       getSupportActionBar().hide();

        listView = findViewById(R.id.listView);
        fetchData();

    }


    private void fetchData() {

        String url = "https://data.covid19india.org/state_district_wise.json";

        StringRequest req = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                try {

                    JSONObject object = new JSONObject(response);
                    Iterator<String> keys = object.keys();

                    while (keys.hasNext()) {
                        String key = keys.next();
                        JSONObject obj1 = object.getJSONObject(key);
                        JSONObject obj2 = obj1.getJSONObject("districtData");
                        Iterator<String> subkeys = obj2.keys();

                        while (subkeys.hasNext()) {
                            String subkey = subkeys.next();
                            JSONObject obj3 = obj2.getJSONObject(subkey);
                            JSONObject obj4 = obj3.getJSONObject("delta");

                            String active = obj3.getString("active");
                            String confirmed = obj3.getString("confirmed");
                            String migratedother = obj3.getString("migratedother");
                            String deceased = obj3.getString("deceased");
                            String recovered = obj3.getString("recovered");

                            String dconfirmed = obj4.getString("confirmed");
                            String ddeceased = obj4.getString("deceased");
                            String drecovered = obj4.getString("recovered");

                            model = new mood(subkey, active, confirmed, migratedother, deceased, recovered,
                                    dconfirmed, ddeceased, drecovered);
                            // placing data into the app using AdapterClass
                            ModelList.add(model);
                        }
                    }

                    adapter = new Adapter(MainActivity2.this, ModelList);
                    listView.setAdapter(adapter);


                    // In case of error it will run
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                // In case of error it will run
                Toast.makeText(MainActivity2.this, error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        RequestQueue reqQueue = Volley.newRequestQueue(this);
        reqQueue.add(req);
        etSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filter(s.toString());

            }

            private void filter(String toString) {
            }
        });
    }

   



    
}

