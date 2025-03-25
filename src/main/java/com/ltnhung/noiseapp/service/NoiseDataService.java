package com.ltnhung.noiseapp.service;

import com.ltnhung.noiseapp.entity.NoiseData;

import java.util.List;

public interface NoiseDataService {
    NoiseData saveNoiseData(NoiseData noiseData);
    List<NoiseData> getAllNoiseData();
    NoiseData getNoiseDataById(Long id);
}
