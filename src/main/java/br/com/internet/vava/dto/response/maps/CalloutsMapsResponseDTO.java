package br.com.internet.vava.dto.response.maps;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CalloutsMapsResponseDTO {

    private static final long serialVersionUID = 1L;

    @JsonProperty("regionName")
    private String regionName;

    @JsonProperty("superRegionName")
    private String superRegionName;

    @JsonProperty("location")
    private LocationMapsResponseDTO locationResponseDTO;



}
