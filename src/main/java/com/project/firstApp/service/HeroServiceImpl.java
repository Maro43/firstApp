package com.project.firstApp.service;

import com.project.firstApp.dto.HeroDto;
import com.project.firstApp.dto.Universe;
import com.project.firstApp.entity.HeroEntity;
import com.project.firstApp.repository.HeroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroServiceImpl implements HeroService {

    private final HeroRepository heroRepository;

    public HeroServiceImpl(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

    @Override
    public HeroDto get(Long id) {
        HeroEntity heroEntity = heroRepository.findById(id).orElseThrow();
        return new HeroDto(heroEntity.getNickname());
    }

    @Override
    public HeroDto add(HeroDto heroDto) {
        HeroEntity save = heroRepository.save(new HeroEntity(heroDto.getNickname(),heroDto.getUniverse()));
        return new HeroDto(save.getNickname());
    }

    @Override
    public HeroDto update(HeroDto heroDto) {
        HeroEntity heroEntity = heroRepository.findById(heroDto.getId()).orElseThrow();
        heroEntity.setNickname(heroDto.getNickname());
        heroRepository.save(heroEntity);
        return new HeroDto(heroEntity.getNickname());
    }

    @Override
    public HeroDto delete(Long id) {
        HeroEntity heroEntity = heroRepository.findById(id).orElseThrow();
        heroRepository.deleteById(id);
        return new HeroDto(heroEntity.getNickname());
    }

    @Override
    public List<HeroDto> find(Universe universe) {
        return null;
    }
}
