package cn.ximoon.bannerpager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Integer> images = new ArrayList<Integer>();
        images.add(R.mipmap.cat01);
        images.add(R.mipmap.cat02);
        images.add(R.mipmap.cat03);
        images.add(R.mipmap.cat04);
        images.add(R.mipmap.cat05);
        images.add(R.mipmap.cat06);
        images.add(R.mipmap.cat07);
        images.add(R.mipmap.cat08);
        images.add(R.mipmap.cat09);
        images.add(R.mipmap.cat10);
        BannerWithIndicatorView bannerView = (BannerWithIndicatorView) findViewById(R.id.banner);
        BannerAdapter bannerAdapter = new BannerAdapter(images);
        bannerView.setAdapter(bannerAdapter);
        bannerView.autoScrollPage(5000);
    }

    private class BannerAdapter<Integer> extends BannerPagerAdapter<Integer>{

        public BannerAdapter(List<Integer> datas) {
            super(datas);
        }

        @Override
        public View getItemView(ViewGroup container, int position) {
            ImageView imageView = new ImageView(MainActivity.this);
            imageView.setImageResource((java.lang.Integer) mDatas.get(position));
            return imageView;
        }

    }
}
