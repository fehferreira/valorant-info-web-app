package br.com.internet.vava.dto.response.maps;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class LocationMapsResponseDTO {

    private static final long serialVersionUID = 1L;

    @JsonProperty("x")
    private String x;

    @JsonProperty("y")
    private String y;
}