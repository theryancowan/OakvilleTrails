package com.app.rastabananarama.oakvilletrails;

import android.content.res.AssetManager;
import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        mMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();

        LatLng SHERIDAN = new LatLng(43.4616431,-79.6891627);

        AssetManager am = getAssets();
        PolylineOptions pl = new PolylineOptions();
        int a = 1;
        try {
            // OPENING THE REQUIRED TEXT FILE
            BufferedReader reader = new BufferedReader(new InputStreamReader(am.open("trail2")));
            String myLine;
            // NOW READING THEM LINE BY LINE UP TO THE END OF FILE
            while ((myLine = reader.readLine()) != null) {
                String lat = myLine.substring(0, myLine.indexOf(",")-1);
                String lng = myLine.substring(myLine.indexOf(",")+1, myLine.length()-1);
                LatLng point = new LatLng(Double.parseDouble(lat), Double.parseDouble(lng));
                pl.add(point);
                if(a == 1){
                    SHERIDAN = point;
                    mMap.addMarker(new MarkerOptions())
                }
            }
            // CLOSE THE FILE AFTER WE HAVE FINISHED READING
            reader.close();
        } catch (IOException e) {
            // INFORM USER OF ANY ERROR...
            e.printStackTrace();
        }

        pl.width(5).color(Color.BLUE);
        mMap.addPolyline(pl);

        // Move the camera instantly to Sydney with a zoom of 15.
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(SHERIDAN, 20));
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

    }
}