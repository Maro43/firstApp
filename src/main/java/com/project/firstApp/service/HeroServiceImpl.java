package com.project.firstApp.service;

import com.project.firstApp.dto.HeroDto;
import com.project.firstApp.entity.HeroEntity;
import com.project.firstApp.repository.HeroRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HeroServiceImpl implements HeroService{

    private final HeroRepository heroRepository;

    public HeroServiceImpl(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

    @Override
    public HeroDto get(Long id) {
        HeroEntity heroEntity = heroRepository.findById(id).orElseThrow();
        return new HeroDto(heroEntity.getNickname());
    }
}
