package br.com.internet.vava.dto.response.maps;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class DataMapsResponseDTO {

    private static final long serialVersionUID = 1L;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("displayName")
    private String displayName;

    @JsonProperty("displayIcon")
    private String displayIcon;

    @JsonProperty("listViewIcon")
    private String listViewIcon;

    @JsonProperty("splash")
    private String splash;

    @JsonProperty("xMultiplier")
    private String xMultiplier;

    @JsonProperty("yMultiplier")
    private String yMultiplier;

    @JsonProperty("xScalarToAdd")
    private String xScalarToAdd;

    @JsonProperty("yScalarToAdd")
    private String yScalarToAdd;

    @JsonProperty("callouts")
    private List<CalloutsMapsResponseDTO> callouts;

}
