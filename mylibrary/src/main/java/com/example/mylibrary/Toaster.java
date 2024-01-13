package com.example.mylibrary;

import android.content.Context;
import android.widget.Toast;

import androidx.annotation.Keep;

@Keep
public class Toaster {
    public static void makeToast(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
