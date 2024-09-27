package com.aori.main.repository;

import com.aori.main.model.ConstructionCompany;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class ConstructionCompanyRepository implements CrudRepository<ConstructionCompany, Long> {
    @Override
    public <S extends ConstructionCompany> S save(S entity) {
        return null;
    }

    @Override
    public <S extends ConstructionCompany> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<ConstructionCompany> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<ConstructionCompany> findAll() {
        return null;
    }

    @Override
    public Iterable<ConstructionCompany> findAllById(Iterable<Long> longs) {
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
    public void delete(ConstructionCompany entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends ConstructionCompany> entities) {

    }

    @Override
    public void deleteAll() {

    }
}