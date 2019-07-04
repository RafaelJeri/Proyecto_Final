package pe.edu.pucp.a20121663.aplicacionfinal.features.login.data.api.in;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import pe.edu.pucp.a20121663.aplicacionfinal.features.login.data.api.base.BaseInRO;

@JsonRootName("solInRO")
public class SolInRO extends BaseInRO {
    //solicitudes

    private String username;

    @JsonCreator
    public SolInRO(@JsonProperty("applicationName") String applicationName,
                     @JsonProperty("username") String username) {
        super(applicationName);
        this.username = username;

    }

    public String getUsername() {
        return username;
    }

}
