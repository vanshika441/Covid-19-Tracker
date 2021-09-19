package com.example.covid_19tracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class Adapter extends ArrayAdapter<mood> {
    private Context context;
    private List<mood> ModelList;

    public Adapter(Context context, List<mood> ModelList) {
        super(context, R.layout.testing, ModelList);

        this.context = context;
        this.ModelList = ModelList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.testing, null,true);

        // Hooks
        TextView state = v.findViewById(R.id.cityname);
        TextView active = v.findViewById(R.id.active);
        TextView confirmed = v.findViewById(R.id.confirm);
        //    TextView migratedother = v.findViewById(R.id.other);
        TextView deceased = v.findViewById(R.id.deceased);
        TextView recovered = v.findViewById(R.id.recovered);

        TextView dconfirmed = v.findViewById(R.id.dconfirm);
        TextView ddeceased = v.findViewById(R.id.ddeceased);
        TextView drecovered = v.findViewById(R.id.drecovered);

        // Adding Data to ModelList
        state.setText(ModelList.get(position).getName());
        active.setText(ModelList.get(position).getActive());
        confirmed.setText(ModelList.get(position).getConfirmed());
        //     migratedother.setText(ModelList.get(position).getMigratedother());
        deceased.setText(ModelList.get(position).getDeceased());
        recovered.setText(ModelList.get(position).getRecovered());

        dconfirmed.setText(ModelList.get(position).getDconfirmed());
        ddeceased.setText(ModelList.get(position).getDdeceased());
        drecovered.setText(ModelList.get(position).getDrecovered());

        return v;
    }
}
