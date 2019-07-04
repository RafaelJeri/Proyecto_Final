package pe.edu.pucp.a20121663.aplicacionfinal.features.login.data.api;

import pe.edu.pucp.a20121663.aplicacionfinal.features.login.data.api.in.LoginInRO;
import pe.edu.pucp.a20121663.aplicacionfinal.features.login.data.api.in.SolInRO;
import pe.edu.pucp.a20121663.aplicacionfinal.features.login.data.api.out.SolOutRO;
import pe.edu.pucp.a20121663.aplicacionfinal.features.login.data.api.out.UserOutRO;
import pe.edu.pucp.a20121663.aplicacionfinal.features.login.data.db.entities.User;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {

    @POST("users/login")
    Call<UserOutRO> login(@Body LoginInRO user);

    @POST("ver-solicitudes")
    Call<SolOutRO> login(@Body SolInRO sol);
}
