package br.com.internet.vava.service;

import br.com.internet.vava.Interface.ValorantClient;
import br.com.internet.vava.constants.Constants;
import br.com.internet.vava.dto.response.weapons.WeaponsResponseDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class WeaponsService {

    private ValorantClient valorantClient;

    public WeaponsResponseDTO getWeapons() {
        return valorantClient.getWeapons(Constants.Variable.BRAZILIAN_LANGUAGE);
    }

    public WeaponsResponseDTO getWeaponByUUID(String uuid) {
        return valorantClient.getWeaponByUUID(
                uuid,
                Constants.Variable.BRAZILIAN_LANGUAGE);
    }
}
