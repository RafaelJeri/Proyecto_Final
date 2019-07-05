package pe.edu.pucp.a20121663.aplicacionfinal.features.login.data.db.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import pe.edu.pucp.a20121663.aplicacionfinal.features.login.data.db.entities.Activo;

@Dao
public interface ActivoDao {


    @Query("SELECT * FROM ACTIVO WHERE ACTIVO_ID = :activo_id LIMIT 1")
    Activo findById(int activo_id);

    @Insert
    void insert(Activo activo);

    @Delete
    void delete(Activo activo);
}
