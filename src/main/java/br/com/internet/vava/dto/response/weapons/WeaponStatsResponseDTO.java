package br.com.internet.vava.dto.response.weapons;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class WeaponStatsResponseDTO {

    private static final long serialVersionUID = 1L;

    @JsonProperty("fireRate")
    private Double fireRate;

    @JsonProperty("magazineSize")
    private Double magazineSize;

    @JsonProperty("runSpeedMultiplier")
    private Double runSpeedMultiplier;

    @JsonProperty("equipTimeSeconds")
    private Double equipTimeSeconds;

    @JsonProperty("reloadTimeSeconds")
    private Double reloadTimeSeconds;

    @JsonProperty("firstBulletAccuracy")
    private Double firstBulletAccuracy;

    @JsonProperty("shotgunPelletCount")
    private Double shotgunPelletCount;

    @JsonProperty("wallPenetration")
    private String wallPenetration;

    @JsonProperty("fireMode")
    private String fireMode;

    @JsonProperty("altFireType")
    private String altFireType;

    @JsonProperty("adsStats")
    private AdsStatsResponseDTO adsStatsResponseDTO;

    @JsonProperty("altShotgunStats")
    private AltShotgunStats altShotgunStats;

    @JsonProperty("airBurstStats")
    private AirBurstStats airBurstStats;

    @JsonProperty("damageRanges")
    private List<DamageRangesResponseDTO> damageRangesList;



}
