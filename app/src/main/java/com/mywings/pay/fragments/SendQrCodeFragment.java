package com.mywings.pay.fragments;


import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mywings.pay.R;


public class SendQrCodeFragment extends BaseFragment {


    private View sendQRCode;
    private RecyclerView lstSendQRCode;


    public SendQrCodeFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        sendQRCode = inflater.inflate(R.layout.fragment_send_qr_code, container, false);

        lstSendQRCode = sendQRCode.findViewById(R.id.lstLoanUsers);



        return sendQRCode;
    }

}
