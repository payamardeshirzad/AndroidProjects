package com.example.payam.scroll_imaging;

import android.graphics.drawable.Drawable;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnchangeimage(View view) {
        ImageView imview1 = (ImageView) findViewById(R.id.imageView2);
        int res = getResources().getIdentifier("image_10102", "drawable", getPackageName());
        imview1.setImageResource(res);
    }

    public void AssetsFolder(View view) {
        ImageView imview2 = (ImageView) findViewById(R.id.imageView2);

        try {
            InputStream stream = getAssets().open("image_10101.jpg");
            Drawable drawable = Drawable.createFromStream(stream,null);
            imview2.setImageDrawable(drawable);
        }catch (Exception e){

        }
    }
}
