package br.com.internet.vava.service;

import br.com.internet.vava.Interface.ValorantClient;
import br.com.internet.vava.constants.Constants;
import br.com.internet.vava.dto.response.maps.MapsResponseDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MapsService {

    private ValorantClient valorantClient;

    public MapsResponseDTO getMaps(){
        return valorantClient.getMaps(Constants.Variable.BRAZILIAN_LANGUAGE);
    }

    public MapsResponseDTO getMapByUUID(String uuid) {
        return valorantClient.getMapByUUID(
                uuid,
                Constants.Variable.BRAZILIAN_LANGUAGE);
    }
}
