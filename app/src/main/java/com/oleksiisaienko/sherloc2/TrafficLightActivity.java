package com.oleksiisaienko.sherloc2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import com.oleksiisaienko.sherloc.R;

public class TrafficLightActivity extends Activity {
    private ConstraintLayout constraintLayout;
    private TextView infoTextView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traffic_light);

        constraintLayout = findViewById(R.id.activityTrafficLight);
        infoTextView = findViewById(R.id.textViewTrafficLight);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.buttonRed :
                constraintLayout.setBackgroundColor(ContextCompat.getColor(this,R.color.colorRed));
                infoTextView.setText("STOP");
                break;
            case R.id.buttonYellow :
                constraintLayout.setBackgroundColor(ContextCompat.getColor(this,R.color.colorYellow));
                infoTextView.setText("PREPARE");
                break;
            case R.id.buttonGreen :
                constraintLayout.setBackgroundColor(ContextCompat.getColor(this,R.color.colorGreen));
                infoTextView.setText("GO-GO-GO!");
                break;
            case R.id.imageButtonBackTrafficLight :
                finish();
                break;
        }
    }
}
