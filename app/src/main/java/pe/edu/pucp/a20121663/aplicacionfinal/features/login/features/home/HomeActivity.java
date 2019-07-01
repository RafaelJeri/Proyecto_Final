package pe.edu.pucp.a20121663.aplicacionfinal.features.login.features.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import pe.edu.pucp.a20121663.aplicacionfinal.R;
import pe.edu.pucp.a20121663.aplicacionfinal.features.login.features.login.LoginActivity;

public class HomeActivity extends AppCompatActivity {

        private Button mLogout;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_home);
            mLogout = findViewById(R.id.home_btn_logout);
            initButtons();
        }

    private void initButtons() {
        mLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logout(v);
            }
        });
    }

        public void logout(View v) {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            finish();
        }
    }

