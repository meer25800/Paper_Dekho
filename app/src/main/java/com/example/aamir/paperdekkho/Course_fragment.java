package com.example.aamir.paperdekkho;


import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Objects;


/**
 * A simple {@link Fragment} subclass.
 */
public class Course_fragment extends Fragment {

    public Course_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_course_fragment, container, false);
        CardView BTech = view.findViewById(R.id.btech);
        //CardView bba = view.findViewById(R.id.bba);
        BTech.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {


                Intent signUp=new Intent(Objects.requireNonNull(getActivity()).getApplication(),BtechActivity.class);
                startActivity(signUp);
            }
        });
        return view;

    }

}
