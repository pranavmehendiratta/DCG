package com.example.patron.huskiehack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.util.Log;

public class weeds extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weeds);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_weeds, menu);
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
    public void Onbindweed(View view) {
        Intent intent2;
        intent2 = new Intent(weeds.this, Bindweed.class);
        try {
            startActivity(intent2);
        } catch (Exception e) {
            Log.d("Activity Error", e.getMessage());
        }
    }
    public void Onbroadleaf(View view) {
        Intent intent3;
        intent3 = new Intent(weeds.this, Broadleaf_Plaintain.class);
        try {
            startActivity(intent3);
        } catch (Exception e) {
            Log.d("Activity Error", e.getMessage());
        }
    }
    public void Onchicory(View view) {
        Intent intent4;
        intent4 = new Intent(weeds.this, Chicory.class);
        try {
            startActivity(intent4);
        } catch (Exception e) {
            Log.d("Activity Error", e.getMessage());
        }
    }
    public void Oncommon(View view) {
        Intent intent5;
        intent5 = new Intent(weeds.this, common_burdock.class);
        try {
            startActivity(intent5);
        } catch (Exception e) {
            Log.d("Activity Error", e.getMessage());
        }
    }
    public void Onhenbit(View view) {
        Intent intent6;
        intent6 = new Intent(weeds.this, Henbit.class);
        try {
            startActivity(intent6);
        } catch (Exception e) {
            Log.d("Activity Error", e.getMessage());
        }
    }
    public void Onlambs(View view) {
        Intent intent7;
        intent7 = new Intent(weeds.this, Lambs_Quarters.class);
        try {
            startActivity(intent7);
        } catch (Exception e) {
            Log.d("Activity Error", e.getMessage());
        }
    }
    public void Onmallow(View view) {
        Intent intent8;
        intent8 = new Intent(weeds.this, Mallow.class);
        try {
            startActivity(intent8);
        } catch (Exception e) {
            Log.d("Activity Error", e.getMessage());
        }
    }
    public void Onmorning(View view) {
        Intent intent9;
        intent9 = new Intent(weeds.this, Morning_Glory.class);
        try {
            startActivity(intent9);
        } catch (Exception e) {
            Log.d("Activity Error", e.getMessage());
        }
    }
    public void Onpenny(View view) {
        Intent intent10;
        intent10 = new Intent(weeds.this, Pennycress.class);
        try {
            startActivity(intent10);
        } catch (Exception e) {
            Log.d("Activity Error", e.getMessage());
        }
    }
    public void Onpurslane(View view) {
        Intent intent11;
        intent11 = new Intent(weeds.this, Purslane.class);
        try {
            startActivity(intent11);
        } catch (Exception e) {
            Log.d("Activity Error", e.getMessage());
        }
    }
    public void Onthistle(View view) {
        Intent intent12;
        intent12 = new Intent(weeds.this, Thistle.class);
        try {
            startActivity(intent12);
        } catch (Exception e) {
            Log.d("Activity Error", e.getMessage());
        }
    }


}
