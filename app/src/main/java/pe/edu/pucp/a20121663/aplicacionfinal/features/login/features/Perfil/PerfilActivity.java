package pe.edu.pucp.a20121663.aplicacionfinal.features.login.features.Perfil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import pe.edu.pucp.a20121663.aplicacionfinal.R;
import pe.edu.pucp.a20121663.aplicacionfinal.features.login.features.home.HomeActivity;
import pe.edu.pucp.a20121663.aplicacionfinal.features.login.features.login.LoginActivity;

public class PerfilActivity extends AppCompatActivity {

    public final static String PERFIL_EXTRA_FULLNAME ="PERFIL_EXTRA_FULLNAME";
    public final static String PERFIL_EXTRA_EMAIL="PERFIL_EXTRA_EMAIL";
    public final static String perfil_indicador = "perfil_indicador";
    private TextView mFullName;
    private TextView mEmail;
    private Button mReturn;
    String nombre;
    String correo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
        mFullName = findViewById(R.id.perfil_txt_fullname);
        mEmail = findViewById(R.id.perfil_txt_email);
        mReturn = findViewById(R.id.perfil_btn_volver);
        showUserDetails();
        initButtons();
    }

    private void initButtons() {
        mReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Volver(v);
            }
        });
    }

    private void showUserDetails()
    {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
    // Obtener los valores enviados por el Intent
            String fullName = extras.getString(HomeActivity.HOME_EXTRA_FULLNAME);
            String email = extras.getString(HomeActivity.HOME_EXTRA_EMAIL);
            nombre = fullName;
            correo = email;
    // Colocar los valores en el TextView
            mFullName.setText(nombre);
            mEmail.setText(correo);
        }
    }

    public void Volver(View v)
    {

        Intent intent = new Intent(this, HomeActivity.class);
        intent.putExtra(PERFIL_EXTRA_FULLNAME, nombre);
        intent.putExtra(PERFIL_EXTRA_EMAIL, correo);
        String indica = "perfil_indicador";
        intent.putExtra(perfil_indicador,indica);
        startActivity(intent);
        finish();
    }
}
