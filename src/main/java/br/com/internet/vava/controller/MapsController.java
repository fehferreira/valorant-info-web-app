package br.com.internet.vava.controller;

import br.com.internet.vava.dto.response.maps.MapsResponseDTO;
import br.com.internet.vava.service.MapsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/maps")
public class MapsController {

    private MapsService mapsService;

    @RequestMapping(method = RequestMethod.GET)
    public MapsResponseDTO getAgents(){
        return mapsService.getMaps();
    }

    @RequestMapping(path = "/{uuid}", method = RequestMethod.GET)
    public MapsResponseDTO getAgents(@PathVariable String uuid){
        return mapsService.getFindByUUID(uuid);
    }




}
