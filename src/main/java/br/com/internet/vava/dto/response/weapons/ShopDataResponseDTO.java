package br.com.internet.vava.dto.response.weapons;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShopDataResponseDTO {

    private static final long serialVersionUID = 1L;

    @JsonProperty("cost")
    private Long cost;

    @JsonProperty("category")
    private String category;

    @JsonProperty("categoryText")
    private String categoryText;

}
