package br.com.internet.vava.Interface;

import br.com.internet.vava.dto.response.agents.AgentsResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@FeignClient(name = "ValorantClient", url = "${url.valorant}")
public interface ValorantClient {

    @RequestMapping(value = "/agents", method = GET)
    public AgentsResponseDTO getAgents(
            @RequestParam(value = "language", required = false) String language,
            @RequestParam(value = "isPlayableCharacter", required = false) boolean isPlayableCharacter
    );
}
