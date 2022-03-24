package com.developerom.chatgloballllllly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;

import com.developerom.chatgloballllllly.databinding.ActivityAnimalBinding;

import java.util.ArrayList;
import java.util.List;

public class AnimalActivity extends AppCompatActivity {

    ActivityAnimalBinding binding;
    List<customItems> itemsList;
    RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAnimalBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().setTitle("Animal");

        binding.recyclerview.setHasFixedSize(true);
        binding.recyclerview.setLayoutManager(new GridLayoutManager(this,3));
        itemsList = new ArrayList<>();

        itemsList.add(new customItems("https://wallpaperaccess.com/full/106548.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/68-680427_4k-hd-wallpaper-wild-animals-wallpaper-for-mobile.jpg"));
        itemsList.add(new customItems("https://wallpapers.pictures/media/frog-from-a-movie-hummm-wallpaper-background-1080x1920.jpg"));
        itemsList.add(new customItems("https://www.hdwallpaper.net/web/wallpapers/colorful-peacock-animal-wallpaper-626/1080x1920.jpg"));
        itemsList.add(new customItems("https://wallpapers.pictures/media/this-cute-bunny-is-in-love-with-you-wallpaper-background-1080x1920.jpg"));
        itemsList.add(new customItems("https://www.wallpapertip.com/wmimgs/41-413918_animal-wallpaper-iphone-8.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/d7/53/5d/d7535d66f9b1a01bd26da24c62d81fff.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/26/98/PJ2jQY.jpg"));
        itemsList.add(new customItems("https://www.hdwallpapers.in/download/animal_squirrel_4k_5k_hd_animals_2-1080x1920.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/6a/0c/12/6a0c128f6483c53cd2eec352d82dd1b6.jpg"));
        itemsList.add(new customItems("https://coolwallpapers.me/picsup/6071210-dolphin-animals-underwater-hd-4k-5k.jpg"));
        itemsList.add(new customItems("https://mfiles.alphacoders.com/654/654463.jpg"));
        itemsList.add(new customItems("https://s1.1zoom.me/b6551/737/Cats_Sitting_Glance_583762_1080x1920.jpg"));
        itemsList.add(new customItems("https://www.wallpapertip.com/wmimgs/219-2193390_wallpaper-meerkat-animal.jpg"));
        itemsList.add(new customItems("https://www.itl.cat/pngfile/big/2-21931_cute-cat-wallpaper-iphone-cute-invasive-species-animals.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/f2/82/bb/f282bb740374f350123022818f756dc5.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/320-3206789_chinese-good-luck-animals.jpg"));
        itemsList.add(new customItems("https://wallpapershome.com/images/wallpapers/deer-1080x1920-meadow-fog-cute-animals-4659.jpg"));
        itemsList.add(new customItems("https://mfiles.alphacoders.com/581/581710.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/1214989.jpg"));
        itemsList.add(new customItems("https://mocah.org/uploads/posts/273747-wallpaper-1080-1920.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/a3/4e/00/a34e00cfc179a3bddb33013b8d5711cf.jpg"));
        itemsList.add(new customItems("https://4.bp.blogspot.com/-C18xBhq0hSM/VdwVUr1_sUI/AAAAAAAAAYQ/P2TOozS4dxw/w1080-h1920-c-d/funny-gauge-animals-speed-galaxy-note-hd-wallpaper.jpg"));
        itemsList.add(new customItems("https://www.wallpapertip.com/wmimgs/97-977141_betta-fish-wallpaper.jpg"));
        itemsList.add(new customItems("https://coolwallpapers.me/picsup/6074126-dolphin-fish-animals-artist-artist-artwork-digital-art-hd-deviantart-4k.jpg"));
        itemsList.add(new customItems("https://mfiles.alphacoders.com/120/thumb-1920-120986.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/cb/e7/7b/cbe77b2b2ef10c29bf29dd605570cf1d.jpg"));
        itemsList.add(new customItems("https://www.wallpapertip.com/wmimgs/54-545955_wallpaper-659905-data-src-elephant-iphone-wallpaper-motivational.jpg"));
        itemsList.add(new customItems("https://coolwallpapers.me/picsup/6099359-deer-animals-silhouette-hd-photography.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/giraffe_animals_long_neck_164166_1080x1920.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/1236144.jpg"));
        itemsList.add(new customItems("https://www.99images.com/photos/love/love/valentine-animalandroid-iphone-desktop-hd-backgrounds-wallpapers-1080p-4k-0xih7.jpg?v=1583305685"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/26-264470_pokemon-iphone-wallpaper.jpg"));
        itemsList.add(new customItems("https://mfiles.alphacoders.com/665/665496.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/a0/89/3d/a0893dac76767c738a5aac099ea407e7.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/animal_graffiti_art_street_art_wall_119611_1080x1920.jpg"));
        itemsList.add(new customItems("https://coolwallpapers.me/picsup/6073324-cat-animals-hd-4k-5k.jpg"));
        itemsList.add(new customItems("https://coolwallpapers.me/picsup/6115265-dog-glasses-animals-funny.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/sloth_branch_animal_151133_1080x1920.jpg"));
        itemsList.add(new customItems("https://coolwallpapers.me/picsup/6077850-lion-animals-artist-artwork-digital-art-hd-4k-deviantart.jpg"));
        itemsList.add(new customItems("https://coolwallpapers.me/picsup/6105631-horse-animals-artist-artwork-hd-deviantart.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/b1/c9/8b/b1c98b9e5b6d4c77d0f7ea9a91239c34.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/b5/e3/84/b5e38467e1a893b82b9c1b47865c4a43.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/a5/23/d7/a523d709602a74e77dbe7c5f3e9c902b.jpg"));
        itemsList.add(new customItems("https://mfiles.alphacoders.com/833/833358.jpg"));
        itemsList.add(new customItems("https://s1.1zoom.me/b5472/395/Underwater_world_Turtles_558749_1080x1920.jpg"));
        itemsList.add(new customItems("https://s1.1zoom.me/b5150/299/Birds_Painting_Art_Three_3_Branches_518782_1080x1920.jpg"));
        itemsList.add(new customItems("https://s2.best-wallpaper.net/wallpaper/iphone/1706/Bird-wire-fence_iphone_1080x1920.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/150-1502505_robin-bird-beautiful.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/3560095.jpg"));
        itemsList.add(new customItems("https://files.wallpaperpass.com/2019/10/bird%20wallpaper%20141%20-%201080x1920.jpg"));
        itemsList.add(new customItems("https://s1.1zoom.me/b5663/51/Birds_Goldfinch_Branches_575489_1080x1920.jpg"));
        itemsList.add(new customItems("https://wallpaper.dog/large/10927698.jpg"));
        itemsList.add(new customItems("https://wallpaper.dog/large/10105.png"));
        itemsList.add(new customItems("https://sguru.org/wp-content/uploads/2017/09/Animals-Wallpapers-animals-iphone-wallpaper-1080x1920-Animal-iPhone-6-Plus-Wallpaper-205.jpg"));
        itemsList.add(new customItems("https://img.wallpapersafari.com/phone/1080/1920/85/98/KO9C2b.jpg"));
        itemsList.add(new customItems("https://www.hdwallpapers.in/download/animal_wolf_22_4k_5k_hd_animals-1080x1920.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/c2/49/47/c249478ad150329e2853263ee7867bf0.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/871598.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/14943.png"));
        itemsList.add(new customItems("https://thewallpaper.co/wp-content/uploads/2020/07/little-animal-iphone-7-wallpaper-1080x1920-hd-background-wallpapers-free-amazing-tablet-smart-phone-4k-high-definition-1080x1920-1.jpg"));
        itemsList.add(new customItems("https://wallpapersprinted.com/download/1/animal_puppy_4k_5k_hd_animals-1080x1920.jpg"));
        itemsList.add(new customItems("https://img.wallpapersafari.com/phone/1080/1920/58/63/4qIb8f.jpg"));
        itemsList.add(new customItems("https://wallpaper.dog/large/20385415.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/lynx_big_cat_animal_162438_1080x1920.jpg"));
        itemsList.add(new customItems("https://wallpaper.dog/large/11020627.png"));
        itemsList.add(new customItems("https://wallpaperboat.com/wp-content/uploads/2019/05/cool-animal-26.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/82-821591_android-butterfly-hd-backgrounds-butterfly-wallpaper-hd-for.jpg"));
        itemsList.add(new customItems("https://wallpaperboat.com/wp-content/uploads/2019/05/cool-animal-14.jpg"));
        itemsList.add(new customItems("https://image.winudf.com/v2/image1/Y29tLndpbGRhbmltYWx3YWxscGFwZXJoZC5hbmltYWxzd2FsbHBhcGVyLmJlYXV0aWZ1bGFuaW1hbGJhY2tncm91bmRzaW1hZ2Vfc2NyZWVuXzEwXzE2MDMxODI1NTVfMDg5/screen-10.jpg?fakeurl=1&type=.jpg"));
        itemsList.add(new customItems("https://res.instawallpaper.com/samsung-galaxy-c7-pro-wallpapers/download/Bengal-Tiger-Closeup-25852.jpg"));
        itemsList.add(new customItems("https://wallpapersprinted.com/download/1/animal_falcon_4k_5k_hd_animals-1080x1920.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/2b/c5/a5/2bc5a5d7f483e444f21bff8c804bac3c.jpg"));
        itemsList.add(new customItems("https://s1.1zoom.me/b4844/208/Dahlias_Closeup_Bees_Insects_555176_1080x1920.jpg"));
        itemsList.add(new customItems("https://wallpapersprinted.com/download/1/animal_bee_eater_4k_hd_animals-1080x1920.jpg"));
        itemsList.add(new customItems("http://hdwallpaper.net/web/wallpapers/perched-blue-jay-animal-wallpaper-104/1080x1920.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp8359236.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp5708229.jpg"));
        itemsList.add(new customItems("https://www.welcometotheonepercent.com/wp-content/uploads/2020/01/iphone-animal-wallpaper-horse.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/52/f3/f6/52f3f67d2f907e0610d21e5a7c9c4c8f.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/panda_bear_funny_188421_1080x1920.jpg"));
        itemsList.add(new customItems("https://wallpapersprinted.com/download/1/hedgedog_on_cloth_in_blur_green_bokeh_background_4k_5k_hd_animals-1080x1920.jpg"));
        itemsList.add(new customItems("https://wallpaperforu.com/wp-content/uploads/2020/09/cute-wallpaper-200921142648351080x1920.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/e2/8a/8b/e28a8ba9826343726921c71e99bae1f7.jpg"));
        itemsList.add(new customItems("https://lh3.googleusercontent.com/proxy/XQWRML-ZRnpxv738_np8pbobPTmP-U_V4xLwfFiyJOqvEN8kAvPIhLO_0ol8WCREjYhQzy-VgeOy8zgbrm75C1J8AapsBq5MmG1RXtJXZ4k273AhARHV1JzcLg5HWzdjViOLsg_QMHqU5Ux-2KfMfKSxbnIRHbxWLdE"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp5760632.jpg"));
        itemsList.add(new customItems("https://wallpaperbat.com/img/472253-cute-cat-iphone-wallpaper-top-free-cute-cat-iphone-background.jpg"));
        itemsList.add(new customItems("https://s1.1zoom.me/b5451/179/Dolphins_Evening_Jump_Spray_516945_1080x1920.jpg"));
        itemsList.add(new customItems("https://greatloveart.com/wp-content/uploads/2021/01/animals-iphone-wallpaper-11.jpg"));
        itemsList.add(new customItems("https://image.winudf.com/v2/image/Y3J5c3RhbC5pbmZvLmFuaW1hbHdhbGxfc2NyZWVuXzBfMTUyMjI3ODQ4MV8wNjg/screen-0.jpg?fakeurl=1&type=.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/1c/84/72/1c8472faaf872c7a1a0b82f88a4de033.jpg"));
        itemsList.add(new customItems("https://wallpaper.dog/large/20460123.jpg"));
        itemsList.add(new customItems("https://s1.1zoom.me/b4451/1000/Squirrels_Rodents_Branches_578401_1080x1920.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/62/3/Ol3Z9L.jpg"));
        itemsList.add(new customItems("https://wallpaper.dog/large/17124578.jpg"));
        itemsList.add(new customItems("http://getwallpapers.com/wallpaper/full/a/d/c/90253.jpg"));
        itemsList.add(new customItems("https://greatloveart.com/wp-content/uploads/2021/01/animals-iphone-wallpaper-1-1.jpg"));
        itemsList.add(new customItems("https://www.desktopbackground.org/download/1080x1920/2010/04/12/1112_best-3d-animal-wallpapers_5200x3200_h.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/1215441.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/2/2/WiBFlK.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/lemur_face_eyes_animal_57923_1080x1920.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/837152.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/43/0b/b6/430bb6f00a47cb404b978a4aa18108ba.jpg"));
        itemsList.add(new customItems("https://wallpaper.dog/large/20366494.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/56/51/ef/5651efe9dec05737658c4a0d7d16aa95.jpg"));
        itemsList.add(new customItems("https://s1.1zoom.me/b5360/539/Fish_Fingers_Closeup_Fugue_564508_1080x1920.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/1215145.jpg"));
        itemsList.add(new customItems("https://cdn.statically.io/img/i.pinimg.com/originals/fc/2c/92/fc2c9216284a5abb18ae6903edcd09d2.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/53/6c/31/536c31c4ae3cdb7efd4e73cb3ea401b0.jpg"));
        itemsList.add(new customItems("https://image.winudf.com/v2/image1/Y29tLmNvb2wud2FsbHBhcGVycy5hbmQucGhvbmVzLmJhY2tncm91bmRzLmFuaW1hbHNfc2NyZWVuXzBfMTU2ODc0MzI0OF8wMzI/screen-0.jpg?fakeurl=1&type=.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/1531423.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/26/40/rp9MWg.jpg"));
        itemsList.add(new customItems("http://getwallpapers.com/wallpaper/full/f/2/7/90135.jpg"));
        itemsList.add(new customItems("https://cutewallpaper.org/21/4k-animal-wallpapers/Animal-Wallpapers-4K-HD-for-Android-APK-Download.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/6b/64/91/6b6491c0d80b867c10e189a296f0d60e.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/111233.jpg"));
        itemsList.add(new customItems("https://androidhdwallpapers.com/media/uploads/2017/08/Horses-Run-Animal.jpg"));
        itemsList.add(new customItems("https://www.desktopbackground.org/download/o/2013/08/14/623054_htc-one-max-animal-wallpapers-hd-123-htc-one-wallpapers-hd_1080x1920_h.jpg"));
        itemsList.add(new customItems("https://i1.wp.com/cdn.idropnews.com/wp-content/uploads/2017/09/19124050/Dog-Animal-Pet-Puppy-iPhone-Wallpaper-1080x1920.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/puma_cub_cute_172065_1080x1920.jpg"));
        itemsList.add(new customItems("https://wallpaper.dog/large/17213059.jpg"));
        itemsList.add(new customItems("https://i2.wp.com/cdn.idropnews.com/wp-content/uploads/2017/09/19123740/Animal-Dog-Chihuahua-Puppy-iPhone-Wallpaper-1080x1920.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/84/9c/46/849c4601cb9cf2875c7de87fc6e0ae46.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRW_sGDiCf660d_mS85nsThiY2Baqpm3YLE7A&usqp=CAU"));
        itemsList.add(new customItems("https://img.wallpapersafari.com/phone/1080/1920/32/70/dfQ0MV.jpg"));
        itemsList.add(new customItems("https://s1.1zoom.me/b7254/719/Lemurs_Hammock_575141_1080x1920.jpg"));
        itemsList.add(new customItems("https://image.winudf.com/v2/image1/Y29tLndhbGxwYXBlcnN3b3JsZC5hbmltYWx3YWxscGFwZXJzX3NjcmVlbl81XzE1NzI1MzY1ODdfMDQ2/screen-5.jpg?fakeurl=1&type=.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRcOnpneObkFjbhQ7SdRN0QE5itj3-AbOpBbw&usqp=CAU"));
        itemsList.add(new customItems("https://wallpapersprinted.com/download/1/red_and_black_panda_is_sitting_in_tree_branch_4k_5k_hd_animals-1080x1920.jpg"));
        itemsList.add(new customItems("https://img.wallpapersafari.com/phone/1080/1920/15/23/3DYmyo.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS279urjI-ykYRiY7lbe1BXbKE7trrmbQEV8A&usqp=CAU"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/7e/66/dd/7e66dd69e231a1ea2b6b3a55c4c9c23f.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/hamster_brown_cute_153912_1080x1920.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSs3g2kkEKbaCewFAq3QuA-cIZ4tHiyGZpYSg&usqp=CAU"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/dog_glasses_tongue_hanging_out_143613_1080x1920.jpg"));
        itemsList.add(new customItems("https://s1.1zoom.me/b5659/239/Squirrels_Branches_581359_1080x1920.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSzmwPCGHl9vzbutIGVzJy7UYQSeKbhQBs2Ng&usqp=CAU"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/9f/45/54/9f4554385156262b43711e60c4121ee5.jpg"));




        recyclerViewAdapter = new RecyclerViewAdapter(itemsList,this);
        binding.recyclerview.setAdapter(recyclerViewAdapter);
    }
}