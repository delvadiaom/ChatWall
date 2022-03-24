package com.developerom.chatgloballllllly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;

import com.developerom.chatgloballllllly.databinding.ActivitySportsBinding;

import java.util.ArrayList;
import java.util.List;

public class SportsActivity extends AppCompatActivity {

    ActivitySportsBinding binding;
    List<customItems> itemsList;
    RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySportsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().setTitle("Sports");
        binding.recyclerview.setHasFixedSize(true);
        binding.recyclerview.setLayoutManager(new GridLayoutManager(this,3));
        itemsList = new ArrayList<>();

        itemsList.add(new customItems("https://www.wallpapertip.com/wmimgs/252-2527065_best-sports-wallpapers.jpg"));
        itemsList.add(new customItems("https://mfiles.alphacoders.com/781/781535.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/83/27/79wslb.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/f7/46/7b/f7467bf07c8870198c9ff0de2d7b8bdc.jpg"));
        itemsList.add(new customItems("https://www.fonewalls.com/wp-content/uploads/1080x1920-Background-HD-Wallpaper-568.jpg"));
        itemsList.add(new customItems("https://wallpapers.pictures/media/baseball-ball-wallpaper-background-1080x1920.jpg"));
        itemsList.add(new customItems("https://www.tokkoro.com/picsup/6114352-football-boots-soccer-sports.jpg"));
        itemsList.add(new customItems("https://www.itl.cat/pngfile/big/193-1938402_chelsea-logo-sports-chelsea-f-chelsea-fc.jpg"));
        itemsList.add(new customItems("https://www.wallpapertip.com/wmimgs/241-2412277_cricket-bat-wallpaper.jpg"));
        itemsList.add(new customItems("https://www.wallpapertip.com/wmimgs/241-2411464_best-cricket-wallpapers.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp4857059.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp7362325.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/54/0c/f3/540cf31cbbaa09e87ec6df9f4583f23f.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/70/73/FQHxUa.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/f1/60/a4/f160a412d898f66f93489eaa95703657.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/playground_marking_lines_140436_1080x1920.jpg"));
        itemsList.add(new customItems("https://images.hdqwalls.com/download/two-sports-car-retrowave-art-4w-1080x1920.jpg"));
        itemsList.add(new customItems("https://coolwallpapers.me/picsup/6085147-inter-milan-soccer-sports-logo-football-hd-deviantart-football-club.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/193-1933909_rear-street-racing-sports-bike-hd-mobile-wallpaper.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/313-3137201_golf-sport.jpg"));
        itemsList.add(new customItems("https://www.wallpapertip.com/wmimgs/7-74324_wallpaper-lockscreen-iphone-wallpapers-adidas-sport-cool-wallpapers.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/92/56/1d/92561df94b94ece09b48295254a06d45.jpg"));
        itemsList.add(new customItems("https://www.superiorwallpapers.com/sports/tennis-ball-sport-hd-wallpaper_1080x1920.jpg"));
        itemsList.add(new customItems("https://wallpapersumo.vercel.app/data/sports-hd-wallpaper-for-iphone-8.jpg"));
        itemsList.add(new customItems("https://coolwallpapers.me/picsup/6085981-lionel-messi-sports-football-hd-4k-boys-male-celebrities-behance.jpg"));
        itemsList.add(new customItems("https://wallpaperset.com/w/full/e/0/4/451981.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/74/38/BnYdJs.jpg"));
        itemsList.add(new customItems("https://wallpaperset.com/w/full/b/1/5/452034.jpg"));
        itemsList.add(new customItems("https://cdn.hipwallpaper.com/i/40/47/oQCD7t.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/32-321489_iphone-7-plus-wallpaper-sports-plus-celtics-data.jpg"));
        itemsList.add(new customItems("https://www.desktopbackground.org/download/o/2011/09/07/261972_download-wallpapers-1080x1920-sports-people-bmx-bike-sony-xperia_1080x1920_h.jpg"));
        itemsList.add(new customItems("https://4kwallpaper.wiki/wp-content/uploads/2019/07/275063.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/1410119.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/28/59/f2/2859f2ff14ee91be11d83ca8f4f5a8c9.jpg"));
        itemsList.add(new customItems("http://www.allwhitebackground.com/images/7/Aesthetic-Black-Quotes-Wallpaper-1080x1920-04802.jpg"));
        itemsList.add(new customItems("https://img.wallpapersafari.com/phone/1080/1920/62/3/KqkelF.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/f8/2f/48/f82f4870dfec24e560ffe77b2793a11f.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/kettlebell_gym_sport_119844_1080x1920.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/63/82/7ZcI6T.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/2503293.jpg"));
        itemsList.add(new customItems("https://wallpapers.pictures/media/baseball-stuff-wallpaper-background-1080x1920.jpg"));
        itemsList.add(new customItems("https://www.fonewalls.com/wp-content/uploads/1080x1920-Background-HD-Wallpaper-411.jpg"));
        itemsList.add(new customItems("https://www.wallpapertip.com/wmimgs/228-2283393_soccer-ball-adidas-sport-football-wallpapers-mobile.jpg"));
        itemsList.add(new customItems("https://mfiles.alphacoders.com/356/356830.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/166-1665243_iphone-7-plus-wallpaper-sports-plus-data-src.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/7d/08/e2/7d08e2361f08c992a1457e8046c6dabc.jpg"));
        itemsList.add(new customItems("https://wallpapers.pictures/media/snowboard-wallpaper-background-1080x1920.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/0-9191_1080x1920-pin-by-ema-ragova-on-sport-nike.jpg"));
        itemsList.add(new customItems("https://www.desktopbackground.org/download/1080x1920/2015/10/04/1021087_detroit-tigers-tigers-mlb-baseball-detroit-sports-hd-wallpapers_1440x2560_h.jpg"));
        itemsList.add(new customItems("https://www.99images.com/photos/wallpapers/sports/sports-iphone-6-plusandroid-iphone-desktop-hd-backgrounds-wallpapers-1080p-4k-13n4n.jpg?v=1578687603"));
        itemsList.add(new customItems("https://www.3wallpapers.fr/wp-content/uploads/2018/02/iPhone-Wallpaper-Nike.jpg"));
        itemsList.add(new customItems("https://mfiles.alphacoders.com/784/thumb-1920-784703.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/basketball_hoop_playground_pole_142745_1080x1920.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/3e/d8/38/3ed83837673cbb15a146fafe3d4b1ea6.jpg"));
        itemsList.add(new customItems("https://www.99images.com/photos/wallpapers/sports/rangersandroid-iphone-desktop-hd-backgrounds-wallpapers-1080p-4k-hnkeb.jpg?v=1584542824"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/1717589.jpg"));
        itemsList.add(new customItems("https://www.99images.com/photos/wallpapers/sports/cool-soccer-for-iphoneandroid-iphone-desktop-hd-backgrounds-wallpapers-1080p-4k-eq4da.jpg?v=1583564583"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/30/32/wRjJcz.jpg"));
        itemsList.add(new customItems("https://wall2mob.com/m/wp-SportsWallpapersHdFreeWallpapers_40907-cprw.jpg?i=40907&w=1080&h=1920&fdl=0"));
        itemsList.add(new customItems("https://www.mwallpapers.com/photos/celebrities/sport/sports-wallpaper-for-iphone-plus-6-hd-free-android-iphone-hd-wallpaper-background-downloadhd-wallpapers-desktop-background-android-iphone-1080p-4k-qgyjx.jpg?v=1616392165"));
        itemsList.add(new customItems("https://www.desktopbackground.org/download/1080x1920/2015/10/08/1023286_basketball-hoop-full-hd-wallpapers-sports-wallpapers-semrawut_3888x2592_h.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/67-672467_range-rover-sport-wallpapers-for-iphone-7-iphone.jpg"));
        itemsList.add(new customItems("https://funsaaz.com/uploads/wallpapers/actual_images/wallpaper-adidas-android-c1wm5u6s.webp"));
        itemsList.add(new customItems("https://sguru.org/wp-content/uploads/2017/09/Sports-Wallpapers-Sports-Xperia-Z-Wallpapers-HD-117.jpg"));
        itemsList.add(new customItems("https://getwallpapers.com/wallpaper/full/0/b/c/753421-boston-sports-wallpaper-1080x1920-for-desktop.jpg"));
        itemsList.add(new customItems("https://getwallpapers.com/wallpaper/full/0/6/4/1230823-beautiful-sports-wallpaper-1080x1920-ipad.jpg"));
        itemsList.add(new customItems("https://image.winudf.com/v2/image1/c3BvcnQubmVvLndhbGxwYXBlcl9zY3JlZW5fMV8xNTcxMDU2NDk3XzA5Mg/screen-1.jpg?fakeurl=1&type=.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/50/86/25/508625a50b61f828e93de20531f32848.jpg"));
        itemsList.add(new customItems("https://getwallpapers.com/wallpaper/full/b/3/f/1389272-download-free-sports-hd-wallpapers-1080x1920-for-htc.jpg"));
        itemsList.add(new customItems("https://i1.wp.com/www.kolpaper.com/wp-content/uploads/2021/02/iPhone-Juventus-Wallpaper-2.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/4b/72/6e/4b726e6e1d93cef05ed96f908368b152.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/cb/66/18/cb66181de4f9f2e6e297b0d09c2aa958.jpg"));
        itemsList.add(new customItems("https://s1.1zoom.me/b3347/652/Barbell_Hands_512220_1080x1920.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/skateboard_legs_sport_118067_1080x1920.jpg"));
        itemsList.add(new customItems("https://images.wallpapersden.com/image/download/unitsikl-wheel-sport_ZmVsbWaUmZqaraWkpJRmZW1lrWZuZ2U.jpg"));
        itemsList.add(new customItems("https://wallpaperbat.com/img/80214-iphone-x-wallpaper-world-cup-russia-fifa-oboi.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/96/22/93/9622939ff7b37330402f9e2bca8f1821.jpg"));
        itemsList.add(new customItems("https://cms.nhl.bamgrid.com/images/photos/317053302/1080x1920/cut.jpeg"));
        itemsList.add(new customItems("https://www.pixelstalk.net/wp-content/uploads/2016/10/Goal-ball-gate-bar-football-1080x1920.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/254-2546235_sport-wallpaper-iphone-girl.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/volleyball_balls_volleyball_sports_113210_1080x1920.jpg"));
        itemsList.add(new customItems("https://wallpapers.pictures/media/baseball-stadium-wallpaper-background-1080x1920.jpg"));
        itemsList.add(new customItems("https://www.mwallpapers.com/photos/celebrities/sport/sports-snowboarding-1080x1920-wallpaper-android-iphone-hd-wallpaper-background-downloadhd-wallpapers-desktop-background-android-iphone-1080p-4k-p0wxp.jpg?v=1616345052"));
        itemsList.add(new customItems("https://hdfreewallpaper.net/wp-content/uploads/2016/03/sports-wallpapers-for-iphone-plus-6-free.jpg"));
        itemsList.add(new customItems("https://wallpapers.pictures/media/baseball-stadium-in-the-sunset-wallpaper-background-1080x1920.jpg"));
        itemsList.add(new customItems("https://s1.1zoom.me/b5758/977/Footbal_Ball_Grass_554782_1080x1920.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/1543768.jpg"));
        itemsList.add(new customItems("https://s1.1zoom.me/b3848/557/Closeup_Golf_Fields_Grass_Lawn_Glove_Ball_Balls_512056_1080x1920.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp3563016.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/30/75/df/3075dfeff27cc75ac4b81f81b8a2a41e.jpg"));
        itemsList.add(new customItems("https://wallpaperbat.com/img/396612-sport-wallpaper-for-your-iphone-xs-from-everpix-wallpaper.jpg"));
        itemsList.add(new customItems("https://wallpaperforu.com/wp-content/uploads/2020/08/sport-wallpaper-20082413392021080x1920.jpg"));
        itemsList.add(new customItems("https://coolwallpapers.me/picsup/6091135-soccer-sports-4k-hd-abstract.jpg"));
        itemsList.add(new customItems("https://funsaaz.com/uploads/wallpapers/actual_images/adidas-android-wallpaper-vuy6rk1d.webp"));
        itemsList.add(new customItems("https://www.superiorwallpapers.com/sports/macro-sport-wallpaper-billiard-pool-game_1080x1920.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/1802652.png"));
        itemsList.add(new customItems("https://funsaaz.com/uploads/wallpapers/actual_images/wallpapers-phone-adidas-x8c59jvd.webp"));
        itemsList.add(new customItems("https://www.superiorwallpapers.com/sports/racing-bicycles-sport-wallpaper_1080x1920.jpg"));
        itemsList.add(new customItems("https://coolwallpapers.me/picsup/6080568-cristiano-ronaldo-sports-football-hd-4k-boys-male-celebrities.jpg"));
        itemsList.add(new customItems("https://wallpaperbat.com/img/359760-johncena-wallpaper-free-stock-wallpaper.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp2968526.jpg"));
        itemsList.add(new customItems("https://s1.1zoom.me/b5153/57/Footbal_Ball_Sand_Old_571259_1080x1920.jpg"));
        itemsList.add(new customItems("https://s1.1zoom.me/b5760/900/Billiards_Table_511808_1080x1920.jpg"));
        itemsList.add(new customItems("https://coolwallpapers.me/picsup/6089121-leo-messi-fifa-sports-football-lionel-messi-fc-barcelona-fcb-hd-4k-5k-8k-artwork-artist-artstation.jpg"));
        itemsList.add(new customItems("https://wall2mob.com/m/wp-SportsGalaxySWallpapersHD_40920-cprw.jpg?i=40920&w=1080&h=1920&fdl=0"));
        itemsList.add(new customItems("https://wallpaperset.com/w/full/6/9/f/451984.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/10/39/08/1039084b27a0f7c218acb91487247ceb.jpg"));
        itemsList.add(new customItems("https://www.desktopbackground.org/download/1080x1920/2011/04/08/184713_iphone-iphone-6-sports-wallpapers-thread_1256x2353_h.jpg"));
        itemsList.add(new customItems("https://image.winudf.com/v2/image1/Y29tLndhbGxwYXBlcjRrLlNwb3R3YWxscGFwZXI0a19zY3JlZW5fMF8xNTQ3NTIxOTQ1XzAzMw/screen-0.jpg?fakeurl=1&type=.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/football_ball_ball_football_151392_1080x1920.jpg"));
        itemsList.add(new customItems("https://images.wallpapersden.com/image/download/race-motorcycle-sports_Z2dpbG6UmZqaraWkpJRmZW1lrWZuZ2U.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp4796666.jpg"));
        itemsList.add(new customItems("https://wallpaper.dog/large/20425630.jpg"));
        itemsList.add(new customItems("https://mfiles.alphacoders.com/770/770371.jpg"));
        itemsList.add(new customItems("https://img.wallpapersafari.com/phone/1080/1920/92/57/SrhBk6.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/60/75/8nYz7g.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/52/50/2e/52502eafe227859e3b2eff31fa3b7734.jpg"));
        itemsList.add(new customItems("https://image.winudf.com/v2/image/dGl4b25pYy5kZXYuc3BvcnR3YWxscGFwZXJfc2NyZWVuXzNfMTUxNzk2MjA3NF8wNDk/screen-3.jpg?fakeurl=1&type=.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/jump_bar_error_sports_79968_1080x1920.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/barbell_bodybuilding_training_152931_1080x1920.jpg"));
        itemsList.add(new customItems("https://image.winudf.com/v2/image1/Y29tLndhbGxwYXBlcjRrLlNwb3R3YWxscGFwZXI0a19zY3JlZW5fN18xNTQ3NTIxOTU0XzA1Ng/screen-7.jpg?fakeurl=1&type=.jpg"));
        itemsList.add(new customItems("https://cutewallpaper.org/21/sports-wallpaper-for-iphone-6/Sports-Wallpapers-F1-Logo-Wallpaper-Iphone.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/inscription_training_sport_126880_1080x1920.jpg"));
        itemsList.add(new customItems("https://i2.wp.com/i.pinimg.com/originals/e4/47/f8/e447f87a40aaf569effd942bb851b9f4.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/feet_sneakers_nike_sport_111238_1080x1920.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/weights_paint_sport_109885_1080x1920.jpg"));
        itemsList.add(new customItems("https://cutewallpaper.org/21/nba-wallpapers-for-android/Sports-Wallpapers-Iphone-6-Nba-Wallpaper-Hd.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/trx_bands_fitness_151967_1080x1920.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/motorcycle_bike_side_view_122150_1080x1920.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/f6/13/99/f6139914f4096fb44b97c2cc7509a11b.jpg"));
        itemsList.add(new customItems("https://wallpaper.dog/large/10700811.jpg"));
        itemsList.add(new customItems("https://www.desktopbackground.org/download/1080x1920/2015/08/17/996560_usain-bolt-speed-wallpapers-hd-resolution-sport-wallpapers_3194x2308_h.jpg"));
        itemsList.add(new customItems("https://img.wallpapersafari.com/phone/1080/1920/99/18/jsecoD.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTyU4SBW4wp0w8NWg_kIzWppQwR5sc-Hsxkzg&usqp=CAU"));
        itemsList.add(new customItems("https://s2.best-wallpaper.net/wallpaper/iphone/1708/Basketball-throw-ball-bokeh_iphone_1080x1920.jpg"));
        itemsList.add(new customItems("https://www.wallpaperuse.com/wallp/3-34827_m.jpg"));
        itemsList.add(new customItems("https://www.wallpaperuse.com/wallp/67-675898_m.jpg"));
        itemsList.add(new customItems("https://www.mwallpapers.com/photos/celebrities/sports/dope-nike-android-iphone-desktop-hd-backgrounds-wallpapers-1080p-4khd-wallpapers-desktop-background-android-iphone-1080p-4k-tkbgp.jpg?v=1614559872"));


        recyclerViewAdapter = new RecyclerViewAdapter(itemsList,this);
        binding.recyclerview.setAdapter(recyclerViewAdapter);

    }
}