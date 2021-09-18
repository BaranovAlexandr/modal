package com.example.modal.repo;

import com.example.modal.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepo extends JpaRepository<Country, Integer> {
}
