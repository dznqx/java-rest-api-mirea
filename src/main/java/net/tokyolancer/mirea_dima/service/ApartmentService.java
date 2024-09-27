package net.tokyolancer.mirea_dima.service;

import net.tokyolancer.mirea_dima.model.Apartment;

import java.util.List;
import java.util.Optional;

public interface ApartmentService {

    List<Apartment> getAllApartments();

    Optional<Apartment> getApartmentById(Long apartmentId);

    Apartment createApartment(Apartment apartment);

    void updateApartmentRooms(Long apartmentId, int rooms);

    void deleteApartment(Long apartmentId);
}
