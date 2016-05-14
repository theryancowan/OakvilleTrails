package com.app.rastabananarama.oakvilletrails;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

/**
 * Created by Ryan on 16-05-14.
 */
public class mainMenu extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainmenu);
    }

    public void clicked(View v){

        Intent intent;

        switch(v.getId()){
            case R.id.imageView4:
                intent = new Intent(mainMenu.this, FindATrail.class);
                startActivity(intent);
                break;
            case R.id.imageView5:
                break;
            case R.id.imageView6:
                break;
        }
    }

}
