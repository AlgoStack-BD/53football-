package com.asm.a53btachfootball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
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

public class score_details extends AppCompatActivity {
    ListView cardList;
    ProgressBar progressBar;

    TextView sec1,sec2,match,sec1score,sec2score;

    public static String code ="";
//    public static String sec_1 = "";
//    public static String sec_2 = "";
//    public static String sec_score_1 = "";
//    public static String  sec_score_2 = "";
//    public static String matchnum = "";

        ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();
        HashMap<String,String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_details);


        progressBar = findViewById(R.id.progressBar);
        progressBar.setVisibility(View.VISIBLE);
       cardList = findViewById(R.id.cardItemList);

        sec1=findViewById(R.id.score_sec_1);
        sec2=findViewById(R.id.score_sec_2);
        sec1score=findViewById(R.id.score_sec_1_score);
        sec2score=findViewById(R.id.score_sec_2_score);
        match=findViewById(R.id.score_match_score);




        String url2  = "https://cse53.algostackbd.com/demo_data.php?i="+code;

        JsonArrayRequest arrayRequest = new JsonArrayRequest(Request.Method.GET, url2, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {


                try {
//                    for(int x=response.length()-1;x<response.length();x++){
                    JSONObject jsonObject = response.getJSONObject(response.length()-1);

//                    String mNum = jsonObject.getString("match_number");
//                    String tOne = jsonObject.getString("team_one");
//                    String tTwo = jsonObject.getString("team_two");
//                    String tOneScore = jsonObject.getString("team_one_score");
//                    String tTwoScore = jsonObject.getString("team_two_score");




                    String mNum = jsonObject.getString("match_number");
                    String tOne = jsonObject.getString("team_one");
                    String tTwo = jsonObject.getString("team_two");
                    String tOneScore = jsonObject.getString("team_one_score");
                    String tTwoScore = jsonObject.getString("team_two_score");

                    sec1.setText(tOne);
                    sec2.setText(tTwo);
                    sec1score.setText(tOneScore);
                    sec2score.setText(tTwoScore);
                    match.setText("Match : " + mNum);


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
        RequestQueue requestQueue  = Volley.newRequestQueue(score_details.this);
        requestQueue.add(arrayRequest);




        String url = "https://cse53.algostackbd.com/demo_data.php?i="+code;

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                progressBar.setVisibility(View.GONE);


                    try {
                        for(int x=0; x<response.length();x++){
                        JSONObject jsonObject = response.getJSONObject(x);

                        String id = jsonObject.getString("id");

                        String goalTime = jsonObject.getString("goal_time");
                        String goalSection = jsonObject.getString("goal_section_name");
                        String goalPlayer = jsonObject.getString("goal_player_name");

                        hashMap = new HashMap<>();
                        hashMap.put ("goalTime",goalTime);
                        hashMap.put ("goalSection",goalSection);
                        hashMap.put ("goalPlayer",goalPlayer);
                        arrayList.add(hashMap);



                    }
                        if(arrayList.size()>0){
                            Myadapter myadapter = new Myadapter();
                            cardList.setAdapter(myadapter);
                        }

                    } catch (JSONException e) {
                        e.printStackTrace();
                }



            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                progressBar.setVisibility(View.GONE);

            }
        });
        RequestQueue requestQueuee = Volley.newRequestQueue(score_details.this);
        requestQueuee.add(jsonArrayRequest);



    }

    public class Myadapter extends BaseAdapter{

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
            View myview = layoutInflater.inflate(R.layout.scorecard,null);

            TextView cardGoaSection = myview.findViewById(R.id.card_goalSectionName);
            TextView cardGoalPlayer = myview.findViewById(R.id.card_goalPlayerName);
            TextView cardGoaTime = myview.findViewById(R.id.card_goalTime);



            hashMap = arrayList.get(position);
//            String teamOne = hashMap.get("tOne");
//            String teamTwo = hashMap.get("tTwo");
//            String teamOneScore = hashMap.get("tOneScore");
//            String teamTwoScore = hashMap.get("tTwoScore");
            String gTime = hashMap.get("goalTime");
            String gSection = hashMap.get("goalSection");
            String gPlayer = hashMap.get("goalPlayer");

            System.out.println("goal"+gTime);

            cardGoaSection.setText(gSection);
            cardGoalPlayer.setText(gPlayer);
            cardGoaTime.setText(gTime);


            return myview;
        }
    }
}