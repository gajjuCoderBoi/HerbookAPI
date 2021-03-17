package com.cognizant.herobookapi.service;

import com.cognizant.herobookapi.dto.VillainDto;
import com.cognizant.herobookapi.entity.Villain;
import com.cognizant.herobookapi.repository.VillainRepository;
import org.apache.catalina.util.ErrorPageSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class VillainService {

    @Autowired
    private VillainRepository villainRepository;

    public List<VillainDto> getAllVillains() {
        List<Villain> savedVillains = villainRepository.findAll();
        List<VillainDto> villainDtoList = new ArrayList<>();

        for (Villain savedVillain : savedVillains) {
            VillainDto temp = new VillainDto();
            temp.setVillainName(savedVillain.getVillainName());
            temp.setRealName(savedVillain.getRealName());
            villainDtoList.add(temp);
        }

        return villainDtoList;
    }
}
