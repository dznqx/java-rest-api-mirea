package controller;

import model.Apartment;
import org.springframework.web.bind.annotation.*;
import utils.ApartmentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;


import java.util.List;

@RestController
@RequestMapping("/apartments")
public class ApartmentController {
    private final ApartmentService apartmentService;

    public ApartmentController(ApartmentService apartmentService) {
        this.apartmentService = apartmentService;
    }

    @GetMapping
    public List<Apartment> getAllApartments() {
        return apartmentService.getAllApartments();
    }

    @GetMapping("/{apartmentId}")
    public Apartment getApartmentById(@PathVariable String apartmentId) {
        return apartmentService.getApartmentById(apartmentId);
    }

    @PostMapping
    public Apartment createApartment(@RequestBody Apartment apartment) {
        return apartmentService.createApartment(apartment);
    }

    @PutMapping("/{apartmentId}")
    public Apartment updateApartment(@PathVariable String apartmentId, @RequestBody Apartment apartment) {
        return apartmentService.updateApartment(apartmentId, apartment);
    }

    @DeleteMapping("/{apartmentId}")
    public void deleteApartment(@PathVariable String apartmentId) {
        apartmentService.deleteApartment(apartmentId);
    }
}

