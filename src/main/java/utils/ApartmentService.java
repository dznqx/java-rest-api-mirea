package utils;

import lombok.NoArgsConstructor;
import model.Apartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import repository.ApartmentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@NoArgsConstructor(force = true)
@Service
public class ApartmentService {

    private final ApartmentRepository apartmentRepository;


    public ApartmentService(ApartmentRepository apartmentRepository) {
        this.apartmentRepository = apartmentRepository;
    }


    // Получить все квартиры
    public Iterable<Apartment> getAllApartments() {
        assert apartmentRepository != null;
        return apartmentRepository.findAll();
    }

    // Получить квартиру по ID
    public Optional<Apartment> getApartmentById(Long apartmentId) {
        assert apartmentRepository != null;
        return apartmentRepository.findById(apartmentId);
    }

    // Создать новую квартиру
    public Apartment createApartment(Apartment apartment) {
        assert apartmentRepository != null;
        return apartmentRepository.save(apartment);
    }

    // Обновить существующую квартиру
    public Apartment updateApartment(Long apartmentId, Apartment updatedApartment) {
        assert apartmentRepository != null;
        return apartmentRepository.findById(apartmentId)
                .map(apartment -> {
                    apartment.setNumberOfRooms(updatedApartment.getNumberOfRooms());
                    return apartmentRepository.save(apartment);
                })
                .orElseThrow(() -> new ResourceNotFoundException("Apartment not found with id " + apartmentId));
    }

    // Удалить квартиру по ID
    public void deleteApartment(Long apartmentId) {
        assert apartmentRepository != null;
        if (apartmentRepository.existsById(apartmentId)) {
            apartmentRepository.deleteById(apartmentId);
        } else {
            throw new ResourceNotFoundException("Apartment not found with id " + apartmentId);
        }
    }
}
