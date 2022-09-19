package com.example.unitalk.models;

import android.webkit.JavascriptInterface;

import com.example.unitalk.activities.CallingActivity;

public class InterfaceJava {

    CallingActivity callingActivity;

    public  InterfaceJava(CallingActivity callingActivity){
        this.callingActivity = callingActivity;
    }

    @JavascriptInterface
    public void onPeerConnected(){
        callingActivity.onPeerConnected();
    }
}
