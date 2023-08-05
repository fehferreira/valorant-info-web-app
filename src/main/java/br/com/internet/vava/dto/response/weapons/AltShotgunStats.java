package br.com.internet.vava.dto.response.weapons;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AltShotgunStats {

    private static final long serialVersionUID = 1L;

    @JsonProperty("shotgunPelletCount")
    private Integer shotgunPelletCount;

    @JsonProperty("burstDistance")
    private Double burstDistance;
}
