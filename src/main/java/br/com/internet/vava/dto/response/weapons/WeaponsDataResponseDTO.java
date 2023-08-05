package br.com.internet.vava.dto.response.weapons;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeaponsDataResponseDTO {

    private static final long serialVersionUID = 1L;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("displayName")
    private String displayName;

    @JsonProperty("displayIcon")
    private String displayIcon;

    @JsonProperty("weaponStats")
    private WeaponStatsResponseDTO weaponStats;

    @JsonProperty("shopData")
    private ShopDataResponseDTO shopData;


}
