package com.developerom.chatgloballllllly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;

import com.developerom.chatgloballllllly.databinding.ActivityCarBinding;

import java.util.ArrayList;
import java.util.List;

public class CarActivity extends AppCompatActivity {

    ActivityCarBinding binding;
    List<customItems> itemsList;
    RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().setTitle("Car");
        binding.recyclerview.setHasFixedSize(true);
        binding.recyclerview.setLayoutManager(new GridLayoutManager(this,3));
        itemsList = new ArrayList<>();

        itemsList.add(new customItems("https://wallpapercave.com/wp/wp4185798.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp4185804.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp4185800.jpg"));
        itemsList.add(new customItems("https://sguru.org/wp-content/uploads/2017/09/Car-Wallpaper-android-car-wallpaper-1080x1920-Chevrolet-Camaro-RS-yellow-car.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp4185842.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp4185839.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp4185820.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/08/d0/de/08d0deb5c4465004aa14fd427c323967.jpg"));
        itemsList.add(new customItems("https://wallpaper.dog/large/10948434.jpg"));
        itemsList.add(new customItems("https://cdn.statically.io/img/lh4.googleusercontent.com/proxy/-sW-Dic7SYOFZWMJKn1mwbWLKVA30Di8FGqGBIyJpsrzyo82fcrp-8GRB_gyQh1QQmvD9H0hOeOQizPlVxb1ll983D0mnx4wry-5Xfp_SfC_caAKSivHLxkMppofkYsAVeU2kDlG1mzyPlpFHM430guXqB520JGXrVJJMklhOudJ=s0-d"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/43/53/94/435394cfbdfe7f7912ca47994eaf0068.jpg"));
        itemsList.add(new customItems("https://i1.wp.com/pixelstalk.net/wp-content/uploads/2016/06/Black-Lamborghini-1080-x-1920-Wallpaper-For-Phone.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp3486784.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp3486785.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wc1735610.jpg"));
        itemsList.add(new customItems("https://www.tomswallpapers.com/pic/201503/1080x1920/tomswallpapers.com-24315.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp5873057.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/75/e7/60/75e760fa31e19ca965078cf0646f819e.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/17/44/4b/17444b0f3373adefe52c0ba440737cdd.jpg"));
        itemsList.add(new customItems("https://coolwallpapers.me/picsup/6080236-toyota-land-cruiser-cars-4k-hd-2019-cars.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcThVbO5dd71At3-UW8S19pG-cw7sVAw49Altg&usqp=CAU"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcThVbO5dd71At3-UW8S19pG-cw7sVAw49Altg&usqp=CAU"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp4185802.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/46/6c/7d/466c7d5e9e3dc0972f1b54d018aac7f7.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQDNZmXYHzAs_6bpxbQAYp4tZ8UQRVcqRYWvQ&usqp=CAU"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSGVdQiz8MtLWq2qk2tPCFvhaNsU7ZVJzPYRg&usqp=CAU"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTUd4Oj6_KjKx_OuDF1fhZmpMECLBNjebCEoQ&usqp=CAU"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp4863329.jpg"));
        itemsList.add(new customItems("https://coolwallpapers.me/picsup/6078471-forza-horizon-4-forza-2019-games-hd-cars-4k-porsche-911-porsche.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQLbOiFdypXRhwoRwGlCJ_KkDLn91pehTOW4g&usqp=CAU"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/cb/d8/30/cbd8306b8c434a4a694064242e017a02.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR17LJAci4ZtDyWTsoqzHE8T2v3-1f873qL_g&usqp=CAU"));
        itemsList.add(new customItems("https://goldwallpapers.com/uploads/posts/iphone-wallpaper-hd-sports/iphone_wallpaper_hd_sports_027.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSP214bwM6LbCC6TegO5uycphpI73s-qjl0cw&usqp=CAU"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp2590956.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/e3/c0/69/e3c0696dd43c6935fdac53e2ab0e3e12.jpg"));
        itemsList.add(new customItems("https://images.hdqwalls.com/download/mclaren-720s-project-cars-2-ir-1080x1920.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/02/15/7b/02157b2408beee105d466494d2e69a69.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS35sFToLft-IMw5H52aOKZ_7sY3fUr8M75XA&usqp=CAU"));
        itemsList.add(new customItems("https://a-static.besthdwallpaper.com/tesla-car-wallpaper-1080x1920-6348_165.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRjB-WYU212C2lB9JhbX6DRXtjhx6EHxNW9HQ&usqp=CAU"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTa3kdnSDGPc2-uvsXfh6r3xSPfBM-8Nw4jSQ&usqp=CAU"));
        itemsList.add(new customItems("https://images.hdqwalls.com/download/lo-fi-retro-car-5k-il-1080x1920.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/fd/f6/30/fdf630e4ad22ee1d4eae8b714708e140.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT5RKm_M-uOjXykMrdjl8JiP-M1QIkfEtd3Rg&usqp=CAU"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp3902285.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp4185812.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp4185854.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp4185853.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp4185843.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQG77nQ-VmJp6uhlCVdfcGJ6hkuxMptjuFvPQ&usqp=CAU"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQwySYr05E-qEM4Y9ibfcDUMt4-U9sSZxsP_vhA9vD7pBHlGblGUgUKXBYvZC3fGGnvFlM&usqp=CAU"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTSLWk_qr-q1RSygm1XehSgcPxmqp1FT2SnZw&usqp=CAU"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp4185838.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp4185817.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp4185835.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp4185846.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp2815523.jpg"));
        itemsList.add(new customItems("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRgobKX8BWPcMF0-jH_HHxCc0Rzk0xO1BZnLw&usqp=CAU"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp4185818.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/857325.jpg"));
        itemsList.add(new customItems("https://coolwallpapers.me/picsup/6104158-mercedes-mercedes-benz-amg-2018-cars.jpg"));
        itemsList.add(new customItems("https://cdn.statically.io/img/wallpaperaccess.com/full/787604.jpg"));
        itemsList.add(new customItems("https://lh3.googleusercontent.com/proxy/VJo1bOmL2d-qi_IXoW_rDT3jNt-rsqJsv0K-wMBAeGrPZO3qFsvbfURofX6F5QohyMewzaUkoijYcmDcRCSXCaYPrkS6p0_7RVA"));
        itemsList.add(new customItems("https://s2.best-wallpaper.net/wallpaper/iphone/1608/Mercedes-Benz-AMG-C63-blue-coupe-speed_iphone_1080x1920.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/20/21/aHEy7T.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp5027235.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp4904792.jpg"));
        itemsList.add(new customItems("https://www.setaswall.com/wp-content/uploads/2017/10/Rolls-Royce-Sweptail-1g-Wallpaper-1080x1920.jpg"));
        itemsList.add(new customItems("https://images.wallpapersden.com/image/download/rolls-royce-wraith_bGdlZ22UmZqaraWkpJRmZW1lrWZuZ2U.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/117-1174327_bmw-m4r-wallpaper-phone-bmw-m4-black-wallpaper.jpg"));
        itemsList.add(new customItems("https://www.mwallpapers.com/photos/wallpapers/cars-bikes/bmw-logo-hd-android-iphone-desktop-hd-backgrounds-wallpapers-1080p-4khd-wallpapers-desktop-background-android-iphone-1080p-4k-fhwgk.jpg?v=1613338337"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/a3/db/77/a3db77d48ac7c53f64dcbb2bdc4936cf.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/bmw_m3_bmw_car_195895_1080x1920.jpg"));
        itemsList.add(new customItems("https://www.setaswall.com/wp-content/uploads/2017/10/Mclaren-570s-2018-Ua-Wallpaper-1080x1920.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/0f/c8/13/0fc81348425e3c28b82eae26b6a1643c.jpg"));
        itemsList.add(new customItems("https://mfiles.alphacoders.com/744/744356.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp7278715.jpg"));
        itemsList.add(new customItems("https://images.hdqwalls.com/download/cadillac-ct6-v-sport-2019-pt-1080x1920.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/68/0f/69/680f69f335b210243186aa300d5bbc10.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/e5/ed/3a/e5ed3a27aa007e3a4e1328810f573011.jpg"));
        itemsList.add(new customItems("https://wallpapershome.com/images/wallpapers/lexus-lc-500-1080x1920-detroit-auto-show-2016-interior-8665.jpeg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/34/d1/3b/34d13bdf6c830bf92c74f27b69fbbb22.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/1288111.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp3387403.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp3387412.jpg"));
        itemsList.add(new customItems("https://coolwallpapers.me/picsup/6101276-mini-cooper-cars-custom-tuned-4k-hd-modified.jpg"));
        itemsList.add(new customItems("https://uhdwallpapers.org/uploads/converted/18/01/19/lamborghini-aventador-1080x1920_644-mm-90.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp5045945.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/b2/2b/ab/b22bab7d9cf5dd44b103de885c479c09.jpg"));
        itemsList.add(new customItems("https://images.hdqwalls.com/download/ford-mustang-gt-4k-2020-aq-1080x1920.jpg"));
        itemsList.add(new customItems("https://mfiles.alphacoders.com/743/743024.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/65/34/vtOJVQ.jpg"));
        itemsList.add(new customItems("https://static.carthrottle.com/workspace/uploads/posts/2015/10/f7c40319-4999-4388-975a-18d7e19d96c0.jpg"));
        itemsList.add(new customItems("https://cdn.statically.io/img/wallpaperplay.com/walls/full/1/7/5/161350.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/27/28/6f/27286f98718ea7382c430685162b3916.jpg"));
        itemsList.add(new customItems("https://images.hdqwalls.com/download/jeep-compass-night-eagle-2017-1m-1080x1920.jpg"));
        itemsList.add(new customItems("https://f.vividscreen.info/soft/aef027cdff11fe065ce87041241cc8a1/Toyota-Land-Cruiser-200-1080x1920.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/71/7d/3b/717d3b2e9f70893477d9c73ccfe93043.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp4185823.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp4185832.jpg"));
        itemsList.add(new customItems("https://traxzee.com/wp-content/uploads/2020/08/Traxzee.Com-001-Minimal-HD-1080X1920-Wallpapers.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp4185807.jpg"));
        itemsList.add(new customItems("https://www.pixelstalk.net/wp-content/uploads/2016/10/Car-Wallpapers-For-Android.jpg"));
        itemsList.add(new customItems("https://wallpaper.dog/large/17090380.jpg"));
        itemsList.add(new customItems("https://www.wallpapertip.com/wmimgs/3-34780_car-wallpaper-hd-1080p-free-download-for-mobile.jpg"));
        itemsList.add(new customItems("https://wallpaper.dog/large/10798755.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/auto_front_view_blue_sports_car_118325_1080x1920.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp4185815.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/269-2698268_1080x1920-bmw-car-photo-illustration-art-iphone-8.jpg"));
        itemsList.add(new customItems("https://www.desktopbackground.org/download/o/2011/04/04/182876_1080x1920-car-wallpapers-hd_1080x1920_h.jpg"));
        itemsList.add(new customItems("https://images.hdqwalls.com/download/white-muscle-car-wallpaper-1080x1920.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/490745.jpg"));
        itemsList.add(new customItems("https://i1.wp.com/traxzee.com/wp-content/uploads/2021/03/TRAXZEE.COM-Car-Wallpapers-194-1080X1920.jpg?fit=1080%2C1920&ssl=1"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/35-353951_auto-car-road-scene-android-wallpaper-cars-hd.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/car_sportscar_supercar_154117_1080x1920.jpg"));
        itemsList.add(new customItems("http://getwallpapers.com/wallpaper/full/1/8/c/1017414-download-american-muscle-car-wallpaper-1080x1920-phone.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/0c/fc/bd/0cfcbd6a086d5e0a173476b21eef0be8.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp4185805.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/8c/ae/1b/8cae1b31f794ae9108a72a203c46707f.jpg"));
        itemsList.add(new customItems("https://cdn.statically.io/img/www.wallpapermaiden.com/wallpaper/16460/download/1080x1920/lamborghini-huracan-yellow-supercar-side-view-cars.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp4185852.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/dodge_charger_daytona_dodge_green_122537_1080x1920.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp4185848.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/porsche_996_carrera_porsche_red_122578_1080x1920.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp4185855.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/e6/5b/0e/e65b0e6d41bb71647f533445f0cd232b.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/06/94/83/069483cb96a7143bf355439ae6bc7429.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/drops_glass_bw_128148_1080x1920.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/41/95/K9LVm4.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp8178404.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/street_road_cars_144984_1080x1920.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/f5/ef/ca/f5efcac2cef1ad9ded896d49abf5be20.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp8023239.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/299603.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/3e/0e/6d/3e0e6d9eb0ff2dc0089fb2b447ad614a.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/10/60/LV9KUw.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/10/60/LV9KUw.jpg"));
        itemsList.add(new customItems("https://www.wallpapertip.com/wmimgs/74-745745_aston-martin-htc-hd-wallpaper-aston-martin-db11.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/273-2735178_aston-martin-wallpaper-iphone.jpg"));
        itemsList.add(new customItems("https://images.hdqwalls.com/download/aston-martin-vantage-2018-og-1080x1920.jpg"));


        recyclerViewAdapter = new RecyclerViewAdapter(itemsList,this);
        binding.recyclerview.setAdapter(recyclerViewAdapter);

    }
}