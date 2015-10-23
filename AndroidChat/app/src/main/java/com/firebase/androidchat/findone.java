package com.firebase.androidchat;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Type;

public class findone extends Activity {
    public static final String userInfoURL = "http://cpybcg.azurewebsites.net/api/users/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_findone);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
    }

    public void find_user(View view){}

    public void find_users(View view)
    {

        EditText phonenumber = (EditText) findViewById(R.id.phoneNumberinFindUser);
        String phonenumberString = phonenumber.getText().toString();
        if ( !phonenumberString.isEmpty() )
        {
            Type listType = new TypeToken<ArrayList<userModel>>() {
            }.getType();
            List<userModel> results = null;
            try {
                String userInfoString = getContentFromURL(userInfoURL);
                results = new Gson().fromJson(userInfoString, listType);
                Log.d("Debug", userInfoString);
            }
            catch(Exception e)
            {}

            if ( results == null ){
                Toast.makeText(this, "Inable to fetch the list", Toast.LENGTH_SHORT).show();
                return;
            }
            for ( userModel i : results ) {
                if (i.getPhoneNumber().equals(phonenumberString)) {
                    //user found;
                    Intent intent = new Intent(this, find_user.class);
                    startActivity(intent);
                    return;
                }
            }


            //user not found;
            Toast.makeText(this, "Not found", Toast.LENGTH_SHORT).show();
        }

        Toast.makeText(this, "Input Phone Number", Toast.LENGTH_SHORT).show();

    }

    public String getContentFromURL (String urlString) throws Exception
    {
        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuffer buffer = new StringBuffer();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1)
                buffer.append(chars, 0, read);

            return buffer.toString();
        }
        finally {
            if (reader != null) reader.close();
        }
    }
}
