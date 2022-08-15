package com.example.dietclinic;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.Spinner;
import android.widget.Toast;


public class RegistrationForm extends AppCompatActivity implements NumberPicker.OnValueChangeListener, PopupMenu.OnMenuItemClickListener, AdapterView.OnItemSelectedListener {
    ImageView impaymentslip;
    Button btpaymentslip;
    private static final int inpaymentslip = 1000;
    private static final int inpaymentslip2 = 1001;
    Spinner spinnerheight, spinnerheight2, spinnerweight, spinnerweight2, spinnerphysical, sprt, splt, spwaist, spbb, spchest, spcalves, sphips;
    NumberPicker nprt, nplt, npwaist, npbb, npchest, npcalves, nphips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_form);
        getSupportActionBar().hide();
        spinnerheight = findViewById(R.id.spinnerheight);
        spinnerheight2 = findViewById(R.id.spinnerheight2);
        spinnerweight = findViewById(R.id.spinnerweight);
        spinnerweight2 = findViewById(R.id.spinnerweight2);
        spinnerphysical = findViewById(R.id.spinnerphysical);
        sprt = findViewById(R.id.sprt);
        splt = findViewById(R.id.splt);
        spwaist = findViewById(R.id.spwaist);
        spbb = findViewById(R.id.spbb);
        spchest = findViewById(R.id.spchest);
        spcalves = findViewById(R.id.spcalvesw);
        sphips = findViewById(R.id.sphips);

        nprt = findViewById(R.id.nprt);
        nplt = findViewById(R.id.nplt);
        npwaist = findViewById(R.id.npwaist);
        npbb = findViewById(R.id.npbb);
        npchest = findViewById(R.id.npchest);
        npcalves = findViewById(R.id.npcalves);
        nphips = findViewById(R.id.nphips);


        impaymentslip = findViewById(R.id.impaymentslip);
        btpaymentslip = findViewById(R.id.btpaymentslip);


        nprt.setMinValue(0);
        nprt.setMaxValue(200);
        nprt.setOnValueChangedListener(this);

        nplt.setMinValue(0);
        nplt.setMaxValue(200);
        nplt.setOnValueChangedListener(this);

        npwaist.setMinValue(0);
        npwaist.setMaxValue(200);
        npwaist.setOnValueChangedListener(this);

        npbb.setMinValue(0);
        npbb.setMaxValue(200);
        npbb.setOnValueChangedListener(this);

        npchest.setMinValue(0);
        npchest.setMaxValue(200);
        npchest.setOnValueChangedListener(this);

        npcalves.setMinValue(0);
        npcalves.setMaxValue(200);
        npcalves.setOnValueChangedListener(this);

        nphips.setMinValue(0);
        nphips.setMaxValue(200);
        nphips.setOnValueChangedListener(this);


        ArrayAdapter adapterheight = ArrayAdapter.createFromResource(this, R.array.numbersft, R.layout.color_spinner_layout);
        ArrayAdapter adapterheight2 = ArrayAdapter.createFromResource(this, R.array.numbersInches, R.layout.color_spinner_layout);
        ArrayAdapter adapterweight = ArrayAdapter.createFromResource(this, R.array.kgpound, R.layout.color_spinner_layout);
        ArrayAdapter adapterphysical = ArrayAdapter.createFromResource(this, R.array.hoursmints, R.layout.color_spinner_layout);
        ArrayAdapter adapterbodymeasurment = ArrayAdapter.createFromResource(this, R.array.InchesCentimeter, R.layout.color_spinner_layout);

        adapterheight.setDropDownViewResource(R.layout.spinner_drop_layout);
        adapterheight2.setDropDownViewResource(R.layout.spinner_drop_layout);
        adapterweight.setDropDownViewResource(R.layout.spinner_drop_layout);
        adapterphysical.setDropDownViewResource(R.layout.spinner_drop_layout);
        adapterbodymeasurment.setDropDownViewResource(R.layout.spinner_drop_layout);

        spinnerheight.setAdapter(adapterheight);
        spinnerheight2.setAdapter(adapterheight2);
        spinnerweight.setAdapter(adapterweight);
        spinnerweight2.setAdapter(adapterweight);
        spinnerphysical.setAdapter(adapterphysical);

        sprt.setAdapter(adapterbodymeasurment);
        splt.setAdapter(adapterbodymeasurment);
        spwaist.setAdapter(adapterbodymeasurment);
        spbb.setAdapter(adapterbodymeasurment);
        spchest.setAdapter(adapterbodymeasurment);
        spcalves.setAdapter(adapterbodymeasurment);
        sphips.setAdapter(adapterbodymeasurment);

        spinnerheight.setOnItemSelectedListener(this);
        spinnerheight.setOnItemSelectedListener(this);
        spinnerweight.setOnItemSelectedListener(this);
        spinnerweight2.setOnItemSelectedListener(this);
        spinnerphysical.setOnItemSelectedListener(this);

        sprt.setOnItemSelectedListener(this);
        splt.setOnItemSelectedListener(this);
        spwaist.setOnItemSelectedListener(this);
        spbb.setOnItemSelectedListener(this);
        spchest.setOnItemSelectedListener(this);
        spcalves.setOnItemSelectedListener(this);
        sphips.setOnItemSelectedListener(this);



        btpaymentslip.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                //check permistion

                if (checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE)
                        == PackageManager.PERMISSION_DENIED) {
                    String[] permissions = {Manifest.permission.READ_EXTERNAL_STORAGE};
                    requestPermissions(permissions, inpaymentslip2);


                } else {
                    PickImageFromGrallery();

                }
            }
        });


    }

    private void PickImageFromGrallery() {
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivityForResult(intent, inpaymentslip);

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case inpaymentslip2: {
                if (grantResults.length > 0 && grantResults[0] ==
                        PackageManager.PERMISSION_GRANTED) {
                    PickImageFromGrallery();
                } else {
                    Toast.makeText(this, "Permission denied", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && requestCode == inpaymentslip) {
            impaymentslip.setImageURI(data.getData());
        }
    }

    public void showPopup(View view) {
        PopupMenu popupMenu = new PopupMenu(this, findViewById(R.id.viewpayment));
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.inflate(R.menu.popupmenusocialmedia);
        popupMenu.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        return false;
        //Switch case lagany hain + her me return true karana hai
        //Default me false kara do
    }

    public void showPopuppayment(View view) {
        PopupMenu popupMenu = new PopupMenu(this, findViewById(R.id.viewpaymentmethod));
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.inflate(R.menu.popupmenupayment);
        popupMenu.show();
    }

    public void showpopupplan(View view) {
        PopupMenu popupMenu = new PopupMenu(this, findViewById(R.id.viewplan));
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.inflate(R.menu.popupmenuplan);
        popupMenu.show();
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String choice = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        Toast.makeText(this, "Please Select a valid height", Toast.LENGTH_SHORT).show();

    }

    public void Reference(MenuItem item) {
//        Toast.makeText(this, "working", Toast.LENGTH_SHORT).show();
        AlertDialog.Builder builder = new AlertDialog.Builder(RegistrationForm.this);
        final View layout = getLayoutInflater().inflate(R.layout.reference, null);
        builder.setView(layout);
        builder.setTitle("Reference:");
        builder.setPositiveButton("Enter", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();

    }

    @Override
    public void onValueChange(NumberPicker picker, int oldVal, int newVal) {

    }
}