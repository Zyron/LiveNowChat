package com.firebase.androidchat;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.telephony.SmsManager;

public class SmsPOCActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms_poc);

        try {
            SmsManager.getDefault().sendTextMessage("+4798622627", null, "Hello SMS!", null, null);
        } catch (Exception e) {
            AlertDialog.Builder alertDialogBuilder = new
                    AlertDialog.Builder(this);
            AlertDialog dialog = alertDialogBuilder.create();


            dialog.setMessage(e.getMessage());


            dialog.show();


        }
    }
}
