package com.developerom.chatgloballllllly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;

import com.developerom.chatgloballllllly.databinding.ActivityTrendingBinding;

import java.util.ArrayList;
import java.util.List;

public class TrendingActivity extends AppCompatActivity {

    ActivityTrendingBinding binding;
    List<customItems> itemsList;
    RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTrendingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().setTitle("Trending");

        binding.recyclerview.setHasFixedSize(true);
        binding.recyclerview.setLayoutManager(new GridLayoutManager(this,3));
        itemsList = new ArrayList<>();

        itemsList.add(new customItems("https://hdqwalls.com/download/neon-marshmello-helmet-c2-1080x1920.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/27/5b/51/275b51faf0c827c8d0fc8553b8485b85.jpg"));
        itemsList.add(new customItems("https://wallpaper.dog/large/5526531.png"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/927488.jpg"));
        itemsList.add(new customItems("https://www.mwallpapers.com/download-image/39357/1080x1920"));
        itemsList.add(new customItems("https://www.mwallpapers.com/download-image/38915/1080x1920"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp4809226.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/19-195126_3d-wallpapers-for-iphone-8-plus.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/20/90/NJxHeu.jpg"));
        itemsList.add(new customItems("https://images.wondershare.com/recoverit/article/02/cool-wallpapers-for-android-phones-6.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/631866.jpg"));
        itemsList.add(new customItems("https://www.wallpapertip.com/wmimgs/1-15659_mobile-wallpaper-red-neon-3d-hd-neon-background.jpg"));
        itemsList.add(new customItems("https://www.mwallpapers.com/download-image/38824/1080x1920"));
        itemsList.add(new customItems("https://wallpapertag.com/wallpaper/full/1/3/a/137360-wallpaper-1080x1920-1080x1920-for-phones.jpg"));
        itemsList.add(new customItems("https://lh3.googleusercontent.com/proxy/hZc4vGBosDqQukujzTA6xcBrTjOey7Whkh7gAnanZwzYFQ_IviNF9BPQHSVE5Ob2RttP8kj8uPVrIf6cQsc5sNmfjNYVX-C4KUkx8IoRZq0"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/435727.jpg"));
        itemsList.add(new customItems("https://www.wallpapertip.com/wmimgs/158-1582688_guy-fawkes-mask-neon-neon-mask.jpg"));
        itemsList.add(new customItems("https://www.wallpapertip.com/wmimgs/0-4145_minimal-walls-for-pokemon-fans-circle.jpg"));
        itemsList.add(new customItems("https://www.setaswall.com/wp-content/uploads/2017/10/Boat-Port-Wallpaper-1080x1920.jpg"));
        itemsList.add(new customItems("https://images.hdqwalls.com/download/macbook-pro-apple-laptop-headphones-1080x1920.jpg"));
        itemsList.add(new customItems("https://www.99images.com/download-image/130641/1080x1920"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/92/11/d8/9211d8ced8f1fafa199fa626ceecdd01.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/27/62/a4/2762a47e14e7dd80c24672823030f784.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/49/70/2pfhOr.jpg"));
        itemsList.add(new customItems("https://lh3.googleusercontent.com/proxy/0C-x3L29_kJN6gz3qWG5rsKKOFs9mNRKOvfAscKpjpi6HuUrIYSvhH7IKnbImnyeki3Bo7OX-diILjsLGJ6OOgz4yalRSDFUfe8Qiq-tU_qCUHiPaUtwztKPN-TtT0NxU98sUgUc8oDZAJT2jQr0ZE6alM2K32tInfFFMLcU2ZbqEbNyLauBYMQo"));
        itemsList.add(new customItems("https://wearecovert.com/wp-content/uploads/2020/03/C19Virus_1080_1920_V6.jpg"));
        itemsList.add(new customItems("https://i.redd.it/zzz9bc5mtofx.png"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/66/69/BHa8Tx.jpg"));
        itemsList.add(new customItems("https://i2.wp.com/i.pinimg.com/originals/45/b9/57/45b95733845d05b5c431a5af0a8187f6.jpg"));
        itemsList.add(new customItems("https://www.99images.com/photos/wallpapers/3d-abstract/green-and-black-aestheticandroid-iphone-desktop-hd-backgrounds-wallpapers-1080p-4k-braju.jpg?v=1577902563"));
        itemsList.add(new customItems("https://i2.wp.com/i.pinimg.com/originals/ca/10/cd/ca10cd5f2ba0fe36cb6453276d4aa83d.jpg"));
        itemsList.add(new customItems("https://www.setaswall.com/wp-content/uploads/2017/10/Monolith-Terminal-14-Wallpaper-1080x1920.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/46/d0/c2/46d0c224783e68a1625b7de3e3a09d12.jpg"));
        itemsList.add(new customItems("https://i2.wp.com/i.pinimg.com/originals/26/9e/e3/269ee38dbc74c6ef6cfb1837d33ba84d.jpg"));
        itemsList.add(new customItems("https://img.wallpapersafari.com/phone/1080/1920/32/34/2Ro75v.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/2246921.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/51/fe/03/51fe03e4651efc5fa882d1651720e6b3.jpg"));
        itemsList.add(new customItems("https://www.wallpapertip.com/wmimgs/73-730498_wallpaper-social-media-logos-cosmos-data-src-social.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/be/97/8c/be978ca8913014064f7e51de53eea647.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/34/97/rfw7JR.jpg"));
        itemsList.add(new customItems("https://r1.ilikewallpaper.net/iphone-8-wallpapers/download/85584/Supreme-Cave-iphone-8-wallpaper-ilikewallpaper_com.jpg"));
        itemsList.add(new customItems("https://www.setaswall.com/wp-content/uploads/2017/12/Superhero-Wallpaper-22-1080x1920.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/94/44/ruEv9Q.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/24124.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/1397748.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/889721.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/889725.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/1d/69/d2/1d69d209a93786a74cc422bc4f0dc373.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/35/e9/dc/35e9dc1f0b21e0dd99e28e539589a34b.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/888690.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/80/2c/d5/802cd5b4dc0e026989872c43c4e11abd.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/15/67/synMlk.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/20/78/hkYojB.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/26182.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/50/5c/b0/505cb0994155a91551619912927766b1.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/1397732.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/26181.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/1121319.png"));
        itemsList.add(new customItems("https://images.wallpapersden.com/image/download/1917-movie_a2xlZW2UmZqaraWkpJRmZW1lrWZuZ2U.jpg"));
        itemsList.add(new customItems("https://cdn.hipwallpaper.com/i/27/90/o9l4qn.jpg"));
        itemsList.add(new customItems("https://i.redd.it/bo2hkxpojhg21.png"));
        itemsList.add(new customItems("https://i.redd.it/c3hugq17kln31.png"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/889708.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/157616.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/31/54/CKWZ40.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/935303.jpg"));
        itemsList.add(new customItems("https://wallpapertag.com/wallpaper/full/4/a/4/475318-funny-hd-wallpapers-1080p-1080x1920-laptop.jpg"));
        itemsList.add(new customItems("https://www.99images.com/photos/wallpapers/3d-abstract/aesthetic-sunandroid-iphone-desktop-hd-backgrounds-wallpapers-1080p-4k-zwtqv.jpg?v=1577318810"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/5d/73/3c/5d733c8b9b3855fd9034cd3e3a07eb85.jpg"));
        itemsList.add(new customItems("https://images.wallpapersden.com/image/download/huawei-4k-stock-abstract_a2toaGuUmZqaraWkpJRmZW1lrWZuZ2U.jpg"));
        itemsList.add(new customItems("https://r1.ilikewallpaper.net/iphone-8-wallpapers/download/91871/iphone-se-2020-stock-wallpaper-Silk-Red-Mono-Dark-iphone-8-wallpaper-ilikewallpaper_com.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/1334073.jpg"));
        itemsList.add(new customItems("https://images.wallpapersden.com/image/download/xbox-series-x-4k_bGVnbm2UmZqaraWkpJRmZW1lrWZuZ2U.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/157638.jpg"));
        itemsList.add(new customItems("https://www.setaswall.com/wp-content/uploads/2017/10/Cloud-Eclipse-Evening-Moon-Ut-Wallpaper-1080x1920.jpg"));
        itemsList.add(new customItems("https://images.wallpapersden.com/image/download/beach-retro-wave_a25ramWUmZqaraWkpJRmZW1lrWZuZ2U.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/8e/dd/33/8edd33bff3f0c190d8540684b1a67d1e.jpg"));
        itemsList.add(new customItems("https://i.imgur.com/6AjKnFD.jpg"));
        itemsList.add(new customItems("https://wallpaper.dog/large/10864741.jpg"));
        itemsList.add(new customItems("https://wallpaperset.com/w/full/f/7/e/434541.jpg"));
        itemsList.add(new customItems("https://wallpaperset.com/w/full/2/8/5/457052.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/07/9a/49/079a49549afa41711d359f7a513c760b.jpg"));
        itemsList.add(new customItems("https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/7de15807-3a01-41c7-ab6f-08ce52c8c7d9/d9zru2i-487e75e4-88a1-4d2e-93a2-bb0b1372ebe7.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOiIsImlzcyI6InVybjphcHA6Iiwib2JqIjpbW3sicGF0aCI6IlwvZlwvN2RlMTU4MDctM2EwMS00MWM3LWFiNmYtMDhjZTUyYzhjN2Q5XC9kOXpydTJpLTQ4N2U3NWU0LTg4YTEtNGQyZS05M2EyLWJiMGIxMzcyZWJlNy5wbmcifV1dLCJhdWQiOlsidXJuOnNlcnZpY2U6ZmlsZS5kb3dubG9hZCJdfQ.3Ei6xKkJPDc3nFNpRCbFmpStp_BsUeMVH9lo7Eh_MP4"));
        itemsList.add(new customItems("https://lh3.googleusercontent.com/proxy/D3WjoT50zbqQV86TSm2I1phJZ8gHC1BLCrcjvMzxGm3rS3mSzj3cEF7sLMC8C-6sO1_lEDSGRNXrwvEXSJSRRBIoCmFtqwpRZavG6Qux2uVvB0oobbKNv_YvsFOyL1z1QM2bATCN1Qy6kN_7QHJ1V-mLg1Cflw2sVUZuJqY"));
        itemsList.add(new customItems("https://www.wallpapertip.com/wmimgs/0-6941_android-wallpaper-hd-marshmello-with-high-resolution-android.jpg"));
        itemsList.add(new customItems("https://www.fonewalls.com/wp-content/uploads/Lock-Screen-Background-HD-Wallpaper-059.jpg"));
        itemsList.add(new customItems("https://www.setaswall.com/wp-content/uploads/2017/10/Alan-Walker-Logo-Qhd-Wallpaper-1080x1920.jpg"));
        itemsList.add(new customItems("https://www.wallpapertip.com/wmimgs/2-28877_cool-fond-decran-hd-samsung-wallpaper-16-check.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/ea/8b/ce/ea8bceeedc9f9d925c87c99c38e31a4b.jpg"));
        itemsList.add(new customItems("https://img.wallpapersafari.com/phone/1080/1920/1/82/asOfBp.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/64/d3/d1/64d3d10f326532b4b7202e6c8df83975.jpg"));
        itemsList.add(new customItems("https://www.setaswall.com/wp-content/uploads/2017/10/Arty-Drop-Wallpaper-1080x1920.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/a7/10/28/a710285b91c021bc254c922f1cdce72c.png"));
        itemsList.add(new customItems("https://img.wallpapersafari.com/phone/1080/1920/36/29/jA6Yyn.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/889707.jpg"));
        itemsList.add(new customItems("https://cdn.statically.io/img/lh3.googleusercontent.com/proxy/9cYPHl4U6hUgvGIE1iX9sGpB3ZrMXDg5JR_vdMWbVhP6PLX-S6zOCHw2iPBht_5OyuJ4t_-fIfff3n88mz1p-0Q-PRSQijFoQe2CfWkNultBkIaRHGQFJirLuhPLj-hLzZApJHT8oFWwYAMBkR1BRH2ldMc=s0-d"));
        itemsList.add(new customItems("https://androidwalls.net/wp-content/uploads/2015/08/Summer%20Holiday%20Fresh%20Breakfast%20Ocean%20View%20Android%20Wallpaper.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/da/4c/d6/da4cd696938b0fe1bda45c01077aa99b.jpg"));
        itemsList.add(new customItems("https://r1.ilikewallpaper.net/iphone-8-wallpapers/download/88001/Cool-Insides-By-Ifixit-Battery-Hd-iphone-8-wallpaper-ilikewallpaper_com.jpg"));
        itemsList.add(new customItems("https://www.setaswall.com/wp-content/uploads/2017/10/Abstract-Minimalism-Hd-Io-Wallpaper-1080x1920.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/35/e1/15/35e11515f41469f811e3cb228b2a9994.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp5280751.jpg"));
        itemsList.add(new customItems("https://manofmany.com/wp-content/uploads/2019/07/50-Minimalist-iPhone-Wallpapers-41.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp3000126.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/889728.jpg"));
        itemsList.add(new customItems("https://i1.wp.com/pixelstalk.net/wp-content/uploads/2016/08/Black-cat-officer-funny-iPhone-7-wallpaper-1080x1920.jpg"));
        itemsList.add(new customItems("https://r1.ilikewallpaper.net/iphone-se-wallpapers/download/93289/Next-step-to-the-paradise-iphone-se-wallpaper-ilikewallpaper_com.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/68/86/a7/6886a7e971155197285ca65a77893d0d.jpg"));
        itemsList.add(new customItems("https://images.wondershare.com/recoverit/article/02/cool-wallpapers-for-android-phones-11.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/2/25/x2bOZD.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/19/57/GWTxuF.jpg"));
        itemsList.add(new customItems("https://r1.ilikewallpaper.net/iphone-8-wallpapers/download/94491/Disney-iphone-8-wallpaper-ilikewallpaper_com.jpg"));
        itemsList.add(new customItems("http://getwallpapers.com/wallpaper/full/f/c/4/1158894-most-popular-retro-iphone-wallpapers-1080x1920-macbook.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/d8/2e/df/d82edfb7704251fb68ee596daf4690e7.jpg"));
        itemsList.add(new customItems("https://r1.ilikewallpaper.net/iphone-8-wallpapers/download/86089/Pin-by-Tina-on-Wallpapers-iphone-8-wallpaper-ilikewallpaper_com.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/b2/bc/25/b2bc25bc9e321652e872781ddb9daa4b.jpg"));
        itemsList.add(new customItems("https://r1.ilikewallpaper.net/iphone-8-wallpapers/download/87126/Stranger-Things-Top-Free-Stranger-Things-Wallpaper-iphone-8-wallpaper-ilikewallpaper_com.jpg"));
        itemsList.add(new customItems("https://images.wallpapersden.com/image/download/synthwave-4k_a2tnZ2mUmZqaraWkpJRmZW1lrWZuZ2U.jpg"));
        itemsList.add(new customItems("https://images.wallpapersden.com/image/download/java-programmer_a2xqaWqUmZqaraWkpJRmZW1lrWZuZ2U.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/12/3b/b4/123bb4e5e0a08e97de357040fc93b845.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/69/9f/b0/699fb0f204c73c66c86ed598570cc053.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/93/52/jQJdr0.png"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/145285.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/56/23/nQAy5q.jpg"));
        itemsList.add(new customItems("https://s2.best-wallpaper.net/wallpaper/iphone/1807/Pancakes-and-tea-food_iphone_1080x1920.jpg"));
        itemsList.add(new customItems("https://img.wallpapersafari.com/phone/1080/1920/97/64/OiCVTU.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/29/5f/51/295f5122267293d4ff7bcb92352c1a68.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/08/07/44/0807447a61960787dae7c06edb9509bc.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/50/7d/81/507d81c5fb380ddaf91a028f72a98f64.jpg"));
        itemsList.add(new customItems("https://images.wallpapersden.com/image/download/astronaut-lost-in-space_bGtua2eUmZqaraWkpJRmZW1lrWZuZ2U.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/ab/98/c2/ab98c225ee529852bcb24c48c9ccdcca.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/64/22/ul4zb2.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/e8/01/09/e8010975536535128a49385e7979ff7e.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/5b/63/e0/5b63e0661f83b8e2b8407647b14b65a6.jpg"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/18/96/s5oe0C.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/220557.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/24885.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/3d/0d/c6/3d0dc69e8a5d7eac77606ce0bb510ab2.jpg"));




        recyclerViewAdapter = new RecyclerViewAdapter(itemsList,this);
        binding.recyclerview.setAdapter(recyclerViewAdapter);

    }
}