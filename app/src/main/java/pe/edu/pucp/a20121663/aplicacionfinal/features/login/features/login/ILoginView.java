package pe.edu.pucp.a20121663.aplicacionfinal.features.login.features.login;

import pe.edu.pucp.a20121663.aplicacionfinal.features.login.features.base.IView;

public interface ILoginView extends IView {
    void askForLoginOffline();
    void goToHomePage(String names, String email);
    void showErrorDialog(String message);
}
