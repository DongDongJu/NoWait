package com.dongdongju.nowait;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import net.daum.android.map.MapView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(button0Listener);
        findViewById(R.id.button2).setOnClickListener(button2Listener);
        findViewById(R.id.button3).setOnClickListener(button3Listener);
        findViewById(R.id.button4).setOnClickListener(button4Listener);
    }

    Button.OnClickListener button0Listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ViewMapActivity.class));
        }
    };
    Button.OnClickListener button2Listener = new View.OnClickListener() {
        @Override
        public void onClick(View v){
                Intent routeSearch = new Intent(Intent.ACTION_VIEW);
                routeSearch.addCategory(Intent.CATEGORY_BROWSABLE);
                routeSearch.addCategory(Intent.CATEGORY_DEFAULT);
                routeSearch.setData(Uri.parse("daummaps://route?sp=37.537229,127.005515&ep=37.4979502,127.0276368&by=PUBLICTRANSIT"));
                startActivity(routeSearch);
        }
    };
    Button.OnClickListener button3Listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
    Button.OnClickListener button4Listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };

}
