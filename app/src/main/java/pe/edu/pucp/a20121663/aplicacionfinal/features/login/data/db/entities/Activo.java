package pe.edu.pucp.a20121663.aplicacionfinal.features.login.data.db.entities;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "ACTIVO")
public class Activo {

    @PrimaryKey
    @ColumnInfo(name = "ACTIVO_ID")
    private int actId;

    @ColumnInfo(name = "ACTIVO_NOMBRE")
    private String activo_nombre;

    @ColumnInfo(name = "DESCRIPCION")
    private String descripcion;

    public Activo(int actId, String activo_nombre, String descripcion) {
        this.actId = actId;
        this.activo_nombre = activo_nombre;
        this.descripcion = descripcion;
    }

    public int getActId() {
        return actId;
    }

    public String getActivo_nombre() {
        return activo_nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

}
