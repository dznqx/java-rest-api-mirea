package utils;

import model.Apartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import repository.ApartmentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ApartmentService {

    private ApartmentRepository apartmentRepository;


    public List<Apartment> getAllApartments() {
        return apartmentRepository.findAll();
    }

    // Получить квартиру по ID
    public Optional<Apartment> getApartmentById(Long apartmentId) {
        return apartmentRepository.findById(apartmentId);
    }

    // Создать новую квартиру
    public Apartment createApartment(Apartment apartment) {
        return apartmentRepository.save(apartment);
    }

    // Обновить существующую квартиру
    public Apartment updateApartment(Long apartmentId, Apartment updatedApartment) {
        return apartmentRepository.findById(apartmentId)
                .map(apartment -> {
                    apartment.setNumberOfRooms(updatedApartment.getNumberOfRooms());
                    return apartmentRepository.save(apartment);
                })
                .orElseThrow(() -> new ResourceNotFoundException("Apartment not found with id " + apartmentId));
    }

    // Удалить квартиру по ID
    public void deleteApartment(Long apartmentId) {
        if (apartmentRepository.existsById(apartmentId)) {
            apartmentRepository.deleteById(apartmentId);
        } else {
            throw new ResourceNotFoundException("Apartment not found with id " + apartmentId);
        }
    }
}
