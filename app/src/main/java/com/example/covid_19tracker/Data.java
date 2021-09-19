package com.example.covid_19tracker;
import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class Data {

    private static Data instance;
    private RequestQueue requestQueue;

    private static Context ctx;

    private Data(Context context) {
        ctx = context;
        requestQueue = getRequestQueue();

    }

    public static synchronized Data getInstance(Context context) {
        if (instance == null) {
            instance = new Data(context);
        }
        return instance;
    }

    public RequestQueue getRequestQueue() {
        if (requestQueue == null) {
            // getApplicationContext() is key, it keeps you from leaking the
            // Activity or BroadcastReceiver if someone passes one in.
            requestQueue = Volley.newRequestQueue(ctx.getApplicationContext());
        }
        return requestQueue;
    }

    public <T> void addToRequestQueue(Request<T> req) {
        getRequestQueue().add(req);
    }


}
