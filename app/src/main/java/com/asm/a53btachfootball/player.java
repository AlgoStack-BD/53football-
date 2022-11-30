package com.asm.a53btachfootball;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;


public class player extends Fragment {

    LinearLayout aBtn,bBtn,cBtn,dBtn,eBtn,fBtn,gBtn,hBtn;



    public player() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_player, container, false);





        aBtn = view.findViewById(R.id.A);
        bBtn = view.findViewById(R.id.B);
        cBtn = view.findViewById(R.id.C);
        dBtn = view.findViewById(R.id.D);
        eBtn = view.findViewById(R.id.E);
        fBtn = view.findViewById(R.id.F);
        gBtn = view.findViewById(R.id.G);
        hBtn = view.findViewById(R.id.H);



        aBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                ce408f3cd44456c7
                Intent intent = new Intent(getActivity(), section.class);
                intent.putExtra("API","section_a");
                intent.putExtra("name", "Section A");
                startActivity(intent);
            }
        });

        bBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(getActivity(), section.class);
                intent.putExtra("API","section_b");
                intent.putExtra("name", "Section B");
                startActivity(intent);
            }
        });

        cBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(getActivity(), section.class);
                intent.putExtra("API","section_c");
                intent.putExtra("name", "Section C");
                startActivity(intent);
            }
        });

        dBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(getActivity(), section.class);
                intent.putExtra("API","section_d");
                intent.putExtra("name", "Section D");
                startActivity(intent);
            }
        });

        eBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), section.class);
                intent.putExtra("API","section_e");
                intent.putExtra("name", "Section E");
                startActivity(intent);
            }
        });

        fBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(getActivity(), section.class);
                intent.putExtra("API","section_f");
                intent.putExtra("name", "Section F");
                startActivity(intent);
            }
        });

        gBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), section.class);
                intent.putExtra("API","section_g");
                intent.putExtra("name", "Section G");
                startActivity(intent);
            }
        });

        hBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(getActivity(), section.class);
                intent.putExtra("API","section_h");
                intent.putExtra("name", "Section H");
                startActivity(intent);
            }
        });

        return view;
    }
}