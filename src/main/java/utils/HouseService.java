package utils;

import model.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.HouseRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class HouseService {
    @Autowired
    private HouseRepository houseRepository;

    private final List<House> houses = new ArrayList<>();

    public List<House> getAllHouses() {
        return houses;
    }

    public House getHouseById(String houseId) {
        return houses.stream()
                .filter(house -> house.getHouseId().equals(houseId))
                .findFirst()
                .orElse(null);
    }

    public House createHouse(House house) {
        houses.add(house);
        return house;
    }

    public House updateHouse(String houseId, House updatedHouse) {
        House existingHouse = getHouseById(houseId);
        if (existingHouse != null) {
            existingHouse.setName(updatedHouse.getName());
        }
        return existingHouse;
    }

    public void deleteHouse(String houseId) {
        houses.removeIf(house -> house.getHouseId().equals(houseId));
    }
}
