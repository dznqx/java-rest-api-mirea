package controller;

import model.House;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.web.bind.annotation.*;
import utils.HouseService;
import java.util.List;
import repository.HouseRepository;


@RestController
@RequestMapping("/houses")
public class HouseController {
    private final HouseService houseService;

    public HouseController(HouseService houseService) {
        this.houseService = houseService;
    }

    @GetMapping
    public Iterable<House> getAllHouses() {
        return houseService.getAllHouses();
    }

    @GetMapping("/{houseId}")
    public House getHouseById(@PathVariable Long houseId) {
        return houseService.getHouseById(houseId);
    }


    @PostMapping
    public House createHouse(@RequestBody House house) {
        return houseService.createHouse(house);
    }

    @PutMapping("/{houseId}")
    public House updateHouse(@PathVariable Long houseId, @RequestBody House house) {
        return houseService.updateHouse(houseId, house);
    }

    @DeleteMapping("/{houseId}")
    public void deleteHouse(@PathVariable Long houseId) {
        houseService.deleteHouse(houseId);
    }
}
