package com.developerom.chatgloballllllly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

import com.developerom.chatgloballllllly.databinding.ActivityWallpaperBinding;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class WallpaperActivity extends AppCompatActivity {

    ActivityWallpaperBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWallpaperBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSingleEvent(binding.mainGridLayout);
        getSupportActionBar().setTitle("Wallpapers");

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        AdRequest adRequest = new AdRequest.Builder().build();
        binding.adView.loadAd(adRequest);

        AdView adView = new AdView(this);

        adView.setAdSize(AdSize.BANNER);

        adView.setAdUnitId("ca-app-pub-2746280336073356/6041062220");
// TODO: Add adView to your view hierarchy.
        AdSize adSize = new AdSize(300, 50);

        binding.adView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                // Code to be executed when an ad request fails.
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }
        });


    }


    private void setSingleEvent(GridLayout mainGridLayout){

        for (int i=0;i<binding.mainGridLayout.getChildCount();i++)
        {
            CardView cardView = (CardView)binding.mainGridLayout.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (finalI==0){
                        Intent intent = new Intent(WallpaperActivity.this,NatureActivity.class);
                        startActivity(intent);
                    }
                    if (finalI==1){
                        Intent intent = new Intent(WallpaperActivity.this,SportsActivity.class);
                        startActivity(intent);
                    }
                    if (finalI==2){
                        Intent intent = new Intent(WallpaperActivity.this,TrendingActivity.class);
                        startActivity(intent);
                    }
                    if (finalI==3){
                        Intent intent = new Intent(WallpaperActivity.this,AnimalActivity.class);
                        startActivity(intent);
                    }
                    if (finalI==4){
                        Intent intent = new Intent(WallpaperActivity.this,EnterTainmentActivity.class);
                        startActivity(intent);
                    }
                    if(finalI==5){
                        Intent intent = new Intent(WallpaperActivity.this,LoveActivity.class);
                        startActivity(intent);
                    }
                    if (finalI==6){
                        Intent intent = new Intent(WallpaperActivity.this,MotivationActivity.class);
                        startActivity(intent);
                    }
                    if (finalI==7){
                        Intent intent = new Intent(WallpaperActivity.this,GameActivity.class);
                        startActivity(intent);
                    }
                    if (finalI==8){
                        Intent intent = new Intent(WallpaperActivity.this,MusicActivity.class);
                        startActivity(intent);
                    }
                    if (finalI==9){
                        Intent intent = new Intent(WallpaperActivity.this,TechnologyActivity.class);
                        startActivity(intent);
                    }
                    if (finalI==10){
                        Intent intent = new Intent(WallpaperActivity.this,CarActivity.class);
                        startActivity(intent);
                    }
                    if (finalI==11){
                        Intent intent = new Intent(WallpaperActivity.this,DrawingsActivity.class);
                        startActivity(intent);
                    }
                }
            });
        }
    }
}