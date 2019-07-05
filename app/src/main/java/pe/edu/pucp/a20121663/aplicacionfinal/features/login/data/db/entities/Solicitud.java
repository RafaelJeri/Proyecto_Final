package pe.edu.pucp.a20121663.aplicacionfinal.features.login.data.db.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "SOLICITUD")
public class Solicitud {

    @PrimaryKey
    @ColumnInfo(name = "SOLICITUD_ID")
    private int actId;

    @ColumnInfo(name = "ENCARGADO")
    private String encargado;

    @ColumnInfo(name = "LUGAR")
    private String lugar;

    @ColumnInfo(name = "CONTACTO")
    private String contacto;

    @ColumnInfo(name = "ACTIVO")
    private Activo activo;

    @ColumnInfo(name = "COMENTARIO")
    private String comentario;

    public Solicitud(int actId, String encargado, String lugar, String contacto, Activo activo, String comentario) {
        this.actId = actId;
        this.encargado = encargado;
        this.lugar = lugar;
        this.contacto = contacto;
        this.activo = activo;
        this.comentario = comentario;
    }

    public int getActId() {
        return actId;
    }

    public String getEncargado() {
        return encargado;
    }

    public String getLugar() {
        return lugar;
    }

    public String getContacto() {
        return contacto;
    }

    public Activo getActivo() {
        return activo;
    }

    public String getComentario() {
        return comentario;
    }
}
