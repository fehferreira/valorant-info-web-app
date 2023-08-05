package br.com.internet.vava.controller;

import br.com.internet.vava.dto.response.maps.MapsResponseDTO;
import br.com.internet.vava.dto.response.weapons.WeaponsResponseDTO;
import br.com.internet.vava.service.MapsService;
import br.com.internet.vava.service.WeaponsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/weapons")
public class WeaponsController {

    private WeaponsService weaponsService;

    @RequestMapping(method = RequestMethod.GET)
    public WeaponsResponseDTO getWeapons(){
        return weaponsService.getWeapons();
    }


}
