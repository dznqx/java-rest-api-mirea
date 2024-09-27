package net.tokyolancer.mirea_dima.repository;

import net.tokyolancer.mirea_dima.model.Apartment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApartmentRepository extends CrudRepository<Apartment, Long> { }