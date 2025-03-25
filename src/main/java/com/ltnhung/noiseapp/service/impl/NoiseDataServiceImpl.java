package com.ltnhung.noiseapp.service.impl;

import com.ltnhung.noiseapp.entity.NoiseData;
import com.ltnhung.noiseapp.repository.NoiseDataRepository;
import com.ltnhung.noiseapp.service.NoiseDataService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class NoiseDataServiceImpl implements NoiseDataService {

    private final NoiseDataRepository noiseDataRepository;

    @Override
    public NoiseData saveNoiseData(NoiseData noiseData) {
        return noiseDataRepository.save(noiseData);
    }

    @Override
    public List<NoiseData> getAllNoiseData() {
        return noiseDataRepository.findAll();
    }

    @Override
    public NoiseData getNoiseDataById(Long id) {
        return noiseDataRepository.findById(id).orElse(null);
    }
}
