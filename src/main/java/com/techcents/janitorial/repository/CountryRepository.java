package com.techcents.janitorial.repository;

import com.techcents.janitorial.model.Countries;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends CrudRepository<Countries, String> {
}