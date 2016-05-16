package com.app.rastabananarama.oakvilletrails;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.*;
import android.graphics.*;
import android.os.*;

/**
 * Created by Ryan on 16-05-14.
 */
public class mainMenu extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainmenu);
        //transparent or change color status bar
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(getResources().getColor(android.R.color.transparent));
        }
    }

    public void onClickFindTrail(View v){
        Intent intent;
        switch (v.getId()){
            case R.id.imageView4:
                intent = new Intent(mainMenu.this,findTrail.class);
                startActivity(intent);
                break;
        }
    }



}
