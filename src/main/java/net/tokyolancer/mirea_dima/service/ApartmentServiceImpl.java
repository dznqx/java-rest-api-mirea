package net.tokyolancer.mirea_dima.service;

import net.tokyolancer.mirea_dima.model.Apartment;
import net.tokyolancer.mirea_dima.repository.ApartmentRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

@Component
public class ApartmentServiceImpl implements ApartmentService {

    private final ApartmentRepository repository;

    public ApartmentServiceImpl(ApartmentRepository repository) {
        this.repository = repository;
    }

    /**
     *
     * Получает все квартиры
     *
     * @return квартиры
     */
    @Override
    public List<Apartment> getAllApartments() {
        return StreamSupport.stream(this.repository.findAll().spliterator(), false).toList();
    }

    /**
     *
     * Получить квартиру по ID
     *
     * @param apartmentId ID квартиры
     * @return квартира
     */
    @Override
    public Optional<Apartment> getApartmentById(Long apartmentId) {
        return this.repository.findById(apartmentId);
    }

    /**
     *
     * Создать новую квартиру
     *
     * @param apartment квартира
     * @return квартира
     */
    @Override
    public Apartment createApartment(Apartment apartment) {
        return this.repository.save(apartment);
    }

    // Обновить существующую квартиру
    @Override
    public void updateApartmentRooms(Long apartmentId, int rooms) {
        this.repository.findById(apartmentId).ifPresent(a -> a.setNumberOfRooms(rooms) );
    }

    // Удалить квартиру по ID
    @Override
    public void deleteApartment(Long apartmentId) {
        this.repository.findById(apartmentId).ifPresent(this.repository::delete);
    }
}
