package utils;

import model.Apartment;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApartmentService {
    private final List<Apartment> apartments = new ArrayList<>();

    public List<Apartment> getAllApartments() {
        return apartments;
    }

    public Apartment getApartmentById(String apartmentId) {
        return apartments.stream()
                .filter(apartment -> apartment.getApartmentId().equals(apartmentId))
                .findFirst()
                .orElse(null);
    }

    public Apartment createApartment(Apartment apartment) {
        apartments.add(apartment);
        return apartment;
    }

    public Apartment updateApartment(String apartmentId, Apartment updatedApartment) {
        Apartment existingApartment = getApartmentById(apartmentId);
        if (existingApartment != null) {
            existingApartment.setNumberOfRooms(updatedApartment.getNumberOfRooms());
            // Обновите другие поля по мере необходимости
        }
        return existingApartment;
    }

    public void deleteApartment(String apartmentId) {
        apartments.removeIf(apartment -> apartment.getApartmentId().equals(apartmentId));
    }
}
