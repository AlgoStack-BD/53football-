package com.asm.a53btachfootball;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class home extends Fragment {
    LinearLayout match1,match2,match3,match4,match5,match6,match7,match8,match9,match10,match11,match12,match13,match14,match15;


    ListView listView;
    ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();
    HashMap<String,String>  hashMap;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

       View view = inflater.inflate(R.layout.fragment_home, container, false);


                String url  = "https://cse53.algostackbd.com/liveupdate.php";

        JsonArrayRequest arrayRequest = new JsonArrayRequest(Request.Method.GET, url, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {


                try {


                    for (int x=response.length()-1; x < response.length();x++){
                        JSONObject jsonObject = response.getJSONObject(x);

                        String id = jsonObject.getString("id");
                        String match_number = jsonObject.getString("match_number");
                        String team_one = jsonObject.getString("team_one");
                        String team_two = jsonObject.getString("team_two");
                        String team_one_score = jsonObject.getString("team_one_score");
                        String team_two_score = jsonObject.getString("team_two_score");



                        hashMap= new HashMap<>();
                        hashMap.put("id",id);
                        hashMap.put("match_number",match_number);
                        hashMap.put("team_one",team_one);
                        hashMap.put("team_two",team_two);
                        hashMap.put("team_one_score",team_one_score);
                        hashMap.put("team_two_score",team_two_score);
                        arrayList.add(hashMap);

                    }

                    Myadapter myAdapter = new Myadapter();
                    listView.setAdapter(myAdapter);




                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {


            }
        });
        RequestQueue requestQueue  = Volley.newRequestQueue(getActivity());
        requestQueue.add(arrayRequest);


















       match1 = view.findViewById(R.id.match_1);
       match2 = view.findViewById(R.id.match_2);
       match3 = view.findViewById(R.id.match_3);
       match4 = view.findViewById(R.id.match_4);
       match5 = view.findViewById(R.id.match_5);
       match6 = view.findViewById(R.id.match_6);
       match7 = view.findViewById(R.id.match_7);
       match8 = view.findViewById(R.id.match_8);
       match9 = view.findViewById(R.id.match_9);
       match10 = view.findViewById(R.id.match_10);
       match11 = view.findViewById(R.id.match_11);
       match12 = view.findViewById(R.id.match_12);
       match13 = view.findViewById(R.id.match_13);
       match14 = view.findViewById(R.id.match_14);
       match15 = view.findViewById(R.id.match_15);



       match1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(getActivity(),score_details.class));
           }
       });
        match2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),score_details.class));

            }
        });
        match3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),score_details.class));

            }
        });
        match4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        match5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        match6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        match7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        match8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        match9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        match10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        match11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        match12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        match13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        match14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        match15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



       return view;
    }



    //----------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------

    private class Myadapter extends BaseAdapter {

        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater layoutInflater = getLayoutInflater();
            View myView = layoutInflater.inflate(R.layout.card,null);



            TextView matchNumber= myView.findViewById(R.id.live_matchNum);
            TextView TeamOne= myView.findViewById(R.id.live_tOne);
            TextView TeamTwo= myView.findViewById(R.id.live_tTwo);
            TextView TeamOneScore= myView.findViewById(R.id.live_tOneScore);
            TextView TeamTwoScore= myView.findViewById(R.id.live_tTwoScore);

            HashMap<String,String> hashMap = arrayList.get(position);
            String teamOne = hashMap.get("team_one");
            String teamTwo = hashMap.get("team_two");
            String teamOneScore = hashMap.get("team_one_score");
            String teamTwoScore = hashMap.get("team_two_score");
            String matchnum  = hashMap.get("match_number");

            System.out.println("simple "+matchnum);
            System.out.println("simple "+teamOne);
            System.out.println("simple "+teamTwo);
            System.out.println("simple "+teamOneScore);
            System.out.println("simple "+teamTwoScore);


            TeamOne.setText(teamOne);
            TeamTwo.setText(teamTwo);
            TeamOneScore.setText(teamOneScore);
            TeamTwoScore.setText(teamTwoScore);
            matchNumber.setText(matchnum);


            return myView;
        }
    }



}

