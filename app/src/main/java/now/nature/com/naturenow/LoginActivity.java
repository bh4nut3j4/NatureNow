package now.nature.com.naturenow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import now.nature.com.naturenow.Home.Home;

public class LoginActivity extends AppCompatActivity {

DBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        db=new DBHelper(this);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final Button bLogin = (Button) findViewById(R.id.bLogin);
        final TextView registerLink = (TextView) findViewById(R.id.tvRegisterHere);



        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=etUsername.getText().toString();
                String pass =etPassword.getText().toString();
                String result = db.validate(username);

                if (result.equals(pass)){

                    Intent i = new Intent(getApplicationContext(),Home.class);
                    startActivity(i);
                    finish();

                }
                else {
                    etUsername.setText("");
                    etPassword.setText("");
                    Toast t=Toast.makeText(getApplicationContext(),"Username and Password Does'nt Match",Toast.LENGTH_SHORT);
                    t.show();
                }

            }
        });

        registerLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(registerIntent);
            }
        });
    }
}
