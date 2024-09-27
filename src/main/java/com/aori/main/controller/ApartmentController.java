package com.aori.main.controller;

import com.aori.main.model.Apartment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.aori.main.util.ApartmentService;

@RestController
@RequestMapping("/apartments")
public class ApartmentController {
    private ApartmentService apartmentService;

    public ApartmentController(ApartmentService apartmentService) {
        this.apartmentService = apartmentService;
    }

    @GetMapping
    public Iterable<Apartment> getAllApartments() {
        return apartmentService.getAllApartments();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Apartment> getApartmentById(@PathVariable Long id) {
        return apartmentService.getApartmentById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Apartment createApartment(@RequestBody Apartment apartment) {
        return apartmentService.createApartment(apartment);
    }

    @PutMapping("/{apartmentId}")
    public Apartment updateApartment(@PathVariable Long apartmentId, @RequestBody Apartment apartment) {
        return apartmentService.updateApartment(apartmentId, apartment);
    }

    @DeleteMapping("/{apartmentId}")
    public void deleteApartment(@PathVariable Long apartmentId) {
        apartmentService.deleteApartment(apartmentId);
    }
}

