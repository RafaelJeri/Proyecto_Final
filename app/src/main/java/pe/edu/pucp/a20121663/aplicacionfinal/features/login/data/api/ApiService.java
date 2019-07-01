package pe.edu.pucp.a20121663.aplicacionfinal.features.login.data.api;

import pe.edu.pucp.a20121663.aplicacionfinal.features.login.data.api.in.LoginInRO;
import pe.edu.pucp.a20121663.aplicacionfinal.features.login.data.api.out.UserOutRO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {

    @POST("user/login")
    Call<UserOutRO> login(@Body LoginInRO user);


}
