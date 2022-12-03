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


    String t1,t2,t1s,t2s,mn;

    ListView listView;
    ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();
    HashMap<String,String>  hashMap;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

       View view = inflater.inflate(R.layout.fragment_home, container, false);

        loadScore(Integer.parseInt("1"),view);
        loadScore(Integer.parseInt("2"),view);
        loadScore(Integer.parseInt("3"),view);
        loadScore(Integer.parseInt("4"),view);
        loadScore(Integer.parseInt("5"),view);
        loadScore(Integer.parseInt("6"),view);
        loadScore(Integer.parseInt("7"),view);
        loadScore(Integer.parseInt("8"),view);
        loadScore(Integer.parseInt("9"),view);
        loadScore(Integer.parseInt("10"),view);
        loadScore(Integer.parseInt("11"),view);
        loadScore(Integer.parseInt("12"),view);
        loadScore(Integer.parseInt("13"),view);
        loadScore(Integer.parseInt("14"),view);
        loadScore(Integer.parseInt("15"),view);




        String url  = "https://cse53.algostackbd.com/liveupdate.php";

        JsonArrayRequest arrayRequest = new JsonArrayRequest(Request.Method.GET, url, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {


                try {
//                    for(int x=response.length()-1;x<response.length();x++){
                        JSONObject jsonObject = response.getJSONObject(response.length()-1);

                        TextView matchNumber = view.findViewById(R.id.live_matchNum);
                        TextView TeamOne = view.findViewById(R.id.live_tOne);
                        TextView TeamTwo = view.findViewById(R.id.live_tTwo);
                        TextView TeamOneScore = view.findViewById(R.id.live_tOneScore);
                        TextView TeamTwoScore = view.findViewById(R.id.live_tTwoScore);



                        String id = jsonObject.getString("id");
                        t1 = jsonObject.getString("team_one");
                        t2 = jsonObject.getString("team_two");
                        t1s = jsonObject.getString("team_one_score");
                        t2s =  jsonObject.getString("team_two_score");
                        mn = jsonObject.getString("match_number");
                        TeamOne.setText(t1);
                        TeamTwo.setText(t2);
                        TeamOneScore.setText(t1s);
                        TeamTwoScore.setText(t2s);
                        matchNumber.setText("Match : " + mn);




                    //}

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
               score_details.code ="1";



               startActivity(new Intent(getActivity(),score_details.class));




           }
       });
        match2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score_details.code ="2";
                startActivity(new Intent(getActivity(),score_details.class));


            }
        });
        match3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score_details.code ="3";
                startActivity(new Intent(getActivity(),score_details.class));

            }
        });
        match4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score_details.code ="4";
                startActivity(new Intent(getActivity(),score_details.class));

            }
        });
        match5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score_details.code ="5";
                startActivity(new Intent(getActivity(),score_details.class));

            }
        });
        match6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score_details.code ="6";
                startActivity(new Intent(getActivity(),score_details.class));

            }
        });
        match7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score_details.code ="7";
                startActivity(new Intent(getActivity(),score_details.class));

            }
        });
        match8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score_details.code ="8";
                startActivity(new Intent(getActivity(),score_details.class));

            }
        });
        match9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score_details.code ="8";
                startActivity(new Intent(getActivity(),score_details.class));

            }
        });
        match10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score_details.code ="10";
                startActivity(new Intent(getActivity(),score_details.class));

            }
        });
        match11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score_details.code ="11";
                startActivity(new Intent(getActivity(),score_details.class));

            }
        });
        match12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score_details.code ="12";
                startActivity(new Intent(getActivity(),score_details.class));

            }
        });
        match13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score_details.code ="13";
                startActivity(new Intent(getActivity(),score_details.class));

            }
        });
        match14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score_details.code ="14";
                startActivity(new Intent(getActivity(),score_details.class));

            }
        });
        match15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score_details.code ="15";
                startActivity(new Intent(getActivity(),score_details.class));

            }
        });



       return view;
    }


    public void loadScore(int code,View view){

        String url = "https://cse53.algostackbd.com/demo_data.php?i="+code;

        JsonArrayRequest arrayRequest = new JsonArrayRequest(Request.Method.GET, url, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {


                try {


                    if(code==1){
                        JSONObject jsonObject = response.getJSONObject(response.length()-1);
                        TextView TeamOne= view.findViewById(R.id.live_1_tOne);
                        TextView TeamTwo= view.findViewById(R.id.live_1_tTwo);
                        TextView TeamOneScore= view.findViewById(R.id.live_1_tOneScore);
                        TextView TeamTwoScore= view.findViewById(R.id.live_1_tTwoScore);
                        TeamOne.setText(jsonObject.getString("team_one"));
                        TeamTwo.setText(jsonObject.getString("team_two"));
                        TeamOneScore.setText(jsonObject.getString("team_one_score"));
                        TeamTwoScore.setText(jsonObject.getString("team_two_score"));






                    }
                       else if(code==2){
                           JSONObject jsonObject = response.getJSONObject(response.length()-1);
                           TextView TeamOne= view.findViewById(R.id.live_2_tOne);
                           TextView TeamTwo= view.findViewById(R.id.live_2_tTwo);
                           TextView TeamOneScore= view.findViewById(R.id.live_2_tOneScore);
                           TextView TeamTwoScore= view.findViewById(R.id.live_2_tTwoScore);
                           TeamOne.setText(jsonObject.getString("team_one"));
                           TeamTwo.setText(jsonObject.getString("team_two"));
                           TeamOneScore.setText(jsonObject.getString("team_one_score"));
                           TeamTwoScore.setText(jsonObject.getString("team_two_score"));

                        
                       }
                    else if(code==3){
                        JSONObject jsonObject = response.getJSONObject(response.length()-1);
                        TextView TeamOne= view.findViewById(R.id.live_3_tOne);
                        TextView TeamTwo= view.findViewById(R.id.live_3_tTwo);
                        TextView TeamOneScore= view.findViewById(R.id.live_3_tOneScore);
                        TextView TeamTwoScore= view.findViewById(R.id.live_3_tTwoScore);
                        TeamOne.setText(jsonObject.getString("team_one"));
                        TeamTwo.setText(jsonObject.getString("team_two"));
                        TeamOneScore.setText(jsonObject.getString("team_one_score"));
                        TeamTwoScore.setText(jsonObject.getString("team_two_score"));

                        
                    }
                    else if(code==4){
                        JSONObject jsonObject = response.getJSONObject(response.length()-1);
                        TextView TeamOne= view.findViewById(R.id.live_4_tOne);
                        TextView TeamTwo= view.findViewById(R.id.live_4_tTwo);
                        TextView TeamOneScore= view.findViewById(R.id.live_4_tOneScore);
                        TextView TeamTwoScore= view.findViewById(R.id.live_4_tTwoScore);
                        TeamOne.setText(jsonObject.getString("team_one"));
                        TeamTwo.setText(jsonObject.getString("team_two"));
                        TeamOneScore.setText(jsonObject.getString("team_one_score"));
                        TeamTwoScore.setText(jsonObject.getString("team_two_score"));

                        
                    }
                    else if(code==5){
                        JSONObject jsonObject = response.getJSONObject(response.length()-1);
                        TextView TeamOne= view.findViewById(R.id.live_5_tOne);
                        TextView TeamTwo= view.findViewById(R.id.live_5_tTwo);
                        TextView TeamOneScore= view.findViewById(R.id.live_5_tOneScore);
                        TextView TeamTwoScore= view.findViewById(R.id.live_5_tTwoScore);
                        TeamOne.setText(jsonObject.getString("team_one"));
                        TeamTwo.setText(jsonObject.getString("team_two"));
                        TeamOneScore.setText(jsonObject.getString("team_one_score"));
                        TeamTwoScore.setText(jsonObject.getString("team_two_score"));

                        
                    }
                    else if(code==6){
                        JSONObject jsonObject = response.getJSONObject(response.length()-1);
                        TextView TeamOne= view.findViewById(R.id.live_6_tOne);
                        TextView TeamTwo= view.findViewById(R.id.live_6_tTwo);
                        TextView TeamOneScore= view.findViewById(R.id.live_6_tOneScore);
                        TextView TeamTwoScore= view.findViewById(R.id.live_6_tTwoScore);
                        TeamOne.setText(jsonObject.getString("team_one"));
                        TeamTwo.setText(jsonObject.getString("team_two"));
                        TeamOneScore.setText(jsonObject.getString("team_one_score"));
                        TeamTwoScore.setText(jsonObject.getString("team_two_score"));

                        
                    }
                    else if(code==7){
                        JSONObject jsonObject = response.getJSONObject(response.length()-1);
                        TextView TeamOne= view.findViewById(R.id.live_7_tOne);
                        TextView TeamTwo= view.findViewById(R.id.live_7_tTwo);
                        TextView TeamOneScore= view.findViewById(R.id.live_7_tOneScore);
                        TextView TeamTwoScore= view.findViewById(R.id.live_7_tTwoScore);
                        TeamOne.setText(jsonObject.getString("team_one"));
                        TeamTwo.setText(jsonObject.getString("team_two"));
                        TeamOneScore.setText(jsonObject.getString("team_one_score"));
                        TeamTwoScore.setText(jsonObject.getString("team_two_score"));

                        


                    }
                    else if(code==8){
                        JSONObject jsonObject = response.getJSONObject(response.length()-1);
                        TextView TeamOne= view.findViewById(R.id.live_8_tOne);
                        TextView TeamTwo= view.findViewById(R.id.live_8_tTwo);
                        TextView TeamOneScore= view.findViewById(R.id.live_8_tOneScore);
                        TextView TeamTwoScore= view.findViewById(R.id.live_8_tTwoScore);
                        TeamOne.setText(jsonObject.getString("team_one"));
                        TeamTwo.setText(jsonObject.getString("team_two"));
                        TeamOneScore.setText(jsonObject.getString("team_one_score"));
                        TeamTwoScore.setText(jsonObject.getString("team_two_score"));

                        
                    }
                    else if(code==9){
                        JSONObject jsonObject = response.getJSONObject(response.length()-1);
                        TextView TeamOne= view.findViewById(R.id.live_9_tOne);
                        TextView TeamTwo= view.findViewById(R.id.live_9_tTwo);
                        TextView TeamOneScore= view.findViewById(R.id.live_9_tOneScore);
                        TextView TeamTwoScore= view.findViewById(R.id.live_9_tTwoScore);
                        TeamOne.setText(jsonObject.getString("team_one"));
                        TeamTwo.setText(jsonObject.getString("team_two"));
                        TeamOneScore.setText(jsonObject.getString("team_one_score"));
                        TeamTwoScore.setText(jsonObject.getString("team_two_score"));

                        
                    }
                    else if(code==10){
                        JSONObject jsonObject = response.getJSONObject(response.length()-1);
                        TextView TeamOne= view.findViewById(R.id.live_2_tOne);
                        TextView TeamTwo= view.findViewById(R.id.live_10_tTwo);
                        TextView TeamOneScore= view.findViewById(R.id.live_10_tOneScore);
                        TextView TeamTwoScore= view.findViewById(R.id.live_10_tTwoScore);
                        TeamOne.setText(jsonObject.getString("team_one"));
                        TeamTwo.setText(jsonObject.getString("team_two"));
                        TeamOneScore.setText(jsonObject.getString("team_one_score"));
                        TeamTwoScore.setText(jsonObject.getString("team_two_score"));

                        
                    }
                    else if(code==11){
                        JSONObject jsonObject = response.getJSONObject(response.length()-1);
                        TextView TeamOne= view.findViewById(R.id.live_11_tOne);
                        TextView TeamTwo= view.findViewById(R.id.live_11_tTwo);
                        TextView TeamOneScore= view.findViewById(R.id.live_11_tOneScore);
                        TextView TeamTwoScore= view.findViewById(R.id.live_11_tTwoScore);
                        TeamOne.setText(jsonObject.getString("team_one"));
                        TeamTwo.setText(jsonObject.getString("team_two"));
                        TeamOneScore.setText(jsonObject.getString("team_one_score"));
                        TeamTwoScore.setText(jsonObject.getString("team_two_score"));

                        
                    }
                    else if(code==12){
                        JSONObject jsonObject = response.getJSONObject(response.length()-1);
                        TextView TeamOne= view.findViewById(R.id.live_12_tOne);
                        TextView TeamTwo= view.findViewById(R.id.live_12_tTwo);
                        TextView TeamOneScore= view.findViewById(R.id.live_12_tOneScore);
                        TextView TeamTwoScore= view.findViewById(R.id.live_12_tTwoScore);
                        TeamOne.setText(jsonObject.getString("team_one"));
                        TeamTwo.setText(jsonObject.getString("team_two"));
                        TeamOneScore.setText(jsonObject.getString("team_one_score"));
                        TeamTwoScore.setText(jsonObject.getString("team_two_score"));

                        
                    }
                    else if(code==13){
                        JSONObject jsonObject = response.getJSONObject(response.length()-1);
                        TextView TeamOne= view.findViewById(R.id.live_13_tOne);
                        TextView TeamTwo= view.findViewById(R.id.live_13_tTwo);
                        TextView TeamOneScore= view.findViewById(R.id.live_13_tOneScore);
                        TextView TeamTwoScore= view.findViewById(R.id.live_13_tTwoScore);
                        TeamOne.setText(jsonObject.getString("team_one"));
                        TeamTwo.setText(jsonObject.getString("team_two"));
                        TeamOneScore.setText(jsonObject.getString("team_one_score"));
                        TeamTwoScore.setText(jsonObject.getString("team_two_score"));

                        
                    }
                    else if(code==14){
                        JSONObject jsonObject = response.getJSONObject(response.length()-1);
                        TextView TeamOne= view.findViewById(R.id.live_14_tOne);
                        TextView TeamTwo= view.findViewById(R.id.live_14_tTwo);
                        TextView TeamOneScore= view.findViewById(R.id.live_14_tOneScore);
                        TextView TeamTwoScore= view.findViewById(R.id.live_14_tTwoScore);
                        TeamOne.setText(jsonObject.getString("team_one"));
                        TeamTwo.setText(jsonObject.getString("team_two"));
                        TeamOneScore.setText(jsonObject.getString("team_one_score"));
                        TeamTwoScore.setText(jsonObject.getString("team_two_score"));

                        
                    }
                    else if(code==15){
                        JSONObject jsonObject = response.getJSONObject(response.length()-1);
                        TextView TeamOne= view.findViewById(R.id.live_15_tOne);
                        TextView TeamTwo= view.findViewById(R.id.live_15_tTwo);
                        TextView TeamOneScore= view.findViewById(R.id.live_15_tOneScore);
                        TextView TeamTwoScore= view.findViewById(R.id.live_15_tTwoScore);
                        TeamOne.setText(jsonObject.getString("team_one"));
                        TeamTwo.setText(jsonObject.getString("team_two"));
                        TeamOneScore.setText(jsonObject.getString("team_one_score"));
                        TeamTwoScore.setText(jsonObject.getString("team_two_score"));

                        
                    }





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
    }




}

