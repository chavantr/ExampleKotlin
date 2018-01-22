package com.mywings.pay.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.mywings.pay.R;


public class AddAtmLocationFragment extends BaseFragment {


    private View addAtmLocations;
    private EditText txtLocation;
    private EditText txtAddress;
    private EditText txtLongitude;
    private EditText txtLatitude;
    private Button btnSave;


    public AddAtmLocationFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        addAtmLocations = inflater.inflate(R.layout.fragment_add_atm_location, container, false);

        txtLocation = addAtmLocations.findViewById(R.id.txtLocation);
        txtAddress = addAtmLocations.findViewById(R.id.txtAddress);
        txtLongitude = addAtmLocations.findViewById(R.id.txtLongitude);
        txtLatitude = addAtmLocations.findViewById(R.id.txtLatitude);
        btnSave = addAtmLocations.findViewById(R.id.btnSave);

        btnSave.setOnClickListener(view -> {

            if (validate()) {

                initializationOfAddAtmLocations();

            } else {
                show("All fields (*) are mandatory.", btnSave);
            }

        });

        return addAtmLocations;
    }

    private void initializationOfAddAtmLocations() {

    }

    private boolean validate() {
        if (!getText(txtLocation).isEmpty() && !getText(txtAddress).isEmpty() && !getText(txtLongitude).isEmpty() && !getText(txtLatitude).isEmpty()) {
            return true;
        }
        return false;
    }
}
