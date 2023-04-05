package com.project.firstApp.service;

import com.project.firstApp.dto.HeroDto;
import com.project.firstApp.dto.Universe;

import java.util.List;

public interface HeroService {

    HeroDto add(HeroDto heroDto);

    HeroDto update(HeroDto heroDto);

    HeroDto get(Long id);

    HeroDto delete(Long id);

    List<HeroDto> find(Universe universe);

}
