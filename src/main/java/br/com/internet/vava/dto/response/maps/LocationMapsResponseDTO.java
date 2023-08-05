package br.com.internet.vava.dto.response.maps;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter @Setter
public class LocationMapsResponseDTO {

    private static final long serialVersionUID = 1L;

    @JsonProperty("x")
    private BigDecimal x;

    @JsonProperty("y")
    private BigDecimal y;
}
