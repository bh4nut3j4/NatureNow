package now.nature.com.naturenow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    DBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        db=new DBHelper(this);
        final EditText etAge = (EditText) findViewById(R.id.etAge);
        final EditText etEmail = (EditText) findViewById(R.id.etEmail);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final EditText etName = (EditText) findViewById(R.id.etName);
        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final Button bRegister = (Button) findViewById(R.id.bRegister);

        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=etName.getText().toString();
                String username=etUsername.getText().toString();
                String password=etPassword.getText().toString();
                String age=etAge.getText().toString();
                String email=etEmail.getText().toString();

                if (!name.equals("")){

                    if(!username.equals("")){

                        if (!password.equals("")){

                            if(!age.equals("")){

                                if (!email.equals("")){

                                    boolean insert = db.insert_2_CREDENTIALS_TABLE(name,username,password,age,email);

                                    if (insert){
                                        Toast.makeText(getApplicationContext(),"Registered Successfully",Toast.LENGTH_SHORT).show();
                                        startActivity(new Intent(getApplicationContext(),LoginActivity.class));
                                        finish();
                                    }else {
                                        Toast.makeText(getApplicationContext(),"Unable to Register",Toast.LENGTH_SHORT).show();
                                        startActivity(new Intent(getApplicationContext(),LoginActivity.class));
                                        finish();
                                    }

                                }else{
                                    etEmail.setError("Required");
                                }

                            }else{
                                etAge.setError("Required");
                            }

                        }else{
                            etPassword.setError("Required");
                        }

                    }else{
                        etUsername.setError("Required");
                    }

                }else{
                    etName.setError("Required");
                }
            }
        });
    }
}