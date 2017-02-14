package upb.cartavirtual;


import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class pMapa extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_mapa);
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
        LatLng laureles = new LatLng(6.246126, -75.589290);
        mMap.addMarker(new MarkerOptions().position(laureles).title("S&B-Laureles"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(laureles));


        LatLng poblado = new LatLng(6.196697,-75.573682);
        mMap.addMarker(new MarkerOptions().position(poblado).title("S&B-Poblado"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(poblado));


        LatLng belen = new LatLng(6.233117,-75.604831);
        mMap.addMarker(new MarkerOptions().position(belen).title("S&B-Belén"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(belen));


        LatLng bello = new LatLng(6.334700,-75.558644);
        mMap.addMarker(new MarkerOptions().position(bello).title("S&B-Bello"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bello));
        mMap.setMinZoomPreference(11);

    }
}
