package repository;

import model.House;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface HouseRepository extends JpaRepository<House, Long> {
}