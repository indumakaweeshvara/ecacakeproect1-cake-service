package com.ijse.eca.cakeservice.service;

import com.ijse.eca.cakeservice.dto.CakeDto;

import java.util.List;

public interface CakeService {
    List<CakeDto> getAllCakes();
    CakeDto getCakeById(Long id);
    CakeDto createCake(CakeDto dto);
    CakeDto updateCake(Long id, CakeDto dto);
    void deleteCake(Long id);
}
