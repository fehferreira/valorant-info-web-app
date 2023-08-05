package br.com.internet.vava.dto.response.weapons;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DamageRangesResponseDTO {

    private static final long serialVersionUID = 1L;

    @JsonProperty("rangeStartMeters")
    private Double rangeStartMeters;

    @JsonProperty("rangeEndMeters")
    private Double rangeEndMeters;

    @JsonProperty("headDamage")
    private Double headDamage;

    @JsonProperty("bodyDamage")
    private Double bodyDamage;

    @JsonProperty("legDamage")
    private Double legDamage;
}
