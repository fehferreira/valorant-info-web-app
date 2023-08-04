package br.com.internet.vava.service;

import br.com.internet.vava.Interface.ValorantClient;
import br.com.internet.vava.constants.Constants;
import br.com.internet.vava.dto.response.agents.AgentsResponseDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AgentsService {

    private ValorantClient valorantClient;

    public AgentsResponseDTO getAgents(){
        return valorantClient.getAgents(
                Constants.Variable.BRAZILIAN_LANGUAGE,
                Constants.Variable.PLAYABLE_CHARACTER);
    }
}
