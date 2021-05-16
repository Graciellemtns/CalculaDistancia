package com.github.gracielle.citiesapi.countries.repository;

import com.github.gracielle.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
