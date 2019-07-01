package pe.edu.pucp.a20121663.aplicacionfinal.features.login.features.ver_detalle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import pe.edu.pucp.a20121663.aplicacionfinal.R;
import pe.edu.pucp.a20121663.aplicacionfinal.features.login.features.login.ILoginPresenter;

public class ver_detalleActivity extends AppCompatActivity {

    private final static String TAG = "MFL_LOGIN_VIEW";
    public final static String LOGIN_EXTRA_FULLNAME = "LOGIN_EXTRA_FULLNAME";
    public final static String LOGIN_EXTRA_EMAIL = "LOGIN_EXTRA_EMAIL";

    private EditText txtsolicitud;
    private EditText txtactivo;
    private EditText txtlugar;
    private EditText txtencargado;
    private EditText txtcontacto;
    private EditText txtComentario;
    private Button btnAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_detalle);
        txtsolicitud=findViewById(R.id.txtsolicitud);
        txtactivo=findViewById(R.id.txtactivo);
        txtlugar=findViewById(R.id.txtlugar);
        txtencargado=findViewById(R.id.txtencargado);
        txtcontacto=findViewById(R.id.txtcontacto);
        txtComentario=findViewById(R.id.txtcomentario);
        btnAceptar=findViewById(R.id.btnAceptar);

    }
}
