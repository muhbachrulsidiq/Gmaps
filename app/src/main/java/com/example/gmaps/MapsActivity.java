package com.example.gmaps;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
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
        LatLng spbu1 = new LatLng(-0.882697, 134.046286);
        mMap.addMarker(new MarkerOptions().position(spbu1).title("SPBU Jalan Baru Drs Esau Sesa").snippet("Manokwari, Papua Barat"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(spbu1,13));

        LatLng spbu2 = new LatLng(-0.8710726,134.0586043);
        mMap.addMarker(new MarkerOptions().position(spbu2).title("PT. Pertamina - Depot Manokwari").snippet("Manokwari, Papua Barat"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(spbu2,13));

        LatLng spbu3 = new LatLng(-0.8621151,134.0627456);
        mMap.addMarker(new MarkerOptions().position(spbu3).title("SPBU Sanggeng").snippet("Manokwari, Papua Barat"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(spbu3,13));

    }
}
