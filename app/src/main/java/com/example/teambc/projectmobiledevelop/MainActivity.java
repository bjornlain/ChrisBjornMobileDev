package com.example.teambc.projectmobiledevelop;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /* TextView mRestaurantTextView;
     Button mMenuButton;
     Button mInfoButton;
     Button mLocatieButton;
     Button mWebsiteButton;*/
    ScrollView mScrollView;
    LinearLayout mInsideLinear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homescreen);

        mInsideLinear = (LinearLayout) findViewById(R.id.inside_linear);
        mScrollView = (ScrollView) findViewById(R.id.scrollView);


        String[] dummyNames = {"Restaurant 1", "Restaurant 2" , "Restaurant 3" , "Restaurant 4", "Restaurant 5","Restaurant 6","Restaurant 7", "Restaurant 8", "Restaurant 9","Restaurant 10"};




        for(int i = 0; i < dummyNames.length;i++){
            LinearLayout linear = new LinearLayout(this);
            linear.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,230));
            linear.setOrientation(LinearLayout.HORIZONTAL);
            linear.setPadding(10,0,0,0);
            TextView restName = new TextView(this);
            restName.setText(dummyNames[i]);
            restName.setTextSize(18);
            Button menuButton = new Button(this);
            LinearLayout.LayoutParams buttonLayoutParams = new LinearLayout.LayoutParams(167,100);
            buttonLayoutParams.setMargins(30,0,0,0);
            menuButton.setLayoutParams(buttonLayoutParams);
            menuButton.setId(i);
            menuButton.setText("menu");
            menuButton.setTextSize(13);
            menuButton.setBackgroundResource(R.drawable.roundedbutton);
            Button infoButton = new Button(this);
            LinearLayout.LayoutParams infoLayoutParams = new LinearLayout.LayoutParams(167,100);
            infoLayoutParams.setMargins(30,0,0,0);
            infoButton.setLayoutParams(infoLayoutParams);
            infoButton.setId(i);
            infoButton.setText("info");
            infoButton.setTextSize(13);
            infoButton.setBackgroundResource(R.drawable.roundedbutton);
            Button locatieButton = new Button(this);
            LinearLayout.LayoutParams locatieLayoutParams = new LinearLayout.LayoutParams(167,100);
            locatieLayoutParams.setMargins(30,0,0,0);
            locatieButton.setLayoutParams(locatieLayoutParams);
            locatieButton.setId(i);
            locatieButton.setText("locatie");
            locatieButton.setTextSize(13);
            locatieButton.setBackgroundResource(R.drawable.roundedbutton);
            Button websiteButton = new Button(this);
            LinearLayout.LayoutParams websiteLayoutParams = new LinearLayout.LayoutParams(167,100);
            websiteLayoutParams.setMargins(30,0,0,0);
            websiteButton.setLayoutParams(websiteLayoutParams);
            websiteButton.setId(i);
            websiteButton.setText("website");
            websiteButton.setTextSize(13);
            websiteButton.setBackgroundResource(R.drawable.roundedbutton);
            websiteButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, "WebsiteButton" + (v.getId()+1) + " is clicked",Toast.LENGTH_SHORT).show();
                }
            });
            locatieButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, "LocatieButton" + (v.getId()+1) + " is clicked",Toast.LENGTH_SHORT).show();
                }
            });
            infoButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, "InfoButton" + (v.getId()+1) + " is clicked",Toast.LENGTH_SHORT).show();
                }
            });
            menuButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, "MenuButton" + (v.getId()+1 )+ " is clicked",Toast.LENGTH_SHORT).show();
                }
            });
            linear.addView(restName);
            linear.addView(menuButton);
            linear.addView(infoButton);
            linear.addView(locatieButton);
            linear.addView(websiteButton);
           mInsideLinear.addView(linear);

        }




    }
}
