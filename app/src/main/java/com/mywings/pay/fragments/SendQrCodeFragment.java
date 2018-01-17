package com.mywings.pay.fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mywings.pay.R;


public class SendQrCodeFragment extends Fragment {


    public SendQrCodeFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_send_qr_code, container, false);
    }

}
