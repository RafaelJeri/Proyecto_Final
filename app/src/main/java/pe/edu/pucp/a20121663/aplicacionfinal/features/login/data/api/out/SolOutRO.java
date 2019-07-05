package pe.edu.pucp.a20121663.aplicacionfinal.features.login.data.api.out;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import pe.edu.pucp.a20121663.aplicacionfinal.features.login.data.api.base.BaseOutRO;
import pe.edu.pucp.a20121663.aplicacionfinal.features.login.data.db.entities.Activo;

@JsonRootName("solOutRO")
public class SolOutRO extends BaseOutRO {

    //solicitudes
    private int solicitud_id;
    private String encargado;
    private String lugar;
    private String contacto;
    private Activo activo;
    private String comentario;

    @JsonCreator
    public SolOutRO(@JsonProperty("errorCode") int errorCode,
                    @JsonProperty("message") String message,
                    @JsonProperty("solicitud_id") int solicitud_id,
                    @JsonProperty("encargado") String encargado,
                    @JsonProperty("lugar") String lugar,
                    @JsonProperty("contacto") String contacto,
                    @JsonProperty("activo") Activo activo,
                    @JsonProperty("comentario") String comentario){
        super(errorCode, message);
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
