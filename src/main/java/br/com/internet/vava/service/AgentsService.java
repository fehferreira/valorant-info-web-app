package br.com.internet.vava.service;

import br.com.internet.vava.Interface.ValorantClient;
import br.com.internet.vava.dto.response.agents.AgentsResponseDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static br.com.internet.vava.constants.Constants.Variable.BRAZILIAN_LANGUAGE;
import static br.com.internet.vava.constants.Constants.Variable.PLAYABLE_CHARACTER;

@Service
@AllArgsConstructor
public class AgentsService {

    private ValorantClient valorantClient;

    public AgentsResponseDTO getAgents(){
        return valorantClient.getAgents(
                BRAZILIAN_LANGUAGE,
                PLAYABLE_CHARACTER);
    }

    public AgentsResponseDTO getAgentsByUUID(String uuid) {
        return valorantClient.getAgentByUUID(
                uuid,
                BRAZILIAN_LANGUAGE);
    }
}
