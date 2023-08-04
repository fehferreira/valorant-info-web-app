package br.com.internet.vava.dto.response.agents;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class AgentsResponseDTO {

    private static final long serialVersionUID = 1L;

    @JsonProperty("status")
    private String status;

    @JsonProperty("data")
    private List<DataResponseDTO> data;

}
