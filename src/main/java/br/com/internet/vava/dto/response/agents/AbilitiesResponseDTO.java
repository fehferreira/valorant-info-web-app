package br.com.internet.vava.dto.response.agents;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class AbilitiesResponseDTO {

    private static final long serialVersionUID = 1L;

    @JsonProperty("abilities")
    private List<AbilityResponseDTO> abilities;

}
