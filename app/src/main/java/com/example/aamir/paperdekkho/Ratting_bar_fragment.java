package com.example.aamir.paperdekkho;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;


public class Ratting_bar_fragment extends Fragment {
    private float ratedValue;
    private TextView tvRateCount;
    private TextView tvRateMessage;

    public Ratting_bar_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ratting_bar_fragment, container, false);

        RatingBar ratingBar = view.findViewById(R.id.ratingBar);
        Button btnSubmit = view.findViewById(R.id.btnSubmit);
        tvRateCount= view.findViewById(R.id.tvRateCount);
        tvRateMessage= view.findViewById(R.id.tvRateMessage);
        // ratting bar listener
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                ratedValue = ratingBar.getRating();

                tvRateCount.setText(getString(R.string.your_ratting)

                        + ratedValue + "/5.");

                if(ratedValue<1){

                    tvRateMessage.setText(R.string.bad);

                }else if(ratedValue<2){

                    tvRateMessage.setText(R.string.ok);

                }else if(ratedValue<3){

                    tvRateMessage.setText(R.string.not_bad);

                }else if(ratedValue<4){

                    tvRateMessage.setText(R.string.nice);

                }else if(ratedValue<5){

                    tvRateMessage.setText(R.string.very_nice);

                }else if(ratedValue==5){

                    tvRateMessage.setText(R.string.thank_you);

                }


            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });
        return view;

    }



}

