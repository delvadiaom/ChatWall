package com.developerom.chatgloballllllly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;

import com.developerom.chatgloballllllly.databinding.ActivityGameBinding;

import java.util.ArrayList;
import java.util.List;

public class GameActivity extends AppCompatActivity {

    ActivityGameBinding binding;
    List<customItems> itemsList;
    RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityGameBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().setTitle("Game");
        binding.recyclerview.setHasFixedSize(true);
        binding.recyclerview.setLayoutManager(new GridLayoutManager(this,3));
        itemsList = new ArrayList<>();

        itemsList.add(new customItems("https://i.pinimg.com/originals/c3/9b/f0/c39bf0c7f60710367a985f395c06b200.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/26-269349_game-android-wallpaper-android-hd-wallpapers-game-wallpaper.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/26-269673_1080x1920-gaming-data-id-172782-data-src-walls.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/1-18406_video-game-hd-wallpapers-for-android-with-high.jpg"));
        itemsList.add(new customItems("https://images.wallpapersden.com/image/download/game-of-thrones-wallpaper-ned-stark-hd-1080p-hd-wallpapers_aWVlZWmUmZqaraWkpJRmZW1lrWZuZ2U.jpg"));
        itemsList.add(new customItems("https://images.hdqwalls.com/download/pubg-4k-game-sw-1080x1920.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTssFzCm32mmGpgYqGemUzqMUYqIAQ6WJDmeA&usqp=CAU"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQicFRigHOTP_u7YJjwnWyONoR2FhoDTT6j2A&usqp=CAU"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/1396483.jpg"));
        itemsList.add(new customItems("https://coolwallpapers.me/picsup/6105082-clash-of-clans-supercell-games-hd-witch.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS6QcY8rw27mr9tRcdlGkGRML-Pv_cyCDJJIYX-Ecl_BPFxylEKnFnT1SiIfNC2yqa8z60&usqp=CAU"));
        itemsList.add(new customItems("https://coolwallpapers.me/picsup/6087124-pubg-playerunknowns-battlegrounds-2018-games-games-hd-4k.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp3278779.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/19/9b/8c/199b8cf81d2f24ac7a6f71fdeba07f96.jpg"));
        itemsList.add(new customItems("https://images.hdqwalls.com/download/goblin-clash-of-clans-on-1080x1920.jpg"));
        itemsList.add(new customItems("https://iphonewallpaperworld.com/wp-content/uploads/2020/02/Clash-of-clans-wallpapers-4.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/631679.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/ee/d4/75/eed4757c336144abb435922560df0bcb.jpg"));
        itemsList.add(new customItems("https://images.wallpapersden.com/image/download/sas-csgo_a25tZmmUmZqaraWkpJRmZW1lrWZuZ2U.jpg"));
        itemsList.add(new customItems("https://i.redd.it/o5agwkqnbwt01.png"));
        itemsList.add(new customItems("https://mfiles.alphacoders.com/581/581496.jpg"));
        itemsList.add(new customItems("https://www.99images.com/download-image/379440/1080x1920"));
        itemsList.add(new customItems("https://mfiles.alphacoders.com/711/711803.jpg"));
        itemsList.add(new customItems("https://1.bp.blogspot.com/-s9076Jf_ebQ/XdImw_dNUeI/AAAAAAAAhT4/H9TZA6Mc22cMxq9NsUNZjj3E7UatLbUaQCLcBGAsYHQ/s2560/2019-nfs-heat-n3-1080x1920.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/d5/96/04/d59604338e5be74cbcc62d4bcc049d70.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/70/86/7f/70867f10b46f7fddabe2473d0c9afee5.jpg"));
        itemsList.add(new customItems("https://images.hdqwalls.com/download/asphalt-9-legends-4k-xl-1080x1920.jpg"));
        itemsList.add(new customItems("https://s1.1zoom.me/b5140/475/Roads_Aleksandar_Pasaric_Asphalt_Stripes_565470_1080x1920.jpg"));
        itemsList.add(new customItems("https://wallpaper.dog/large/1001597.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp5086440.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/197-1971568_plant-vs-zombie-wallpaper-art.jpg"));
        itemsList.add(new customItems("https://mfiles.alphacoders.com/773/773527.jpg"));
        itemsList.add(new customItems("https://mfiles.alphacoders.com/633/633658.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/2406182.jpg"));
        itemsList.add(new customItems("https://image.winudf.com/v2/image1/Y29tLmtpbG9vLnN1YndheXN1cmZfc2NyZWVuXzBfMTYyMDgxMzc0Nl8wMTA/screen-0.jpg?fakeurl=1&type=.jpg"));
        itemsList.add(new customItems("https://www.fibonapps.com/assets/img/screenshots/2018/03/13/4362/subway-surfers-1.webp"));
        itemsList.add(new customItems("https://image.winudf.com/v2/image1/Y29tLmRvZG9ucGEuYmFsaS50ZW1wbGUucnVuLmJhcm9uZ19zY3JlZW5fMV8xNTU4NDg3MDcxXzA3Nw/screen-1.jpg?fakeurl=1&type=.jpg"));
        itemsList.add(new customItems("https://image.winudf.com/v2/image1/Y29tLmNhZy5waXhlbC50ZW1wbGUucnVuX3NjcmVlbl80XzE1NDU4NDA4MzVfMDY3/screen-4.jpg?fakeurl=1&type=.jpg"));
        itemsList.add(new customItems("https://images.hdqwalls.com/download/garena-free-fire-4k-game-ox-1080x1920.jpg"));
        itemsList.add(new customItems("https://coolwallpapers.me/picsup/6071050-garena-free-fire-2019-games-games-hd-4k.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTx_9fr6PGTWX-Ht5NsUQsBADG3tLhTPSPspA&usqp=CAU"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS83FxlIiF8xaTUgWoiW221vtit88kRgeJSBA&usqp=CAU"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/25/56/87/2556878b568839ea803d35c23292dc03.jpg"));
        itemsList.add(new customItems("https://mfiles.alphacoders.com/127/thumb-1920-127027.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQo3moCL7dTtaEwSldYHiCK5FpkfcO8GVrpAQ&usqp=CAU"));
        itemsList.add(new customItems("http://wallpapers.net/chess-pieces-hd-wallpaper-for-desktop-mobiles/download/1080x1920.jpeg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/12/55/8sFTul.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR2UJookxcjFXr3h8Kqn2ig5z1smnjb50GJUQ&usqp=CAU"));
        itemsList.add(new customItems("https://www.wallpapers.net/archangel-playstation-vr-game-hd-wallpaper-for-desktop-mobiles/download/1080x1920.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/08/00/d4/0800d4b5bd0462e739c89588f4c957e2.jpg"));
        itemsList.add(new customItems("https://www.mwallpapers.com/photos/celebrities/games/video-game-iphone-android-iphone-desktop-hd-backgrounds-wallpapers-1080p-4khd-wallpapers-desktop-background-android-iphone-1080p-4k-oztab.jpg?v=1614462025"));
        itemsList.add(new customItems("https://www.mwallpapers.com/photos/celebrities/games/video-game-iphone-android-iphone-desktop-hd-backgrounds-wallpapers-1080p-4khd-wallpapers-desktop-background-android-iphone-1080p-4k-z36po.jpg?v=1614462076"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/326-3265792_monument-valley-game-level.png"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS6ZFhCe0QkfgqOpICT_lxDU5OnMa1yAD9OUw&usqp=CAU"));
        itemsList.add(new customItems("https://www.tokkoro.com/picsup/6103928-tom-clancys-ghost-recon-wildlands-2016-games-games-xbox-games-ps4-games-hd.jpg"));
        itemsList.add(new customItems("https://images.wallpapersden.com/image/download/game-of-thrones-star-wars-crossover-movie-hd-wallpaper_aWVlbmqUmZqaraWkpJRmZW1lrWZuZ2U.jpg"));
        itemsList.add(new customItems("https://www.enjpg.com/img/2020/minecraft-inventory-1.jpg"));
        itemsList.add(new customItems("https://www.desktopbackground.org/download/1080x1920/2015/06/16/964999_multi-monitor-video-game-hd-wallpapers-desktop-backgrounds_1242x2208_h.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT8wG1SOSQyH1pn9Mm_WjNeSLukzeilvHLV8w&usqp=CAU"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/8d/a4/7b/8da47b44afa6c98b0bb2ec6dc2d88f0c.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/2991900.jpg"));
        itemsList.add(new customItems("https://images.wallpapersden.com/image/download/gamepad-xbox-console_Z2dsbWyUmZqaraWkpJRmZW1lrWZuZ2U.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/fd/fe/9f/fdfe9fde29cbb0ef45b79c74addb0e0c.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSwYTaoyyl6NIy58HMm1w-wDkuhfXFdLDKsdA&usqp=CAU"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/1115015.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSuBEm0K6PBz5eJvHfI_CkOHazoLK8RWkNaKw&usqp=CAU"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTB0zqXPTM2yAbGPjUfJ8SbqhOQjNzhxUJiHw&usqp=CAU"));
        itemsList.add(new customItems("https://mocah.org/uploads/posts/335599-World-War-Z-Game-Zombies-4K.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/78/41/dd/7841dd5a479c25dcd9ff89e7f8e225d8.jpg"));
        itemsList.add(new customItems("https://wallpapers.pictures/media/pokemon-go-logo-wallpaper-wallpaper-background-1080x1920.jpg"));
        itemsList.add(new customItems("https://wallpaperchat.com/walls/full/1/b/5/403560.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTXT43AHf6MvJWY7kSpWVaDpCPULQiPjInqMw&usqp=CAU"));
        itemsList.add(new customItems("https://answers.unity.com/storage/temp/49641-11713152-10202735841716506-1688914225-o.jpg"));
        itemsList.add(new customItems("https://image.winudf.com/v2/image/Y29tLnVuaXR5M2QuZ2VuZXJpY3JlbW90ZV9zY3JlZW5zaG90c18wXzExZTM3Mzli/screen-0.jpg?fakeurl=1&type=.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR-uw1MMXSwWMeYSdBKIwfZ-1wBJMpWqXN9bA&usqp=CAU"));
        itemsList.add(new customItems("https://img.wallpapersafari.com/phone/1080/1920/57/62/D3Xnu4.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQUKlu1HVuRCbfLvjmdxl8FzJqLaODOvWYzBA&usqp=CAU"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSJHOcDUCGV8LBy5yssOOK4NQZYWVoxCztVKQ&usqp=CAU"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/7f/d5/0b/7fd50b9674d5f0ad8f7e5cfca94287af.jpg"));
        itemsList.add(new customItems("https://images.wallpapersden.com/image/download/text-quotes-game-of-thrones-house-baratheon_aG5ua2WUmZqaraWkpJRmZW1lrWZuZ2U.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/52/5f/07/525f07a0277c025e0f758d0c3e99e660.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/53/d1/32/53d13294755993a00cce25c81f08803d.jpg"));
        itemsList.add(new customItems("https://free4kwallpapers.com/uploads/wallpaper/quotes-2016-dark-souls-3-4k-wallpapers-1080x1920-wallpaper.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSTjtnZ6PFIXwRI9ARCVsFtcEkuQdA4XYbL1Q&usqp=CAU"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/8d/67/bd/8d67bd33c3b5b5f74aa2a063ea30fda6.jpg"));
        itemsList.add(new customItems("https://www.mwallpapers.com/photos/celebrities/games/undertale-mobile-android-iphone-desktop-hd-backgrounds-wallpapers-1080p-4khd-wallpapers-desktop-background-android-iphone-1080p-4k-xmxzd.jpg?v=1614624027"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQAUyzGIcFLqEWrIRhWRwATMZuDrFjsm1-88w&usqp=CAU"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSE1-ZRtWiUj9nXEPqmZ2i8rW-9bgJaHSOfFA&usqp=CAU"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSZy_skm-5lmeBYyIMl1f8zwMIoK4XmuL4YMA&usqp=CAU"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSnwob9rFgiuvTGpn8Tr00MZB4s2yeAsSSrtA&usqp=CAU"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSnT0TWsWuhsE2kCprYpX5cvSqjlxgbzstu8Q&usqp=CAU"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/17/f5/73/17f57382aa0069105b7449355b7b2083.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp5498320.jpg"));
        itemsList.add(new customItems("https://4kwallpaper.wiki/wp-content/uploads/2019/07/172822.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/86/12/YXQRVx.jpg"));
        itemsList.add(new customItems("https://all-images.net/wp-content/uploads/2020/05/iphone-wallpapers-games-292.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/26/79/9f/26799f739d39fa99a7b5847a8f999706.jpg"));
        itemsList.add(new customItems("https://www.3wallpapers.fr/wp-content/uploads/2018/02/iPhone-wallpaper-retro-games-gameboy.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp7346922.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/2d/94/40/2d94400f6b4257b6ca843ca4ca3e801c.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/58/2e/56/582e565e3cf32d14a239ff68c3a6ee23.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/3121452.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/d4/34/39/d434394485dd6d4761364cbf80b4f0b2.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/3487741.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/58/cb/0b/58cb0b868c3e06fae47edd75b798f366.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/41/6c/b7/416cb732b84bf072037a60f6264c74e4.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp4826990.png"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/69/41/26/69412658f34575e1aa5321f475da53bb.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/2187444.png"));
        itemsList.add(new customItems("https://wallpaper.dog/large/10828295.jpg"));
        itemsList.add(new customItems("https://coolwallpapers.me/picsup/6091399-barbarian-clash-of-clans-supercell-games-hd-pekka.jpg"));
        itemsList.add(new customItems("https://assets.wallpapersin4k.org/uploads/2017/04/Game-Of-Thrones-Wallpaper-Android-22.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/a0/70/31/a070316e659ecad6fa0f7a8d2d130e53.jpg"));
        itemsList.add(new customItems("https://www.99images.com/photos/wallpapers/games/gta-3%20android-iphone-desktop-hd-backgrounds-wallpapers-1080p-4k-70xfg.jpg?v=1615796896"));
        itemsList.add(new customItems("https://www.99images.com/photos/wallpapers/games/red-dead-redemption-ii%20android-iphone-desktop-hd-backgrounds-wallpapers-1080p-4k-otc2r.jpg?v=1616447769"));
        itemsList.add(new customItems("https://www.99images.com/photos/wallpapers/games/marioandroid-iphone-desktop-hd-backgrounds-wallpapers-1080p-4k-kebzj.jpg?v=1614329291"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/127132.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/2a/99/15/2a9915f36ad22122f589be1a29fb60af.jpg"));
        itemsList.add(new customItems("https://androidhdwallpapers.com/media/uploads/2016/08/Games-iPhone-6-Plus-Wallpaper-116.jpg"));
        itemsList.add(new customItems("https://www.mwallpapers.com/photos/celebrities/aesthetic/olya-on-ps-zone-hypebeast-wallpaper-game-wallpaper-iphone-android-iphone-hd-wallpaper-background-downloadhd-wallpapers-desktop-background-android-iphone-1080p-4k-nrpoa.jpg?v=1616300873"));



        recyclerViewAdapter = new RecyclerViewAdapter(itemsList,this);
        binding.recyclerview.setAdapter(recyclerViewAdapter);

    }
}