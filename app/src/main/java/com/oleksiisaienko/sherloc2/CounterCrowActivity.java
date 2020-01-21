package com.oleksiisaienko.sherloc2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.oleksiisaienko.sherloc.R;

public class CounterCrowActivity extends Activity {
    private TextView infoTextView;
    private int counterCrow = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter_crow);

        infoTextView = findViewById(R.id.textViewInfoCounterCrow);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonHello :
                infoTextView.setText("Вітання і гарного настрою!");
                break;
            case R.id.buttonCounterCrow :
                infoTextView.setText("Кількість ворон - " + ++counterCrow );
                break;
            case R.id.buttonDropCounterCrow :
                counterCrow = 0;
                infoTextView.setText("Лічільник скинуто до " + counterCrow);
                break;
            case R.id.imageButtonBackCouterCrow :
                finish();
                break;
        }
    }
}
