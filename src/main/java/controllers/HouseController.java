package controllers;

import model.House;
import org.springframework.web.bind.annotation.*;
import utils.HouseService;

import java.util.List;


@RestController
@RequestMapping("/houses")
public class HouseController {
    private final HouseService houseService;

    public HouseController(HouseService houseService) {
        this.houseService = houseService;
    }

    @GetMapping
    public List<House> getAllHouses() {
        return houseService.getAllHouses();
    }

    @GetMapping("/{houseId}")
    public House getHouseById(@PathVariable String houseId) {
        return houseService.getHouseById(houseId);
    }

    @PostMapping
    public House createHouse(@RequestBody House house) {
        return houseService.createHouse(house);
    }

    @PutMapping("/{houseId}")
    public House updateHouse(@PathVariable String houseId, @RequestBody House house) {
        return houseService.updateHouse(houseId, house);
    }

    @DeleteMapping("/{houseId}")
    public void deleteHouse(@PathVariable String houseId) {
        houseService.deleteHouse(houseId);
    }
}
