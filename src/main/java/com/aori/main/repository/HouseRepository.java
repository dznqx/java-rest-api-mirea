package com.aori.main.repository;

import com.aori.main.model.House;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class HouseRepository implements CrudRepository<House, Long> {
    @Override
    public <S extends House> S save(S entity) {
        return null;
    }

    @Override
    public <S extends House> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<House> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<House> findAll() {
        return null;
    }

    @Override
    public Iterable<House> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(House entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends House> entities) {

    }

    @Override
    public void deleteAll() {

    }
}