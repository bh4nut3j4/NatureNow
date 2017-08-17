package now.nature.com.naturenow.Home;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import now.nature.com.naturenow.Libs.ZoomableImageView;
import now.nature.com.naturenow.R;

/**
 * Created by root on 11/20/16.
 */

public class Home_Img extends AppCompatActivity {
    Context ctx;
    ZoomableImageView img;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_img);
        img= (ZoomableImageView) findViewById(R.id.img);
        Bundle bundle = getIntent().getExtras();
        int d =bundle.getInt("i1");
        switch (d){

            case 1:
                Glide.with(this).load(R.drawable.ashoka).error(android.R.drawable.ic_dialog_alert).into(img);
                break;
            case 2: Glide.with(this).load(R.drawable.coconut).error(android.R.drawable.ic_dialog_alert).into(img);
                break;
            case 3: Glide.with(this).load(R.drawable.neem).error(android.R.drawable.ic_dialog_alert).into(img);
                break;
            case 4: Glide.with(this).load(R.drawable.tulasi).error(android.R.drawable.ic_dialog_alert).into(img);
                break;

        }

    }
}
