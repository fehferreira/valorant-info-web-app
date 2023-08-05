package br.com.internet.vava.dto.response.agents;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class DataAgentsResponseDTO {

    private static final long serialVersionUID = 1L;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("displayName")
    private String displayName;

    @JsonProperty("description")
    private String description;

    @JsonProperty("displayIcon")
    private String displayIcon;

    @JsonProperty("fullPortrait")
    private String fullPortrait;

    @JsonProperty("background")
    private String background;

    @JsonProperty("backgroundGradientColors")
    private List<String> backgroundGradientColors;

    @JsonProperty("role")
    private RoleResponseDTO role;

    @JsonProperty("abilities")
    private List<AbilitiesResponseDTO> abilities;

}
