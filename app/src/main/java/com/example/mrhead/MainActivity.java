package com.example.mrhead;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkboxHair;
    private CheckBox checkboxMoustache;
    private CheckBox checkboxEyebrow;
    private CheckBox checkboxBeard;
    private ImageView headImageView;
    private ImageView hairImageView;
    private ImageView eyebrowImageView;
    private ImageView eyeImageView;
    private ImageView moustacheImageView;
    private ImageView beardImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        headImageView = findViewById(R.id.headImageView);
        eyeImageView = findViewById(R.id.eyeImageView);
        hairImageView = findViewById(R.id.hairImageView);
        eyebrowImageView = findViewById(R.id.eyebrowImageView);
        beardImageView = findViewById(R.id.beardImageView);
        moustacheImageView = findViewById(R.id.moustacheImageView);
        checkboxHair = findViewById(R.id.checkboxHair);
        checkboxBeard = findViewById(R.id.checkboxBeard);
        checkboxEyebrow = findViewById(R.id.checkboxEyebrow);
        checkboxMoustache = findViewById(R.id.checkboxMoustache);

        hairImageView.setVisibility(View.INVISIBLE);
        eyebrowImageView.setVisibility(View.INVISIBLE);
        beardImageView.setVisibility(View.INVISIBLE);
        moustacheImageView.setVisibility(View.INVISIBLE);

        checkboxHair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkboxHair.isChecked()) {
                    hairImageView.setVisibility(View.VISIBLE);
                } else {
                    hairImageView.setVisibility(View.GONE);
                }
            }
        });

        checkboxMoustache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkboxMoustache.isChecked()) {
                    moustacheImageView.setVisibility(View.VISIBLE);
                } else {
                    moustacheImageView.setVisibility(View.GONE);
                }
            }
        });

        checkboxEyebrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkboxEyebrow.isChecked()) {
                    eyebrowImageView.setVisibility(View.VISIBLE);
                } else {
                    eyebrowImageView.setVisibility(View.GONE);
                }
            }
        });

        checkboxBeard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkboxBeard.isChecked()) {
                    beardImageView.setVisibility(View.VISIBLE);
                } else {
                    beardImageView.setVisibility(View.GONE);
                }
            }
        });
    }
}
