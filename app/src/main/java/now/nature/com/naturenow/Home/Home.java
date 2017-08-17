package now.nature.com.naturenow.Home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import now.nature.com.naturenow.R;

/**
 * Created by root on 11/20/16.
 */

public class Home extends AppCompatActivity {
    Context ctx;
    ImageView i1,i2,i3,i4,i5;
    ProgressBar p1,p2,p3,p4,p5;
    TextView t1,t11,t2,t22,t3,t33,t4,t44,t5,t55;
    CardView c1,c2,c3,c4,c5;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_lay);
        i1= (ImageView) findViewById(R.id.img_1);
        i2= (ImageView) findViewById(R.id.img_2);
        i3= (ImageView) findViewById(R.id.img_3);
        i4= (ImageView) findViewById(R.id.img_4);

        c1= (CardView) findViewById(R.id.cd1);
        c2= (CardView) findViewById(R.id.cd2);
        c3= (CardView) findViewById(R.id.cd3);
        c4= (CardView) findViewById(R.id.cd4);

        Glide.with(getApplicationContext()).load(R.drawable.ashoka).error(android.R.drawable.ic_dialog_alert).into(i1);
        Glide.with(getApplicationContext()).load(R.drawable.coconut).error(android.R.drawable.ic_dialog_alert).into(i2);
        Glide.with(getApplicationContext()).load(R.drawable.neem).error(android.R.drawable.ic_dialog_alert).into(i3);
        Glide.with(getApplicationContext()).load(R.drawable.tulasi).error(android.R.drawable.ic_dialog_alert).into(i4);

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(getApplicationContext(),Home_Img.class);
                i1.putExtra("i1",1);
                startActivity(i1);
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(getApplicationContext(),Home_Img.class);
                i1.putExtra("i1",2);
                startActivity(i1);

            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(getApplicationContext(),Home_Img.class);
                i1.putExtra("i1",3);
                startActivity(i1);
            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(getApplicationContext(),Home_Img.class);
                i1.putExtra("i1",4);
                startActivity(i1);
            }
        });



        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(getApplicationContext(),Home2.class);
                i1.putExtra("i1",1);
                startActivity(i1);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(getApplicationContext(),Home2.class);
                i1.putExtra("i1",2);
                startActivity(i1);

            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(getApplicationContext(),Home2.class);
                i1.putExtra("i1",3);
                startActivity(i1);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(getApplicationContext(),Home2.class);
                i1.putExtra("i1",4);
                startActivity(i1);
            }
        });







    }
}
