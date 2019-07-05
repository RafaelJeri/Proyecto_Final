package pe.edu.pucp.a20121663.aplicacionfinal.features.login.data.db.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import pe.edu.pucp.a20121663.aplicacionfinal.features.login.data.db.entities.Activo;
import pe.edu.pucp.a20121663.aplicacionfinal.features.login.data.db.entities.Solicitud;

@Dao
public interface SolicitudDao {

    @Query("SELECT * FROM SOLICITUD WHERE SOLICITUD_ID = :solicitud_id LIMIT 1")
    Solicitud findById(int solicitud_id);

    @Insert
    void insert(Solicitud solicitud);

    @Delete
    void delete(Solicitud solicitud);
}
