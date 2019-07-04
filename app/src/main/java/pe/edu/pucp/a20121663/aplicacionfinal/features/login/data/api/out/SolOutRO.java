package pe.edu.pucp.a20121663.aplicacionfinal.features.login.data.api.out;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import pe.edu.pucp.a20121663.aplicacionfinal.features.login.data.api.base.BaseOutRO;

@JsonRootName("solOutRO")
public class SolOutRO extends BaseOutRO {

    //solicitudes
    private String Id;
    private String lugar;

    @JsonCreator
    public SolOutRO(@JsonProperty("errorCode") int errorCode,
                    @JsonProperty("message") String message,
                    @JsonProperty("Id") String Id,
                    @JsonProperty("lugar") String lugar) {
        super(errorCode, message);
        this.Id = Id;
        this.lugar = lugar;

    }

    public String getId() {
        return Id;
    }

    public String getLugar() {
        return lugar;
    }

}
