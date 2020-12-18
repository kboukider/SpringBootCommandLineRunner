package com.koussaila.SpringBootCommandLineRunner.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.koussaila.SpringBootCommandLineRunner.model.City;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {

}
