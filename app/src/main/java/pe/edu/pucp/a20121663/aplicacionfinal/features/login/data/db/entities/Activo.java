package pe.edu.pucp.a20121663.aplicacionfinal.features.login.data.db.entities;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "ACTIVO")
public class Activo {

    @PrimaryKey
    @ColumnInfo(name = "ACTIVO_ID")
    public int activo_id;

    @ColumnInfo(name = "ACTIVO_NOMBRE")
    public String activo_nombre;

    @ColumnInfo(name = "DESCRIPCION")
    public String descripcion;

    public Activo(int activo_id, String activo_nombre, String descripcion) {
        this.activo_id = activo_id;
        this.activo_nombre = activo_nombre;
        this.descripcion = descripcion;
    }

    public int getActivo_id() {
        return activo_id;
    }

    public String getActivo_nombre() {
        return activo_nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
