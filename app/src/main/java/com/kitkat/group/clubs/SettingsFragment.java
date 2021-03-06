package com.kitkat.group.clubs;

import android.content.DialogInterface;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.kitkat.group.clubs.nfc.SenderActivity;
/**
 * Created by Glenn on 17/02/2019.
 * (Do not remove)
 */

public class SettingsFragment extends Fragment {

    private static final String TAG = "SettingsFragment";

    public SettingsFragment() {
        // Empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView: started SettingsFragment");

        return inflater.inflate(R.layout.fragment_user_settings, container, false);
    }
}
