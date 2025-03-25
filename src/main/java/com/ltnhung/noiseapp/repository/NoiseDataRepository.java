package com.ltnhung.noiseapp.repository;

import com.ltnhung.noiseapp.entity.NoiseData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoiseDataRepository extends JpaRepository<NoiseData,Long> {
}
