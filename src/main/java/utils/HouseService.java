package utils;

import lombok.NoArgsConstructor;
import model.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import repository.ApartmentRepository;
import repository.HouseRepository;

import java.util.List;

@NoArgsConstructor(force = true)
@Service
public class HouseService {

    private HouseRepository houseRepository;

    public HouseService(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    // Получить все дома
    public Iterable<House> getAllHouses() {
        return houseRepository.findAll();
    }

    // Получить дом по ID
    public House getHouseById(Long houseId) {
        return houseRepository.findById(houseId)
                .orElseThrow(() -> new ResourceNotFoundException("House not found with id " + houseId));
    }

    // Создать новый дом
    public House createHouse(House house) {
        return houseRepository.save(house);
    }

    // Обновить существующий дом
    public House updateHouse(Long houseId, House updatedHouse) {
        House existingHouse = houseRepository.findById(houseId)
                .orElseThrow(() -> new ResourceNotFoundException("House not found with id " + houseId));

        existingHouse.setName(updatedHouse.getName());
        return houseRepository.save(existingHouse);
    }

    // Удалить дом по ID
    public void deleteHouse(Long houseId) {
        House existingHouse = houseRepository.findById(houseId)
                .orElseThrow(() -> new ResourceNotFoundException("House not found with id " + houseId));
        houseRepository.delete(existingHouse);
    }
}