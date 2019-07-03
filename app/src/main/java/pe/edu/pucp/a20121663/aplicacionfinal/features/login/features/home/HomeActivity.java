package pe.edu.pucp.a20121663.aplicacionfinal.features.login.features.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import pe.edu.pucp.a20121663.aplicacionfinal.R;
import pe.edu.pucp.a20121663.aplicacionfinal.features.login.features.Perfil.PerfilActivity;
import pe.edu.pucp.a20121663.aplicacionfinal.features.login.features.login.LoginActivity;
import pe.edu.pucp.a20121663.aplicacionfinal.features.login.utils.Utilities;

public class HomeActivity extends AppCompatActivity
{
    public final static String HOME_EXTRA_FULLNAME ="HOME_EXTRA_FULLNAME";
    public final static String HOME_EXTRA_EMAIL="HOME_EXTRA_EMAIL";
    String fullName = "" ;
    String email ="";

        private Button mLogout;
        private Button mPerfil;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_home);
            mLogout = findViewById(R.id.home_btn_logout);
            mPerfil = findViewById(R.id.home_btn_miPerfil);
            initButtons();
        }

    private void initButtons() {
        mLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logout(v);
            }
        });
        mPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verPerfil(v);
            }
        });
    }

        public void logout(View v) {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            finish();
        }
        public void verPerfil(View v)
        {
            Intent intent = new Intent(this, PerfilActivity.class);
            Bundle extras = getIntent().getExtras();



            if (extras != null )
            {
                // Obtener los valores enviados por el Intent


                //String indica =extras.getString(PerfilActivity.perfil_indicador);
                if(extras.getString(PerfilActivity.PERFIL_EXTRA_FULLNAME)!= null)
                {
                    Utilities.showMessage(this,"entro extra perfil");
                    fullName = extras.getString(PerfilActivity.PERFIL_EXTRA_FULLNAME);
                    email = extras.getString(PerfilActivity.PERFIL_EXTRA_EMAIL);
                }
                else
                {
                    Utilities.showMessage(this,"entro extra login");
                    fullName = extras.getString(LoginActivity.LOGIN_EXTRA_FULLNAME);
                    email = extras.getString(LoginActivity.LOGIN_EXTRA_EMAIL);
                }
                intent.putExtra(HOME_EXTRA_FULLNAME, fullName);
                intent.putExtra(HOME_EXTRA_EMAIL, email);
                startActivity(intent);
                finish();
            }
            else if (fullName == "" || email =="")
            {
                Utilities.showMessage(this,"error");
            }
            else
            {
                Utilities.showMessage(this,"entro");
                intent.putExtra(HOME_EXTRA_FULLNAME, fullName);
                intent.putExtra(HOME_EXTRA_EMAIL, email);
                startActivity(intent);
                finish();
            }

        }
    }

