package com.developerom.chatgloballllllly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;

import com.developerom.chatgloballllllly.databinding.ActivityTechnologyBinding;

import java.util.ArrayList;
import java.util.List;

public class TechnologyActivity extends AppCompatActivity {

    ActivityTechnologyBinding binding;
    List<customItems> itemsList;
    RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTechnologyBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().setTitle("Technology");
        binding.recyclerview.setHasFixedSize(true);
        binding.recyclerview.setLayoutManager(new GridLayoutManager(this,3));
        itemsList = new ArrayList<>();

        itemsList.add(new customItems("https://wallpaperaccess.com/full/1465993.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/67/e0/60/67e060eee7fc504df24aa4582d354b32.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/52-522846_hi-tech.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp5208075.jpg"));
        itemsList.add(new customItems("https://mfiles.alphacoders.com/253/253566.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/297642.jpg"));
        itemsList.add(new customItems("https://mfiles.alphacoders.com/618/618897.png"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp4996730.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/66/89/ZTLlDB.jpg"));
        itemsList.add(new customItems("https://wallpaper.dog/large/10724707.png"));
        itemsList.add(new customItems("https://wallpaperbat.com/img/322658-lane-conder-on-drawing-in-2020-xiaomi-wallpaper.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/65/61/06/6561067e34e3eb63135ec42397fabc45.jpg"));
        itemsList.add(new customItems("https://mfiles.alphacoders.com/693/693943.png"));
        itemsList.add(new customItems("https://www.wallpapertip.com/wmimgs/251-2516724_technology-wallpaper-for-mobile.png"));
        itemsList.add(new customItems("https://wallpaperboat.com/wp-content/uploads/2019/05/tech-2.jpg"));
        itemsList.add(new customItems("https://sguru.org/wp-content/uploads/2017/09/Technology-Wallpaper-technology-iphone-wallpaper-1080x1920-3D-Technology-1080x1920.jpg"));
        itemsList.add(new customItems("https://www.wallpapertip.com/wmimgs/1-12795_technology-apple-wallpaper-hd-hexagon-wallpaper-iphone.jpg"));
        itemsList.add(new customItems("https://images.wallpapersden.com/image/download/virtual-reality-technology_amxuaWyUmZqaraWkpJRmZW1lrWZuZ2U.jpg"));
        itemsList.add(new customItems("https://mfiles.alphacoders.com/636/636999.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/05/68/3c/05683ca46e3c695751b8f002957925be.jpg"));
        itemsList.add(new customItems("https://sguru.org/wp-content/uploads/2017/09/Technology-Wallpaper-3d-hi-tech-graphics-rendering-style-31352-1080x1920.jpg"));
        itemsList.add(new customItems("https://cdn.statically.io/img/wallpaperaccess.com/full/1076527.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/1466001.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQZ1Zq1vA-WrSwMGAcYkwub1LktMzqmeePuBQ&usqp=CAU"));
        itemsList.add(new customItems("https://mfiles.alphacoders.com/681/681540.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/103-1037682_facebook-wallpaper-iphone.jpg"));
        itemsList.add(new customItems("https://images.hdqwalls.com/download/binary-code-technology-4k-l2-1080x1920.jpg"));
        itemsList.add(new customItems("https://www.wallpaperuse.com/wallp/8-88630_m.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/2a/04/91/2a0491438f0bb133d455f32527847a7a.jpg"));
        itemsList.add(new customItems("https://1.bp.blogspot.com/-CMCPWpWcytc/YIzChWFRBHI/AAAAAAAASS0/pscZQEOz2PYfBqbtMLsYsDupgLynLQd9QCLcBGAsYHQ/d/technology%2Bwallpaper%2Bfor%2Bmobile%2B1080x1920_04.png"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp5421326.jpg"));
        itemsList.add(new customItems("https://www.wallpapertip.com/wmimgs/134-1347542_architecture.jpg"));
        itemsList.add(new customItems("https://mfiles.alphacoders.com/624/thumb-1920-624398.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp6418060.jpg"));
        itemsList.add(new customItems("https://getwallpapers.com/wallpaper/full/7/8/e/62441.jpg"));
        itemsList.add(new customItems("https://www.wallpaperuse.com/wallp/3-33598_m.jpg"));
        itemsList.add(new customItems("https://mfiles.alphacoders.com/792/792685.jpg"));
        itemsList.add(new customItems("https://img.wallpapersafari.com/phone/1080/1920/1/95/mBOoVh.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGb5GbGg45DwNCfGCXb89zoWLgFqFemSzJ1g&usqp=CAU"));
        itemsList.add(new customItems("https://sguru.org/wp-content/uploads/2017/09/Technology-Wallpaper-minimalism-telephone-computer-technology-99028-1080x1920.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/60/99/SmwFd7.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/84/6c/cf/846ccfbd7f3689e7ad80f1990a7d2f47.jpg"));
        itemsList.add(new customItems("https://mfiles.alphacoders.com/711/thumb-1920-711632.jpg"));
        itemsList.add(new customItems("https://mfiles.alphacoders.com/124/124685.png"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/24/38/ac/2438acd6f36b9e0adfab0f6eba787d7d.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/1c/e3/17/1ce317ac266519c9f0143ebeb75bf0ec.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/e4/dd/1e/e4dd1e9e22ad471e0640bda0f41c05f4.jpg"));
        itemsList.add(new customItems("https://1.bp.blogspot.com/-SOiSn-WDv4Y/XyxSlhee4hI/AAAAAAAA3mI/OStP0hnEzTIqeJ3Ufk8ujm_Oq8C6UR_LQCLcBGAsYHQ/s2560/anonymous-vector-x-vexel-art-nx-1080x1920.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/91/57/d4/9157d49201aa02253b749fdbc45c668c.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/keyboard_key_backlight_128828_1080x1920.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/0b/9d/c8/0b9dc810819b07ba9323ee0e769bf6cc.png"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/computer_coolers_backlight_146318_1080x1920.jpg"));
        itemsList.add(new customItems("https://mfiles.alphacoders.com/845/845819.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/d4/99/cf/d499cff6a51c38cdaaed4f0ed47b647c.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/02/24/6c/02246ca1ef91d673092af0173460a51e.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/af/bd/26/afbd2667e57b93ecc7eb76a4d3d1a5b0.jpg"));
        itemsList.add(new customItems("https://cutewallpaper.org/21/black-technology-wallpaper/Tech-Wallpaper-For-Android-30+-Group-Wallpapers.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/b7/18/8d/b7188d39452c491aec6f476fa20fd461.jpg"));
        itemsList.add(new customItems("https://files.wallpaperpass.com/2019/10/rocket%20league%20wallpaper%20124%20-%201080x1920.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/62/1a/43/621a4345889fa0077df1d09346515e8b.jpg"));
        itemsList.add(new customItems("http://getwallpapers.com/wallpaper/full/4/7/5/557398.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/rocket_flight_launch_162464_1080x1920.jpg"));
        itemsList.add(new customItems("https://1.bp.blogspot.com/-fY7AEq0dUng/Xz_pwwf-GLI/AAAAAAAAIDA/CcVaxw46I9YOUR7NMreAHPGdnVTKEZM1QCLcBGAsYHQ/s1920/NASA-BLACK-WALLPAPER-mobile-HD.png"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/leica_camera_technology_163634_1080x1920.jpg"));
        itemsList.add(new customItems("https://sguru.org/wp-content/uploads/2017/09/Technology-Wallpaper-nikon-camera-technology-44428-1080x1920.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/drone_camera_technology_171576_1080x1920.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/7f/6e/19/7f6e195af6b893337c97b27447df3b49.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp2247520.jpg"));
        itemsList.add(new customItems("http://www.eyeondrones.com/drone-wallpapers/1080x1920/3d-robotics-iris-clouds-1080x1920.jpg"));
        itemsList.add(new customItems("http://www.eyeondrones.com/drone-wallpapers/1080x1920/hubsan-x4-beach-sand-1080x1920.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp3967013.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/polaroid_equipment_camera_164490_1080x1920.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/phone_charging_battery_162781_1080x1920.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/7f/f5/d8/7ff5d85b410068055df4f0d195949d9c.jpg"));
        itemsList.add(new customItems("https://images.hdqwalls.com/download/tesla-model-x-front-4k-5x-1080x1920.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/1d/f0/43/1df0435f8d8788ad03030a07cfd22c1e.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/103-1038547_significance-of-technology.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS9j8TH4crTIqBQ2JfZYLvwN6-WYrXeM2NyHw&usqp=CAU"));
        itemsList.add(new customItems("https://wallpaperbat.com/img/413223-hacker-phone-wallpaper.jpg"));
        itemsList.add(new customItems("https://wallpaper.dog/large/5505317.jpg"));
        itemsList.add(new customItems("https://images.wallpapersden.com/image/download/bitcoin-cryptocurrency_bGVtZWeUmZqaraWkpJRmZW1lrWZuZ2U.jpg"));
        itemsList.add(new customItems("https://www.wallpaperuse.com/wallp/6-61334_m.jpg"));
        itemsList.add(new customItems("https://www.wallpaperuse.com/wallp/4-47856_m.jpg"));
        itemsList.add(new customItems("https://cutewallpaper.org/21/robot-wallpaper/Robot-Wallpaper-HD-for-Android-PixelsTalkNet.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/1455448.jpg"));
        itemsList.add(new customItems("https://4kwallpapers.com/images/wallpapers/anonymous-hacker-data-breach-5k-1080x1920-7.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/6d/dd/36/6ddd36055ad210be1555b7499a86827f.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/21-219742_technology-themes-for-android.jpg"));
        itemsList.add(new customItems("https://mfiles.alphacoders.com/746/thumb-1920-746177.jpg"));
        itemsList.add(new customItems("https://www.desktopbackground.org/download/1080x1920/2011/07/06/229884_ultra-hd-4k-technology-wallpapers-hd-desktop-backgrounds-3840x2400_3840x2400_h.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/50/e1/9a/50e19a09a71976cfe2ed5092d8ad0d84.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/typewriter_retro_sofa_110194_1080x1920.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/typewriter_retro_sofa_110194_1080x1920.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/75/cd/f8/75cdf8df1c20a5fe3be9b2d7773fd7ab.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/ae/18/9f/ae189f60c3c01d217aad74a9b1534ae2.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/neon_lamps_light_144414_1080x1920.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/computer_details_wires_181732_1080x1920.jpg"));
        itemsList.add(new customItems("https://cutewallpaper.org/21/wallpapers-for-note-8/50-High-contrast-4k-Wallpapers-perfect-for-the-Samsung-.png"));
        itemsList.add(new customItems("https://www.desktopbackground.org/download/1080x1920/2011/10/08/277882_technology-internet-business-circuit-computer-f-wallpapers_4920x3380_h.jpg"));
        itemsList.add(new customItems("https://cdn.hipwallpaper.com/i/39/3/JuDRSO.jpg"));
        itemsList.add(new customItems("https://coolwallpapers.me/picsup/2963734-minimalism-artwork-technology___abstract-wallpapers.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp4372393.jpg"));

        recyclerViewAdapter = new RecyclerViewAdapter(itemsList,this);
        binding.recyclerview.setAdapter(recyclerViewAdapter);

    }
}