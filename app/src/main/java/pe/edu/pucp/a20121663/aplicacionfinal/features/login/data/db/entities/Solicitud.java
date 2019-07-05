package pe.edu.pucp.a20121663.aplicacionfinal.features.login.data.db.entities;

import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import androidx.room.RoomWarnings;

@Entity(tableName = "SOLICITUD")
public class Solicitud {

    @PrimaryKey
    @ColumnInfo(name = "SOLICITUD_ID")
    private int solicitud_id;

    @ColumnInfo(name = "ENCARGADO")
    private String encargado;

    @ColumnInfo(name = "LUGAR")
    private String lugar;

    @ColumnInfo(name = "CONTACTO")
    private String contacto;

    @SuppressWarnings(RoomWarnings.PRIMARY_KEY_FROM_EMBEDDED_IS_DROPPED)
    @Embedded private Activo activo;

    @ColumnInfo(name = "COMENTARIO")
    private String comentario;

    public Solicitud(int solicitud_id, String encargado, String lugar, String contacto, Activo activo, String comentario) {
        this.solicitud_id = solicitud_id;
        this.encargado = encargado;
        this.lugar = lugar;
        this.contacto = contacto;
        this.activo = activo;
        this.comentario = comentario;
    }

    public int getSolicitud_id() {
        return solicitud_id;
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
