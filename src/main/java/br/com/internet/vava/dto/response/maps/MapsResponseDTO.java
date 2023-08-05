package br.com.internet.vava.dto.response.maps;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class MapsResponseDTO {
    private static final long serialVersionUID = 1L;

    @JsonProperty("status")
    private String status;

    @JsonProperty("data")
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    private List<DataMapsResponseDTO> dataMapsResponseDTO;

}
