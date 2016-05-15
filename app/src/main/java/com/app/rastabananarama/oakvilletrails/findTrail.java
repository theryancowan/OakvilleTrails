package com.app.rastabananarama.oakvilletrails;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.app.rastabananarama.oakvilletrails.R;

/**
 * Created by Ryan on 16-05-15.
 */
public class findTrail extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.find_a_trail);

    }


    public void chosenTrail(View v) {
        Intent intent = new Intent(findTrail.this, MapsActivity.class);
        startActivity(intent);

    }
}