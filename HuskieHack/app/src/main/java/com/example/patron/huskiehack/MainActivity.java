package com.example.patron.huskiehack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.app.Activity;
import android.util.Log;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void OnRegisterClicked(View view) {
        Intent intent;
        intent = new Intent(this, ContactActivity.class);
        try {
            startActivity(intent);
        } catch (Exception e) {
            Log.d("Activity Error", e.getMessage());
        }
    }
        public void OnMaps(View view) {
            Intent intent1;
            intent1 = new Intent(this, MapsActivity.class);
            try {
                startActivity(intent1);
            } catch (Exception e) {
                Log.d("Activity Error", e.getMessage());
            }
        }
    public void OnWeeds(View view) {
        Intent intent13;
        intent13 = new Intent(this, weeds.class);
        try {
            startActivity(intent13);
        } catch (Exception e) {
            Log.d("Activity Error", e.getMessage());
        }
    }
        //finish();
    }

