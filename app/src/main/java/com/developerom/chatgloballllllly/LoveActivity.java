package com.developerom.chatgloballllllly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;

import com.developerom.chatgloballllllly.databinding.ActivityLoveBinding;

import java.util.ArrayList;
import java.util.List;

public class LoveActivity extends AppCompatActivity {

    ActivityLoveBinding binding;
    List<customItems> itemsList;
    RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoveBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().setTitle("Love");
        binding.recyclerview.setHasFixedSize(true);
        binding.recyclerview.setLayoutManager(new GridLayoutManager(this,3));
        itemsList = new ArrayList<>();

        itemsList.add(new customItems("https://i.pinimg.com/originals/7b/e8/f6/7be8f63d11a7f8555a61f6b2a2813127.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/112465.jpg"));
        itemsList.add(new customItems("https://uhdwallpapers.org/uploads/converted/19/08/03/the-hearts-of-love-1080x1920_944968-rm-90.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/110-1108140_red-love-wallpaper-hd.png"));
        itemsList.add(new customItems("https://lh3.googleusercontent.com/proxy/AnM9RfgNnEXauKZ_04klh1tfeFkyAwXU1ODgFshgKuGnJVyZXK0Nhnvt4uFODmmQIjUkuBwOYx4mlhVBE0ApVVQAcUQyhG3ugknBeWzzDrZQ9YMoXPDUyuCI=s0-d"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp5001994.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/242-2421649_pink-love-vintage-heart-mobile-love-wallpaper-hd.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/60/6f/c7/606fc76dac7efd66ea3e598b43ed396e.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/54/41/TVAGaO.jpg"));
        itemsList.add(new customItems("https://themobilewallpaper.com/uploads/blog_images/I-Love-you-1080x1920-I-Love-you-Android-wallpaper---Android-HD-wallpaper-HD-mobile-Wallpaper-8856148.jpg"));
        itemsList.add(new customItems("https://www.99images.com/photos/love/love/cute-loveandroid-iphone-desktop-hd-backgrounds-wallpapers-1080p-4k-7yxcw.jpg?v=1579496346"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/94/13/7a/94137a3284ac4f3464b82639f3fdf8d9.jpg"));
        itemsList.add(new customItems("https://www.desktopbackground.org/download/o/2015/01/17/888679_1080x1920-cute-love-wallpapers-hd_1080x1920_h.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/112474.jpg"));
        itemsList.add(new customItems("https://wallpaperboat.com/wp-content/uploads/2019/05/cute-love-1.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/332-3326019_cute-love-wallpaper-for-phone-love-wallpapers-for.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/201-2014086_cute-love-iphone-8-plus-wallpaper-iphone-wallpaper.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/73/85/de5iFO.jpg"));
        itemsList.add(new customItems("https://images.hdqwalls.com/download/i-love-you-hd-1080x1920.jpg"));
        itemsList.add(new customItems("https://www.wallpapertip.com/wmimgs/252-2523788_showing-love.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp5592506.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTkeKiRFvIcng0Rwmw0pemv54NQu10KlB-vbg&usqp=CAU"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/44/27/FpZnLj.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp5281800.jpg"));
        itemsList.add(new customItems("https://www.mwallpapers.com/photos/love/love/iphone-wallpaper-love-android-iphone-hd-wallpaper-background-downloadhd-wallpapers-desktop-background-android-iphone-1080p-4k-dez3n.jpg?v=1615666117"));
        itemsList.add(new customItems("https://www.99images.com/photos/love/love/love-iphone%20android-iphone-desktop-hd-backgrounds-wallpapers-1080p-4k-2xdjp.jpg?v=1615666990"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp5823157.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/194-1949007_love-fingers-valentine-pair-love-wallpaper-hd-portrait.jpg"));
        itemsList.add(new customItems("https://assets.wallpapersin4k.org/uploads/2017/04/Galaxy-Love-Wallpaper-19.jpg"));
        itemsList.add(new customItems("https://www.wallpapertip.com/wmimgs/62-623244_bts-rm-love-quotes.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/1174173.jpg"));
        itemsList.add(new customItems("https://www.wallpapertip.com/wmimgs/3-34019_hd-love-wallpaper-android-wallpaper-full-hd-love.jpg"));
        itemsList.add(new customItems("https://www.wallpaperuse.com/wallp/37-377778_m.jpg"));
        itemsList.add(new customItems("https://coolwallpapers.me/picsup/6093051-code-computer-programming-syntax-typography-love-hd.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/5c/b5/b9/5cb5b9caed343605792035d44a7e43f8.jpg"));
        itemsList.add(new customItems("https://www.99images.com/download-image/432445/1080x1920"));
        itemsList.add(new customItems("https://www.wallpapertip.com/wmimgs/0-2058_cute-love-galaxy-wallpaper-hd-cute-wallpaper-hd.jpg"));
        itemsList.add(new customItems("https://androidhdwallpapers.com/media/uploads/2016/04/Teddy-Love.jpg"));
        itemsList.add(new customItems("https://wallpaper.dog/large/953734.jpg"));
        itemsList.add(new customItems("https://www.99images.com/download-image/388933/1080x1920"));
        itemsList.add(new customItems("https://wallpaperforu.com/wp-content/uploads/2020/10/love-wallpaper-20102001540111080x1920.jpg"));
        itemsList.add(new customItems("https://zeeoii.com/wp-content/uploads/2020/08/Mobile-Full-HD-AMOLED-Wallpaper-1080X1920-39.jpg"));
        itemsList.add(new customItems("https://coolwallpapers.me/picsup/6099084-heart-sand-beach-love-hd-4k-5k-travel.jpg"));
        itemsList.add(new customItems("https://goldwallpapers.com/uploads/posts/one-love-wallpaper/one_love_wallpaper_028.jpg"));
        itemsList.add(new customItems("https://www.mwallpapers.com/photos/love/love/love-wallpaper-for-galaxy-s5-android-iphone-hd-wallpaper-background-downloadhd-wallpapers-desktop-background-android-iphone-1080p-4k-ajnqj.jpg?v=1615723762"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS1Uaj00knCAt6y6xgkbdhmbXKuiYCXegWncg&usqp=CAU"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/86-864728_love-blur-background-hd.jpg"));
        itemsList.add(new customItems("https://www.wallpaperuse.com/wallp/1-17731_m.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/24/6c/25/246c2555c6ff6cd28ecf2b6cfaea25b1.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQmGwZ7jDYPs9Z4K8smSHqDcrp-oFeCG8o6-A&usqp=CAU"));
        itemsList.add(new customItems("https://a-static.besthdwallpaper.com/love-heart-shape-sand-decor-wallpaper-1080x1920-54765_165.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRyf_Ukh-9OIb9Xxs8Z0BfIjd4AYtB6vZ7WqQ&usqp=CAU"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRovWSN6Exaiv6XCLuHpXAE0TGmetIuLQsZYg&usqp=CAU"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/269-2695690_love-full-screen-wallpaper-hd.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/55/73/uw3EjQ.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/41/1f/70/411f70f096c65cb5f944aec1d4bfa5fa.jpg"));
        itemsList.add(new customItems("https://getwallpapers.com/wallpaper/full/6/4/2/837004-my-love-wallpapers-1080x1920-ipad.jpg"));
        itemsList.add(new customItems("https://www.desktopbackground.org/download/o/2013/08/21/626323_i-love-you-3-magical-words-hd-wallpapers_1080x1920_h.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRjuTXeZKVrEZkLUjLh1DiDJzWTlYNdTvnfCw&usqp=CAU"));
        itemsList.add(new customItems("https://www.99images.com/download-image/836799/1080x1920"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRLj99TeSEOv-NYvzgjwwyEQa8--JA66uEv_w&usqp=CAU"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRQl8_RiV97lrvw8puET9pygT4LGXGcjyEEcw&usqp=CAU"));
        itemsList.add(new customItems("https://wallpapertag.com/wallpaper/full/7/6/a/833098-free-sweet-love-wallpaper-1080x1920-for-ios.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQqmtEWusynLEoz1poUPUv9wLXRQCLVlluJsw&usqp=CAU"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRfoLz5C3cxHyAOcoXM7xSkU4jiTPch2X7lPA&usqp=CAU"));
        itemsList.add(new customItems("https://getwallpapers.com/wallpaper/full/f/4/f/524333.jpg"));
        itemsList.add(new customItems("https://www.99images.com/download-image/368151/1080x1920"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRSpGMtzBcdaXII_8qjDTZARrpLOp6LXv2aqw&usqp=CAU"));
        itemsList.add(new customItems("https://www.wallpaperkiss.com/wimg/b/114-1147662_big.png"));
        itemsList.add(new customItems("https://assets.wallpapersin4k.org/uploads/2017/04/Love-Lock-Wallpaper-23.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTC0rrMXC8PE0cFwkcY5YgvxwOFoxX7HaBAtQ&usqp=CAU"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT2EzcFGbbQgUzZ0UkSo5jXV1Zo6tJsnpCzbQ&usqp=CAU"));
        itemsList.add(new customItems("https://www.99images.com/photos/love/love/i-love-my-familyandroid-iphone-desktop-hd-backgrounds-wallpapers-1080p-4k-thppx.jpg?v=1581759244"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/42/23/7d/42237d1c6886dafc3be452cd23b00cfb.jpg"));
        itemsList.add(new customItems("https://www.wallpapertip.com/wmimgs/0-5145_cute-love-ios-10-wallpaper-heart-wallpaper-love.jpg"));
        itemsList.add(new customItems("https://www.wallpapertip.com/wmimgs/0-5285_love-on-another-level.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQjLyPBmUuug8EPpwlCSAkfnzaTSOZpf_0I-Q&usqp=CAU"));
        itemsList.add(new customItems("https://www.wallpapertip.com/wmimgs/138-1383999_new-wallpaper-2019-love.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRmBvZkFFqyeBSYZhnkG6RkBMdADbZNW-oFHQ&usqp=CAU"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/11/51/0gswNp.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQKss6T2LN6y5FTb4QRYtU1OB32GcJXGMYyTA&usqp=CAU"));
        itemsList.add(new customItems("http://getwallpapers.com/wallpaper/full/8/3/3/674685.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp6111781.jpg"));
        itemsList.add(new customItems("https://www.wallpapertip.com/wmimgs/8-86148_love-heart-bokeh-love-android-wallpaper-hd.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/love_heart_art_153384_1080x1920.jpg"));
        itemsList.add(new customItems("https://www.99images.com/photos/love/love/cute-heartsandroid-iphone-desktop-hd-backgrounds-wallpapers-1080p-4k-scaq8.jpg?v=1583163306"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/mom_love_heart_129072_1080x1920.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/heart_light_love_159650_1080x1920.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/11-112629_cute-love-wallpaper-for-mobile-10801920-1-data.jpg"));
        itemsList.add(new customItems("https://www.99images.com/photos/love/love/love-quotes-iphoneandroid-iphone-desktop-hd-backgrounds-wallpapers-1080p-4k-2kg3w.jpg?v=1582605013"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTpd1CSvFodydm6LP8O5NUIvHG7jKEgAAcodg&usqp=CAU"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRDpWzvQ1teReoMMDQGfx-DE7FYNBqSm9eSCg&usqp=CAU"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/heart_black_love_140573_1080x1920.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcStXskZKyPQn6oZ5paFy00HwiXIaIaazhf9cw&usqp=CAU"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/2536089.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp4312961.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/doves_couple_rose_sky_love_78149_1080x1920.jpg"));
        itemsList.add(new customItems("https://img.wallpapersafari.com/phone/1080/1920/93/1/ylVD4p.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTpz58XqcmHqhIjkW-dkVVKZSw37YVMO78gRA&usqp=CAU"));
        itemsList.add(new customItems("https://www.mwallpapers.com/photos/love/love/love-wallpaper-iphone-6s-plus-android-iphone-hd-wallpaper-background-downloadhd-wallpapers-desktop-background-android-iphone-1080p-4k-wq6bs.png?v=1615665723"));
        itemsList.add(new customItems("https://themobilewallpaper.com/uploads/blog_images/I-Love-you-1080x1920-I-Love-You-Funny-Sheep-iPhone-6-Plus-HD-Wallpaper-HD-HD-mobile-Wallpaper-8952672.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp8560577.jpg"));
        itemsList.add(new customItems("https://img.wallpapersafari.com/phone/1080/1920/48/32/MquDhH.jpg"));
        itemsList.add(new customItems("https://coolwallpapers.me/picsup/6093458-heart-love-wood-texture-hd-4k-5k-pattern.jpg"));
        itemsList.add(new customItems("https://uhdwallpapers.org/uploads/converted/18/06/01/i-love-you-watermelon-slice-wallpaper-1080x1920_45964-mm-90.jpg"));
        itemsList.add(new customItems("https://wallpapershome.com/images/wallpapers/love-image-1080x1920-heart-hd-14846.jpg"));
        itemsList.add(new customItems("https://a-static.besthdwallpaper.com/valentine-s-day-love-quote-on-the-wall-wallpaper-1080x1920-13398_165.jpg"));
        itemsList.add(new customItems("https://www.99images.com/photos/love/love/love-shape%20android-iphone-desktop-hd-backgrounds-wallpapers-1080p-4k-u2los.jpg?v=1614491646"));
        itemsList.add(new customItems("https://www.mwallpapers.com/photos/celebrities/movies/to-all-the-boys-i-loved-before-2-wallpaper-android-iphone-hd-wallpaper-background-downloadhd-wallpapers-desktop-background-android-iphone-1080p-4k-qcggn.jpg?v=1616257244"));
        itemsList.add(new customItems("https://www.wallpaperkiss.com/wimg/b/144-1447128_big.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/14/16/00/141600385acf9ed288d62de5e4999131.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/8-83236_3d-love-wallpapers-for-mobile-touch-screen-free.jpg"));
        itemsList.add(new customItems("https://www.wallpaperkiss.com/wimg/b/128-1280153_big.jpg"));
        itemsList.add(new customItems("https://www.itl.cat/pngfile/big/10-101231_cute-heart-love-iphone-6-wallpapers-hd.jpg"));
        itemsList.add(new customItems("https://coolwallpapers.me/picsup/6105543-heart-love.jpg"));
        itemsList.add(new customItems("https://www.mwallpapers.com/photos/celebrities/aesthetic/i-wanna-feel-love-with-him-again-roses-blooms-in-2019-android-iphone-hd-wallpaper-background-downloadhd-wallpapers-desktop-background-android-iphone-1080p-4k-ynu92.jpg?v=1616293470"));
        itemsList.add(new customItems("https://coolwallpapers.me/picsup/6108453-love-minimalism.jpg"));
        itemsList.add(new customItems("https://www.wallpapers.net/download-feel-my-love-hd-wallpaper-for-desktop-mobiles/download/1080x1920.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp5033552.jpg"));
        itemsList.add(new customItems("https://wallpaperset.com/w/full/0/7/7/170386.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp5823164.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/175-1759799_hd-wallpaper-love-for-android.jpg"));
        itemsList.add(new customItems("https://www.itl.cat/pngfile/big/3-37670_love-images-wallpaper-for-mobile-word-love.jpg"));
        itemsList.add(new customItems("https://traxzee.com/wp-content/uploads/2020/10/Traxzee.Com-Love-Wallpapers-213-1080X1920.jpg"));
        itemsList.add(new customItems("http://images.unsplash.com/photo-1518050346340-aa2ec3bb424b?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/241-2418557_galaxy-wallpaper-love.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/lock_heart_love_116319_1080x1920.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/63/75/tXxJo6.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/2214754.jpg"));
        itemsList.add(new customItems("http://getwallpapers.com/wallpaper/full/1/0/0/1212820-black-and-red-heart-wallpaper-1080x1920-for-windows.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/1174082.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/950799.jpg"));
        itemsList.add(new customItems("https://lh3.googleusercontent.com/proxy/qFQq5CGYKKT2Lw_dkgiuf_G7GGHkNlt3bGEJAQSiTszGaGUBW9fUHdyZLDlNccAnSRItZlrXrX6r0dq9yWvsHbo1w9YVCEpf6XY"));
        itemsList.add(new customItems("https://getwallpapers.com/wallpaper/full/1/2/a/837091-my-love-wallpapers-1080x1920-picture.jpg"));
        itemsList.add(new customItems("https://www.wallpapertip.com/wmimgs/85-850071_chocolate-hearts-android-wallpaper-iphone-cute-wallpaper-hd.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/ea/d6/d8/ead6d850ea823ef2a301d07dfa30f25e.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/heart_decoration_crafts_148220_1080x1920.jpg"));
        itemsList.add(new customItems("https://img.wallpapersafari.com/phone/1080/1920/57/1/sn9Gzx.jpg"));
        itemsList.add(new customItems("https://wallpapertag.com/wallpaper/full/0/c/9/751922-cool-love-wallpapers-1080x1947-computer.jpg"));
        itemsList.add(new customItems("https://images.hdqwalls.com/download/love-1080x1920.jpg"));
        itemsList.add(new customItems("https://wallpapertag.com/wallpaper/full/7/6/a/833098-free-sweet-love-wallpaper-1080x1920-for-ios.jpg"));
        recyclerViewAdapter = new RecyclerViewAdapter(itemsList,this);
        binding.recyclerview.setAdapter(recyclerViewAdapter);

    }
}