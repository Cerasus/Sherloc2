package com.oleksiisaienko.sherloc2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import com.oleksiisaienko.sherloc.R;

public class ChooseActivity extends Activity {
    public final static String THIEF = "Котенок";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
    }

    public void onRadioClick(View view){
        Intent answerIntent = new Intent();
        switch (view.getId()) {
            case R.id.radioCrow :
                answerIntent.putExtra(THIEF,"Ворона");
                break;
            case R.id.radioDog :
                answerIntent.putExtra(THIEF,"Песик");
                break;
            case R.id.radioCat :
                answerIntent.putExtra(THIEF,"Котенок");
                break;
             default :
                 break;
        }
        setResult(RESULT_OK, answerIntent);
        finish();
    }
}
