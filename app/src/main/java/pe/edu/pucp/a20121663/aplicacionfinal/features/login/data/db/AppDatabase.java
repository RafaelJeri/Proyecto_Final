package pe.edu.pucp.a20121663.aplicacionfinal.features.login.data.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import pe.edu.pucp.a20121663.aplicacionfinal.features.login.data.db.dao.ActivoDao;
import pe.edu.pucp.a20121663.aplicacionfinal.features.login.data.db.dao.SolicitudDao;
import pe.edu.pucp.a20121663.aplicacionfinal.features.login.data.db.dao.UserDao;
import pe.edu.pucp.a20121663.aplicacionfinal.features.login.data.db.entities.Activo;
import pe.edu.pucp.a20121663.aplicacionfinal.features.login.data.db.entities.Solicitud;
import pe.edu.pucp.a20121663.aplicacionfinal.features.login.data.db.entities.User;

@Database(entities = {User.class, Activo.class, Solicitud.class}, version = 1, exportSchema = false)

public abstract class AppDatabase extends RoomDatabase {

    private static final String DB_NAME = "myfirstlogin.db";
    private static AppDatabase INSTANCE;

    public static AppDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                    AppDatabase.class, DB_NAME).build();
        }
        return INSTANCE;
    }

    public abstract UserDao userDao();
    public abstract ActivoDao activoDao();
    public abstract SolicitudDao solicitudDao();
}
