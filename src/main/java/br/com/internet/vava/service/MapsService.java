package br.com.internet.vava.service;

import br.com.internet.vava.Interface.ValorantClient;
import br.com.internet.vava.constants.Constants;
import br.com.internet.vava.dto.response.maps.MapsResponseDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MapsService {

    private ValorantClient client;

    public MapsResponseDTO getMaps(){
        return client.getMaps(Constants.Variable.BRAZILIAN_LANGUAGE);
    }

}
