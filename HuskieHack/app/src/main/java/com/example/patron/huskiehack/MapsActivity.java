package com.example.patron.huskiehack;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity {

    private GoogleMap mMap; // Might be null if Google Play services APK is not available.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        setUpMapIfNeeded();
    }

    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();
    }

    /**
     * Sets up the map if it is possible to do so (i.e., the Google Play services APK is correctly
     * installed) and the map has not already been instantiated.. This will ensure that we only ever
     * call {@link #setUpMap()} once when {@link #mMap} is not null.
     * <p/>
     * If it isn't installed {@link SupportMapFragment} (and
     * {@link com.google.android.gms.maps.MapView MapView}) will show a prompt for the user to
     * install/update the Google Play services APK on their device.
     * <p/>
     * A user can return to this FragmentActivity after following the prompt and correctly
     * installing/updating/enabling the Google Play services. Since the FragmentActivity may not
     * have been completely destroyed during this process (it is likely that it would only be
     * stopped or paused), {@link #onCreate(Bundle)} may not be called again so we should call this
     * method in {@link #onResume()} to guarantee that it will be called.
     */
    private void setUpMapIfNeeded() {
        // Do a null check to confirm that we have not already instantiated the map.
        if (mMap == null) {
            // Try to obtain the map from the SupportMapFragment.
            mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map))
                    .getMap();
            // Check if we were successful in obtaining the map.
            if (mMap != null) {
                setUpMap();
            }
        }
    }

    /**
     * This is where we can add markers or lines, add listeners or move the camera. In this case, we
     * just add a marker near Africa.
     * <p/>
     * This should only be called once and when we are sure that {@link #mMap} is not null.
     */
    private void setUpMap() {
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.955399, -88.771246)).title("Annie Glidden Outreach Garden").snippet("2500 N. Annie Glidden Rd. DeKalb, IL 60115"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.920135, -88.765107)).title("Tyler Elementary").snippet("1021 Alden Circle DeKalb, IL 60115"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.968641, -88.750811)).title("Brooks Elementary School Garden").snippet("3225 Sangamon Rd. DeKalb, IL 60115"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.949731, -88.746902)).title("Bethlehem Lutheran Gardens").snippet("1915 N. 1st Street, DeKalb, IL 60115"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.938257, -88.748895)).title("Clinton Rosette Middle School").snippet("650 North First St. DeKalb, IL 60115"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.927338, -88.749807)).title("Mayor's Community Garden").snippet("5th & Franklin DeKalb, IL 60115"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.922732, -88.751787)).title("Golden Years Plaza Garden").snippet("507 E. Taylor St. DeKalb, IL 60115"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.919797, -88.754360)).title("Children's Learning Center and Growing Place Gardens").snippet("905 S 4th St, DeKalb, IL 60115"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.917785, -88.755880)).title("Lincoln School Garden").snippet("220 E. Sunset Place DeKalb, IL 60115"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.921771, -88.748642)).title("Founders Garden").snippet("821 S. 7th St. DeKalb, IL 60115"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.939117, -88.738391)).title("Littlejohn School Garden").snippet("1121 School St. DeKalb, IL 60115"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.934315, -88.740209)).title("Conexion Comunidad Garden").snippet("637 N. 11th St. DeKalb, IL 60115"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.935682, -88.735699)).title("14th and Lewis Gardens").snippet("Lewis & 14th St. DeKalb, IL 60115"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.967067, -88.724125)).title("Dolce Vita/ Kish Health").snippet("2525 Bethany Rd. Sycamore, IL 60178"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.965330, -88.723861)).title("Kishwaukee YMCA Gardens").snippet("2500 W. Bethany Rd. Sycamore, IL 60178"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.965604, -88.708765)).title("VAC Gardens").snippet("1606 Bethany Rd. Sycamore, IL 60178"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.977040, -88.699998)).title("South Prairie Gardens").snippet("820 Borden Ave. Sycamore, IL 60178"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.982295, -88.704368)).title("Kishwaukee Behavioral Health Garden").snippet("760 Foxpointe Dr. Sycamore, IL 60178"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.989013, -88.703196)).title("Sycamore United Methodist").snippet("160 Johnson Ave. Sycamore, IL 60178"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.988234, -88.697399)).title("West Elementary School Gardens").snippet("240 S. Fair St. Sycamore, IL 60178"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.988120, -88.692480)).title("Civic Apartments").snippet("350 Grant St. Sycamore, IL 60178"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.978476, -88.684725)).title("Southeast Elementary Gardens").snippet("718 Locust St. Sycamore, IL 60178"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.918904, -88.684555)).title("Cortland Community Gardens").snippet("Maple Ave, Cortland, Illinois 60112"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.907590, -88.675034)).title("Cortland Elementary").snippet("370 E. Lexington Ave. Cortland IL, 60112"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(42.118527, -88.841901)).title("Walnut Grove Farm").snippet("333600 Pearl St. Kirkland, IL 60146"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(42.071442, -88.734380)).title("Miller/Ellwood Cabin Garden").snippet("Pleasant Hill Road"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(42.098725, -88.692247)).title("Genoa Community Gardens").snippet("E Railroad Ave & N Sycamore StGenoa, IL 60135"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.660181, -88.838408)).title("Indian Creek Farm Garden").snippet("Suydam Rd & Benson Rd Earlville, IL 60518"));
        mMap .addMarker(new MarkerOptions().position(new LatLng(41.638356, -88.679718)).title("Somonauk Baptist And Somonauk Christian School Community Unity Gardens").snippet("315 E. North St. Somonauk, IL 60552"));
        mMap .addMarker(new MarkerOptions().position(new LatLng(41.657438, -88.620703)).title("Valley West Gardens").snippet("11 E. Pleasant Ave. Sandwich, IL 60548"));

    }
}
