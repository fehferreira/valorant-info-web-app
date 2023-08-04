package br.com.internet.vava.controller;

import br.com.internet.vava.dto.response.agents.AgentsResponseDTO;
import br.com.internet.vava.service.AgentsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/agents")
public class AgentsController {

    private AgentsService agentsService;

    @RequestMapping(method = RequestMethod.GET)
    public AgentsResponseDTO getAgents(){
        return agentsService.getAgents();
    }

}
