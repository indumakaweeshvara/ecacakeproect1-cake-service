package com.ijse.eca.cakeservice.service.impl;

import com.ijse.eca.cakeservice.dto.CakeDto;
import com.ijse.eca.cakeservice.entity.Cake;
import com.ijse.eca.cakeservice.repository.CakeRepository;
import com.ijse.eca.cakeservice.service.CakeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CakeServiceImpl implements CakeService {

    private final CakeRepository cakeRepository;

    public CakeServiceImpl(CakeRepository cakeRepository) {
        this.cakeRepository = cakeRepository;
    }

    @Override
    public List<CakeDto> getAllCakes() {
        return cakeRepository.findAll().stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    @Override
    public CakeDto getCakeById(Long id) {
        Cake cake = cakeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cake not found with id: " + id));
        return mapToDto(cake);
    }

    @Override
    public CakeDto createCake(CakeDto dto) {
        Cake cake = mapToEntity(dto);
        Cake saved = cakeRepository.save(cake);
        return mapToDto(saved);
    }

    @Override
    public CakeDto updateCake(Long id, CakeDto dto) {
        Cake cake = cakeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cake not found with id: " + id));

        cake.setName(dto.getName());
        cake.setCategory(dto.getCategory());
        cake.setFlavor(dto.getFlavor());
        cake.setPrice(dto.getPrice());
        cake.setStockQuantity(dto.getStockQuantity());
        cake.setDescription(dto.getDescription());
        cake.setImageUrl(dto.getImageUrl());

        Cake updated = cakeRepository.save(cake);
        return mapToDto(updated);
    }

    @Override
    public void deleteCake(Long id) {
        cakeRepository.deleteById(id);
    }

    private CakeDto mapToDto(Cake cake) {
        return new CakeDto(
                cake.getId(),
                cake.getName(),
                cake.getCategory(),
                cake.getFlavor(),
                cake.getPrice(),
                cake.getStockQuantity(),
                cake.getDescription(),
                cake.getImageUrl()
        );
    }

    private Cake mapToEntity(CakeDto dto) {
        Cake cake = new Cake();
        cake.setId(dto.getId());
        cake.setName(dto.getName());
        cake.setCategory(dto.getCategory());
        cake.setFlavor(dto.getFlavor());
        cake.setPrice(dto.getPrice());
        cake.setStockQuantity(dto.getStockQuantity());
        cake.setDescription(dto.getDescription());
        cake.setImageUrl(dto.getImageUrl());
        return cake;
    }
}
