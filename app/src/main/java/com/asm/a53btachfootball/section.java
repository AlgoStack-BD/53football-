package com.asm.a53btachfootball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class section extends AppCompatActivity {

    ProgressBar progressBar;
    ListView listView;
    TextView sec;

    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    HashMap <String, String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section);

        progressBar = findViewById(R.id.progressBar);
        listView = findViewById(R.id.listView);
        sec = findViewById(R.id.secChange);

        String data = getIntent().getExtras().getString("name","Section A");
        String api = getIntent().getExtras().getString("API","section_a");

        System.out.println("inflater Test api :" +api);
        System.out.println("inflater Test Data :" +data);


        sec.setText(data);



        String url = "https://cse53.algostackbd.com/player.json";
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

                progressBar.setVisibility(View.GONE);

                try {
                    JSONArray jsonArray = response.getJSONArray(api);

                    for (int i=0; i<jsonArray.length();i++){
                        JSONObject jsonObject = jsonArray.getJSONObject(i);
                        String name = jsonObject.getString("name");
                        String purl = jsonObject.getString("purl");

                        hashMap = new HashMap<>();
                        hashMap.put("name",name);
                        hashMap.put("purl", purl);
                        arrayList.add(hashMap);


                    }

                    MyAdapter myAdapter = new MyAdapter();
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


        RequestQueue requestQueue = Volley.newRequestQueue(section.this);
        requestQueue.add(jsonObjectRequest);
    }
    private class MyAdapter extends BaseAdapter {

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
            View myView = layoutInflater.inflate(R.layout.list_item, null);
            TextView nameTxt = myView.findViewById(R.id.txtL1);
            ImageView imageView = myView.findViewById(R.id.imgItem);

            HashMap <String, String> hashMap = arrayList.get(position);
            String name = hashMap.get("name");
            String purl = hashMap.get("purl");

            System.out.println("Photo position : "+position);
            System.out.println("Photo load : "+purl);

            nameTxt.setText(name);
            Picasso.get().load(purl).placeholder(R.drawable.profileloading).into(imageView);
//                                Picasso.get()
//                            .load(purl)
//                            .into(imageView);

            return myView ;
        }
    }
}
