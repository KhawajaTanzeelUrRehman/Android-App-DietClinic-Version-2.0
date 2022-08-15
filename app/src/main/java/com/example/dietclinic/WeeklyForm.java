package com.example.dietclinic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.NumberPicker;

import com.example.dietclinic.databinding.ActivityWeeklyFormBinding;

public class WeeklyForm extends AppCompatActivity implements NumberPicker.OnValueChangeListener,AdapterView.OnItemSelectedListener{
    ActivityWeeklyFormBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWeeklyFormBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.nprtw.setMinValue(0);
        binding.nprtw.setMaxValue(200);
        binding.nprtw.setOnValueChangedListener(this);



        binding.npltw.setMinValue(0);
        binding.npltw.setMaxValue(200);
        binding.npltw.setOnValueChangedListener(this);


        binding.npwaistw.setMinValue(0);
        binding.npwaistw.setMaxValue(200);
        binding.npwaistw.setOnValueChangedListener(this);



        binding.npchestw.setMinValue(0);
        binding.npchestw.setMaxValue(200);
        binding.npchestw.setOnValueChangedListener(this);



        binding.npcalvesw.setMinValue(0);
        binding.npcalvesw.setMaxValue(200);
        binding.npcalvesw.setOnValueChangedListener(this);


        binding.nphipsw.setMinValue(0);
        binding.nphipsw.setMaxValue(200);
        binding.nphipsw.setOnValueChangedListener(this);

        binding.npbbw.setMinValue(0);
        binding.npbbw.setMaxValue(200);
        binding.npbbw.setOnValueChangedListener(this);


        ArrayAdapter adapterheight = ArrayAdapter.createFromResource(this, R.array.numbersft, R.layout.color_spinner_layout);
        ArrayAdapter adapterheight2 = ArrayAdapter.createFromResource(this, R.array.numbersInches, R.layout.color_spinner_layout);
        ArrayAdapter adapterweight = ArrayAdapter.createFromResource(this, R.array.kgpound, R.layout.color_spinner_layout);
        ArrayAdapter adapterbodymeasurment = ArrayAdapter.createFromResource(this, R.array.InchesCentimeter, R.layout.color_spinner_layout);

        adapterheight.setDropDownViewResource(R.layout.spinner_drop_layout);
        adapterheight2.setDropDownViewResource(R.layout.spinner_drop_layout);
        adapterweight.setDropDownViewResource(R.layout.spinner_drop_layout);
        adapterbodymeasurment.setDropDownViewResource(R.layout.spinner_drop_layout);


        binding.spinnerheightw.setAdapter(adapterheight);
        binding.spinnerheight2w.setAdapter(adapterheight2);
        binding.spinnerweightw.setAdapter(adapterweight);
        binding.spinnerweight2w.setAdapter(adapterweight);


        binding.sprtw.setAdapter(adapterbodymeasurment);
        binding.spltw.setAdapter(adapterbodymeasurment);
        binding.spwaistw.setAdapter(adapterbodymeasurment);
        binding.spbbw.setAdapter(adapterbodymeasurment);
        binding.spchestw.setAdapter(adapterbodymeasurment);
        binding.spcalvesw.setAdapter(adapterbodymeasurment);
        binding.sphipsw.setAdapter(adapterbodymeasurment);



        binding.spinnerheightw.setOnItemSelectedListener(this);
        binding.spinnerheightw.setOnItemSelectedListener(this);
        binding.spinnerweightw.setOnItemSelectedListener(this);
        binding.spinnerweight2w.setOnItemSelectedListener(this);

        binding.sprtw.setOnItemSelectedListener(this);
        binding.spltw.setOnItemSelectedListener(this);
        binding.spwaistw.setOnItemSelectedListener(this);
        binding.spbbw.setOnItemSelectedListener(this);
        binding.spchestw.setOnItemSelectedListener(this);
        binding.spcalvesw.setOnItemSelectedListener(this);
        binding.sphipsw.setOnItemSelectedListener(this);

    }

    @Override
    public void onValueChange(NumberPicker picker, int oldVal, int newVal) {

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}