package now.nature.com.naturenow.Home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import now.nature.com.naturenow.R;

/**
 * Created by root on 11/20/16.
 */

public class Home2 extends AppCompatActivity {
    TextView data;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home2);
        data= (TextView) findViewById(R.id.data);
        Bundle bundle = getIntent().getExtras();
        int d =bundle.getInt("i1");
        switch (d){

            case 1: data.setText(R.string.asoka_data);
                    break;
            case 2: data.setText(R.string.coconut_data);
                break;
            case 3: data.setText(R.string.neem_data);
                break;
            case 4: data.setText(R.string.tulasi_data);
                break;

        }

    }
}
