package pe.edu.pucp.a20121663.aplicacionfinal.features.login.utils;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import androidx.annotation.StringRes;

public class Utilities {
// formatear una cadena de texto multilingüe
    public static String formatString(Context context, @StringRes int stringId,
                                      Object... args) {
        return String.format(context.getString(stringId), args);
    }
//mostrar un mensaje en una notificación Toast
    public static void showMessage(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
//muestra el mensaje contenido en una cadena de texto multilingüe.
    public static void showMessage(Context context, @StringRes int stringId) {
        showMessage(context, context.getString(stringId));
    }
// esconder el teclado
    public static void hideKeyboard(Activity activity) {
        View view = activity.getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager)
                    activity.getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }



}
