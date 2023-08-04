package br.com.internet.vava.dto.response.agents;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class RoleResponseDTO {

    private static final long serialVersionUID = 1L;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("displayName")
    private String displayName;

    @JsonProperty("description")
    private String description;

    @JsonProperty("displayIcon")
    private String displayIcon;

}
