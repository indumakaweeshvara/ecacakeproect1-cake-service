package com.ijse.eca.cakeservice.controller;

import com.ijse.eca.cakeservice.dto.CakeDto;
import com.ijse.eca.cakeservice.service.CakeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cakes")
public class CakeController {

    private final CakeService cakeService;

    public CakeController(CakeService cakeService) {
        this.cakeService = cakeService;
    }

    @GetMapping
    public ResponseEntity<List<CakeDto>> getAllCakes() {
        return ResponseEntity.ok(cakeService.getAllCakes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CakeDto> getCakeById(@PathVariable Long id) {
        return ResponseEntity.ok(cakeService.getCakeById(id));
    }

    @PostMapping
    public ResponseEntity<CakeDto> createCake(@RequestBody CakeDto dto) {
        return new ResponseEntity<>(cakeService.createCake(dto), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CakeDto> updateCake(@PathVariable Long id, @RequestBody CakeDto dto) {
        return ResponseEntity.ok(cakeService.updateCake(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCake(@PathVariable Long id) {
        cakeService.deleteCake(id);
        return ResponseEntity.noContent().build();
    }
}
