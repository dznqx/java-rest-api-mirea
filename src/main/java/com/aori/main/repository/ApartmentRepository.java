package com.aori.main.repository;

import com.aori.main.model.Apartment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ApartmentRepository implements CrudRepository<Apartment, Long> {
    @Override
    public <S extends Apartment> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Apartment> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Apartment> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Apartment> findAll() {
        return null;
    }

    @Override
    public Iterable<Apartment> findAllById(Iterable<Long> longs) {
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
    public void delete(Apartment entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Apartment> entities) {

    }

    @Override
    public void deleteAll() {

    }
}