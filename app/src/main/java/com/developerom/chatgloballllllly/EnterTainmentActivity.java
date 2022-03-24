package com.developerom.chatgloballllllly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;

import com.developerom.chatgloballllllly.databinding.ActivityEnterTainmentBinding;

import java.util.ArrayList;
import java.util.List;

public class EnterTainmentActivity extends AppCompatActivity {

    ActivityEnterTainmentBinding binding;
    List<customItems> itemsList;
    RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEnterTainmentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().setTitle("Entertainment");
        binding.recyclerview.setHasFixedSize(true);
        binding.recyclerview.setLayoutManager(new GridLayoutManager(this,3));
        itemsList = new ArrayList<>();

        itemsList.add(new customItems("https://i.pinimg.com/originals/ce/c8/2d/cec82d5465d42ae136e627b67dbeb068.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/173-1734971_entertainment-walking-dead-iphone-6-plus-wallpapers-jarvis.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/75/0f/3e/750f3e2aaf5de7ab58431d5457f65658.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp2444514.jpg"));
        itemsList.add(new customItems("https://www.wallpapertip.com/wmimgs/39-390448_dj-wallpaper-iphone.png"));
        itemsList.add(new customItems("https://www.99images.com/photos/wallpapers/games/nintendo-iphoneandroid-iphone-desktop-hd-backgrounds-wallpapers-1080p-4k-7zgtk.jpg?v=1583423764"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/marquee_circus_entertainment_116192_1080x1920.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/d3/d2/b0/d3d2b0a9166a864d216ff3e359a36e6c.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/84/98/5b/84985b0367ab2420b05b325a818c0be5.jpg"));
        itemsList.add(new customItems("https://wallpaper.dog/large/20338332.jpg"));
        itemsList.add(new customItems("https://image.winudf.com/v2/image1/Y29tLmFwcC5jYXJ0b29uLmltZy52YWFhay5jYXJ0b29uX3NjcmVlbl8zXzE1ODgwMzA3MTJfMDU4/screen-3.jpg?fakeurl=1&type=.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp4849857.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/2c/f6/d2/2cf6d20155adeef97f47b98d7789fe22.jpg"));
        itemsList.add(new customItems("https://lh3.googleusercontent.com/proxy/55zaxowvSGWrIRvV_gGFbagivYstD1gvIrO8P_AxAvxeV0YN2WoPg85lJKzUgfTQ05nVZ7BViOb1vLARNkIHE8mDQB3brtB6c85rtM6Y08IjLKxSDB8sloBr3btJyVDmBqWA"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/ferris_wheel_entertainment_attractions_113515_1080x1920.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/dj_equipment_neon_161184_1080x1920.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp2641911.jpg"));
        itemsList.add(new customItems("https://coolwallpapers.me/picsup/6097266-marshmello-music-dj-hd-4k.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp4986307.jpg"));
        itemsList.add(new customItems("https://thewallpaper.co/wp-content/uploads/2020/08/captain-america-the-winter-soldier-android-wallpaper-shield-avangers-cartoon-1080x1920-1.jpg"));
        itemsList.add(new customItems("https://www.adultswim.com/misc/primal-backgrounds/media/BG13/BG13_iPhone6+_1080x1920.jpg"));
        itemsList.add(new customItems("https://wallpaper.dog/large/11017493.jpg"));
        itemsList.add(new customItems("https://wallpaper.dog/large/10768838.jpg"));
        itemsList.add(new customItems("https://manofmany.com/wp-content/uploads/2019/07/50-Minimalist-iPhone-Wallpapers-30.jpg"));
        itemsList.add(new customItems("https://cutewallpaper.org/21/wallpaper-fun/20+-Funny-iPhone-Wallpapers-for-iPhone-6s65s5.jpg"));
        itemsList.add(new customItems("https://lh3.googleusercontent.com/proxy/m2Ur7H5VfwEL3J1eDpVetfQeebdmb4_yC-w6gqdpCP_x-7ZCWL2ijt8uvmx6BcYF9EMiyX9xwdkaM5n9CmnQir2kfnESQgU"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/28/65/5WHC9Y.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/b7/66/a0/b766a03e841abccebb47dd3f4f71d13a.jpg"));
        itemsList.add(new customItems("https://i1.wp.com/wallpaperwolf.com/wallpapers/wallpapers-for-android/hd/download/mickey-mouse-0459.png"));
        itemsList.add(new customItems("https://amp.ikimaru.com/pic/2899753_full-cool-1080x1920-hd-band-wallpaper-66-hd-1080x1920-iphone-6-plus-wallpaper-free-download.jpg"));
        itemsList.add(new customItems("https://cdn.hipwallpaper.com/i/36/78/cEsOSI.jpg"));
        itemsList.add(new customItems("https://lh3.googleusercontent.com/proxy/_OC0f3zdShNxoq_ZwpLLXNFmTNLxSmtsqvCT-g1tKoaHSXahPbYJ8D7ROxeOnv2wNqoTMBMxpmAp5bS3gJ0CE32KgIElAkMxDqjBKhCEyFs"));
        itemsList.add(new customItems("https://lh3.googleusercontent.com/proxy/fpLt16mM_brEiV2CjiJ4cPta2n5kThBpSrxDnsfElDjaphMwa4Eojtt8zJI-MHBjQ30Yg5doWoa3slgasoXiZK5MW9eo9zVXgFerHfkILp2TdvIjd1hoPVZ3rjvttMnejS2HGt1CUFaPiGfiK2F32qMO1YLU17l90bzcSnS-kP7aXw"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/57/14/aNEcJM.png"));
        itemsList.add(new customItems("https://wallpaper.dog/large/5469795.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/d2/b3/eb/d2b3eb41cd64f2abf40ed30fb66d1842.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/3235703.jpg"));
        itemsList.add(new customItems("https://mocah.org/uploads/posts/273561-wallpaper-1080-1920.jpg"));
        itemsList.add(new customItems("https://wallpapershome.com/images/wallpapers/dj-marshmello-1080x1920-dj-neon-4k-19771.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/7b/00/a7/7b00a774ac20e7807523014e98c14e34.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/ferris_wheel_city_entertainment_110597_1080x1920.jpg"));
        itemsList.add(new customItems("https://www.setaswall.com/wp-content/uploads/2017/10/Airplane-Moon-Minimalism-Wallpaper-1080x1920.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/f1/33/94/f13394ae20f6e542c56aa04fc00eedf3.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/dj_installation_equipment_163924_1080x1920.jpg"));
        itemsList.add(new customItems("https://amp.ikimaru.com/pic/2899779_full-cool-1080x1920-hd-band-wallpaper-daft-punk-iphone-wallpaper-hd-pixelstalk-net.png"));
        itemsList.add(new customItems("https://cdn.hipwallpaper.com/i/75/92/OrxzIG.jpg"));
        itemsList.add(new customItems("https://images.hdqwalls.com/download/world-of-warcraft-disc-wallpaper-1080x1920.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/a3/d1/79/a3d179d7d7300da45afb0a3f20812de7.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/157619.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/157634.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/84/52/ec/8452ecae2e73335eab65902cad1f9d39.jpg"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/dj_music_disco_160929_1080x1920.jpg"));
        itemsList.add(new customItems("https://lh3.googleusercontent.com/proxy/-hPLA0JfbQcwmAvwnZETZHKSRcPd0Pitze_uELG5Lz0Z11CtE7aF1MJKflCohwZgkINoRE5jkmdhRWz_KAwIla6TOW5IGweKh3zWW6dHHYrAOel-gHjyYO7_Mn358YTeiRr6qbuutCzmE234"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/74/68/q7NZa2.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp4186944.jpg"));
        itemsList.add(new customItems("https://lh3.googleusercontent.com/proxy/3JdKVD0tOdJWMlrPzPDbyxEydNVr-KWVXv0PEZsm3bnXobQaLTX3wLu-zFyh3hY0rL7LHdLDs7jAxkYZGQUQnHDU5CAXMDz-ikIzid_n4hcFQOSaFjP6xQNSM_GDqiu9peKl0QAyFdg_4dQhSOT1rRuN"));
        itemsList.add(new customItems("https://www.enwallpaper.com/wp-content/uploads/f9c2d616f1c413e5dfdb6f494afb4b91.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/2137624.jpg"));
        itemsList.add(new customItems("https://i2.wp.com/zeeoii.com/wp-content/uploads/2020/08/Mobile-Full-HD-AMOLED-Wallpaper-1080X1920-61.jpg?fit=1080%2C1920&ssl=1"));
        itemsList.add(new customItems("https://1.bp.blogspot.com/--sGIYNZ8vaY/YAwXkeah1XI/AAAAAAAAQSQ/_XfUonnUPM8lSKIioACTXo6bJW1epEVgwCLcBGAsYHQ/d/HD-Joker-Wallpapers-For-iPhone-37.jpg"));
        itemsList.add(new customItems("https://s2.best-wallpaper.net/wallpaper/iphone/1708/Entertainment-lighting-night-beautiful-lights_iphone_1080x1920.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/c3/dc/d9/c3dcd9804e19a6ed296548a2796a140d.jpg"));
        itemsList.add(new customItems("https://wallpaper.dog/large/20463769.jpg"));
        itemsList.add(new customItems("https://cutewallpaper.org/21/overwatch-wallpaper-iphone/Genji-Wallpapers-Hd-Overwatch-Genji-Overwatch-Wallpaper-.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/bd/8e/d3/bd8ed38ed574eaefc8185a708a08556f.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/187777.jpg"));
        itemsList.add(new customItems("https://www.wallpapertip.com/wmimgs/69-696414_ultra-hd-michael-jackson-hd.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/13/4b/31/134b31ed83d90ab41c911120da81e30b.jpg"));
        itemsList.add(new customItems("data:image/jpeg;base64,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"));
        itemsList.add(new customItems("https://images.wallpaperscraft.com/image/ferris_wheel_attraction_entertainment_116739_1080x1920.jpg"));
        itemsList.add(new customItems("https://www.nvidia.com/content/dam/en-zz/Solutions/geforce/ampere/wallpapers/rtx-3090/3090-wallpaper-1080x1920-r1.png"));
        itemsList.add(new customItems("https://cdn.wallpapersafari.com/3/69/cbuVaj.jpg"));
        itemsList.add(new customItems("https://www.lefthudson.com/wp-content/uploads/2019/11/bat-signal-wallpaper-unique-wallpaper-wednesday-ics-sammobile-sammobile-this-year-of-bat-signal-wallpaper.jpg"));
        itemsList.add(new customItems("https://1.bp.blogspot.com/-8S4uaLBnFh0/YAwXp_t-ckI/AAAAAAAAQS0/OlttRfemYhoXUBJeLByL1Wcy3DIFrSFKwCLcBGAsYHQ/d/Joker-Wallpaper-HD-Download-For-Android-Mobile-24.jpg"));
        itemsList.add(new customItems("https://wallpapertag.com/wallpaper/full/8/f/e/1004097-top-corey-taylor-2018-wallpaper-1080x1920.jpg"));
        itemsList.add(new customItems("https://coolwallpapers.me/picsup/6115978-playstation-old-computer.jpg"));
        itemsList.add(new customItems("https://www.nba.com/lakers/sites/lakers/files/1920_lal_mktg_ww082819_01_al.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp2768127.jpg"));
        itemsList.add(new customItems("https://wallpaper.dog/large/10949003.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/889749.jpg"));
        itemsList.add(new customItems("https://lh3.googleusercontent.com/proxy/ksB7AfN_0j-LkRjO-q0mSiLDqpOTTGbQ4GfTG7lA5o4343JuOaIaD0EySOkC2gmxOgAptpapvkmtqQwzmDIXgHSkL7Io2Z1aDv7r3FJT7j1xI5Fm2rkqIo4wTwkTawBIZKxjkImWndcx=s0-d"));
        itemsList.add(new customItems("https://lh3.googleusercontent.com/proxy/nozWnmoFCT37z_16d-Op0owI8mqzPwKi5LGWumuHNrlNxKiGAz0cdNXyt0LBoOok8XffFWgh2MFyWEZQh6Yh-koDvFVQ33HmC7E"));
        itemsList.add(new customItems("https://wallpaper.dog/large/10871450.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/1333439.jpg"));
        itemsList.add(new customItems("https://wallpaper.dog/large/10919768.jpg"));
        itemsList.add(new customItems("https://wallpaperset.com/w/full/f/e/3/543539.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/8e/2a/61/8e2a613623280a824c1fc94b7ca259b4.jpg"));
        itemsList.add(new customItems("https://cdn.hipwallpaper.com/i/18/66/2KCLjB.jpg"));
        itemsList.add(new customItems("https://www.itl.cat/pngfile/big/56-563437_1080-x-1920-wallpaper-hd-backgrounds-1080-x.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/844497.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/2432559.jpg"));
        itemsList.add(new customItems("https://www.setaswall.com/wp-content/uploads/2017/10/Ahsoka-Tano-Vs-Darth-Vader-Image-Wallpaper-1080x1920.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/08/1d/bd/081dbd55d844862a02117e07da730b38.jpg"));
        itemsList.add(new customItems("https://images.wallpapersden.com/image/download/h1z1-online-game-sony-online-entertainment_ZmdpZmeUmZqaraWkpJRmZW1lrWZuZ2U.jpg"));
        itemsList.add(new customItems("https://4kwallpaper.wiki/wp-content/uploads/2019/07/371428.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp3121100.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/1333456.jpg"));
        itemsList.add(new customItems("https://wallpapercave.com/wp/wp5633836.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/231-2312367_hd-stargate-sg1-mobile-phone-wallpaper-iphone-x.jpg"));
        itemsList.add(new customItems("https://c.wallhere.com/photos/fc/ef/YHKT_ENTERTAINMENT_INCARNATION-1950243.jpg!d"));
        itemsList.add(new customItems("https://www.mwallpapers.com/photos/celebrities/movies/poppy-in-trolls-world-tour-free-4k-ultra-hd-mobile-wallpaper-android-iphone-hd-wallpaper-background-downloadhd-wallpapers-desktop-background-android-iphone-1080p-4k-fq4gq.jpg?v=1615740617"));
        itemsList.add(new customItems("https://cutewallpaper.org/21/chhota-bheem-wallpapers/Chota-Bheem-Hd-Wallpaper-Happy-Holi-Chota-Bheem-Free-.jpg"));
        itemsList.add(new customItems("https://wallpaperaccess.com/full/4815347.jpg"));
        itemsList.add(new customItems("https://www.teahub.io/photos/full/242-2423567_tom-and-jerry-s7-edge-wallpaper-tom-and.jpg"));
        itemsList.add(new customItems("https://wallpaperboat.com/wp-content/uploads/2019/05/tom-and-jerry-6.jpg"));
        itemsList.add(new customItems("https://images.hdqwalls.com/download/tom-and-jerry-2021-1y-1080x1920.jpg"));
        itemsList.add(new customItems("http://artnames.info/wp-content/image/O/oskar1.jpg"));
        itemsList.add(new customItems("http://artnames.info/wp-content/image/O/oskar1.jpg"));
        itemsList.add(new customItems("https://coolwallpapers.me/picsup/6085094-santa-monica-pier-ferris-wheel-world-photography-hd-4k-5k.jpg"));
        itemsList.add(new customItems("https://www.pixelstalk.net/wp-content/uploads/2016/10/Arctic-Monkeys-HD-Wallpaper-for-Mobile.jpg"));
        itemsList.add(new customItems("https://coolwallpapers.me/picsup/6084359-the-capital-wheel-ferris-wheel-photography-hd-4k.jpg"));
        itemsList.add(new customItems("https://www.nawpic.com/media/2020/nawpic-81.jpg"));
        itemsList.add(new customItems("https://zeeoii.com/wp-content/uploads/2020/08/Mobile-Full-HD-AMOLED-Wallpaper-1080X1920-45.jpg"));
        itemsList.add(new customItems("https://lh3.googleusercontent.com/proxy/rb3pKQIDodF9BK1Me1cFzgw177yJ5sIBa8NkcbIJHcyM7j35TSJHQj2KuRz3TVJI3Hn6VVpbXEoT4mX5Yzn-PjyJUVI-1Y365CLSnkZ9KVcSZuIqT55lXXuN08Hi9H3seM8iDFawGolaK-Wy4Q"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/b5/04/f1/b504f17cfc1b44bba5aaeb056a725358.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/a5/33/3c/a5333cb24e9d176c111e9ebd179f9e0e.jpg"));
        itemsList.add(new customItems("https://i.pinimg.com/originals/b9/3e/7f/b93e7f5baed2808454fb6793b58e7ad6.jpg"));
        itemsList.add(new customItems("https://s2.best-wallpaper.net/wallpaper/iphone/1809/Clown-colorful-clothes-makeup_iphone_1080x1920.jpg"));
        itemsList.add(new customItems("https://i2.wp.com/tokkoro.com/picsup/6098805-anime-artwork-hd-4k.jpg"));
        itemsList.add(new customItems("https://wallpaper.dog/large/8382.jpg"));
        itemsList.add(new customItems("https://64.media.tumblr.com/d5349e1f2c5dacbb8aacad7b2de50ae7/27f5fc81f57ee616-47/s1280x1920/19bae707d922ee7631dfe45d5ececec75f9dce78.jpg"));
        itemsList.add(new customItems("https://wallpaper.dog/large/994893.jpg"));
        itemsList.add(new customItems("https://img.wallpapersafari.com/phone/1080/1920/13/47/UN7EJI.jpg"));



        recyclerViewAdapter = new RecyclerViewAdapter(itemsList,this);
        binding.recyclerview.setAdapter(recyclerViewAdapter);

    }
}