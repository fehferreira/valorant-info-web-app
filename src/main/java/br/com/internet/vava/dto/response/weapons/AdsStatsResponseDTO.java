package br.com.internet.vava.dto.response.weapons;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter @Setter
public class AdsStatsResponseDTO {

    @JsonProperty("zoomMultiplier")
    private Double zoomMultiplier;

    @JsonProperty("fireRate")
    private Double fireRate;

    @JsonProperty("runSpeedMultiplier")
    private Double runSpeedMultiplier;

    @JsonProperty("burstCount")
    private Double burstCount;

    @JsonProperty("firstBulletAccuracy")
    private BigDecimal firstBulletAccuracy;

}
