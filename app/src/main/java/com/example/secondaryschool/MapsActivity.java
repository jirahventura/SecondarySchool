package com.example.secondaryschool;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    ArrayList<LatLng> arrayList= new ArrayList<>();
    LatLng Philippines = new LatLng(12.3300, 122.4880);
    LatLng Cabanbanan = new LatLng(16.01846, 120.51547);
    LatLng Eguia = new LatLng(15.90747, 119.88789);
    LatLng Maramba = new LatLng(16.00229, 120.39987);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        arrayList.add(Philippines);

        arrayList.add(Cabanbanan);
        arrayList.add(Eguia);
        arrayList.add(Maramba);
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

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(16.01846, 120.51547);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Kimberly's Secondary School"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

        Marker m1 = googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(15.90747, 119.88789))
                .anchor(0.5f, 0.5f)
                .title("Kelvin")
                .snippet("Secondary School"));

        Marker m2 = googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(16.00229, 120.39987))
                .anchor(0.5f, 0.5f)
                .title("Jirah")
                .snippet("Secondary School"));

        enableMyLocation();
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.getUiSettings().setZoomGesturesEnabled(true);
        mMap.getUiSettings().setCompassEnabled(true);
    }


    public void enableMyLocation() {

    }
}
