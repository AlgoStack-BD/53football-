package com.asm.a53btachfootball;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity { ProgressBar progressBar;
//    ListView listView;
//    ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();
//    HashMap<String,String>  hashMap;
    BottomNavigationView btNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btNav=findViewById(R.id.bt_nav);



        btNav=findViewById(R.id.bt_nav);

        btNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id=item.getItemId();

                if(id==R.id.nav_profile){

                    loadFrg(new home(),true);

                }
                else if (id==R.id.nav_home){

                    loadFrg(new player(),false);

                }
//                else {
//
//                    loadFrg(new search(),false);
//
//                }

                return true;
            }
        });

        btNav.setSelectedItemId(R.id.nav_profile);






//        progressBar= findViewById(R.id.progressBar);
//        listView = findViewById(R.id.list_view);



//        String url  = "https://cse53.algostackbd.com/demo_data.php?i=4";
//
//        JsonArrayRequest arrayRequest = new JsonArrayRequest(Request.Method.GET, url, null, new Response.Listener<JSONArray>() {
//            @Override
//            public void onResponse(JSONArray response) {
//                progressBar.setVisibility(View.GONE);
//
//                try {
//
//
//                    for (int x=response.length()-1; x < response.length();x++){
//                        JSONObject jsonObject = response.getJSONObject(x);
////                        String videoTitle = jsonObject.getString("videoTitle");
////                        String videoId = jsonObject.getString("videoId");
////
////                        hashMap  = new HashMap<>();
////                        hashMap.put("videoTitle", videoTitle);
////                        hashMap.put("videoId", videoId);
////                        arrayList.add(hashMap);
//
//                        String id = jsonObject.getString("id");
//                        String match_number = jsonObject.getString("match_number");
//                        String team_one = jsonObject.getString("team_one");
//                        String team_two = jsonObject.getString("team_two");
//                        String team_one_score = jsonObject.getString("team_one_score");
//                        String team_two_score = jsonObject.getString("team_two_score");
//
//                        hashMap= new HashMap<>();
//                        hashMap.put("id",id);
//                        hashMap.put("match_number",match_number);
//                        hashMap.put("team_one",team_one);
//                        hashMap.put("team_two",team_two);
//                        hashMap.put("team_one_score",team_one_score);
//                        hashMap.put("team_two_score",team_two_score);
//                        arrayList.add(hashMap);
//
//                    }
//
//                    Myadapter myAdapter = new Myadapter();
//                    listView.setAdapter(myAdapter);
//
//
//
//
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
//
//            }
//        }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                progressBar.setVisibility(View.GONE);
//
//            }
//        });
//        RequestQueue requestQueue  = Volley.newRequestQueue(MainActivity.this);
//        requestQueue.add(arrayRequest);
    }


    public  void loadFrg (Fragment fragment, boolean flag){
        FragmentManager frgM = getSupportFragmentManager();
        FragmentTransaction frgT= frgM.beginTransaction();

        if(flag){
            frgT.add(R.id.FrmLay,fragment);


        }
        else {
            frgT.replace(R.id.FrmLay,fragment);
        }


        frgT.commit();

    }


}