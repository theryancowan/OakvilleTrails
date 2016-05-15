package com.app.rastabananarama.oakvilletrails;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.*;

/**
 * Created by Ryan on 16-05-15.
 */
public class firstTrailExample extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_trail_example);

    }

    public void clickbut(View v){
        Intent intent = new Intent(firstTrailExample.this, MapsActivity.class);
        startActivity(intent);
    }
}
