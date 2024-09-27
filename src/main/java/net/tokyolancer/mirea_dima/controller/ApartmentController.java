package net.tokyolancer.mirea_dima.controller;

import net.tokyolancer.mirea_dima.model.Apartment;
import net.tokyolancer.mirea_dima.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apartments")
public class ApartmentController {

    @Autowired
    private ApartmentService apartmentService;

    @GetMapping
    public List<Apartment> getAllApartments() {
        return apartmentService.getAllApartments();
    }

    @PostMapping
    public void createApartment(@RequestBody Apartment apartment) {
        apartmentService.createApartment(apartment);
    }
}

