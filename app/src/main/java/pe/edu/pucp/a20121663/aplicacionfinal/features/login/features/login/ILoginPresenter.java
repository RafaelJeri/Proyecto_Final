package pe.edu.pucp.a20121663.aplicacionfinal.features.login.features.login;

import pe.edu.pucp.a20121663.aplicacionfinal.features.login.features.base.IPresenter;

public interface ILoginPresenter extends IPresenter {
    boolean verifyLoginData(String username, String password);
    void loginRest(String username, String password);
    void loginOffline(String username, String password);

}
