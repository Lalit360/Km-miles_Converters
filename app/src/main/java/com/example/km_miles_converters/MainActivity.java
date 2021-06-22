package com.example.km_miles_converters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.km_miles_converters.databinding.ActivityMainBinding;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        binding = ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        binding.convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float Value, ShowValue;
                Value = Float.valueOf(binding.insertValues.getText().toString());
                ShowValue = (float) (Value*0.62137);
                DecimalFormat formatVal = new DecimalFormat("##.#####" );
                binding.showValues.setText(formatVal.format(ShowValue));
            }
        });
        binding.convertBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float Value, ShowValue;
                Value = Float.valueOf(binding.showValues.getText().toString());
                ShowValue = (float) (Value*0.62137);
                DecimalFormat formatVal = new DecimalFormat("##.#####" );
                binding.insertValues.setText(formatVal.format(ShowValue));

            }
        });
    }
    public void clearBTN(View view) {
        binding.showValues.setText("");
        binding.insertValues.setText("");
    }
}
