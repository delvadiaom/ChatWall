package com.developerom.chatgloballllllly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;

import com.developerom.chatgloballllllly.databinding.ActivityNatureBinding;

import java.util.ArrayList;
import java.util.List;

public class NatureActivity extends AppCompatActivity {

    ActivityNatureBinding binding;
    List<customItems> itemsList;
    RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNatureBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().setTitle("Nature");

        binding.recyclerview.setHasFixedSize(true);
        binding.recyclerview.setLayoutManager(new GridLayoutManager(this,3));
        itemsList = new ArrayList<>();

        itemsList.add(new customItems("https://www.teahub.io/photos/full/26-263043_1080-x-1920-hd-wallpapers-nature.jpg"));
        itemsList.add(new customItems("https://get.wallhere.com/photo/1080x1920-px-Armenia-bricks-fall-leaves-nature-portrait-display-railway-red-trees-tunnel-1042808.jpg"));
        itemsList.add(new customItems("https://wallpapers.pictures/media/nature-background-wallpaper-20161022224029-1080x1920.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/1-14743_awesome-samsung-phone-wallpaper-nature-high-quality-mobile.jpg"));
        itemsList.add(new customItems("https://r1.ilikewallpaper.net/iphone-8-wallpapers/download/36068/Flower-Summer-Spring-Nature-iphone-8-wallpaper-ilikewallpaper_com.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/32/ab/87/32ab878bb6e981fc95d5e3fb4fd5a50d.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/260-2609099_nature-mobile-wallpapers-hd.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/518772.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/shop_nature_landscape_87158_1080x1920.jpg"));
        itemsList.add(new customItems("https://mobilehd.blob.core.windows.net/main/2017/04/drops-macro-nature-leaves-1080x1920.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/sea_cliffs_cliff_149369_1080x1920.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/river_bridge_aerial_view_151776_1080x1920.jpg"));
        itemsList.add(new customItems("https://s1.1zoom.me/b4854/713/USA_Island_Ocean_Morris_island_South_Carolina_From_565062_1080x1920.jpg"));
        itemsList.add(new customItems("https://www.wallpaperuse.com/wallp/2-21944_m.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/73/31/2Fx6pM.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/88-889222_65-natural-iphone-wallpapers-for-the-nature-lovers.jpg"));
        itemsList.add(new customItems("https://www.setaswall.com/wp-content/uploads/2017/10/Pier-Nature-Img-Wallpaper-1080x1920.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/163-1630761_1080-1920-hd-nature.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/house_forest_trees_153740_1080x1920.jpg"));
        itemsList.add(new customItems("https://mfiles.alphacoders.com/754/754564.jpg"));
        itemsList.add(new customItems("https://images.hdqwalls.com/download/nature-mountains-photography-pic-1080x1920.jpg"));
        itemsList.add(new customItems("https://images.hdqwalls.com/download/dark-mountains-covered-by-snow-5k-6i-1080x1920.jpg"));
        itemsList.add(new customItems("https://images.hdqwalls.com/download/mountains-landscape-nature-digital-art-1b-1080x1920.jpg"));
        itemsList.add(new customItems("https://get.wallhere.com/photo/nature-landscape-portrait-display-mountains-road-hotel-clouds-flowers-blue-flowers-depth-of-field-plants-1403671.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/mountains_lake_ice_157843_1080x1920.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/14/2c/11/142c11fa1262e66ed7c75127f3ac78e2.jpg"));
        itemsList.add(new customItems("https://r1.ilikewallpaper.net/iphone-8-wallpapers/download/29272/Astronomy-Lightning-Skyscape-iphone-8-wallpaper-ilikewallpaper_com.jpg"));
        itemsList.add(new customItems("https://www.99images.com/photos/wallpapers/creative-graphics/blue-natureandroid-iphone-desktop-hd-backgrounds-wallpapers-1080p-4k-nmqic.jpg?v=1581652803"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/a7/64/c8/a764c874e1be205bbd88b0b2b438838c.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/36/87/EGyajp.jpg"));
        itemsList.add(new customItems("https://www.99images.com/photos/wallpapers/nature-landscapes/fall-colors-backgroundandroid-iphone-desktop-hd-backgrounds-wallpapers-1080p-4k-5fz1e.jpg?v=1583310124"));
        itemsList.add(new customItems("https://r1.ilikewallpaper.net/iphone-8-wallpapers/download/22643/Nature-Spring-Budding-Landscape-iphone-8-wallpaper-ilikewallpaper_com.jpg"));
        itemsList.add(new customItems("https://image.winudf.com/v2/image/Y29tLm5hdHVyZS53YWxscGFwZXIuY29sb3JleF9zY3JlZW5fM18xNTM4MDYwMzI2XzA2NA/screen-3.jpg?fakeurl=1&type=.jpg"));
        itemsList.add(new customItems("https://apkninja.org/wp-content/uploads/2019/11/train-track-wallpaper-09-steam.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/puddle_road_wet_156919_1080x1920.jpg"));
        itemsList.add(new customItems("wallpapertip_beach-wallpaper-iphone-6_832826.jpg"));
        itemsList.add(new customItems("https://www.setaswall.com/wp-content/uploads/2017/10/Red-Wash-Wallpaper-1080x1920.jpg"));
        itemsList.add(new customItems("https://img.pngio.com/wallpapers-for-samsung-galaxy-s4-thousands-of-hd-wallpapers-for-pc-png-nature-hd-1080_1920.jpg"));
        itemsList.add(new customItems("https://quotes-image.com/assets/upload/quotes/quotes_12099/quotes143_1595082293.jpg"));
        itemsList.add(new customItems("https://mfiles.alphacoders.com/682/682679.jpg"));
        itemsList.add(new customItems("https://lh3.googleusercontent.com/proxy/pd2T99_qGeUFawPkIDlxNxUHKCNjrIxNJiL1EaPwKdXePkmsWEuAkwe3BQOQfAW6hhJjQ0p-OXh5rYs1KjF9IwFaO3B_Ih9jrta_1k5sXSQQL9DFcHJA3L3Oist_wRNdGG35jGlla7SJt9eEIPmkkSZmTE93H3gGm8Aaj6uZB2ppQdA"));
        itemsList.add(new customItems("https://iphoneswallpapers.com/wp-content/uploads/2018/12/Nature-Camping-Art-Mountains-iPhone-Wallpaper.jpg"));
        itemsList.add(new customItems("https://mobilehd.blob.core.windows.net/main/2019/03/background-art-color-blur-abstract-bright-nature-rainbow-design-coloring-artistic.jpg"));
        itemsList.add(new customItems("https://www.setaswall.com/wp-content/uploads/2017/10/Nature-2-Wallpaper-1080x1920.jpg"));
        itemsList.add(new customItems("https://www.wallpapertip.com/wmimgs/79-797161_background-hd-images-full-screen.jpg"));
        itemsList.add(new customItems("https://www.wallpaperkiss.com/wimg/b/104-1042371_big.jpg"));
        itemsList.add(new customItems("https://www.wallpapertip.com/wmimgs/14-141730_1080p-nature-mobile-wallpaper-hd.jpg"));
        itemsList.add(new customItems("https://mocah.org/uploads/posts/273177-wallpaper-1080-1920.jpg"));
        itemsList.add(new customItems("https://images.hdqwalls.com/download/niagara-falls-5k-8r-1080x1920.jpg"));
        itemsList.add(new customItems("https://www.wallpaperuse.com/wallp/2-21811_m.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/0-2850_spring-nature-wallpaper-for-iphone-resolution-high-quality.jpg"));
        itemsList.add(new customItems("https://www.wallpapertip.com/wmimgs/82-821284_full-hd-mobile-wallpaper-scenery.jpg"));
        itemsList.add(new customItems("https://www.wallpapertip.com/wmimgs/246-2460827_good-nature-wallpaper.jpg"));
        itemsList.add(new customItems("https://images.hdqwalls.com/download/gta-5-nature-8k-ne-1080x1920.jpg"));
        itemsList.add(new customItems("https://www.hdwallpapers.in/download/two_yellow_roses_nature_plants_flowers_4k_hd-1080x1920.jpg"));
        itemsList.add(new customItems("https://www.hdwallpapers.in/download/forest_and_barn_roof_with_spruce_under_blue_sky_during_winter_4k_hd_nature-1080x1920.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/8f/44/7b/8f447bc9b0eceabc2b19896b97c23a91.jpg"));
        itemsList.add(new customItems("https://www.itl.cat/pngfile/big/81-816531_full-hd-nature-wallpapers-1080p-for-mobile.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/22-227247_best-4k-ultra-hd-nature-wallpaper-data-src.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/67/1c/f1/671cf17478216ed7eef002242b7ed30f.jpg"));
        itemsList.add(new customItems("https://www.wallpapertip.com/wmimgs/0-1705_nature-wallpaper-hd-for-mobile-nature-hd-images.jpg"));
        itemsList.add(new customItems("https://a-static.besthdwallpaper.com/river-nature-forest-wallpaper-1080x1920-19783_165.jpg"));
        itemsList.add(new customItems("https://kecbio.com/wallpaper/nature-snow-background.jpg"));
        itemsList.add(new customItems("https://www.wallpaperuse.com/wallp/14-144502_m.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/53/13/57/5313573cba8a30937c5bf2ddf89c6526.jpg"));
        itemsList.add(new customItems("https://www.setaswall.com/wp-content/uploads/2017/10/Bejamin-Mountains-A-Quiet-Mind-Yi-Wallpaper-1080x1920.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/road_forest_trees_157652_1080x1920.jpg"));
        itemsList.add(new customItems("https://www.setaswall.com/wp-content/uploads/2017/10/Material-Nature-Gg-Wallpaper-1080x1920.jpg"));
        itemsList.add(new customItems("https://www.hdwallpapers.in/download/earth_palm_tree_under_blue_seashore_4k_5k_hd_nature-1080x1920.jpg"));
        itemsList.add(new customItems("https://www.hdwallpapers.in/download/mountains_sea_ocean_clouds_4k_hd_nature-1080x1920.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/8f/5d/29/8f5d2946bc57b66d8182e4df3b333ac2.jpg"));
        itemsList.add(new customItems("https://www.hdwallpapers.in/download/rainbow_6_4k_hd_nature-1080x1920.jpg"));
        itemsList.add(new customItems("https://lh3.googleusercontent.com/proxy/WEcQMHmKrHyg-cBNRdEu0NWot8kCVw5wxC-SJ5d5z2ta5O7bxtfW-pyDiWX2Jp8aaoZh2tnO1yuo293vev70FTKsLOdVNqTMh_yJt--LUu9HzkOqPqS-vPlQVrEhHcy8BJgZZH4DWZHE2jJRZLjd6g"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/1877863.jpg"));
        itemsList.add(new customItems("https://www.wallpaperkiss.com/wimg/b/103-1038371_big.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/48/5/BIZwb8.jpg"));
        itemsList.add(new customItems("https://www.wallpapertip.com/wmimgs/245-2450048_rain-nature-wallpaper.jpg"));
        itemsList.add(new customItems("https://cdn.statically.io/img/lh4.googleusercontent.com/proxy/uuAO2IaDhR4KpRw1IddnNSpJLClBQ8le-qp2-zx2VQI14yGD3yLodnMI9eR596VBJVJWaOYhTqyC2bdNsgNnfT83IaVAFKwAlorp=s0-d"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/26-263360_beautiful-wallpaper-for-phone-nature-wallpaper-fall-fall.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/35-354461_mountain-black-white-nature-wallpapers-hd-black-and.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/251-2518358_1080x1920-nature-lg-g2-wallpapers-hd-90-data.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/69-694803_q-mobile-flower-wallpapers-qmobile-noir-i2-wallpapers.jpg"));
        itemsList.add(new customItems("https://wallpapersprinted.com/download/1/closeup_photo_of_white_cherry_blossoms_flowers_in_blur_background_4k_hd_nature-1080x1920.jpg"));
        itemsList.add(new customItems("https://www.setaswall.com/wp-content/uploads/2017/10/8-Bit-Nature-Lu-Wallpaper-1080x1920.jpg"));
        itemsList.add(new customItems("https://wallpaper.dog/large/20465466.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/9c/f2/22/9cf222c76b02487c040b2ed7e67772e6.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp4788573.jpg"));
        itemsList.add(new customItems("https://img.wallpapersafari.com/phone/1080/1920/19/25/eSYQ2J.jpg"));
        itemsList.add(new customItems("https://images.unsplash.com/photo-1518986762393-2a8362ee6fb9?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8NXx8fGVufDB8fHx8&w=1000&q=80"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/1b/6e/44/1b6e444c58814becc7f0de010bf70024.jpg"));
        itemsList.add(new customItems("https://wallpapersprinted.com/download/1/green_leaf_plant_branch_with_blur_background_4k_hd_nature-1080x1920.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/0a/f8/be/0af8bea8f50b962f3d9cdfe406cb3677.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/5/52/Rv0ILP.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp3201721.jpg"));
        itemsList.add(new customItems("https://res.instawallpaper.com/1080x1920-wallpapers/download/Nature-Bamboo-Grove-Blur-25454.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/2a/dc/c1/2adcc19523721eb6b4d740e0296a8119.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/82/12/5un7ia.jpg"));
        itemsList.add(new customItems("https://wallpapersprinted.com/download/1/train_between_california_coast_pacific_ocean_and_flowers_during_sunset_4k_5k_hd_nature-1080x1920.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/157148.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp4814693.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/32/77/35/3277353aae568e8377643ccabe91433b.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/fb/1a/67/fb1a67d24144b4456e7a44bb1fe8f4cc.jpg"));
        itemsList.add(new customItems("https://cdn.idropnews.com/wp-content/uploads/2017/11/07022311/Half-Moon-Over-Pine-iPhone-Wallpaper-1080x1920.jpg"));
        itemsList.add(new customItems("https://www.setaswall.com/wp-content/uploads/2017/10/Beauty-Nature-2-Wallpaper-1080x1920.jpg"));
        itemsList.add(new customItems("https://wallpaperforu.com/wp-content/uploads/2021/01/macro-wallpaper-210108220003621080x1920.jpg"));
        itemsList.add(new customItems("https://www.desktopbackground.org/download/1080x1920/2011/05/17/204446_amazing-iphone-nature-wallpaper-backgrounds-hd_1080x1950_h.jpg"));
        itemsList.add(new customItems("https://www.backgroundscool.com/wp-content/uploads/2020/02/14116_1080x1920_iphonehdwallpapers_net.jpg"));
        itemsList.add(new customItems("https://www.wallpaperuse.com/wallp/79-796357_m.png"));
        itemsList.add(new customItems("https://wallpapersprinted.com/download/1/green_covered_rocks_in_body_of_water_under_blue_sky_during_daytime_4k_hd_nature-1080x1920.jpg"));
        itemsList.add(new customItems("https://res.instawallpaper.com/oppo-f3-wallpapers/download/Nature-Beautiful-Butterfly-Animal-Flower-Water-Blur-25599.jpg"));
        itemsList.add(new customItems("https://wallpaper.dog/large/5459040.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/9e/8d/07/9e8d079b89a044002302b50f497015f5.jpg"));
        itemsList.add(new customItems("https://hdqwalls.com/download/spring-autumn-colorful-nature-magical-forest-4k-9o-1080x1920.jpg"));
        itemsList.add(new customItems("https://www.itl.cat/pngfile/big/7-79376_download-wallpaper-windows-10-wallpaper-hd-nature.jpg"));
        itemsList.add(new customItems("https://image.winudf.com/v2/image1/Y29tLkxhbmRzY2FwZS5xdWFsaXR5d2FsbHBhcGVyX3NjcmVlbl84XzE2MDQ3MTA5ODZfMDYw/screen-8.jpg?fakeurl=1&type=.jpg"));
        itemsList.add(new customItems("http://getwallpapers.com/wallpaper/full/0/d/b/538650.jpg"));
        itemsList.add(new customItems("https://s2.best-wallpaper.net/wallpaper/iphone/1708/Alps-mountains-fog-clouds-creek-Italy-nature-landscape_iphone_1080x1920.jpg"));
        itemsList.add(new customItems("https://wallpapersprinted.com/download/1/white_flowers_in_light_purple_background_4k_hd_nature-1080x1920.jpg"));
        itemsList.add(new customItems("https://www.wallpaperuse.com/wallp/1-18750_m.jpg"));
        itemsList.add(new customItems("https://www.wallpaperkiss.com/wimg/b/115-1150909_big.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/3/53/LTd9Pk.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/1a/da/ed/1adaed2c9d596785878a69d97057b63f.jpg"));
        itemsList.add(new customItems("https://a-static.besthdwallpaper.com/far-cry-4-landscape-wallpaper-1080x1920-3901_165.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/f9/69/91/f96991d135e64b603b3096f7625b2748.jpg"));
        itemsList.add(new customItems("https://wallpapersprinted.com/download/1/path_between_autumn_red_leafed_trees_4k_hd_nature-1080x1920.jpg"));
        itemsList.add(new customItems("https://cdn.statically.io/img/wallpaperaccess.com/full/815089.jpg"));
        itemsList.add(new customItems("https://cdn.statically.io/img/wallpaperaccess.com/full/1182859.jpg"));
        itemsList.add(new customItems("https://www.itl.cat/pngfile/big/311-3113514_bridge-london-nature-wallpapers-hd-full-wallpapers-full.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/1682158.jpg"));
        itemsList.add(new customItems("https://img.wallpapersafari.com/phone/1080/1920/24/30/81BUqm.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/56-560666_iphone-8-wallpaper-nature-green-with-image-resolution.jpg"));
        itemsList.add(new customItems("https://www.desktopbackground.org/download/o/2010/07/21/51524_1080x1920-summer-nature-wallpapers-hd_1080x1920_h.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/d8/1d/9c/d81d9c123b860d96d3b76180c49fe383.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/f7/94/49/f794497a4757451a115d29606d19fbc8.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp4937453.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/fe/cf/48/fecf48db729d46cb491c9c1906142293.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/11/93/VUjrCA.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp4324907.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/89/50/nvCrWQ.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/235598.jpg"));
        itemsList.add(new customItems("https://img.wallpapersafari.com/phone/1080/1920/0/8/FJqvL0.jpg"));


        recyclerViewAdapter = new RecyclerViewAdapter(itemsList,this);
        binding.recyclerview.setAdapter(recyclerViewAdapter);
    }
}