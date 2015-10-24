package com.firebase.androidchat;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AlertDialog;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.telephony.SmsManager;
import android.view.*;
import android.widget.EditText;
import android.widget.Toast;

public class UserPad extends Activity {

    private EditText phoneNumberSMSTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_pad);
        phoneNumberSMSTextView = (EditText)findViewById(R.id.PhoneNumberSMSEditText);
        phoneNumberSMSTextView.addTextChangedListener(new PhoneNumberFormattingTextWatcher());

    }

    public void to_phonemessage(View view)
    {
        if(phoneNumberSMSTextView.getText() == null || phoneNumberSMSTextView.getText().toString().isEmpty()){
            Toast.makeText(this, "Please enter a phone number", Toast.LENGTH_LONG);
            return;
        }

        try {
            SmsManager.getDefault().sendTextMessage(phoneNumberSMSTextView.getText().toString().trim(), null, "Hello SMS!", null, null);
        } catch (Exception e) {
            AlertDialog.Builder alertDialogBuilder = new
                    AlertDialog.Builder(this);
            AlertDialog dialog = alertDialogBuilder.create();


            dialog.setMessage(e.getMessage());


            dialog.show();


        }
    }

    public void to_chat(View view)
    {
        Intent intent = new Intent(this, find_user.class);
        startActivity(intent);
    }

    public void find_to_chat(View view)
    {
        Intent intent = new Intent(this, findone.class);
        startActivity(intent);
    }
}
